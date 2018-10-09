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
public class TeamInfoPanel {

    private JLabel teamName;
    private JLabel teamOwner;
    private JLabel toPlay;
    private JLabel inPlay;
    private JLabel projection;
    private JLabel totalScore;

    private String yetToPlay;
    private String playing;
    private String currentProjection;
    private String currentTotalScore;
    private String name;
    private String owner;

    public TeamInfoPanel(JLabel teamName, JLabel teamOwner, JLabel toPlay, JLabel inPlay, JLabel projection, JLabel totalScore) {
        this.teamName = teamName;
        this.teamOwner = teamOwner;
        this.toPlay = toPlay;
        this.inPlay = inPlay;
        this.projection = projection;
        this.totalScore = totalScore;
        init();
    }

    public void init() {
        teamName.setForeground(Color.white);
        teamOwner.setForeground(Color.white);
        toPlay.setForeground(Color.white);
        inPlay.setForeground(Color.white);
        projection.setForeground(Color.white);
        
        yetToPlay = toPlay.getText();
        playing = inPlay.getText();
        currentProjection = projection.getText();
        currentTotalScore = totalScore.getText();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    
    public String getYetToPlay() {
        return yetToPlay;
    }

    public void setYetToPlay(String yetToPlay) {
        this.yetToPlay = yetToPlay;
    }

    public String getPlaying() {
        return playing;
    }

    public void setPlaying(String playing) {
        this.playing = playing;
    }

    public String getCurrentProjection() {
        return currentProjection;
    }

    public void setCurrentProjection(String currentProjection) {
        this.currentProjection = currentProjection;
    }

    public String getCurrentTotalScore() {
        return currentTotalScore;
    }

    public void setCurrentTotalScore(String currentTotalScore) {
        this.currentTotalScore = currentTotalScore;
    }

    public JLabel getTeamName() {
        return teamName;
    }

    public JLabel getTeamOwner() {
        return teamOwner;
    }

    public JLabel getToPlay() {
        return toPlay;
    }

    public JLabel getInPlay() {
        return inPlay;
    }

    public JLabel getProjection() {
        return projection;
    }

    public JLabel getTotalScore() {
        return totalScore;
    }
    
    
}
