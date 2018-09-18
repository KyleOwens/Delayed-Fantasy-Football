/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DelayedFootball;

import DelayedFootball.UserInterfaces.Fantasycast;
import DelayedFootball.UserInterfaces.LinkDialog;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
import DelayedFootball.ActionListeners.ColorChanger;
import DelayedFootball.ActionListeners.DialogCloser;
import DelayedFootball.ActionListeners.LastPlayListener;
import DelayedFootball.ActionListeners.LabelChanger;
import DelayedFootball.ActionListeners.LabelColorChanger;
import DelayedFootball.ActionListeners.WindowClosingListener;
import DelayedFootball.UserInterfaces.ErrorDialog;
import DelayedFootball.UserInterfaces.NotificationDialog;
import DelayedFootball.UserInterfaces.ProgressBar;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author Kyle
 */
public class TestFantasy extends JFrame {

    private LinkDialog link;
    private static String lastNotification;
    private static String url;
    private static int delay;
    private boolean loaded;
    private ChromeDriver d;
    private ChromeDriver d1;
    private static ChromeDriver driver;
    private static ChromeDriver driver2;
    private static JFrame frame;
    private static final Color DARKGREY = new Color(60, 63, 65);
    private static final Color OFFENSE = new Color(155, 138, 67);
    private static final Color DEFENSE = new Color(145, 138, 115);
    private static final Color REDZONE = new Color(154, 20, 0);
    private static final Color PREYELLOW = new Color(166, 154, 123);
    private static final Color ACTIVEYELLOW = new Color(235, 221, 180);
    private static final Color POSTYELLOW = new Color(255, 234, 185);
    private static final Color PREGREY = new Color(102, 102, 108);

    public TestFantasy() {
        //display dialog to get link and set delay time
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        loaded = false;
        new Thread(() -> {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("--mute-audio");
            d = new ChromeDriver(chromeOptions);
            d1 = new ChromeDriver(chromeOptions);
            d1.get("http://games.espn.com/ffl/scoreboard?leagueId=19116&seasonId=2018");

            setDriver(d);
            setDriver2(d1);
        }).start();

        link = new LinkDialog(this, true);
        link.addWindowListener(new DialogCloser());
        link.setVisible(true);
        lastNotification = "";

    }

