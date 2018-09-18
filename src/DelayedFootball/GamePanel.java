/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DelayedFootball;

import Constants.Colors;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

/**
 *
 * @author Kyle
 */
public class GamePanel {
    private String awayTeam;
    private String homeTeam;
    private String awayScore;
    private String homeScore;
    private String gameTime;
    private String gameStatus;
    private String lastPlay;
    
    private JLabel awayTeamLabel;
    private JLabel homeTeamLabel;
    private JLabel awayScoreLabel;
    private JLabel homeScoreLabel;
    private JLabel gameTimeLabel;
    private JLabel gameStatusLabel;
    private JLabel awayLogo;
    private JLabel homeLogo;
    private JLabel possession;
    private JLabel possLabel;
    private JTextPane lastPlayPane;
    private JPanel panel;

    public GamePanel(JLabel awayTeamLabel, JLabel homeTeamLabel, JLabel awayScoreLabel, JLabel homeScoreLabel, 
            JLabel gameTimeLabel, JLabel gameStatusLabel, JTextPane lastPlayPane, JPanel panel,
            JLabel awayLogo, JLabel homeLogo, JLabel possession, JLabel possLabel) {
        this.awayTeamLabel = awayTeamLabel;
        this.homeTeamLabel = homeTeamLabel;
        this.awayScoreLabel = awayScoreLabel;
        this.homeScoreLabel = homeScoreLabel;
        this.gameTimeLabel = gameTimeLabel;
        this.gameStatusLabel = gameStatusLabel;
        this.awayLogo = awayLogo;
        this.homeLogo = homeLogo;
        this.possession = possession;
        this.possLabel = possLabel;
        this.lastPlayPane = lastPlayPane;
        this.panel = panel;
        init();
    }
    
    private void init(){
        awayTeamLabel.setForeground(Color.white);
        homeTeamLabel.setForeground(Color.white); 
        awayScoreLabel.setForeground(Color.white);
        homeScoreLabel.setForeground(Color.white);
        gameTimeLabel.setForeground(Color.white);
        gameStatusLabel.setForeground(Color.white);
        lastPlayPane.setBackground(Colors.TEXTPANEBACKGROUND);
        lastPlayPane.setForeground(Color.white);
        panel.setBackground(Colors.BACKGROUND);
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(String awayScore) {
        this.awayScore = awayScore;
    }

    public String getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(String homeScore) {
        this.homeScore = homeScore;
    }

    public String getGameTime() {
        return gameTime;
    }

    public void setGameTime(String gameTime) {
        this.gameTime = gameTime;
    }

    public String getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(String gameStatus) {
        this.gameStatus = gameStatus;
    }

    public String getLastPlay() {
        return lastPlay;
    }

    public void setLastPlay(String lastPlay) {
        this.lastPlay = lastPlay;
    }

    public JLabel getAwayTeamLabel() {
        return awayTeamLabel;
    }

    public JLabel getHomeTeamLabel() {
        return homeTeamLabel;
    }

    public JLabel getAwayScoreLabel() {
        return awayScoreLabel;
    }

    public JLabel getHomeScoreLabel() {
        return homeScoreLabel;
    }

    public JLabel getGameTimeLabel() {
        return gameTimeLabel;
    }

    public JLabel getGameStatusLabel() {
        return gameStatusLabel;
    }

    public JTextPane getLastPlayPane() {
        return lastPlayPane;
    }

    public JPanel getPanel() {
        return panel;
    }

    public JLabel getAwayLogo() {
        return awayLogo;
    }

    public JLabel getHomeLogo() {
        return homeLogo;
    }

    public JLabel getPossession() {
        return possession;
    }

    public JLabel getPossLabel() {
        return possLabel;
    }
    
    
}
