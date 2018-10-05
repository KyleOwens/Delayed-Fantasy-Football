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

    private int imgX;
    private int imgY;
    private int awayIconX;
    private int awayIconY;
    private int homeIconX;
    private int homeIconY;

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

    private void init() {
        imgX = 0;
        imgY = 0;
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

    public void setAwayTeam(String awayTeam) {
        this.awayTeamLabel.setText(awayTeam);
        this.awayTeam = awayTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeamLabel.setText(homeTeam);
        this.homeTeam = homeTeam;
    }

    public void setAwayScore(String awayScore) {
        this.awayScoreLabel.setText(awayScore);
        this.awayScore = awayScore;
    }

    public void setHomeScore(String homeScore) {
        this.homeScoreLabel.setText(homeScore);
        this.homeScore = homeScore;
    }

    public void setGameTime(String gameTime) {
        this.gameTimeLabel.setText(gameTime);
        this.gameTime = gameTime;
    }

    public void setGameStatus(String gameStatus) {
        this.gameStatusLabel.setText(gameStatus);
        this.gameStatus = gameStatus;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayScore() {
        return awayScore;
    }

    public String getHomeScore() {
        return homeScore;
    }

    public String getGameTime() {
        return gameTime;
    }

    public String getGameStatus() {
        return gameStatus;
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

    public int getImgX() {
        return imgX;
    }

    public void setImgX(int imgX) {
        this.imgX = imgX;
    }

    public int getImgY() {
        return imgY;
    }

    public void setImgY(int imgY) {
        this.imgY = imgY;
    }

    public int getAwayIconX() {
        return awayIconX;
    }

    public void setAwayIconX(int awayIconX) {
        this.awayIconX = awayIconX;
    }

    public int getAwayIconY() {
        return awayIconY;
    }

    public void setAwayIconY(int awayIconY) {
        this.awayIconY = awayIconY;
    }

    public int getHomeIconX() {
        return homeIconX;
    }

    public void setHomeIconX(int homeIconX) {
        this.homeIconX = homeIconX;
    }

    public int getHomeIconY() {
        return homeIconY;
    }

    public void setHomeIconY(int homeIconY) {
        this.homeIconY = homeIconY;
    }

}
