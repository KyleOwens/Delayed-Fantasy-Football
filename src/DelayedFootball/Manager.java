/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DelayedFootball;

import Constants.Colors;
import DelayedFootball.ActionListeners.ColorChanger;
import DelayedFootball.ActionListeners.DialogCloser;
import DelayedFootball.ActionListeners.ImageChanger;
import DelayedFootball.ActionListeners.LabelChanger;
import DelayedFootball.ActionListeners.LabelColorChanger;
import DelayedFootball.ActionListeners.LabelVisibility;
import DelayedFootball.ActionListeners.LastPlayListener;
import DelayedFootball.ActionListeners.WindowClosingListener;
import DelayedFootball.UserInterfaces.ErrorDialog;
import DelayedFootball.UserInterfaces.Fantasycast;
import DelayedFootball.UserInterfaces.LinkDialog;
import DelayedFootball.UserInterfaces.NotificationDialog;
import DelayedFootball.UserInterfaces.ProgressBar;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author Kyle
 */
public class Manager implements Runnable {

    private LinkDialog links;
    private WebNavigator nav;

    private ArrayList<PlayerPanel> playerPanels = new ArrayList<>();
    private ArrayList<GamePanel> gamePanels = new ArrayList<>();
    private ArrayList<TeamInfoPanel> infoPanels = new ArrayList<>();

    private static String lastNotification;
    private String url;

    private static int delay;

    private static Fantasycast mainFrame;

    public Manager() {
        url = "";
        mainFrame = new Fantasycast();
    }