    public static void main(String[] args) throws IOException {
        System.out.println("let's see if this will commit");
//set the look and feel to black
        try {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel");
        } catch (Exception e) {
            ErrorDialog ed = new ErrorDialog(new JFrame(), true);
            ed.setText(e.getMessage());
            ed.setVisible(true);
            System.exit(0);
        }

        //pop up the dialog box
        TestFantasy t = new TestFantasy();

        //create the fantasycast
        Fantasycast mainFrame = new Fantasycast();
        frame = mainFrame;

        //set the link to the webdriver and create a new instance. Also declare teh document for Jsoup
        ProgressBar progress = new ProgressBar(new JFrame(), false);
        progress.setVisible(true);

        Document doc = Jsoup.parse("");
        //navigate the driver to the URL entered, have jsoup grab that information and then make the window small
        try {
            while (true) {
                try {
                    driver.get(url);
                    doc = Jsoup.parse(driver.getPageSource());
                    break;
                } catch (NullPointerException ex) {
                    continue;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            driver.close();
            driver2.close();
            ErrorDialog ed = new ErrorDialog(new JFrame(), true);
            ed.setText(e.getMessage());
            ed.setVisible(true);
            System.exit(0);
        }

        //grab all of the panels and labels needed to set up the game pane
        ArrayList<JPanel> gamePanels = mainFrame.getGamePanels();
        ArrayList<JLabel> teamNames = mainFrame.getTeamLabels();
        ArrayList<JLabel> gameTimes = mainFrame.getTimeLabels();
        ArrayList<JLabel> gameStatuses = mainFrame.getStatusLabels();
        ArrayList<JLabel> gameScores = mainFrame.getGameScores();
        ArrayList<JTextPane> lastPlays = mainFrame.getPlays();

        //set up the games scroll pane
        setUpGames(teamNames, gameTimes, gameStatuses, gameScores, lastPlays, driver, doc);

        //hide any extra game panels
        removeUnusedPanels(gamePanels, lastPlays);

        //grab all of the panels and labels needed to set up the players
        ArrayList<JPanel> playerPanels = mainFrame.getPlayerPanels();
        ArrayList<JPanel> mainPanels = mainFrame.getMainPanels();
        ArrayList<JLabel> playerNames = mainFrame.getPlayerNames();
        ArrayList<JLabel> playerGames = mainFrame.getPlayerGames();
        ArrayList<JLabel> playerStats = mainFrame.getPlayerStats();
        ArrayList<JLabel> playerScores = mainFrame.getPlayerScores();
        ArrayList<JLabel> totalScores = mainFrame.getTotalScores();
        ArrayList<JLabel> fantasyTeamNames = mainFrame.getFantasyTeamNames();
        ArrayList<JLabel> ownerNames = mainFrame.getOwnerNames();
        ArrayList<JLabel> toPlay = mainFrame.getToPlay();
        ArrayList<JLabel> inPlay = mainFrame.getInPlay();
        ArrayList<JLabel> projections = mainFrame.getProjections();
        ArrayList<JLabel> images = mainFrame.getImages();
        ArrayList<JLabel> possesionImages = mainFrame.getPossessionImages();
        ArrayList<JLabel> possesionLabels = mainFrame.getPosessionLabels();
        ArrayList<JLabel> teamLogos = mainFrame.getTeamLogos();

        progress.setVisible(false);

        //prepare the labels and text areas with correct background and text color
        prepareLabels(playerNames);
        preparePlayerStatuses(playerGames);
        prepareLabels(playerStats);
        prepareLabels(playerScores);
        prepareLabels(totalScores);
        prepareLabels(teamNames);
        prepareLabels(gameTimes);
        prepareLabels(gameStatuses);
        prepareLabels(gameScores);
        preparePanels(playerPanels);
        preparePanels(mainPanels);
        preparePanels(gamePanels);
        prepareTextAreas(lastPlays);

        //put information into the player slots
        setUpPlayers(playerNames, playerGames, playerStats, playerScores, totalScores, playerPanels, fantasyTeamNames,
                ownerNames, toPlay, inPlay, projections, doc);

        setPlayerImages(images, doc);

        setPossesionIcons(possesionImages, possesionLabels, doc);
        setTeamLogos(teamLogos, doc);

        //set the scroll speed and color or the scroll bars
        prepareScrollPane(mainFrame.getScrollPane());
        prepareScrollPane(mainFrame.getScrollPane2());

        //create the main frame, and run it. Creating it from the fantasycast pane
        SwingUtilities.invokeLater(
                new Runnable() {
            @Override
            public void run() {
                JFrame frame = mainFrame;
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.getContentPane().setBackground(new Color(60, 63, 65));
                frame.setContentPane(frame.getContentPane());
                frame.addWindowListener(new WindowClosingListener(driver, driver2));
                frame.setTitle("ESPN Delayed Fantasycast");
                frame.pack();
                frame.setVisible(true);
            }

        }
        );

        Document temp = Jsoup.parse(driver2.getPageSource());
        try {
            Elements tempE = temp.select("div#toastDiv");

            if (!tempE.isEmpty()) {
                lastNotification = tempE.select("span#toast_gameMessage").text();
            }
        } catch (Exception e) {

        }

        while (true) {
            try {
                doc = Jsoup.parse(driver.getPageSource());
                checkForGameUpdates(teamNames, gameTimes, gameStatuses, gameScores, lastPlays, driver, doc, delay);
                checkForPlayerUpdates(playerNames, playerGames, playerStats, playerScores, totalScores, playerPanels, toPlay, inPlay, projections, doc, delay);
                checkForScoringNotification(driver2);
                Thread.sleep(50);
            } catch (Exception e) {
                ErrorDialog ed = new ErrorDialog(new JFrame(), true);
                ed.setText(e.getMessage());
                ed.setVisible(true);
                break;
            }
        }

        //exit the driver before closing
        try {
            driver.quit();
            driver2.quit();
        } catch (Exception ex) {

        }
        System.exit(0);
    }

    public static void setUpGames(ArrayList<JLabel> teamLabels, ArrayList<JLabel> statusLabels, ArrayList<JLabel> gameStatuses, ArrayList<JLabel> gameScores, ArrayList<JTextPane> plays, WebDriver d, Document doc) {
        //select the home and away teams by their class
        Elements awayTeamNames = doc.getElementsByClass("away-abbrev");
        Elements homeTeamNames = doc.getElementsByClass("home-abbrev");

        //set the team names up in the game scroll pane
        int j = 0;
        for (int i = 0; i < teamLabels.size(); i += 2) {
            try {
                teamLabels.get(i).setText(awayTeamNames.get(j).text());
                teamLabels.get(i + 1).setText(homeTeamNames.get(j).text());
                j++;
            } catch (IndexOutOfBoundsException e) {
                continue;
            }
        }

        //select the scores by their classes
        Elements awayScores = doc.getElementsByClass("away-score");
        Elements homeScores = doc.getElementsByClass("home-score");

        //fill the game scores information in the game scroll pane
        j = 0;
        for (int i = 0; i < gameScores.size(); i += 2) {
            try {
                gameScores.get(i).setText(awayScores.get(i).text());
                gameScores.get(i + 1).setText(homeScores.get(i).text());
                j++;
            } catch (IndexOutOfBoundsException e) {
                continue;
            }
        }

        //select the last plays
        Elements lastPlays = doc.getElementsByClass("ref-parent");

        //set the last plays text
        for (int i = 0; i < plays.size(); i++) {
            try {
                //figure out if any players in the last play are on your team or the opponent team
                Elements names = lastPlays.get(i).getElementsByClass("your-player");
                Elements names2 = lastPlays.get(i).getElementsByClass("opp-player");

                //break down the last play into single words so that they can be comapred
                ArrayList<String> parts = new ArrayList<String>(Arrays.asList(lastPlays.get(i).text().split(" ")));

                //create and fill arraylists for your team and opponent team
                ArrayList<String> compareNames = new ArrayList<String>();
                ArrayList<String> compareNames2 = new ArrayList<String>();

                for (Element el : names) {
                    compareNames.add(el.text());
                }
                for (Element el : names2) {
                    compareNames2.add(el.text());
                }

                //set up the last play text panes with the correct text, and correct highlighting
                setJTextPane(plays.get(i), parts, compareNames, compareNames2);
            } catch (IndexOutOfBoundsException e) {
                continue;
            }
        }

        //grab the game information
        Elements status = doc.getElementsByClass("situation");

        //set the game times up
        for (int i = 0; i < statusLabels.size(); i++) {
            try {
                String situation = status.get(i).getElementsByClass("period").get(0).text();
                String time = status.get(i).getElementsByClass("time").get(0).text();

                if (situation.equals("")) {
                    situation = status.get(i).getElementsByClass("time").get(0).text();
                } else {
                    statusLabels.get(i).setText(time + " " + situation);
                }

            } catch (IndexOutOfBoundsException e) {
                continue;
            }
        }

        //set up the down and distance labels
        for (int i = 0; i < gameStatuses.size(); i++) {
            try {
                gameStatuses.get(i).setText(status.get(i).getElementsByClass("down-distance").get(0).text());
            } catch (Exception e) {
                gameStatuses.get(i).setText("Game Not Started");
            }
        }

    }

    public static void setUpPlayers(ArrayList<JLabel> playerNames, ArrayList<JLabel> playerGames, ArrayList<JLabel> playerStats, ArrayList<JLabel> playerScores,
            ArrayList<JLabel> totalScores, ArrayList<JPanel> playerPanels, ArrayList<JLabel> fantasyTeamNames, ArrayList<JLabel> ownerNames, ArrayList<JLabel> toPlay, ArrayList<JLabel> inPlay,
            ArrayList<JLabel> projections, Document doc) {

        //grab the fantasy team names and set them
        Elements info = doc.getElementsByClass("teamName");

        for (int i = 0; i < fantasyTeamNames.size(); i++) {
            fantasyTeamNames.get(i).setText(info.get(i).text());
        }

        //grab the fantasy owner names and set them
        info = doc.getElementsByClass("owners");

        for (int i = 0; i < ownerNames.size(); i++) {
            ownerNames.get(i).setText(info.get(i).text());
        }

        //grab the left to play information and set them
        info = doc.select("span[id^=team_ytp]");

        for (int i = 0; i < toPlay.size(); i++) {
            toPlay.get(i).setText("To Play: " + info.get(i).text());
        }

        //grab the in play information and set them
        info = doc.select("span[id^=team_ip]");

        for (int i = 0; i < inPlay.size(); i++) {
            inPlay.get(i).setText("In Play: " + info.get(i).text());
        }

        //grab the projections and set them
        info = doc.select("span[id^=team_liveproj]");

        for (int i = 0; i < projections.size(); i++) {
            projections.get(i).setText("Proj: " + info.get(i).text());
        }

        //grab each row of players abd information
        Elements slots = doc.getElementsByClass("slot");

        int j = 0;
        for (int i = 0; i < playerNames.size() - 1; i += 2) {
            //grab the two player names of the slot, and set them to each team
            try {
                playerNames.get(i).setText(slots.get(j).getElementsByClass("playerName").get(0).text());
            } catch (IndexOutOfBoundsException eio) {
                playerNames.get(i).setText("empty");
            }

            try {
                playerNames.get(i + 1).setText(slots.get(j).getElementsByClass("playerName").get(1).text());
            } catch (IndexOutOfBoundsException eio2) {
                playerNames.get(i + 1).setText("empty");
            }
            //grab the two player scores and set them
            playerScores.get(i).setText(slots.get(j).getElementsByTag("td").get(1).text());
            playerScores.get(i + 1).setText(slots.get(j).getElementsByTag("td").get(6).text());

            //check if a player is on offense/defense/redzone
            String className1 = slots.get(j).getElementsByTag("td").get(0).className();
            String className2 = slots.get(j).getElementsByTag("td").get(5).className();

            //check the state of the player - pregame, in game, or postgame
            String playerGameState1 = slots.get(j).select("td[class^=player proteam]").get(0).className();
            String playerGameState2 = slots.get(j).select("td[class^=player proteam]").get(1).className();

            //check the current state of player 1 and set correct highlighting
            setupPlayerState(className1, playerPanels.get(i));
            setupPlayerState(className2, playerPanels.get(i + 1));

            //check the status of player 1 and set the label color
            setupGameState(playerGameState1, playerNames.get(i), playerGames.get(i), playerScores.get(i), playerStats.get(i), i);
            setupGameState(playerGameState2, playerNames.get(i + 1), playerGames.get(i + 1), playerScores.get(i + 1), playerStats.get(i + 1), i);

            //check if the player1 game status has an eastern time in it and set it, if not, set it to blank
            if (!slots.get(j).getElementsByClass("status").get(0).text().contains("ET")) {
                playerStats.get(i).setText(slots.get(j).getElementsByClass("playerstatsummary").get(0).text());
            } else {
                playerStats.get(i).setText(" ");
            }

            //check if the player2 game status has an eastern time in it and set it, if not, set it to blank
            if (!slots.get(j).getElementsByClass("status").get(1).text().contains("ET")) {
                playerStats.get(i + 1).setText(slots.get(j).getElementsByClass("playerstatsummary").get(1).text());
            } else {
                playerStats.get(i + 1).setText(" ");
            }

            try {
                playerGames.get(i).setText(slots.get(j).getElementsByClass("status").get(0).getElementsByClass("gamestatus").get(0).text());
            } catch (Exception e1) {
                playerGames.get(i).setText(" ");
            }

            try {
                playerGames.get(i + 1).setText(slots.get(j).getElementsByClass("status").get(1).getElementsByClass("gamestatus").get(0).text());
            } catch (Exception e2) {
                playerGames.get(i + 1).setText(" ");
            }

            j++;
        }

        //set the member's total scores
        Elements points = doc.getElementsByClass("points");
        for (int i = 0; i < totalScores.size(); i++) {
            totalScores.get(i).setText(points.get(i).getElementsByTag("span").get(0).text());
        }

    }

    public static void checkForGameUpdates(ArrayList<JLabel> teamLabels, ArrayList<JLabel> statusLabels, ArrayList<JLabel> gameStatuses, ArrayList<JLabel> gameScores, ArrayList<JTextPane> plays, WebDriver d, Document doc, int delay) {
        //select the last plays
        Elements selected = doc.getElementsByClass("ref-parent");

        for (int i = 0; i < selected.size(); i++) {
            try {
                //check if the play has changed

                String compare = plays.get(i).getText();
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
                    Timer t = new Timer(delay, new LastPlayListener(plays.get(i), parts, compareNames, compareNames2));
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

        for (int i = 0; i < statusLabels.size(); i++) {
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
                if (!statusLabels.get(i).getText().equals(compare)) {
                    startLabelChange(statusLabels.get(i), compare);
                }
            } catch (IndexOutOfBoundsException e) {
                continue;
            }
        }

        //get the current down/yardage and compare to what's on screen
        for (int i = 0; i < gameStatuses.size(); i++) {
            try {
                String compare;
                try {
                    compare = selected.get(i).getElementsByClass("down-distance").get(0).text();
                } catch (Exception e) {
                    compare = "Game Not Started";
                }
                if (!gameStatuses.get(i).getText().equals(compare)) {
                    startLabelChange(gameStatuses.get(i), compare);
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
        for (int i = 0; i < teamLabels.size(); i += 2) {
            try {
                String compare1 = awayTeamNames.get(j).text();
                String compare2 = homeTeamNames.get(j).text();

                if (!teamLabels.get(i).getText().equals(compare1)) {
                    startLabelChange(teamLabels.get(i), compare1);
                }

                if (!teamLabels.get(i + 1).getText().equals(compare2)) {
                    startLabelChange(teamLabels.get(i + 1), compare2);
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
        for (int i = 0; i < gameScores.size(); i += 2) {
            try {
                String compare1 = awayScores.get(i).text();
                String compare2 = homeScores.get(i).text();

                if (!gameScores.get(i).getText().equals(compare1)) {
                    startLabelChange(gameScores.get(i), compare1);
                }

                if (!gameScores.get(i + 1).getText().equals(compare2)) {
                    startLabelChange(gameScores.get(i + 1), compare2);
                }

                j++;
            } catch (IndexOutOfBoundsException e) {
                continue;
            }
        }

    }

    public static void checkForPlayerUpdates(ArrayList<JLabel> playerNames, ArrayList<JLabel> playerGames, ArrayList<JLabel> playerStats, ArrayList<JLabel> playerScores, ArrayList<JLabel> totalScores, ArrayList<JPanel> playerPanels,
            ArrayList<JLabel> toPlay, ArrayList<JLabel> inPlay, ArrayList<JLabel> projections, Document doc, int delay) {

        //select left to play 
        Elements info = doc.select("span[id^=team_ytp]");

        //check if it's different and change if needed
        for (int i = 0; i < toPlay.size(); i++) {
            String compare = "To Play: " + info.get(i).text();
            if (!toPlay.get(i).getText().equals(compare)) {
                startLabelChange(toPlay.get(i), compare);
            }
        }

        //select in play
        info = doc.select("span[id^=team_ip]");

        //check if different and change if needed
        for (int i = 0; i < inPlay.size(); i++) {
            String compare = "In Play: " + info.get(i).text();
            if (!inPlay.get(i).getText().equals(compare)) {
                startLabelChange(inPlay.get(i), compare);
            }
        }

        //select projections
        info = doc.select("span[id^=team_liveproj]");

        //check if different and change if needed
        for (int i = 0; i < projections.size(); i++) {
            String compare = "Proj: " + info.get(i).text();
            if (!projections.get(i).getText().equals(compare)) {
                startLabelChange(projections.get(i), compare);
                //System.out.println("Making a change 10");
            }
        }

        //select player slots
        Elements slots = doc.getElementsByClass("slot");

        int j = 0;
        for (int i = 0; i < playerNames.size() - 1; i += 2) {
            //check player names for changes
            String nameCompare1 = slots.get(j).getElementsByClass("playerName").get(0).text();
            String nameCompare2 = slots.get(j).getElementsByClass("playerName").get(1).text();

            if (!playerNames.get(i).getText().equals(nameCompare1)) {
                startLabelChange(playerNames.get(i), nameCompare1);
                //System.out.println("Making a change 11");
            }

            if (!playerNames.get(i + 1).getText().equals(nameCompare2)) {
                startLabelChange(playerNames.get(i + 1), nameCompare2);
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
            updatePlayerState(className1, playerPanels.get(i));
            updatePlayerState(className2, playerPanels.get(i + 1));

            updateGameState(playerGameState1, playerNames.get(i), playerGames.get(i), playerScores.get(i), playerStats.get(i), i);
            updateGameState(playerGameState2, playerNames.get(i + 1), playerGames.get(i + 1), playerScores.get(i + 1), playerStats.get(i + 1), i);

            //check if either score is different and change if needed
            if (!playerScores.get(i).getText().equals(scoreCompare1)) {
                startLabelChange(playerScores.get(i), scoreCompare1);
                //System.out.println("Making a change 27");
            }

            if (!playerScores.get(i + 1).getText().equals(scoreCompare2)) {
                startLabelChange(playerScores.get(i + 1), scoreCompare2);
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

            if (!playerStats.get(i).getText().equals(statCompare1)) {
                startLabelChange(playerStats.get(i), statCompare1);
                //System.out.println("Making a change 29");
            }

            if (!playerStats.get(i + 1).getText().equals(statCompare2)) {
                startLabelChange(playerStats.get(i + 1), statCompare2);
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

            if (!playerGames.get(i).getText().equals(gameCompare1)) {
                startLabelChange(playerGames.get(i), gameCompare1);
                //System.out.println("Making a change 31");
            }

            if (!playerGames.get(i + 1).getText().equals(gameCompare2)) {
                startLabelChange(playerGames.get(i + 1), gameCompare2);
                //System.out.println("Making a change 32");
            }

            j++;
        }

        //select total scores and see if there are changes
        Elements points = doc.getElementsByClass("points");
        for (int i = 0; i < totalScores.size(); i++) {
            String compare = points.get(i).getElementsByTag("span").get(0).text();
            if (!totalScores.get(i).getText().equals(compare)) {
                startLabelChange(totalScores.get(i), compare);
                //System.out.println("Making a change 33");
            }
        }
    }

    public static void prepareLabels(ArrayList<JLabel> labels) {
        //set the color of the labels to white
        for (JLabel label : labels) {
            label.setForeground(Color.white);
        }
    }

    public static void preparePanels(ArrayList<JPanel> panels) {
        //set the backgrouind of JPanels
        for (JPanel p : panels) {
            p.setBackground(new Color(60, 63, 65));
        }
    }

    public static void prepareTextAreas(ArrayList<JTextPane> areas) {
        //set the background and foreground colors of textpanes
        for (JTextPane jta : areas) {
            jta.setBackground(new Color(69, 73, 74));
            jta.setForeground(Color.WHITE);
        }
    }

    public static void preparePlayerStatuses(ArrayList<JLabel> statuses) {
        //set the color of the game statuses. Yellow for starts, gray for bench players
        for (int i = 0; i < statuses.size(); i++) {
            if (i < 18) {
                statuses.get(i).setForeground(new Color(166, 154, 123));
            } else {
                statuses.get(i).setForeground(new Color(102, 102, 108));
            }
        }
    }

    public static void prepareScrollPane(JScrollPane pane) {
        pane.getVerticalScrollBar().setUnitIncrement(16);
        pane.getVerticalScrollBar().setBackground(DARKGREY);
        pane.getVerticalScrollBar().setForeground(DARKGREY);
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

    public static void setPlayerImages(ArrayList<JLabel> images, Document doc) {
        Elements imageSelector = doc.getElementsByClass("playerPhotoWrapper");

        int j = 0;
        for (int i = 0; i < images.size(); i += 2) {
            try {
                try {
                    URL imageURL1 = new URL(imageSelector.get(i).getElementsByTag("img").get(0).absUrl("src"));
                    images.get(i).setIcon(new ImageIcon(imageURL1, ""));
                } catch (IndexOutOfBoundsException ex) {
                    String url1 = imageSelector.get(i).getElementsByClass("fantasy-team-logo").get(0).attr("style");
                    url1 = url1.substring(url1.indexOf("(") + 1);
                    url1 = url1.substring(0, url1.indexOf(")"));
                    URL imageURL1 = new URL(url1);
                    images.get(i).setIcon(new ImageIcon(imageURL1, ""));
                }

                try {
                    URL imageURL2 = new URL(imageSelector.get(i + 1).getElementsByTag("img").get(0).absUrl("src"));
                    images.get(i + 1).setIcon(new ImageIcon(imageURL2, ""));
                } catch (IndexOutOfBoundsException ex) {
                    String url2 = imageSelector.get(i + 1).getElementsByClass("fantasy-team-logo").get(0).attr("style");
                    url2 = url2.substring(url2.indexOf("(") + 1);
                    url2 = url2.substring(0, url2.indexOf(")"));
                    URL imageURL2 = new URL(url2);
                    images.get(i + 1).setIcon(new ImageIcon(imageURL2, ""));
                }
            } catch (Exception e) {
                continue;
            }
        }
    }

    public static void setupPlayerState(String className, JPanel panel) {
        if (className.contains("playerOFFENSE") && !className.contains("playerREDZONE")) {
            panel.setBackground(OFFENSE);
        } else if (className.contains("playerDEFENSE") && !className.contains("playerREDZONE")) {
            panel.setBackground(DEFENSE);
        } else if (className.contains("playerREDZONE")) {
            panel.setBackground(REDZONE);
        } else if (!panel.getBackground().equals(DARKGREY)) {
            panel.setBackground(DARKGREY);
        }
    }

    public static void updatePlayerState(String className, JPanel panel) {
        if (className.contains("playerOFFENSE") && !className.contains("playerREDZONE")) {
            if (!panel.getBackground().equals(OFFENSE)) {
                startColorChange(panel, OFFENSE);
                //System.out.println("Making a change 13");
            }
        } else if (className.contains("playerDEFENSE") && !className.contains("playerREDZONE")) {
            if (!panel.getBackground().equals(DEFENSE)) {
                startColorChange(panel, DEFENSE);
                //System.out.println("Making a change 14");
            }
        } else if (className.contains("playerREDZONE")) {
            if (!panel.getBackground().equals(REDZONE)) {
                startColorChange(panel, REDZONE);
                //System.out.println("Making a change 15");
            }
        } else if (!panel.getBackground().equals(DARKGREY)) {
            startColorChange(panel, DARKGREY);
            //System.out.println("Making a change 17");
        }
    }

    public static void setupGameState(String gameState, JLabel name, JLabel game, JLabel score, JLabel stats, int i) {
        if (gameState.contains("activegame") && i < 18) {
            name.setForeground(Color.WHITE);
            score.setForeground(Color.WHITE);
            game.setForeground(ACTIVEYELLOW);
            stats.setForeground(Color.WHITE);
        } else if (gameState.contains("completedgame") && i < 18) {
            name.setForeground(PREGREY);
            score.setForeground(POSTYELLOW);
            game.setForeground(PREYELLOW);
            stats.setForeground(PREGREY);
        } else {
            name.setForeground(PREGREY);
            score.setForeground(PREGREY);
            stats.setForeground(PREGREY);
            if (i < 18) {
                game.setForeground(PREYELLOW);
            } else {
                game.setForeground(PREGREY);
            }

        }
    }

    public static void updateGameState(String gameState, JLabel name, JLabel game, JLabel score, JLabel stats, int i) {
        if (gameState.contains("activegame") && i < 18) { //&& 
            if (!name.getForeground().equals(Color.WHITE)) {
                System.out.println("Making a change 23");
                startLabelColorChange(name, Color.WHITE);
                startLabelColorChange(score, Color.WHITE);
                startLabelColorChange(game, ACTIVEYELLOW);
                startLabelColorChange(stats, Color.WHITE);
            }
        } else if (gameState.contains("completedgame") && i < 18) {
            if (!score.getForeground().equals(POSTYELLOW)) {
                System.out.println("Making a comlpeted game change 24");
                startLabelColorChange(name, PREGREY);
                startLabelColorChange(score, POSTYELLOW);
                startLabelColorChange(game, PREYELLOW);
                startLabelColorChange(stats, PREGREY);
            }
        } else {
            if (!score.getForeground().equals(PREGREY)) {
                System.out.println("Making a change 24");
                startLabelColorChange(name, PREGREY);
                startLabelColorChange(score, PREGREY);
                startLabelColorChange(stats, PREGREY);
                if (i < 18) {
                    startLabelColorChange(game, PREYELLOW);
                } else {
                    startLabelColorChange(game, PREGREY);
                }
            }

        }
    }

    public static void createNotification(String team1, String team2, String score1, String score2, String notificationText, String gameStatus) {
        Timer t1 = new Timer(delay, (ActionEvent e) -> {
            JDialog notification = new NotificationDialog(TestFantasy.frame, false, team1, team2, score1, score2, notificationText, gameStatus);
            notification.setLocation(TestFantasy.frame.getX() + TestFantasy.frame.getWidth() - notification.getWidth(), TestFantasy.frame.getY() + TestFantasy.frame.getHeight() - notification.getHeight());
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
//                notificationText = selected.select("span#toast_awayTeam").text() + "  " + selected.select("div#toast_awayTeamScore").text()
//                        + "\n" + selected.select("span#toast_homeTeam").text() + "  " + selected.select("div#toast_homeTeamScore").text()
//                        + "\n\n" + selected.select("span#toast_gameMessage").text() + "\n\n" + selected.select("span#toast_gameStatus").text();
                notificationText = selected.select("span#toast_gameMessage").text();
                team1 = selected.select("span#toast_awayTeam").text();
                team2 = selected.select("span#toast_homeTeam").text();
                score1 = selected.select("div#toast_awayTeamScore").text();
                score2 = selected.select("div#toast_homeTeamScore").text();
                gameStatus = selected.select("span#toast_gameStatus").text();

                if (!notificationText.equals(getLastNotification()) && !notificationText.equals("\n\n\n\n\n")) {
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

    public static void setUrl(String url) {
        //let the dialog set the url
        TestFantasy.url = url;
    }

    public static void setDelay(int delay) {
        //let the dialog set the delay
        int mmDelay = delay * 1000;
        TestFantasy.delay = mmDelay;
    }

    public static String getLastNotification() {
        return TestFantasy.lastNotification;
    }

    public static void setLastNotification(String string) {
        TestFantasy.lastNotification = string;
    }

    public static void setDriver(ChromeDriver d) {
        driver = d;
    }

    public static void setDriver2(ChromeDriver d2) {
        driver2 = d2;
    }

    public static void setPossesionIcons(ArrayList<JLabel> labels, ArrayList<JLabel> poss, Document doc) throws IOException {
        for (int i = 0; i < labels.size(); i++) {
            try {
                String baseString = doc.getElementsByClass("logo").get(i).attr("style").toString();
                int x = Integer.parseInt(baseString.substring(baseString.indexOf(":-") + 2, baseString.indexOf("px")));
                int y = Integer.parseInt(baseString.substring(baseString.indexOf("-", baseString.indexOf("px") + 2) + 1, baseString.indexOf("px", baseString.indexOf("px") + 2)));

                BufferedImage source = ImageIO.read(new File("Logos.png"));
                BufferedImage crop = source.getSubimage(x, y, 30, 25);

                labels.get(i).setIcon(new ImageIcon(crop));
            } catch (Exception e) {
                poss.get(i).setVisible(false);
                continue;
            }

        }

    }

    public static void setTeamLogos(ArrayList<JLabel> labels, Document doc) throws IOException {
        for (int i = 0; i < labels.size(); i++) {
            try {
                String baseString = doc.getElementsByClass("team-logo").get(i).attr("Style").toString();
                int x = Integer.parseInt(baseString.substring(baseString.indexOf(":-") + 2, baseString.indexOf("px")));
                int y = Integer.parseInt(baseString.substring(baseString.indexOf("-", baseString.indexOf("px") + 2) + 1, baseString.indexOf("px", baseString.indexOf("px") + 2)));
                
                BufferedImage source = ImageIO.read(new File("TeamLogos.png"));
                BufferedImage crop = source.getSubimage(x, y, 12, 12);

                labels.get(i).setIcon(new ImageIcon(crop));
            } catch (Exception e) {
                continue;
            }
        }
    }
    
    public static ChromeDriver getDriver1(){
        return driver;
    }
    
    public static ChromeDriver getDriver2(){
        return driver2;
    }

}
