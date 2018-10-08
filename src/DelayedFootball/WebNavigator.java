/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DelayedFootball;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author Kyle
 */
public class WebNavigator {

    private ChromeDriver fantasycast;
    private ChromeDriver scoreAlerts;
    private ChromeOptions chromeOptions;

    private Document doc;

    public WebNavigator() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        new Thread(() -> {
            chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("--mute-audio");

            fantasycast = new ChromeDriver(chromeOptions);
            scoreAlerts = new ChromeDriver(chromeOptions);
            scoreAlerts.get("http://games.espn.com/ffl/scoreboard?leagueId=19116&seasonId=2018");
        }).start();
    }

    public void closeDrivers() {
        fantasycast.close();
        scoreAlerts.close();
    }

    public void setUrl(String url) {
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
            closeDrivers();
        }
    }

    public void updateDoc() {
        doc = Jsoup.parse(fantasycast.getPageSource());
    }

    public String getNotification() {
        Document temp = Jsoup.parse(scoreAlerts.getPageSource());
        String lastNotification = "";
        try {
            Elements tempE = temp.select("div#toastDiv");
            if (!tempE.isEmpty()) {
                lastNotification = tempE.select("span#toast_gameMessage").text();
            }
        } catch (Exception e) {

        }

        return lastNotification;
    }

    public Elements getNotificationInfo() {
        Document temp = Jsoup.parse(scoreAlerts.getPageSource());
        return temp.select("div#toastDiv");
    }

    public String getAwayTeamName(int i) {
        try {
            Elements awayTeamNames = doc.getElementsByClass("away-abbrev");
            return awayTeamNames.get(i).text();
        } catch (IndexOutOfBoundsException e) {
            return "";
        }
    }

    public String getHomeTeamName(int i) {
        try {
            Elements homeTeamNames = doc.getElementsByClass("home-abbrev");
            return homeTeamNames.get(i).text();
        } catch (IndexOutOfBoundsException e) {
            return "";
        }
    }

    public String getAwayScore(int i) {
        try {
            Elements awayScores = doc.getElementsByClass("away-score");
            return awayScores.get(i).text();
        } catch (IndexOutOfBoundsException e) {
            return "";
        }
    }

    public String getHomeScore(int i) {
        try {
            Elements homeScores = doc.getElementsByClass("home-score");
            return homeScores.get(i).text();
        } catch (IndexOutOfBoundsException e) {
            return "";
        }
    }

    public String getLastPlay(int i) {
        try {
            Elements lastPlays = doc.getElementsByClass("ref-parent");
            return lastPlays.get(i).text();
        } catch (IndexOutOfBoundsException e) {
            return "Error Getting Last Play";
        }
    }

    public ArrayList<String> getYourPlayers(int i) {
        ArrayList<String> yourPlayers = new ArrayList<>();
        try {
            Elements names = doc.getElementsByClass("ref-parent").get(i).getElementsByClass("your-player");

            for (Element el : names) {
                yourPlayers.add(el.text());
            }
            return yourPlayers;

        } catch (IndexOutOfBoundsException e) {
            return yourPlayers;
        }
    }

    public ArrayList<String> getOpponentPlayers(int i) {
        ArrayList<String> oppPlayers = new ArrayList<>();
        try {
            Elements names = doc.getElementsByClass("ref-parent").get(i).getElementsByClass("opp-player");

            for (Element el : names) {
                oppPlayers.add(el.text());
            }
            return oppPlayers;

        } catch (IndexOutOfBoundsException e) {
            return oppPlayers;
        }
    }

    public String getSituation(int i) {
        try {
            Elements status = doc.getElementsByClass("situation");
            return status.get(i).getElementsByClass("period").get(0).text();
        } catch (IndexOutOfBoundsException e) {
            return "";
        }
    }

    public String getTime(int i) {
        try {
            Elements status = doc.getElementsByClass("situation");
            return status.get(i).getElementsByClass("time").get(0).text();
        } catch (IndexOutOfBoundsException e) {
            return "";
        }
    }

    public String getDownDistance(int i) {
        Elements status = doc.getElementsByClass("situation");
        String downDist = "Game not active";
        try {
            downDist = status.get(i).getElementsByClass("down-distance").get(0).text();
        } catch (IndexOutOfBoundsException e) {

        }
        return downDist;
    }

    public String getFantasyTeamName(int i) {
        try {
            Elements teamNames = doc.getElementsByClass("teamName");
            return teamNames.get(i).text();
        } catch (IndexOutOfBoundsException e) {
            return "";
        }
    }

    public String getFantasyOwner(int i) {
        try {
            Elements owners = doc.getElementsByClass("owners");
            return owners.get(i).text();
        } catch (IndexOutOfBoundsException e) {
            return "";
        }
    }

    public String getToPlay(int i) {
        try {
            Elements ytp = doc.select("span[id^=team_ytp]");
            return "To Play: " + ytp.get(i).text();
        } catch (IndexOutOfBoundsException e) {
            return "";
        }
    }

    public String getInPlay(int i) {
        try {
            Elements ip = doc.select("span[id^=team_ip]");
            return "In Play: " + ip.get(i).text();
        } catch (IndexOutOfBoundsException e) {
            return "";
        }
    }

    public String getProjection(int i) {
        try {
            Elements projs = doc.select("span[id^=team_liveproj]");
            return "Proj: " + projs.get(i).text();
        } catch (IndexOutOfBoundsException e) {
            return "";
        }
    }

    public String getTotalScore(int i) {
        try {
            return doc.getElementsByClass("points").get(i).getElementsByTag("span").get(0).text();
        } catch (IndexOutOfBoundsException e) {
            return "";
        }
    }

    public String getPlayerName(int i, int slotPos) {
        String result;
        try {
            result = doc.getElementsByClass("slot").get(i).getElementsByClass("playerName").get(slotPos).text();
        } catch (IndexOutOfBoundsException e) {
            result = "Empty";
        }

        return result;
    }

    public String getPlayerScore(int i, int slotPos) {
        try {
            return doc.getElementsByClass("slot").get(i).getElementsByTag("td").get(slotPos).text();
        } catch (IndexOutOfBoundsException e) {
            return "";
        }
    }

    public String getPlayerState(int i, int slotPos) {
        try {
            return doc.getElementsByClass("slot").get(i).getElementsByTag("td").get(slotPos).className();
        } catch (IndexOutOfBoundsException e) {
            return "";
        }
    }

    public String getPlayerGameState(int i, int slotPos) {
        String result;
        try {
            result = doc.getElementsByClass("slot").get(i).select("td[class^=player proteam]").get(slotPos).className();
        } catch (IndexOutOfBoundsException e) {
            result = "";
        }
        return result;
    }

    public boolean containsET(int i, int slotPos) {
        Boolean result;
        try {
            result = doc.getElementsByClass("slot").get(i).getElementsByClass("status").get(slotPos).text().contains("ET");
        } catch (IndexOutOfBoundsException e) {
            result = false;
        }
        return result;
    }

    public String getPlayerStats(int i, int slotPos) {
        String result;
        try {
            result = doc.getElementsByClass("slot").get(i).getElementsByClass("playerstatsummary").get(slotPos).text();
        } catch (IndexOutOfBoundsException e) {
            result = "";
        }
        return result;
    }

    public String getGameStatus(int i, int slotPos) {
        try {
            return doc.getElementsByClass("slot").get(i).getElementsByClass("status").get(slotPos).getElementsByClass("gamestatus").get(0).text();
        } catch (IndexOutOfBoundsException e) {
            return "";
        }
    }

    public URL getPlayerImage(int i) throws MalformedURLException {
        return new URL(doc.getElementsByClass("playerPhotoWrapper").get(i).getElementsByTag("img").get(0).absUrl("src"));
    }

    public String getDefenseLogo(int i) {
        return doc.getElementsByClass("playerPhotoWrapper").get(i).getElementsByClass("fantasy-team-logo").get(0).attr("style");
    }

    public String getPossessionIcon(int i) {
        return doc.getElementsByClass("logo").get(i).attr("style").toString();
    }

    public String getTeamLogo(int i) {
        return doc.getElementsByClass("team-logo").get(i).attr("Style").toString();
    }

}