    @Override
    public void run() {

        new Thread(() -> {
            nav = new WebNavigator();
        }).start();

        links = new LinkDialog(null, true, this);
        links.addWindowListener(new DialogCloser());
        links.setVisible(true);

        lastNotification = "";

        ProgressBar progress = new ProgressBar(null, false);
        progress.setVisible(true);


        while (true) {
            try {
                nav.setUrl(url);
                break;
            } catch (Exception e) {
                continue;
            }
        }

        setupPanels();

        progress.setVisible(false);

        SwingUtilities.invokeLater(
                new Runnable() {
            @Override
            public void run() {
                JFrame frame = mainFrame;
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.getContentPane().setBackground(new Color(60, 63, 65));
                frame.setContentPane(frame.getContentPane());
                frame.addWindowListener(new WindowClosingListener(nav));
                frame.setTitle("ESPN Delayed Fantasycast");
                frame.setIconImage(Toolkit.getDefaultToolkit().createImage("Icon.png"));
                frame.pack();
                frame.setVisible(true);
            }

        });

        lastNotification = nav.getNotification();

        while (true) {
            try {
                nav.updateDoc();
                checkForGameUpdates(gamePanels);
                checkForPlayerUpdates(playerPanels, infoPanels);
                checkForScoringNotification();
                checkForTeamLogoUpdate(gamePanels);
                checkForPossessionUpdate(gamePanels);
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }

        //exit the driver before closing
        try {
            nav.closeDrivers();
        } catch (Exception ex) {

        }
        System.exit(0);

    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDelay(int delay) {
        this.delay = delay * 1000;
    }

    public void setupPanels() {
        int j = 0;
        for (int i = 0; i < 32; i += 2) {
            JLabel awayTeamLabel = mainFrame.getTeamLabels().get(i);
            JLabel homeTeamLabel = mainFrame.getTeamLabels().get(i + 1);
            JLabel awayScoreLabel = mainFrame.getGameScores().get(i);
            JLabel homeScoreLabel = mainFrame.getGameScores().get(i + 1);
            JLabel gameTimeLabel = mainFrame.getTimeLabels().get(j);
            JLabel gameStatusLabel = mainFrame.getStatusLabels().get(j);
            JLabel awayLogo = mainFrame.getTeamLogos().get(i);
            JLabel homeLogo = mainFrame.getTeamLogos().get(i + 1);
            JLabel possession = mainFrame.getPossessionImages().get(j);
            JLabel possLabels = mainFrame.getPosessionLabels().get(j);
            JTextPane lastPlayPane = mainFrame.getPlays().get(j);
            JPanel panel = mainFrame.getGamePanels().get(j);

            gamePanels.add(new GamePanel(awayTeamLabel, homeTeamLabel, awayScoreLabel,
                    homeScoreLabel, gameTimeLabel, gameStatusLabel, lastPlayPane, panel, awayLogo, homeLogo, possession, possLabels));
            j++;
        }

        j = 0;
        for (int i = 0; i < 34; i++) {
            JLabel name = mainFrame.getPlayerNames().get(i);
            JLabel game = mainFrame.getPlayerGames().get(i);
            JLabel stats = mainFrame.getPlayerStats().get(i);
            JLabel score = mainFrame.getPlayerScores().get(i);
            JLabel image = mainFrame.getImages().get(i);
            JPanel panel = mainFrame.getPlayerPanels().get(i);

            playerPanels.add(new PlayerPanel(name, game, stats, score, image, panel));
        }

        for (int i = 0; i < 2; i++) {
            JLabel teamName = mainFrame.getFantasyTeamNames().get(i);
            JLabel teamOwner = mainFrame.getOwnerNames().get(i);
            JLabel toPlay = mainFrame.getToPlay().get(i);
            JLabel inPlay = mainFrame.getInPlay().get(i);
            JLabel projection = mainFrame.getProjections().get(i);
            JLabel totalScore = mainFrame.getTotalScores().get(i);

            infoPanels.add(new TeamInfoPanel(teamName, teamOwner, toPlay, inPlay,
                    projection, totalScore));
        }

        prepareScrollPane(mainFrame.getScrollPane());
        prepareScrollPane(mainFrame.getScrollPane2());

        ArrayList<JPanel> panels = mainFrame.getMainPanels();

        for (JPanel p : panels) {
            p.setBackground(Colors.BACKGROUND);
        }

        try {
            setPlayerImages(playerPanels);
            setTeamLogos(gamePanels);
            setPossesionIcons(gamePanels);
        } catch (Exception e) {
            System.out.println("loading images failed");
        }

        setUpGames(gamePanels);
        setUpPlayers(playerPanels, infoPanels);
    }

    public void setUpGames(ArrayList<GamePanel> gamePanels) {

        //set the team names up in the game scroll pane
        int j = 1;
        for (int i = 0; i < gamePanels.size(); i++) {
            try {
                gamePanels.get(i).getAwayTeamLabel().setText(nav.getAwayTeamName(i));
                gamePanels.get(i).getHomeTeamLabel().setText(nav.getHomeTeamName(i));
            } catch (IndexOutOfBoundsException e) {
                continue;
            }

            try {
                gamePanels.get(i).getAwayScoreLabel().setText(nav.getAwayScore(j));
                gamePanels.get(i).getHomeScoreLabel().setText(nav.getHomeScore(j));
                j += 2;
            } catch (IndexOutOfBoundsException e) {
                continue;
            }

            try {

                //break down the last play into single words so that they can be comapred
                ArrayList<String> parts = new ArrayList<>(Arrays.asList(nav.getLastPlay(i).split(" ")));

                //create and fill arraylists for your team and opponent team
                ArrayList<String> compareNames = nav.getYourPlayers(i);
                ArrayList<String> compareNames2 = nav.getOpponentPlayers(i);

                //set up the last play text panes with the correct text, and correct highlighting
                setJTextPane(gamePanels.get(i).getLastPlayPane(), parts, compareNames, compareNames2);
            } catch (IndexOutOfBoundsException e) {
                continue;
            }

            try {
                String situation = nav.getSituation(i);
                String time = nav.getTime(i);

                gamePanels.get(i).getGameTimeLabel().setText(time + " " + situation);
            } catch (IndexOutOfBoundsException e) {
                continue;
            }

            gamePanels.get(i).getGameStatusLabel().setText(nav.getDownDistance(i));

        }
    }

    public void setUpPlayers(ArrayList<PlayerPanel> playerPanels, ArrayList<TeamInfoPanel> infoPanels) {
        for (int i = 0; i < infoPanels.size(); i++) {
            infoPanels.get(i).getTeamName().setText(nav.getFantasyTeamName(i));
            infoPanels.get(i).getTeamOwner().setText(nav.getFantasyOwner(i));
            infoPanels.get(i).getToPlay().setText(nav.getToPlay(i));
            infoPanels.get(i).getInPlay().setText(nav.getInPlay(i));
            infoPanels.get(i).getProjection().setText(nav.getProjection(i));
            infoPanels.get(i).getTotalScore().setText(nav.getTotalScore(i));
        }

        int j = 0;
        for (int i = 0; i < 33; i += 2) {
            //grab the two player names of the slot, and set them to each team
            try {
                playerPanels.get(i).getName().setText(nav.getPlayerName(j, 0));
            } catch (IndexOutOfBoundsException eio) {
                playerPanels.get(i).getName().setText("empty");
            }

            try {
                playerPanels.get(i + 1).getName().setText(nav.getPlayerName(j, 1));
            } catch (IndexOutOfBoundsException eio2) {
                playerPanels.get(i + 1).getName().setText("empty");
            }
            //grab the two player scores and set them
            playerPanels.get(i).getScore().setText(nav.getPlayerScore(j, 1));
            playerPanels.get(i + 1).getScore().setText(nav.getPlayerScore(j, 6));

            //check if a player is on offense/defense/redzone
            String className1 = nav.getPlayerState(j, 0);
            String className2 = nav.getPlayerState(j, 5);

            //check the state of the player - pregame, in game, or postgame
            String playerGameState1 = nav.getPlayerGameState(j, 0);
            String playerGameState2 = nav.getPlayerGameState(j, 1);

            //check the current state of player 1 and set correct highlighting
            setupPlayerState(className1, playerPanels.get(i).getPanel());
            setupPlayerState(className2, playerPanels.get(i + 1).getPanel());

            //check the status of player 1 and set the label color
            setupGameState(playerGameState1, playerPanels.get(i).getName(), playerPanels.get(i).getGame(), playerPanels.get(i).getScore(), playerPanels.get(i).getStats(), i);
            setupGameState(playerGameState2, playerPanels.get(i + 1).getName(), playerPanels.get(i + 1).getGame(), playerPanels.get(i + 1).getScore(), playerPanels.get(i + 1).getStats(), i);

            //check if the player1 game status has an eastern time in it and set it, if not, set it to blank
            if (!nav.containsET(j, 0)) {
                playerPanels.get(i).getStats().setText(nav.getPlayerStats(j, 0));
            } else {
                playerPanels.get(i).getStats().setText(" ");
            }

            //check if the player2 game status has an eastern time in it and set it, if not, set it to blank
            if (!nav.containsET(j, 1)) {
                playerPanels.get(i + 1).getStats().setText(nav.getPlayerStats(j, 0));
            } else {
                playerPanels.get(i + 1).getStats().setText(" ");
            }

            try {
                playerPanels.get(i).getGame().setText(nav.getGameStatus(j, 0));
            } catch (Exception e1) {
                playerPanels.get(i).getGame().setText(" ");
            }

            try {
                playerPanels.get(i + 1).getGame().setText(nav.getGameStatus(j, 1));
            } catch (Exception e2) {
                playerPanels.get(i + 1).getGame().setText(" ");
            }

            j++;
        }
    }

    public void checkForGameUpdates(ArrayList<GamePanel> gamePanels) {
        for (int i = 0; i < gamePanels.size(); i++) {
            try {
                String compare = gamePanels.get(i).getLastPlayPane().getText();
                compare = compare.replace("\n", "").replace("\r", "");

                if (!compare.equals(nav.getLastPlay(i))) {
                    //break the last play down into single strings
                    ArrayList<String> parts = new ArrayList<>(Arrays.asList(nav.getLastPlay(i).split(" ")));
                    //create and fill arrays for player names on teams
                    ArrayList<String> compareNames = nav.getYourPlayers(i);
                    ArrayList<String> compareNames2 = nav.getOpponentPlayers(i);

                    //execute the update
                    Timer t = new Timer(delay, new LastPlayListener(gamePanels.get(i).getLastPlayPane(), parts, compareNames, compareNames2));
                    t.setRepeats(false);
                    t.start();
                }
            } catch (IndexOutOfBoundsException | NullPointerException e) {
                continue;
            }
        }

        for (int i = 0; i < gamePanels.size(); i++) {
            try {
                //select the game start time
                String compare = nav.getSituation(i);
                String time = nav.getTime(i);

                compare = time + " " + compare;

                //check if it's different than on screen, start time for change if it is different
                if (!gamePanels.get(i).getGameTimeLabel().getText().equals(compare)) {
                    startLabelChange(gamePanels.get(i).getGameTimeLabel(), compare);
                }
            } catch (IndexOutOfBoundsException e) {
                continue;
            }
        }

        //get the current down/yardage and compare to what's on screen
        for (int i = 0; i < gamePanels.size(); i++) {
            try {
                String compare;
                try {
                    compare = nav.getDownDistance(i);
                } catch (Exception e) {
                    compare = "Game Not Started";
                }
                if (!gamePanels.get(i).getGameStatusLabel().getText().equals(compare)) {
                    startLabelChange(gamePanels.get(i).getGameStatusLabel(), compare);
                }
            } catch (IndexOutOfBoundsException e) {
                continue;
            }
        }

        //check if any of them have changed, and execute a timer to change if they are
        int j = 0;
        for (int i = 0; i < gamePanels.size(); i++) {
            try {
                String compare1 = nav.getAwayTeamName(j);
                String compare2 = nav.getHomeTeamName(j);

                if (!gamePanels.get(i).getAwayTeamLabel().getText().equals(compare1)) {
                    startLabelChange(gamePanels.get(i).getAwayTeamLabel(), compare1);
                }

                if (!gamePanels.get(i).getHomeTeamLabel().getText().equals(compare2)) {
                    startLabelChange(gamePanels.get(i).getHomeTeamLabel(), compare2);
                }
                j++;
            } catch (IndexOutOfBoundsException e) {
                continue;
            }
        }

        //check if any are different and execute timer if they are
        j = 1;
        for (int i = 0; i < gamePanels.size(); i++) {
            try {
                String compare1 = nav.getAwayScore(j);
                String compare2 = nav.getHomeScore(j);

                if (!gamePanels.get(i).getAwayScoreLabel().getText().equals(compare1)) {
                    System.out.println("Making a change i="+i);
                    startLabelChange(gamePanels.get(i).getAwayScoreLabel(), compare1);
                }

                if (!gamePanels.get(i).getHomeScoreLabel().getText().equals(compare2)) {
                    startLabelChange(gamePanels.get(i).getHomeScoreLabel(), compare2);
                }

                j+=2;
            } catch (IndexOutOfBoundsException e) {
                continue;
            }
        }

    }

    public void checkForPlayerUpdates(ArrayList<PlayerPanel> playerPanels, ArrayList<TeamInfoPanel> infoPanels) {

        //check if it's different and change if needed
        for (int i = 0; i < infoPanels.size(); i++) {
            String compare = nav.getToPlay(i);
            if (!infoPanels.get(i).getToPlay().getText().equals(compare)) {
                startLabelChange(infoPanels.get(i).getToPlay(), compare);
            }

            compare = nav.getInPlay(i);
            if (!infoPanels.get(i).getInPlay().getText().equals(compare)) {
                startLabelChange(infoPanels.get(i).getInPlay(), compare);
            }

            compare = nav.getProjection(i);
            if (!infoPanels.get(i).getProjection().equals(compare)) {
                startLabelChange(infoPanels.get(i).getProjection(), compare);
            }

            compare = nav.getTotalScore(i);
            if (!infoPanels.get(i).getTotalScore().getText().equals(compare)) {
                startLabelChange(infoPanels.get(i).getTotalScore(), compare);
            }
        }

        int j = 0;
        for (int i = 0; i < 33; i += 2) {
            //check player names for changes
            String nameCompare1 = nav.getPlayerName(j, 0);
            String nameCompare2 = nav.getPlayerName(j, 1);

            if (!playerPanels.get(i).getName().getText().equals(nameCompare1)) {
                startLabelChange(playerPanels.get(i).getName(), nameCompare1);
                //System.out.println("Making a change 11");
            }

            if (!playerPanels.get(i + 1).getName().getText().equals(nameCompare2)) {
                startLabelChange(playerPanels.get(i + 1).getName(), nameCompare2);
                //System.out.println("Making a change 12");
            }

            //get scores, and also player statuses
            String scoreCompare1 = nav.getPlayerScore(j, 1);
            String className1 = nav.getPlayerState(j, 0);
            String scoreCompare2 = nav.getPlayerScore(j, 6);
            String className2 = nav.getPlayerState(j, 5);

            String playerGameState1 = nav.getPlayerGameState(j, 0);
            String playerGameState2 = nav.getPlayerGameState(j, 1);

            //if a player is on offense, defense, or in redzone, set color
            updatePlayerState(className1, playerPanels.get(i).getPanel());
            updatePlayerState(className2, playerPanels.get(i + 1).getPanel());

            updateGameState(playerGameState1, playerPanels.get(i).getName(), playerPanels.get(i).getGame(), playerPanels.get(i).getScore(), playerPanels.get(i).getStats(), i);
            updateGameState(playerGameState2, playerPanels.get(i + 1).getName(), playerPanels.get(i + 1).getGame(), playerPanels.get(i + 1).getScore(), playerPanels.get(i + 1).getStats(), i);

            //check if either score is different and change if needed
            if (!playerPanels.get(i).getScore().getText().equals(scoreCompare1)) {
                startLabelChange(playerPanels.get(i).getScore(), scoreCompare1);
                //System.out.println("Making a change 27");
            }

            if (!playerPanels.get(i + 1).getScore().getText().equals(scoreCompare2)) {
                startLabelChange(playerPanels.get(i + 1).getScore(), scoreCompare2);
                //System.out.println("Making a change 28");
            }

            //grab player stats
            String statCompare1;
            String statCompare2;

            //set the comparisons and check if they are different and change if needed
            if (!nav.containsET(j, 0)) {
                statCompare1 = nav.getPlayerStats(j, 0);
            } else {
                statCompare1 = " ";
            }
            if (!nav.containsET(j, 1)) {
                statCompare2 = nav.getPlayerStats(j, 1);
            } else {
                statCompare2 = " ";
            }

            if (!playerPanels.get(i).getStats().getText().equals(statCompare1)) {
                startLabelChange(playerPanels.get(i).getStats(), statCompare1);
                //System.out.println("Making a change 29");
            }

            if (!playerPanels.get(i + 1).getStats().getText().equals(statCompare2)) {
                startLabelChange(playerPanels.get(i + 1).getStats(), statCompare2);
                //System.out.println("Making a change 30");
            }

            //check if there is any game information and change if needed
            String gameCompare1;
            String gameCompare2;

            try {
                gameCompare1 = nav.getGameStatus(j, 0);
            } catch (Exception e1) {
                gameCompare1 = " ";
            }

            try {
                gameCompare2 = nav.getGameStatus(j, 1);
            } catch (Exception e2) {
                gameCompare2 = " ";
            }

            if (!playerPanels.get(i).getGame().getText().equals(gameCompare1)) {
                startLabelChange(playerPanels.get(i).getGame(), gameCompare1);
                //System.out.println("Making a change 31");
            }

            if (!playerPanels.get(i + 1).getGame().getText().equals(gameCompare2)) {
                startLabelChange(playerPanels.get(i + 1).getGame(), gameCompare2);
                //System.out.println("Making a change 32");
            }

            j++;
        }
    }

    public void prepareScrollPane(JScrollPane pane) {
        pane.getVerticalScrollBar().setUnitIncrement(16);
        pane.getVerticalScrollBar().setBackground(Colors.DARKGREY);
        pane.getVerticalScrollBar().setForeground(Colors.DARKGREY);
    }

    public void removeUnusedPanels(ArrayList<JPanel> panels, ArrayList<JTextPane> plays) {
        //check if a panel is being used, and if not, get rid of it
        try {
            for (int i = 0; i < plays.size(); i++) {
                if (plays.get(i).getText().equals("")) {
                    panels.get(i).setVisible(false);
                    //panels.remove(i);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setupGameState(String gameState, JLabel name, JLabel game, JLabel score, JLabel stats, int i) {
        if (gameState.contains("activegame") && i < 18) {
            name.setForeground(Color.WHITE);
            score.setForeground(Color.WHITE);
            game.setForeground(Colors.ACTIVEYELLOW);
            stats.setForeground(Color.WHITE);
        } else if (gameState.contains("completedgame") && i < 18) {
            name.setForeground(Colors.PREGREY);
            score.setForeground(Colors.POSTYELLOW);
            game.setForeground(Colors.PREYELLOW);
            stats.setForeground(Colors.PREGREY);
        } else {
            name.setForeground(Colors.PREGREY);
            score.setForeground(Colors.PREGREY);
            stats.setForeground(Colors.PREGREY);
            if (i < 18) {
                game.setForeground(Colors.PREYELLOW);
            } else {
                game.setForeground(Colors.PREGREY);
            }

        }
    }

    public void setupPlayerState(String className, JPanel panel) {
        if (className.contains("playerOFFENSE") && !className.contains("playerREDZONE")) {
            panel.setBackground(Colors.OFFENSE);
        } else if (className.contains("playerDEFENSE") && !className.contains("playerREDZONE")) {
            panel.setBackground(Colors.DEFENSE);
        } else if (className.contains("playerREDZONE")) {
            panel.setBackground(Colors.REDZONE);
        } else if (!panel.getBackground().equals(Colors.DARKGREY)) {
            panel.setBackground(Colors.DARKGREY);
        }
    }

    public void setJTextPane(JTextPane jtp, ArrayList<String> parts, ArrayList<String> compareNames, ArrayList<String> compareNames2) {
        //clear the text
        jtp.setText("");

        //create objects needed for changing text
        StyledDocument sd = jtp.getStyledDocument();
        Style style = jtp.addStyle("Color red", null);
        StyleConstants.setForeground(style, Color.WHITE);

        String text = "";
        for (int i = 0; i < parts.size(); i++) {
            //create check for if anything has been changed yet
            boolean added = false;
            try {
                //check if any of the names in the last play are on your team, change color if they are

                //if the last part of the string didn't match a name, add it normally
                if (!added) {
                    StyleConstants.setForeground(style, Color.WHITE);
                    sd.insertString(sd.getLength(), parts.get(i), style);
                    text += parts.get(i);
                }
                //add a space if this isn't the last word
                if (i != parts.size() - 1) {
                    sd.insertString(sd.getLength(), " ", style);
                    text += " ";
                }
                //add a line break between fantasy teams if this is before the start of the game 
                if (parts.get(i).equals("player") || parts.get(i).equals("players")
                        || parts.get(i).equals("pts") || parts.get(i).equals("Performers")) {
                    sd.insertString(sd.getLength(), "\n", style);
                    text += "\n";
                }
            } catch (BadLocationException b) {
                System.out.println("string append failed");
            }
        }

        try {
            for (String s : compareNames) {
                if (sd.getText(0, sd.getLength()).contains(s)) {
                    StyleConstants.setForeground(style, new Color(255, 255, 0));
                    sd.setCharacterAttributes(sd.getText(0, sd.getLength()).indexOf(s), s.length(), style, true);
                }
            }
            //check if any of the names in the last play are on their team, change color if they are
            for (String s : compareNames2) {
                if (sd.getText(0, sd.getLength()).contains(s)) {
                    StyleConstants.setForeground(style, new Color(102, 102, 102));
                    sd.setCharacterAttributes(sd.getText(0, sd.getLength()).indexOf(s), s.length(), style, true);
                }
            }
        } catch (BadLocationException ble) {

        }

    }

    public void setPlayerImages(ArrayList<PlayerPanel> playerPanels) {
        int j = 0;
        for (int i = 0; i < playerPanels.size(); i += 2) {
            try {
                try {
                    URL imageURL1 = nav.getPlayerImage(i);
                    playerPanels.get(i).getImage().setIcon(new ImageIcon(imageURL1, ""));
                } catch (IndexOutOfBoundsException ex) {
                    String url1 = nav.getDefenseLogo(i);
                    url1 = url1.substring(url1.indexOf("(") + 1);
                    url1 = url1.substring(0, url1.indexOf(")"));
                    URL imageURL1 = new URL(url1);
                    playerPanels.get(i).getImage().setIcon(new ImageIcon(imageURL1, ""));
                }

                try {
                    URL imageURL2 = nav.getPlayerImage(i + 1);
                    playerPanels.get(i + 1).getImage().setIcon(new ImageIcon(imageURL2, ""));
                } catch (IndexOutOfBoundsException ex) {
                    String url2 = nav.getDefenseLogo(i + 1);
                    url2 = url2.substring(url2.indexOf("(") + 1);
                    url2 = url2.substring(0, url2.indexOf(")"));
                    URL imageURL2 = new URL(url2);
                    playerPanels.get(i + 1).getImage().setIcon(new ImageIcon(imageURL2, ""));
                }
            } catch (Exception e) {
                continue;
            }
        }
    }

    public void setPossesionIcons(ArrayList<GamePanel> gamePanels) throws IOException {
        for (int i = 0; i < gamePanels.size(); i++) {
            try {
                String baseString = nav.getPossessionIcon(i);
                int x = Integer.parseInt(baseString.substring(baseString.indexOf(":-") + 2, baseString.indexOf("px")));
                int y = Integer.parseInt(baseString.substring(baseString.indexOf("-", baseString.indexOf("px") + 2) + 1, baseString.indexOf("px", baseString.indexOf("px") + 2)));

                BufferedImage source = ImageIO.read(new File("Logos.png"));
                BufferedImage crop = source.getSubimage(x, y, 30, 25);

                gamePanels.get(i).getPossession().setIcon(new ImageIcon(crop));
                gamePanels.get(i).setImgX(x);
                gamePanels.get(i).setImgY(y);
            } catch (Exception e) {
                gamePanels.get(i).getPossLabel().setVisible(false);
                gamePanels.get(i).setImgX(-1);
                gamePanels.get(i).setImgY(-1);
                continue;
            }

        }

    }

    public void checkForPossessionUpdate(ArrayList<GamePanel> gamePanels) throws IOException {
        for (int i = 0; i < gamePanels.size(); i++) {
            try {
                String baseString = nav.getPossessionIcon(i);
                int x = Integer.parseInt(baseString.substring(baseString.indexOf(":-") + 2, baseString.indexOf("px")));
                int y = Integer.parseInt(baseString.substring(baseString.indexOf("-", baseString.indexOf("px") + 2) + 1, baseString.indexOf("px", baseString.indexOf("px") + 2)));

                if (gamePanels.get(i).getImgX() != x || gamePanels.get(i).getImgY() != y) {
                    BufferedImage source = ImageIO.read(new File("Logos.png"));
                    BufferedImage crop = source.getSubimage(x, y, 30, 25);

                    Timer t = new Timer(delay, new ImageChanger(crop, gamePanels.get(i).getPossession()));
                    t.setRepeats(false);
                    t.start();

                    Timer tt = new Timer(delay, new LabelVisibility(gamePanels.get(i).getPossLabel(), true));
                    tt.setRepeats(false);
                    tt.start();

                    gamePanels.get(i).setImgX(x);
                    gamePanels.get(i).setImgY(y);
                }
            } catch (Exception e) {
                if (gamePanels.get(i).getImgX() != -1 || gamePanels.get(i).getImgY() != -1) {
                    Timer t = new Timer(delay, new LabelVisibility(gamePanels.get(i).getPossLabel(), false));
                    t.setRepeats(false);
                    t.start();

                    Timer tt = new Timer(delay, new ImageChanger(null, gamePanels.get(i).getPossession()));
                    tt.setRepeats(false);
                    tt.start();
                    gamePanels.get(i).setImgX(-1);
                    gamePanels.get(i).setImgY(-1);
                }
            }

        }

    }

    public void setTeamLogos(ArrayList<GamePanel> gamePanels) throws IOException {
        int j = 0;
        for (int i = 0; i < 32; i += 2) {
            try {
                String baseString = nav.getTeamLogo(i);
                int x = Integer.parseInt(baseString.substring(baseString.indexOf(":-") + 2, baseString.indexOf("px")));
                int y = Integer.parseInt(baseString.substring(baseString.indexOf("-", baseString.indexOf("px") + 2) + 1, baseString.indexOf("px", baseString.indexOf("px") + 2)));

                BufferedImage source = ImageIO.read(new File("TeamLogos.png"));
                BufferedImage crop = source.getSubimage(x, y, 12, 12);

                gamePanels.get(j).setAwayIconX(x);
                gamePanels.get(j).setAwayIconY(y);
                gamePanels.get(j).getAwayLogo().setIcon(new ImageIcon(crop));

                baseString = nav.getTeamLogo(i + 1);
                x = Integer.parseInt(baseString.substring(baseString.indexOf(":-") + 2, baseString.indexOf("px")));
                y = Integer.parseInt(baseString.substring(baseString.indexOf("-", baseString.indexOf("px") + 2) + 1, baseString.indexOf("px", baseString.indexOf("px") + 2)));

                source = ImageIO.read(new File("TeamLogos.png"));
                crop = source.getSubimage(x, y, 12, 12);

                gamePanels.get(j).setHomeIconX(x);
                gamePanels.get(j).setHomeIconY(y);
                gamePanels.get(j).getHomeLogo().setIcon(new ImageIcon(crop));
                j++;
            } catch (Exception e) {
                continue;
            }
        }
    }

    public void checkForTeamLogoUpdate(ArrayList<GamePanel> gamePanels) throws IOException {
        int j = 0;
        for (int i = 0; i < 32; i += 2) {
            try {
                String baseString = nav.getTeamLogo(i);
                int x = Integer.parseInt(baseString.substring(baseString.indexOf(":-") + 2, baseString.indexOf("px")));
                int y = Integer.parseInt(baseString.substring(baseString.indexOf("-", baseString.indexOf("px") + 2) + 1, baseString.indexOf("px", baseString.indexOf("px") + 2)));

                if (gamePanels.get(j).getAwayIconX() != x || gamePanels.get(j).getAwayIconY() != y) {
                    BufferedImage source = ImageIO.read(new File("TeamLogos.png"));
                    BufferedImage crop = source.getSubimage(x, y, 12, 12);

                    Timer t = new Timer(delay, new ImageChanger(crop, gamePanels.get(j).getAwayLogo()));
                    t.setRepeats(false);
                    t.start();

                    gamePanels.get(j).setAwayIconX(x);
                    gamePanels.get(j).setAwayIconY(y);
                }

                baseString = nav.getTeamLogo(i + 1);
                x = Integer.parseInt(baseString.substring(baseString.indexOf(":-") + 2, baseString.indexOf("px")));
                y = Integer.parseInt(baseString.substring(baseString.indexOf("-", baseString.indexOf("px") + 2) + 1, baseString.indexOf("px", baseString.indexOf("px") + 2)));

                if (gamePanels.get(j).getHomeIconX() != x || gamePanels.get(j).getHomeIconY() != y) {
                    BufferedImage source = ImageIO.read(new File("TeamLogos.png"));
                    BufferedImage crop = source.getSubimage(x, y, 12, 12);

                    Timer t = new Timer(delay, new ImageChanger(crop, gamePanels.get(j).getHomeLogo()));
                    t.setRepeats(false);
                    t.start();

                    gamePanels.get(j).setHomeIconX(x);
                    gamePanels.get(j).setHomeIconY(y);
                }
                j++;
            } catch (Exception e) {
                continue;
            }
        }
    }

    public void updateGameState(String gameState, JLabel name, JLabel game, JLabel score, JLabel stats, int i) {
        if (gameState.contains("activegame") && i < 18) { //&& 
            if (!name.getForeground().equals(Color.WHITE)) {
                //System.out.println("Making a change 23");
                startLabelColorChange(name, Color.WHITE);
                startLabelColorChange(score, Color.WHITE);
                startLabelColorChange(game, Colors.ACTIVEYELLOW);
                startLabelColorChange(stats, Color.WHITE);
            }
        } else if (gameState.contains("completedgame") && i < 18) {
            if (!score.getForeground().equals(Colors.POSTYELLOW)) {
                //System.out.println("Making a comlpeted game change 24");
                startLabelColorChange(name, Colors.PREGREY);
                startLabelColorChange(score, Colors.POSTYELLOW);
                startLabelColorChange(game, Colors.PREYELLOW);
                startLabelColorChange(stats, Colors.PREGREY);
            }
        } else {
            if (!score.getForeground().equals(Colors.PREGREY)) {
                //System.out.println("Making a change 24");
                startLabelColorChange(name, Colors.PREGREY);
                startLabelColorChange(score, Colors.PREGREY);
                startLabelColorChange(stats, Colors.PREGREY);
                if (i < 18) {
                    startLabelColorChange(game, Colors.PREYELLOW);
                } else {
                    startLabelColorChange(game, Colors.PREGREY);
                }
            }

        }
    }

    public void updatePlayerState(String className, JPanel panel) {
        if (className.contains("playerOFFENSE") && !className.contains("playerREDZONE")) {
            if (!panel.getBackground().equals(Colors.OFFENSE)) {
                startColorChange(panel, Colors.OFFENSE);
                //System.out.println("Making a change 13");
            }
        } else if (className.contains("playerDEFENSE") && !className.contains("playerREDZONE")) {
            if (!panel.getBackground().equals(Colors.DEFENSE)) {
                startColorChange(panel, Colors.DEFENSE);
                //System.out.println("Making a change 14");
            }
        } else if (className.contains("playerREDZONE")) {
            if (!panel.getBackground().equals(Colors.REDZONE)) {
                startColorChange(panel, Colors.REDZONE);
                //System.out.println("Making a change 15");
            }
        } else if (!panel.getBackground().equals(Colors.DARKGREY)) {
            startColorChange(panel, Colors.DARKGREY);
            //System.out.println("Making a change 17");
        }
    }

    public void createNotification(String team1, String team2, String score1, String score2, String notificationText, String gameStatus) {
        Timer t1 = new Timer(delay, (ActionEvent e) -> {
            JDialog notification = new NotificationDialog(mainFrame, false, team1, team2, score1, score2, notificationText, gameStatus);
            notification.setLocation(mainFrame.getX() + mainFrame.getWidth() - notification.getWidth(), mainFrame.getY() + mainFrame.getHeight() - notification.getHeight());
            notification.setVisible(true);
            Timer t2 = new Timer(10000, (ev) -> {
                notification.dispose();
            });
            t2.setRepeats(false);
            t2.start();
        });
        t1.setRepeats(false);
        t1.start();
    }

    public void checkForScoringNotification() {
        try {
            Elements selected = nav.getNotificationInfo();

            String notificationText = "";
            String team1 = "";
            String team2 = "";
            String score1 = "";
            String score2 = "";
            String gameStatus = "";

            if (!selected.isEmpty()) {
                notificationText = selected.select("span#toast_gameMessage").text();
                team1 = selected.select("span#toast_awayTeam").text();
                team2 = selected.select("span#toast_homeTeam").text();
                score1 = selected.select("div#toast_awayTeamScore").text();
                score2 = selected.select("div#toast_homeTeamScore").text();
                gameStatus = selected.select("span#toast_gameStatus").text();

                if (!notificationText.equals(lastNotification) && !notificationText.equals("\n\n\n\n\n")) {
                    System.out.println("I need to make a call to notification");
                    lastNotification = notificationText;
                    createNotification(team1, team2, score1, score2, notificationText, gameStatus);
                }
            } else {
            }

        } catch (Exception e) {
            System.out.println("here");
        }
    }

    public void startLabelChange(JLabel label, String change) {
        Timer t = new Timer(delay, new LabelChanger(label, change));
        t.setRepeats(false);
        t.start();
    }

    public static void startColorChange(JPanel panel, Color color) {
        Timer t = new Timer(delay, new ColorChanger(panel, color));
        t.setRepeats(false);
        t.start();
    }

    public static void startLabelColorChange(JLabel label, Color color) {
        Timer t = new Timer(delay, new LabelColorChanger(label, color));
        t.setRepeats(false);
        t.start();
    }

}
