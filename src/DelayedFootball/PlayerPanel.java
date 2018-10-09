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

/**
 *
 * @author Kyle
 */
public class PlayerPanel {

    private String playerName;
    private String playerGame;
    private String playerStats;
    private Color playerStatus;
    private String playerScore;
    private String imageLink;

    private JLabel name;
    private JLabel game;
    private JLabel stats;
    private JLabel score;
    private JLabel image;
    private JPanel panel;

    public PlayerPanel(JLabel name, JLabel game, JLabel stats, JLabel score, JLabel image, JPanel panel) {
        this.name = name;
        this.game = game;
        this.stats = stats;
        this.score = score;
        this.image = image;
        this.panel = panel;
        init();
    }

    public void init() {
        name.setForeground(Color.white);
        game.setForeground(Color.white);
        stats.setForeground(Color.white);
        score.setForeground(Color.white);
        panel.setBackground(Colors.BACKGROUND);

        playerName = name.getText();
        playerGame = game.getText();
        playerStats = stats.getText();
        playerStatus = panel.getBackground();
        playerScore = score.getText();
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerScore(String playerScore) {
        this.playerScore = playerScore;
    }

    public void setPlayerStats(String playerStats) {
        this.playerStats = playerStats;
    }

    public void setPlayerGame(String playerGame) {
        this.playerGame = playerGame;
    }

    public String getPlayerName() {
        return playerName;
    }
    
    public String getPlayerGame() {
        return playerGame;
    }

    public String getPlayerStats() {
        return playerStats;
    }

    public Color getPlayerStatus() {
        return playerStatus;
    }

    public void setPlayerStatus(Color playerStatus) {
        this.playerStatus = playerStatus;
    }

    public String getPlayerScore() {
        return playerScore;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public JLabel getName() {
        return name;
    }

    public JLabel getGame() {
        return game;
    }

    public JLabel getStats() {
        return stats;
    }

    public JLabel getScore() {
        return score;
    }

    public JLabel getImage() {
        return image;
    }

    public JPanel getPanel() {
        return panel;
    }

}
