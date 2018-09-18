/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DelayedFootball;

import Constants.Colors;
import DelayedFootball.ActionListeners.ColorChanger;
import DelayedFootball.ActionListeners.DialogCloser;
import DelayedFootball.ActionListeners.LabelChanger;
import DelayedFootball.ActionListeners.LabelColorChanger;
import DelayedFootball.ActionListeners.LastPlayListener;
import DelayedFootball.ActionListeners.WindowClosingListener;
import DelayedFootball.UserInterfaces.ErrorDialog;
import DelayedFootball.UserInterfaces.Fantasycast;
import DelayedFootball.UserInterfaces.LinkDialog;
import DelayedFootball.UserInterfaces.NotificationDialog;
import DelayedFootball.UserInterfaces.ProgressBar;
import java.awt.Color;
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
import javax.swing.UIManager;
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

    private ChromeDriver fantasycast;
    private ChromeDriver scoreAlerts;
    private ChromeOptions chromeOptions;

    private Document doc;

    private LinkDialog links;

    private ArrayList<PlayerPanel> playerPanels = new ArrayList<>();
    private ArrayList<GamePanel> gamePanels = new ArrayList<>();
    private ArrayList<TeamInfoPanel> infoPanels = new ArrayList<>();

    private static String lastNotification;
    private String url;

    private static int delay;

    private static Fantasycast mainFrame;

    public Manager() {
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--mute-audio");
        url = "";
        mainFrame = new Fantasycast();

    }

    @Override
    public void run() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        new Thread(() -> {
            fantasycast = new ChromeDriver(chromeOptions);
            scoreAlerts = new ChromeDriver(chromeOptions);
            scoreAlerts.get("http://games.espn.com/ffl/scoreboard?leagueId=19116&seasonId=2018");
        }).start();

        links = new LinkDialog(null, true, this);
        links.addWindowListener(new DialogCloser());
        links.setVisible(true);

        lastNotification = "";

        ProgressBar progress = new ProgressBar(null, false);
        progress.setVisible(true);

        try {
            while (true) {
                try {
                    fantasycast.get(url);
                    doc = Jsoup.parse(fantasycast.getPageSource());
                    break;
                } catch (NullPointerException ex) {
                    continue;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            fantasycast.close();
            scoreAlerts.close();
            ErrorDialog ed = new ErrorDialog(new JFrame(), true);
            ed.setText(e.getMessage());
            ed.setVisible(true);
            System.exit(0);
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
                frame.addWindowListener(new WindowClosingListener(fantasycast, scoreAlerts));
                frame.setTitle("ESPN Delayed Fantasycast");
                frame.pack();
                frame.setVisible(true);
            }

        });

        Document temp = Jsoup.parse(scoreAlerts.getPageSource());
        try {
            Elements tempE = temp.select("div#toastDiv");

            if (!tempE.isEmpty()) {
                lastNotification = tempE.select("span#toast_gameMessage").text();
            }
        } catch (Exception e) {

        }

        while (true) {
            try {
                doc = Jsoup.parse(fantasycast.getPageSource());
                checkForGameUpdates(gamePanels, doc);
                checkForPlayerUpdates(playerPanels, infoPanels, doc);
                checkForScoringNotification(scoreAlerts);
                Thread.sleep(50);
            } catch (Exception e) {
                break;
            }
        }

        //exit the driver before closing
        try {
            fantasycast.quit();
            scoreAlerts.quit();
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
            setPlayerImages(playerPanels, doc);
            setTeamLogos(gamePanels, doc);
            setPossesionIcons(gamePanels, doc);
        } catch (Exception e) {
            System.out.println("loading images failed");
        }

        setUpGames(gamePanels, doc);
        setUpPlayers(playerPanels, infoPanels, doc);
    }

    public static void setUpGames(ArrayList<GamePanel> gamePanels, Document doc) {
        //select the home and away teams by their class
        Elements awayTeamNames = doc.getElementsByClass("away-abbrev");
        Elements homeTeamNames = doc.getElementsByClass("home-abbrev");
        Elements awayScores = doc.getElementsByClass("away-score");
        Elements homeScores = doc.getElementsByClass("home-score");
        Elements lastPlays = doc.getElementsByClass("ref-parent");
        Elements status = doc.getElementsByClass("situation");

        //set the team names up in the game scroll pane
        int j = 0;
        for (int i = 0; i < gamePanels.size(); i++) {
            try {
                gamePanels.get(i).getAwayTeamLabel().setText(awayTeamNames.get(i).text());
                gamePanels.get(i).getHomeTeamLabel().setText(homeTeamNames.get(i).text());
            } catch (IndexOutOfBoundsException e) {
                continue;
            }

            try {
                gamePanels.get(i).getAwayScoreLabel().setText(awayScores.get(j).text());
                gamePanels.get(i).getHomeScoreLabel().setText(homeScores.get(j).text());
                j += 2;
            } catch (IndexOutOfBoundsException e) {
                continue;
            }

            try {
                //figure out if any players in the last play are on your team or the opponent team
                Elements names = lastPlays.get(i).getElementsByClass("your-player");
                Elements names2 = lastPlays.get(i).getElementsByClass("opp-player");

                //break down the last play into single words so that they can be comapred
                ArrayList<String> parts = new ArrayList<>(Arrays.asList(lastPlays.get(i).text().split(" ")));

                //create and fill arraylists for your team and opponent team
                ArrayList<String> compareNames = new ArrayList<>();
                ArrayList<String> compareNames2 = new ArrayList<>();

                for (Element el : names) {
                    compareNames.add(el.text());
                }
                for (Element el : names2) {
                    compareNames2.add(el.text());
                }

                //set up the last play text panes with the correct text, and correct highlighting
                setJTextPane(gamePanels.get(i).getLastPlayPane(), parts, compareNames, compareNames2);
            } catch (IndexOutOfBoundsException e) {
                continue;
            }

            try {
                String situation = status.get(i).getElementsByClass("period").get(0).text();
                String time = status.get(i).getElementsByClass("time").get(0).text();

                if (situation.equals("")) {
                    situation = status.get(i).getElementsByClass("time").get(0).text();
                } else {
                    gamePanels.get(i).getGameTimeLabel().setText(time + " " + situation);
                }

            } catch (IndexOutOfBoundsException e) {
                continue;
            }

            try {
                gamePanels.get(i).getGameStatusLabel().setText(status.get(i).getElementsByClass("down-distance").get(0).text());
            } catch (Exception e) {
                gamePanels.get(i).getGameStatusLabel().setText("Game Not Started");
            }
        }
    }

    public static void setUpPlayers(ArrayList<PlayerPanel> playerPanels, ArrayList<TeamInfoPanel> infoPanels, Document doc) {

        //grab the fantasy team names and set them
        Elements info;
        Elements points = doc.getElementsByClass("points");

        for (int i = 0; i < infoPanels.size(); i++) {
            info = doc.getElementsByClass("teamName");
            infoPanels.get(i).getTeamName().setText(info.get(i).text());

            info = doc.getElementsByClass("owners");
            infoPanels.get(i).getTeamOwner().setText(info.get(i).text());

            info = doc.select("span[id^=team_ytp]");
            infoPanels.get(i).getToPlay().setText("To Play: " + info.get(i).text());

            info = doc.select("span[id^=team_ip]");
            infoPanels.get(i).getInPlay().setText("In Play: " + info.get(i).text());

            info = doc.select("span[id^=team_liveproj]");
            infoPanels.get(i).getProjection().setText("Proj: " + info.get(i).text());

            infoPanels.get(i).getTotalScore().setText(points.get(i).getElementsByTag("span").get(0).text());
        }

        //grab each row of players abd information
        Elements slots = doc.getElementsByClass("slot");

        int j = 0;
        for (int i = 0; i < 33; i += 2) {
            //grab the two player names of the slot, and set them to each team
            try {
                playerPanels.get(i).getName().setText(slots.get(j).getElementsByClass("playerName").get(0).text());
            } catch (IndexOutOfBoundsException eio) {
                playerPanels.get(i).getName().setText("empty");
            }

            try {
                playerPanels.get(i + 1).getName().setText(slots.get(j).getElementsByClass("playerName").get(1).text());
            } catch (IndexOutOfBoundsException eio2) {
                playerPanels.get(i + 1).getName().setText("empty");
            }
            //grab the two player scores and set them
            playerPanels.get(i).getScore().setText(slots.get(j).getElementsByTag("td").get(1).text());
            playerPanels.get(i + 1).getScore().setText(slots.get(j).getElementsByTag("td").get(6).text());

            //check if a player is on offense/defense/redzone
            String className1 = slots.get(j).getElementsByTag("td").get(0).className();
            String className2 = slots.get(j).getElementsByTag("td").get(5).className();

            //check the state of the player - pregame, in game, or postgame
            String playerGameState1 = slots.get(j).select("td[class^=player proteam]").get(0).className();
            String playerGameState2 = slots.get(j).select("td[class^=player proteam]").get(1).className();

            //check the current state of player 1 and set correct highlighting
            setupPlayerState(className1, playerPanels.get(i).getPanel());
            setupPlayerState(className2, playerPanels.get(i + 1).getPanel());

            //check the status of player 1 and set the label color
            setupGameState(playerGameState1, playerPanels.get(i).getName(), playerPanels.get(i).getGame(), playerPanels.get(i).getScore(), playerPanels.get(i).getStats(), i);
            setupGameState(playerGameState2, playerPanels.get(i + 1).getName(), playerPanels.get(i + 1).getGame(), playerPanels.get(i + 1).getScore(), playerPanels.get(i + 1).getStats(), i);

            //check if the player1 game status has an eastern time in it and set it, if not, set it to blank
            if (!slots.get(j).getElementsByClass("status").get(0).text().contains("ET")) {
                playerPanels.get(i).getStats().setText(slots.get(j).getElementsByClass("playerstatsummary").get(0).text());
            } else {
                playerPanels.get(i).getStats().setText(" ");
            }

            //check if the player2 game status has an eastern time in it and set it, if not, set it to blank
            if (!slots.get(j).getElementsByClass("status").get(1).text().contains("ET")) {
                playerPanels.get(i + 1).getStats().setText(slots.get(j).getElementsByClass("playerstatsummary").get(1).text());
            } else {
                playerPanels.get(i + 1).getStats().setText(" ");
            }

            try {
                playerPanels.get(i).getGame().setText(slots.get(j).getElementsByClass("status").get(0).getElementsByClass("gamestatus").get(0).text());
            } catch (Exception e1) {
                playerPanels.get(i).getGame().setText(" ");
            }

            try {
                playerPanels.get(i + 1).getGame().setText(slots.get(j).getElementsByClass("status").get(1).getElementsByClass("gamestatus").get(0).text());
            } catch (Exception e2) {
                playerPanels.get(i + 1).getGame().setText(" ");
            }

            j++;
        }
    }

    public static void checkForGameUpdates(ArrayList<GamePanel> gamePanels, Document doc) {
        //select the last plays
        Elements selected = doc.getElementsByClass("ref-parent");

        for (int i = 0; i < selected.size(); i++) {
            try {
                //check if the play has changed

                String compare = gamePanels.get(i).getLastPlayPane().getText();
                compare = compare.replace("\n", "").replace("\r", "");

                if (!compare.equals(selected.get(i).text())) {
                    //check to see if anyone is on your/opponents team
                    Elements names = selected.get(i).getElementsByClass("your-player");
                    Elements names2 = selected.get(i).getElementsByClass("opp-player");

                    //break the last play down into single strings
                    ArrayList<String> parts = new ArrayList<>(Arrays.asList(selected.get(i).text().split(" ")));
                    //create and fill arrays for player names on teams
                    ArrayList<String> compareNames = new ArrayList<>();
                    ArrayList<String> compareNames2 = new ArrayList<>();
                    for (Element el : names) {
                        compareNames.add(el.text());
                    }
                    for (Element el : names2) {
                        compareNames2.add(el.text());
                    }

                    //execute the update
                    Timer t = new Timer(delay, new LastPlayListener(gamePanels.get(i).getLastPlayPane(), parts, compareNames, compareNames2));
                    //System.out.println("Making a change 1");
                    t.setRepeats(false);
                    t.start();
                }
            } catch (IndexOutOfBoundsException | NullPointerException e) {
                continue;
            }
        }

        //select the time/down information
        selected = doc.getElementsByClass("situation");

        for (int i = 0; i < gamePanels.size(); i++) {
            try {
                //select the game start time
                String compare = selected.get(i).getElementsByClass("period").get(0).text();
                String time = selected.get(i).getElementsByClass("time").get(0).text();

                //see if it's empty, if it is, get the time remaining instead
                if (compare.equals("")) {
                    compare = selected.get(i).getElementsByClass("time").get(0).text();
                } else {
                    compare = time + " " + compare;
                }

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
                    compare = selected.get(i).getElementsByClass("down-distance").get(0).text();
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

        //select all team names
        Elements awayTeamNames = doc.getElementsByClass("away-abbrev");
        Elements homeTeamNames = doc.getElementsByClass("home-abbrev");

        //check if any of them have changed, and execute a timer to change if they are
        int j = 0;
        for (int i = 0; i < gamePanels.size(); i++) {
            try {
                String compare1 = awayTeamNames.get(j).text();
                String compare2 = homeTeamNames.get(j).text();

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

        //select all team scores
        Elements awayScores = doc.getElementsByClass("away-score");
        Elements homeScores = doc.getElementsByClass("home-score");

        //check if any are different and execute timer if they are
        j = 0;
        for (int i = 0; i < gamePanels.size(); i++) {
            try {
                String compare1 = awayScores.get(i).text();
                String compare2 = homeScores.get(i).text();

                if (!gamePanels.get(i).getAwayScoreLabel().getText().equals(compare1)) {
                    startLabelChange(gamePanels.get(i).getAwayScoreLabel(), compare1);
                }

                if (!gamePanels.get(i).getHomeScoreLabel().getText().equals(compare2)) {
                    startLabelChange(gamePanels.get(i).getHomeScoreLabel(), compare2);
                }

                j++;
            } catch (IndexOutOfBoundsException e) {
                continue;
            }
        }

    }

    public static void checkForPlayerUpdates(ArrayList<PlayerPanel> playerPanels, ArrayList<TeamInfoPanel> infoPanels, Document doc) {

        //select left to play 
        Elements info;
        Elements points = doc.getElementsByClass("points");

        //check if it's different and change if needed
        for (int i = 0; i < infoPanels.size(); i++) {
            info = doc.select("span[id^=team_ytp]");

            String compare = "To Play: " + info.get(i).text();
            if (!infoPanels.get(i).getToPlay().getText().equals(compare)) {
                startLabelChange(infoPanels.get(i).getToPlay(), compare);
            }

            info = doc.select("span[id^=team_ip]");
            compare = "In Play: " + info.get(i).text();
            if (!infoPanels.get(i).getInPlay().getText().equals(compare)) {
                startLabelChange(infoPanels.get(i).getInPlay(), compare);
            }

            info = doc.select("span[id^=team_liveproj]");
            compare = "Proj: " + info.get(i).text();
            if (!infoPanels.get(i).getProjection().equals(compare)) {
                startLabelChange(infoPanels.get(i).getProjection(), compare);
                //System.out.println("Making a change 10");
            }

            compare = points.get(i).getElementsByTag("span").get(0).text();
            if (!infoPanels.get(i).getTotalScore().getText().equals(compare)) {
                startLabelChange(infoPanels.get(i).getTotalScore(), compare);
                //System.out.println("Making a change 33");
            }
        }

        //select player slots
        Elements slots = doc.getElementsByClass("slot");

        int j = 0;
        for (int i = 0; i < 33; i += 2) {
            //check player names for changes
            String nameCompare1 = slots.get(j).getElementsByClass("playerName").get(0).text();
            String nameCompare2 = slots.get(j).getElementsByClass("playerName").get(1).text();

            if (!playerPanels.get(i).getName().getText().equals(nameCompare1)) {
                startLabelChange(playerPanels.get(i).getName(), nameCompare1);
                //System.out.println("Making a change 11");
            }

            if (!playerPanels.get(i + 1).getName().getText().equals(nameCompare2)) {
                startLabelChange(playerPanels.get(i + 1).getName(), nameCompare2);
                //System.out.println("Making a change 12");
            }

            //get scores, and also player statuses
            String scoreCompare1 = slots.get(j).getElementsByTag("td").get(1).text();
            String className1 = slots.get(j).getElementsByTag("td").get(0).className();
            String scoreCompare2 = slots.get(j).getElementsByTag("td").get(6).text();
            String className2 = slots.get(j).getElementsByTag("td").get(5).className();

            String playerGameState1 = slots.get(j).select("td[class^=player proteam]").get(0).className();
            String playerGameState2 = slots.get(j).select("td[class^=player proteam]").get(1).className();

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
            if (!slots.get(j).getElementsByClass("status").get(0).text().contains("ET")) {
                statCompare1 = slots.get(j).getElementsByClass("playerstatsummary").get(0).text();
            } else {
                statCompare1 = " ";
            }
            if (!slots.get(j).getElementsByClass("status").get(1).text().contains("ET")) {
                statCompare2 = slots.get(j).getElementsByClass("playerstatsummary").get(1).text();
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
                gameCompare1 = slots.get(j).getElementsByClass("status").get(0).getElementsByClass("gamestatus").get(0).text();
            } catch (Exception e1) {
                gameCompare1 = " ";
            }

            try {
                gameCompare2 = slots.get(j).getElementsByClass("status").get(1).getElementsByClass("gamestatus").get(0).text();
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

    public static void prepareScrollPane(JScrollPane pane) {
        pane.getVerticalScrollBar().setUnitIncrement(16);
        pane.getVerticalScrollBar().setBackground(Colors.DARKGREY);
        pane.getVerticalScrollBar().setForeground(Colors.DARKGREY);
    }

    public static void setupGameState(String gameState, JLabel name, JLabel game, JLabel score, JLabel stats, int i) {
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

    public static void setupPlayerState(String className, JPanel panel) {
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

    public static void setJTextPane(JTextPane jtp, ArrayList<String> parts, ArrayList<String> compareNames, ArrayList<String> compareNames2) {
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

    public static void setPlayerImages(ArrayList<PlayerPanel> playerPanels, Document doc) {
        Elements imageSelector = doc.getElementsByClass("playerPhotoWrapper");

        int j = 0;
        for (int i = 0; i < playerPanels.size(); i += 2) {
            try {
                try {
                    URL imageURL1 = new URL(imageSelector.get(i).getElementsByTag("img").get(0).absUrl("src"));
                    playerPanels.get(i).getImage().setIcon(new ImageIcon(imageURL1, ""));
                } catch (IndexOutOfBoundsException ex) {
                    String url1 = imageSelector.get(i).getElementsByClass("fantasy-team-logo").get(0).attr("style");
                    url1 = url1.substring(url1.indexOf("(") + 1);
                    url1 = url1.substring(0, url1.indexOf(")"));
                    URL imageURL1 = new URL(url1);
                    playerPanels.get(i).getImage().setIcon(new ImageIcon(imageURL1, ""));
                }

                try {
                    URL imageURL2 = new URL(imageSelector.get(i + 1).getElementsByTag("img").get(0).absUrl("src"));
                    playerPanels.get(i + 1).getImage().setIcon(new ImageIcon(imageURL2, ""));
                } catch (IndexOutOfBoundsException ex) {
                    String url2 = imageSelector.get(i + 1).getElementsByClass("fantasy-team-logo").get(0).attr("style");
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

    public static void setPossesionIcons(ArrayList<GamePanel> gamePanels, Document doc) throws IOException {
        for (int i = 0; i < gamePanels.size(); i++) {
            try {
                String baseString = doc.getElementsByClass("logo").get(i).attr("style").toString();
                int x = Integer.parseInt(baseString.substring(baseString.indexOf(":-") + 2, baseString.indexOf("px")));
                int y = Integer.parseInt(baseString.substring(baseString.indexOf("-", baseString.indexOf("px") + 2) + 1, baseString.indexOf("px", baseString.indexOf("px") + 2)));

                BufferedImage source = ImageIO.read(new File("Logos.png"));
                BufferedImage crop = source.getSubimage(x, y, 30, 25);

                gamePanels.get(i).getPossession().setIcon(new ImageIcon(crop));
            } catch (Exception e) {
                gamePanels.get(i).getPossLabel().setVisible(false);
                continue;
            }

        }

    }

    public static void setTeamLogos(ArrayList<GamePanel> gamePanels, Document doc) throws IOException {
        int j = 0;
        for (int i = 0; i < 32; i += 2) {
            try {
                String baseString = doc.getElementsByClass("team-logo").get(i).attr("Style").toString();
                int x = Integer.parseInt(baseString.substring(baseString.indexOf(":-") + 2, baseString.indexOf("px")));
                int y = Integer.parseInt(baseString.substring(baseString.indexOf("-", baseString.indexOf("px") + 2) + 1, baseString.indexOf("px", baseString.indexOf("px") + 2)));

                BufferedImage source = ImageIO.read(new File("TeamLogos.png"));
                BufferedImage crop = source.getSubimage(x, y, 12, 12);

                gamePanels.get(j).getAwayLogo().setIcon(new ImageIcon(crop));

                baseString = doc.getElementsByClass("team-logo").get(i + 1).attr("Style").toString();
                x = Integer.parseInt(baseString.substring(baseString.indexOf(":-") + 2, baseString.indexOf("px")));
                y = Integer.parseInt(baseString.substring(baseString.indexOf("-", baseString.indexOf("px") + 2) + 1, baseString.indexOf("px", baseString.indexOf("px") + 2)));

                source = ImageIO.read(new File("TeamLogos.png"));
                crop = source.getSubimage(x, y, 12, 12);

                gamePanels.get(j).getHomeLogo().setIcon(new ImageIcon(crop));
                j++;
            } catch (Exception e) {
                continue;
            }
        }
    }

    public static void createNotification(String team1, String team2, String score1, String score2, String notificationText, String gameStatus) {
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

    public static void checkForScoringNotification(WebDriver d2) {

        Document doc1 = Jsoup.parse(d2.getPageSource());
        try {
            Elements selected = doc1.select("div#toastDiv");

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

    public static void startLabelChange(JLabel label, String change) {
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

    public static void updateGameState(String gameState, JLabel name, JLabel game, JLabel score, JLabel stats, int i) {
        if (gameState.contains("activegame") && i < 18) { //&& 
            if (!name.getForeground().equals(Color.WHITE)) {
                System.out.println("Making a change 23");
                startLabelColorChange(name, Color.WHITE);
                startLabelColorChange(score, Color.WHITE);
                startLabelColorChange(game, Colors.ACTIVEYELLOW);
                startLabelColorChange(stats, Color.WHITE);
            }
        } else if (gameState.contains("completedgame") && i < 18) {
            if (!score.getForeground().equals(Colors.POSTYELLOW)) {
                System.out.println("Making a comlpeted game change 24");
                startLabelColorChange(name, Colors.PREGREY);
                startLabelColorChange(score, Colors.POSTYELLOW);
                startLabelColorChange(game, Colors.PREYELLOW);
                startLabelColorChange(stats, Colors.PREGREY);
            }
        } else {
            if (!score.getForeground().equals(Colors.PREGREY)) {
                System.out.println("Making a change 24");
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

    public static void updatePlayerState(String className, JPanel panel) {
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

    public static void removeUnusedPanels(ArrayList<JPanel> panels, ArrayList<JTextPane> plays) {
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
}
