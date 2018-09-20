/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DelayedFootball;

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
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--mute-audio");

        fantasycast = new ChromeDriver(chromeOptions);
        scoreAlerts = new ChromeDriver(chromeOptions);
        scoreAlerts.get("http://games.espn.com/ffl/scoreboard?leagueId=19116&seasonId=2018");
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
            fantasycast.close();
            scoreAlerts.close();
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

    public String getAwayTeamName(int i) {
        Elements awayTeamNames = doc.getElementsByClass("away-abbrev");

        return awayTeamNames.get(i).text();
    }

    public String getHomeTeamName(int i) {
        Elements homeTeamNames = doc.getElementsByClass("home-abbrev");

        return homeTeamNames.get(i).text();
    }

    public String getAwayScore(int i) {
        Elements awayScores = doc.getElementsByClass("away-score");

        return awayScores.get(i).text();
    }

    public String getHomeScore(int i) {
        Elements homeScores = doc.getElementsByClass("home-score");

        return homeScores.get(i).text();
    }

    public String getLastPlay(int i) {
        Elements lastPlays = doc.getElementsByClass("ref-parent");

        return lastPlays.get(i).text();
    }

    public ArrayList<String> getYourPlayers(int i) {
        Elements names = doc.getElementsByClass("ref-parent").get(i).getElementsByClass("your-player");

        ArrayList<String> yourPlayers = new ArrayList<>();
        for (Element el : names) {
            yourPlayers.add(el.text());
        }

        return yourPlayers;
    }

    public ArrayList<String> getOpponentPlayers(int i) {
        Elements names = doc.getElementsByClass("ref-parent").get(i).getElementsByClass("opp-player");

        ArrayList<String> oppPlayers = new ArrayList<>();
        for (Element el : names) {
            oppPlayers.add(el.text());
        }

        return oppPlayers;
    }

    public String getSituation(int i) {
        Elements status = doc.getElementsByClass("situation");

        return status.get(i).getElementsByClass("period").get(0).text();
    }

    public String getTime(int i) {
        Elements status = doc.getElementsByClass("situation");

        return status.get(i).getElementsByClass("time").get(0).text();
    }

    public String getDownDistance(int i) {
        Elements status = doc.getElementsByClass("situation");
        String downDist = "Game not active";
        try{
            downDist = status.get(i).getElementsByClass("down-distance").get(0).text();
        } catch(Exception e){
            
        }

        return downDist;
    }
    
    public String getTeamName(int i){
        Elements teamNames = doc.getElementsByClass("teamName");
        return teamNames.get(i).text();        
    }
    
    public String getOwner(int i){
        Elements owners = doc.getElementsByClass("owners");
        return owners.get(i).text();
    }
    
    public String getToPlay(int i){
        Elements ytp = doc.select("span[id^=team_ytp]");
        return "To Play: " + ytp.get(i).text();
    }
    
    public String getInPlay(int i){
        Elements ip = doc.select("span[id^=team_ip]");
        return "In Play: " +ip.get(i).text();
    }
    
    public String getProjection(int i){
        Elements projs = doc.select("span[id^=team_liveproj]");
        return "Proj: " + projs.get(i).text();
    }
    
    public String getTotalScore(int i){
        return doc.getElementsByClass("points").get(i).getElementsByTag("span").get(0).text();
    }
    
    public String getPlayerName(int i, int slotPos){
        return doc.getElementsByClass("slot").get(i).getElementsByClass("playerName").get(slotPos).text();
    }
    
    public String getPlayerScore(int i, int slotPos){
        return doc.getElementsByClass("slot").get(i).getElementsByTag("td").get(slotPos).text();
    }
    
    public String getPlayerState(int i, int slotPos){
        return doc.getElementsByClass("slot").get(i).getElementsByTag("td").get(slotPos).text();
    }
    
    public String getPlayerGameState(int i, int slotPos){
        return doc.getElementsByClass("slot").get(i).select("td[class^=player proteam]").get(slotPos).className();
    }
    
    public boolean containsET(int i, int slotPos){
        return doc.getElementsByClass("slot").get(i).getElementsByClass("status").get(slotPos).text().contains("ET");
    }
    
    public String getPlayerGameTime(int i, int slotPos){
        return doc.getElementsByClass("slot").get(i).getElementsByClass("playerstatsummary").get(slotPos).text();
    }
    
    public String getGameStatus(int i, int slotPos){
        return doc.getElementsByClass("slot").get(i).getElementsByClass("status").get(slotPos).getElementsByClass("gamestatus").get(0).text();
    }

}
