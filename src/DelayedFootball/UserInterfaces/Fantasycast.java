/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DelayedFootball.UserInterfaces;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.UIManager;

/**
 *
 * @author Kyle
 */
public class Fantasycast extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Fantasycast() {
        this.setUndecorated(true);
        initComponents();
        initAgain();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        mainGameScorePanel = new javax.swing.JPanel();
        gamePane1 = new javax.swing.JPanel();
        teamName1 = new javax.swing.JLabel();
        teamName2 = new javax.swing.JLabel();
        score1 = new javax.swing.JLabel();
        score2 = new javax.swing.JLabel();
        gameTime1 = new javax.swing.JLabel();
        gamestatus1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lastPlay1 = new javax.swing.JTextPane();
        possesionPicture1 = new javax.swing.JLabel();
        poss1 = new javax.swing.JLabel();
        teamLogo1 = new javax.swing.JLabel();
        teamLogo2 = new javax.swing.JLabel();
        gamePane2 = new javax.swing.JPanel();
        teamName3 = new javax.swing.JLabel();
        teamName4 = new javax.swing.JLabel();
        score3 = new javax.swing.JLabel();
        score4 = new javax.swing.JLabel();
        gameTime2 = new javax.swing.JLabel();
        gamestatus2 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        lastPlay2 = new javax.swing.JTextPane();
        possesionPicture2 = new javax.swing.JLabel();
        poss2 = new javax.swing.JLabel();
        teamLogo3 = new javax.swing.JLabel();
        teamLogo4 = new javax.swing.JLabel();
        gamePane3 = new javax.swing.JPanel();
        teamName5 = new javax.swing.JLabel();
        teamName6 = new javax.swing.JLabel();
        score5 = new javax.swing.JLabel();
        score6 = new javax.swing.JLabel();
        gameTime3 = new javax.swing.JLabel();
        gamestatus3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        lastPlay3 = new javax.swing.JTextPane();
        possesionPicture3 = new javax.swing.JLabel();
        poss3 = new javax.swing.JLabel();
        teamLogo5 = new javax.swing.JLabel();
        teamLogo6 = new javax.swing.JLabel();
        gamePane4 = new javax.swing.JPanel();
        teamName7 = new javax.swing.JLabel();
        teamName8 = new javax.swing.JLabel();
        score7 = new javax.swing.JLabel();
        score8 = new javax.swing.JLabel();
        gameTime4 = new javax.swing.JLabel();
        gamestatus4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        lastPlay4 = new javax.swing.JTextPane();
        possesionPicture4 = new javax.swing.JLabel();
        poss4 = new javax.swing.JLabel();
        teamLogo7 = new javax.swing.JLabel();
        teamLogo8 = new javax.swing.JLabel();
        gamePane5 = new javax.swing.JPanel();
        teamName9 = new javax.swing.JLabel();
        teamName10 = new javax.swing.JLabel();
        score9 = new javax.swing.JLabel();
        score10 = new javax.swing.JLabel();
        gameTime5 = new javax.swing.JLabel();
        gamestatus5 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        lastPlay5 = new javax.swing.JTextPane();
        possesionPicture5 = new javax.swing.JLabel();
        poss5 = new javax.swing.JLabel();
        teamLogo9 = new javax.swing.JLabel();
        teamLogo10 = new javax.swing.JLabel();
        gamePane6 = new javax.swing.JPanel();
        teamName11 = new javax.swing.JLabel();
        teamName12 = new javax.swing.JLabel();
        score11 = new javax.swing.JLabel();
        score12 = new javax.swing.JLabel();
        gameTime6 = new javax.swing.JLabel();
        gamestatus6 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        lastPlay6 = new javax.swing.JTextPane();
        possesionPicture6 = new javax.swing.JLabel();
        poss6 = new javax.swing.JLabel();
        teamLogo11 = new javax.swing.JLabel();
        teamLogo12 = new javax.swing.JLabel();
        gamePane7 = new javax.swing.JPanel();
        teamName13 = new javax.swing.JLabel();
        teamName14 = new javax.swing.JLabel();
        score13 = new javax.swing.JLabel();
        score14 = new javax.swing.JLabel();
        gameTime7 = new javax.swing.JLabel();
        gamestatus7 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        lastPlay7 = new javax.swing.JTextPane();
        possesionPicture7 = new javax.swing.JLabel();
        poss7 = new javax.swing.JLabel();
        teamLogo13 = new javax.swing.JLabel();
        teamLogo14 = new javax.swing.JLabel();
        gamePane8 = new javax.swing.JPanel();
        teamName15 = new javax.swing.JLabel();
        teamName16 = new javax.swing.JLabel();
        score15 = new javax.swing.JLabel();
        score16 = new javax.swing.JLabel();
        gameTime8 = new javax.swing.JLabel();
        gamestatus8 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        lastPlay8 = new javax.swing.JTextPane();
        possesionPicture8 = new javax.swing.JLabel();
        poss8 = new javax.swing.JLabel();
        teamLogo15 = new javax.swing.JLabel();
        teamLogo16 = new javax.swing.JLabel();
        gamePane9 = new javax.swing.JPanel();
        teamName17 = new javax.swing.JLabel();
        teamName18 = new javax.swing.JLabel();
        score17 = new javax.swing.JLabel();
        score18 = new javax.swing.JLabel();
        gameTime9 = new javax.swing.JLabel();
        gamestatus9 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        lastPlay9 = new javax.swing.JTextPane();
        possesionPicture9 = new javax.swing.JLabel();
        poss9 = new javax.swing.JLabel();
        teamLogo17 = new javax.swing.JLabel();
        teamLogo18 = new javax.swing.JLabel();
        gamePane10 = new javax.swing.JPanel();
        teamName19 = new javax.swing.JLabel();
        teamName20 = new javax.swing.JLabel();
        score19 = new javax.swing.JLabel();
        score20 = new javax.swing.JLabel();
        gameTime10 = new javax.swing.JLabel();
        gamestatus10 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        lastPlay10 = new javax.swing.JTextPane();
        possesionPicture10 = new javax.swing.JLabel();
        poss10 = new javax.swing.JLabel();
        teamLogo19 = new javax.swing.JLabel();
        teamLogo20 = new javax.swing.JLabel();
        gamePane11 = new javax.swing.JPanel();
        teamName21 = new javax.swing.JLabel();
        teamName22 = new javax.swing.JLabel();
        score21 = new javax.swing.JLabel();
        score22 = new javax.swing.JLabel();
        gameTime11 = new javax.swing.JLabel();
        gamestatus11 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        lastPlay11 = new javax.swing.JTextPane();
        possesionPicture11 = new javax.swing.JLabel();
        poss11 = new javax.swing.JLabel();
        teamLogo21 = new javax.swing.JLabel();
        teamLogo22 = new javax.swing.JLabel();
        gamePane12 = new javax.swing.JPanel();
        teamName23 = new javax.swing.JLabel();
        teamName24 = new javax.swing.JLabel();
        score23 = new javax.swing.JLabel();
        score24 = new javax.swing.JLabel();
        gameTime12 = new javax.swing.JLabel();
        gamestatus12 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        lastPlay12 = new javax.swing.JTextPane();
        possesionPicture12 = new javax.swing.JLabel();
        poss12 = new javax.swing.JLabel();
        teamLogo23 = new javax.swing.JLabel();
        teamLogo24 = new javax.swing.JLabel();
        gamePane13 = new javax.swing.JPanel();
        teamName25 = new javax.swing.JLabel();
        teamName26 = new javax.swing.JLabel();
        score25 = new javax.swing.JLabel();
        score26 = new javax.swing.JLabel();
        gameTime13 = new javax.swing.JLabel();
        gamestatus13 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        lastPlay13 = new javax.swing.JTextPane();
        possesionPicture13 = new javax.swing.JLabel();
        poss13 = new javax.swing.JLabel();
        teamLogo25 = new javax.swing.JLabel();
        teamLogo26 = new javax.swing.JLabel();
        gamePane14 = new javax.swing.JPanel();
        teamName27 = new javax.swing.JLabel();
        teamName28 = new javax.swing.JLabel();
        score27 = new javax.swing.JLabel();
        score28 = new javax.swing.JLabel();
        gameTime14 = new javax.swing.JLabel();
        gamestatus14 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        lastPlay14 = new javax.swing.JTextPane();
        possesionPicture14 = new javax.swing.JLabel();
        poss14 = new javax.swing.JLabel();
        teamLogo27 = new javax.swing.JLabel();
        teamLogo28 = new javax.swing.JLabel();
        gamePane15 = new javax.swing.JPanel();
        teamName29 = new javax.swing.JLabel();
        teamName30 = new javax.swing.JLabel();
        score29 = new javax.swing.JLabel();
        score30 = new javax.swing.JLabel();
        gameTime15 = new javax.swing.JLabel();
        gamestatus15 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        lastPlay15 = new javax.swing.JTextPane();
        possesionPicture15 = new javax.swing.JLabel();
        poss15 = new javax.swing.JLabel();
        teamLogo29 = new javax.swing.JLabel();
        teamLogo30 = new javax.swing.JLabel();
        gamePane16 = new javax.swing.JPanel();
        teamName31 = new javax.swing.JLabel();
        teamName32 = new javax.swing.JLabel();
        score31 = new javax.swing.JLabel();
        score32 = new javax.swing.JLabel();
        gameTime16 = new javax.swing.JLabel();
        gamestatus16 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        lastPlay16 = new javax.swing.JTextPane();
        possesionPicture16 = new javax.swing.JLabel();
        poss16 = new javax.swing.JLabel();
        teamLogo31 = new javax.swing.JLabel();
        teamLogo32 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        mainPlayerPanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        playerName35 = new javax.swing.JLabel();
        total1 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        playerName36 = new javax.swing.JLabel();
        total2 = new javax.swing.JLabel();
        teamInfo1 = new javax.swing.JPanel();
        toPlay1 = new javax.swing.JLabel();
        inPlay1 = new javax.swing.JLabel();
        projection1 = new javax.swing.JLabel();
        fantasyTeamInfo1 = new javax.swing.JPanel();
        fantasyTeamName1 = new javax.swing.JLabel();
        owner1 = new javax.swing.JLabel();
        fantasyTeamInfo2 = new javax.swing.JPanel();
        fantasyTeamName2 = new javax.swing.JLabel();
        owner2 = new javax.swing.JLabel();
        playerPanel1 = new javax.swing.JPanel();
        playerName1 = new javax.swing.JLabel();
        playerGame1 = new javax.swing.JLabel();
        playerStats1 = new javax.swing.JLabel();
        image1 = new javax.swing.JLabel();
        playerScore1 = new javax.swing.JLabel();
        teamInfo2 = new javax.swing.JPanel();
        toPlay2 = new javax.swing.JLabel();
        inPlay2 = new javax.swing.JLabel();
        projection2 = new javax.swing.JLabel();
        playerPanel2 = new javax.swing.JPanel();
        playerName2 = new javax.swing.JLabel();
        playerGame2 = new javax.swing.JLabel();
        playerStats2 = new javax.swing.JLabel();
        image2 = new javax.swing.JLabel();
        playerScore2 = new javax.swing.JLabel();
        playerPanel3 = new javax.swing.JPanel();
        playerName3 = new javax.swing.JLabel();
        playerGame3 = new javax.swing.JLabel();
        playerStats3 = new javax.swing.JLabel();
        image3 = new javax.swing.JLabel();
        playerScore3 = new javax.swing.JLabel();
        playerPanel4 = new javax.swing.JPanel();
        playerName4 = new javax.swing.JLabel();
        playerGame4 = new javax.swing.JLabel();
        playerStats4 = new javax.swing.JLabel();
        image4 = new javax.swing.JLabel();
        playerScore4 = new javax.swing.JLabel();
        playerPanel5 = new javax.swing.JPanel();
        playerName5 = new javax.swing.JLabel();
        playerGame5 = new javax.swing.JLabel();
        playerStats5 = new javax.swing.JLabel();
        image5 = new javax.swing.JLabel();
        playerScore5 = new javax.swing.JLabel();
        playerPanel6 = new javax.swing.JPanel();
        playerName6 = new javax.swing.JLabel();
        playerGame6 = new javax.swing.JLabel();
        playerStats6 = new javax.swing.JLabel();
        image6 = new javax.swing.JLabel();
        playerScore6 = new javax.swing.JLabel();
        playerPanel7 = new javax.swing.JPanel();
        playerName7 = new javax.swing.JLabel();
        playerGame7 = new javax.swing.JLabel();
        playerStats7 = new javax.swing.JLabel();
        image7 = new javax.swing.JLabel();
        playerScore7 = new javax.swing.JLabel();
        playerPanel8 = new javax.swing.JPanel();
        playerName8 = new javax.swing.JLabel();
        playerGame8 = new javax.swing.JLabel();
        playerStats8 = new javax.swing.JLabel();
        image8 = new javax.swing.JLabel();
        playerScore8 = new javax.swing.JLabel();
        playerPanel9 = new javax.swing.JPanel();
        playerName9 = new javax.swing.JLabel();
        playerGame9 = new javax.swing.JLabel();
        playerStats9 = new javax.swing.JLabel();
        image9 = new javax.swing.JLabel();
        playerScore9 = new javax.swing.JLabel();
        playerPanel10 = new javax.swing.JPanel();
        playerName10 = new javax.swing.JLabel();
        playerGame10 = new javax.swing.JLabel();
        playerStats10 = new javax.swing.JLabel();
        image10 = new javax.swing.JLabel();
        playerScore10 = new javax.swing.JLabel();
        playerPanel11 = new javax.swing.JPanel();
        playerName11 = new javax.swing.JLabel();
        playerGame11 = new javax.swing.JLabel();
        playerStats11 = new javax.swing.JLabel();
        image11 = new javax.swing.JLabel();
        playerScore11 = new javax.swing.JLabel();
        playerPanel12 = new javax.swing.JPanel();
        playerName12 = new javax.swing.JLabel();
        playerGame12 = new javax.swing.JLabel();
        playerStats12 = new javax.swing.JLabel();
        image12 = new javax.swing.JLabel();
        playerScore12 = new javax.swing.JLabel();
        playerPanel13 = new javax.swing.JPanel();
        playerName13 = new javax.swing.JLabel();
        playerGame13 = new javax.swing.JLabel();
        playerStats13 = new javax.swing.JLabel();
        image13 = new javax.swing.JLabel();
        playerScore13 = new javax.swing.JLabel();
        playerPanel14 = new javax.swing.JPanel();
        playerName14 = new javax.swing.JLabel();
        playerGame14 = new javax.swing.JLabel();
        playerStats14 = new javax.swing.JLabel();
        image14 = new javax.swing.JLabel();
        playerScore14 = new javax.swing.JLabel();
        playerPanel15 = new javax.swing.JPanel();
        playerName15 = new javax.swing.JLabel();
        playerGame15 = new javax.swing.JLabel();
        playerStats15 = new javax.swing.JLabel();
        image15 = new javax.swing.JLabel();
        playerScore15 = new javax.swing.JLabel();
        playerPanel16 = new javax.swing.JPanel();
        playerName16 = new javax.swing.JLabel();
        playerGame16 = new javax.swing.JLabel();
        playerStats16 = new javax.swing.JLabel();
        image16 = new javax.swing.JLabel();
        playerScore16 = new javax.swing.JLabel();
        playerPanel17 = new javax.swing.JPanel();
        playerName17 = new javax.swing.JLabel();
        playerGame17 = new javax.swing.JLabel();
        playerStats17 = new javax.swing.JLabel();
        image17 = new javax.swing.JLabel();
        playerScore17 = new javax.swing.JLabel();
        playerPanel18 = new javax.swing.JPanel();
        playerName18 = new javax.swing.JLabel();
        playerGame18 = new javax.swing.JLabel();
        playerStats18 = new javax.swing.JLabel();
        image18 = new javax.swing.JLabel();
        playerScore18 = new javax.swing.JLabel();
        playerPanel19 = new javax.swing.JPanel();
        playerName19 = new javax.swing.JLabel();
        playerGame19 = new javax.swing.JLabel();
        playerStats19 = new javax.swing.JLabel();
        image19 = new javax.swing.JLabel();
        playerScore19 = new javax.swing.JLabel();
        playerPanel20 = new javax.swing.JPanel();
        playerName20 = new javax.swing.JLabel();
        playerGame20 = new javax.swing.JLabel();
        playerStats20 = new javax.swing.JLabel();
        image20 = new javax.swing.JLabel();
        playerScore20 = new javax.swing.JLabel();
        playerPanel21 = new javax.swing.JPanel();
        playerName21 = new javax.swing.JLabel();
        playerGame21 = new javax.swing.JLabel();
        playerStats21 = new javax.swing.JLabel();
        image21 = new javax.swing.JLabel();
        playerScore21 = new javax.swing.JLabel();
        playerPanel22 = new javax.swing.JPanel();
        playerName22 = new javax.swing.JLabel();
        playerGame22 = new javax.swing.JLabel();
        playerStats22 = new javax.swing.JLabel();
        image22 = new javax.swing.JLabel();
        playerScore22 = new javax.swing.JLabel();
        playerPanel23 = new javax.swing.JPanel();
        playerName23 = new javax.swing.JLabel();
        playerGame23 = new javax.swing.JLabel();
        playerStats23 = new javax.swing.JLabel();
        image23 = new javax.swing.JLabel();
        playerScore23 = new javax.swing.JLabel();
        playerPanel24 = new javax.swing.JPanel();
        playerName24 = new javax.swing.JLabel();
        playerGame24 = new javax.swing.JLabel();
        playerStats24 = new javax.swing.JLabel();
        image24 = new javax.swing.JLabel();
        playerScore24 = new javax.swing.JLabel();
        playerPanel25 = new javax.swing.JPanel();
        playerName25 = new javax.swing.JLabel();
        playerGame25 = new javax.swing.JLabel();
        playerStats25 = new javax.swing.JLabel();
        image25 = new javax.swing.JLabel();
        playerScore25 = new javax.swing.JLabel();
        playerPanel26 = new javax.swing.JPanel();
        playerName26 = new javax.swing.JLabel();
        playerGame26 = new javax.swing.JLabel();
        playerStats26 = new javax.swing.JLabel();
        image26 = new javax.swing.JLabel();
        playerScore26 = new javax.swing.JLabel();
        playerPanel27 = new javax.swing.JPanel();
        playerName27 = new javax.swing.JLabel();
        playerGame27 = new javax.swing.JLabel();
        playerStats27 = new javax.swing.JLabel();
        image27 = new javax.swing.JLabel();
        playerScore27 = new javax.swing.JLabel();
        playerPanel28 = new javax.swing.JPanel();
        playerName28 = new javax.swing.JLabel();
        playerGame28 = new javax.swing.JLabel();
        playerStats28 = new javax.swing.JLabel();
        image28 = new javax.swing.JLabel();
        playerScore28 = new javax.swing.JLabel();
        playerPanel29 = new javax.swing.JPanel();
        playerName29 = new javax.swing.JLabel();
        playerGame29 = new javax.swing.JLabel();
        playerStats29 = new javax.swing.JLabel();
        image29 = new javax.swing.JLabel();
        playerScore29 = new javax.swing.JLabel();
        playerPanel30 = new javax.swing.JPanel();
        playerName30 = new javax.swing.JLabel();
        playerGame30 = new javax.swing.JLabel();
        playerStats30 = new javax.swing.JLabel();
        image30 = new javax.swing.JLabel();
        playerScore30 = new javax.swing.JLabel();
        playerPanel31 = new javax.swing.JPanel();
        playerName31 = new javax.swing.JLabel();
        playerGame31 = new javax.swing.JLabel();
        playerStats31 = new javax.swing.JLabel();
        image31 = new javax.swing.JLabel();
        playerScore31 = new javax.swing.JLabel();
        playerPanel32 = new javax.swing.JPanel();
        playerName32 = new javax.swing.JLabel();
        playerGame32 = new javax.swing.JLabel();
        playerStats32 = new javax.swing.JLabel();
        image32 = new javax.swing.JLabel();
        playerScore32 = new javax.swing.JLabel();
        playerPanel33 = new javax.swing.JPanel();
        playerName33 = new javax.swing.JLabel();
        playerGame33 = new javax.swing.JLabel();
        playerStats33 = new javax.swing.JLabel();
        image33 = new javax.swing.JLabel();
        playerScore33 = new javax.swing.JLabel();
        playerPanel34 = new javax.swing.JPanel();
        playerName34 = new javax.swing.JLabel();
        playerGame34 = new javax.swing.JLabel();
        playerStats34 = new javax.swing.JLabel();
        image34 = new javax.swing.JLabel();
        playerScore34 = new javax.swing.JLabel();
        settingsButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        delayBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gamePane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        teamName1.setText("0");

        teamName2.setText("BUF");

        score1.setText("0");

        score2.setText("7");

        gameTime1.setText("2:01 1st");

        gamestatus1.setText("3rd & 6 on KC 24");

        lastPlay1.setForeground(new java.awt.Color(150, 150, 150));
        lastPlay1.setText("asdfasdfa");
        lastPlay1.setFocusable(false);
        jScrollPane4.setViewportView(lastPlay1);

        poss1.setForeground(new java.awt.Color(255, 255, 255));
        poss1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        poss1.setText("Poss:");

        javax.swing.GroupLayout gamePane1Layout = new javax.swing.GroupLayout(gamePane1);
        gamePane1.setLayout(gamePane1Layout);
        gamePane1Layout.setHorizontalGroup(
            gamePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gamePane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(poss1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(possesionPicture1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePane1Layout.createSequentialGroup()
                        .addGroup(gamePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teamLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gamePane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(teamLogo2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gamePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(gamePane1Layout.createSequentialGroup()
                                .addComponent(teamName1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(score1))
                            .addGroup(gamePane1Layout.createSequentialGroup()
                                .addComponent(teamName2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(score2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(gamePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameTime1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gamestatus1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gamePane1Layout.setVerticalGroup(
            gamePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePane1Layout.createSequentialGroup()
                        .addGroup(gamePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gamePane1Layout.createSequentialGroup()
                                .addComponent(gameTime1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gamestatus1))
                            .addGroup(gamePane1Layout.createSequentialGroup()
                                .addGroup(gamePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(teamName1)
                                    .addComponent(score1)
                                    .addComponent(teamLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gamePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gamePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName2)
                                        .addComponent(score2))
                                    .addComponent(teamLogo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(gamePane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(possesionPicture1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(poss1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        gamePane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        teamName3.setText("0");

        teamName4.setText("BUF");

        score3.setText("0");

        score4.setText("7");

        gameTime2.setText("2:01 1st");

        gamestatus2.setText("3rd & 6 on KC 24");

        lastPlay2.setForeground(new java.awt.Color(255, 255, 255));
        lastPlay2.setText("asdfasdfa");
        lastPlay2.setFocusable(false);
        jScrollPane7.setViewportView(lastPlay2);

        poss2.setForeground(new java.awt.Color(255, 255, 255));
        poss2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        poss2.setText("Poss:");

        javax.swing.GroupLayout gamePane2Layout = new javax.swing.GroupLayout(gamePane2);
        gamePane2.setLayout(gamePane2Layout);
        gamePane2Layout.setHorizontalGroup(
            gamePane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gamePane2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(poss2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(possesionPicture2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePane2Layout.createSequentialGroup()
                        .addGroup(gamePane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teamLogo3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gamePane2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(teamLogo4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gamePane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(gamePane2Layout.createSequentialGroup()
                                .addComponent(teamName3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(score3))
                            .addGroup(gamePane2Layout.createSequentialGroup()
                                .addComponent(teamName4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(score4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addGroup(gamePane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameTime2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gamestatus2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gamePane2Layout.setVerticalGroup(
            gamePane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePane2Layout.createSequentialGroup()
                        .addGroup(gamePane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gamePane2Layout.createSequentialGroup()
                                .addComponent(gameTime2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gamestatus2))
                            .addGroup(gamePane2Layout.createSequentialGroup()
                                .addGroup(gamePane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teamLogo3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(gamePane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName3)
                                        .addComponent(score3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gamePane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gamePane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName4)
                                        .addComponent(score4))
                                    .addComponent(teamLogo4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(gamePane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(possesionPicture2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(poss2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        gamePane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        teamName5.setText("0");

        teamName6.setText("BUF");

        score5.setText("0");

        score6.setText("7");

        gameTime3.setText("2:01 1st");

        gamestatus3.setText("3rd & 6 on KC 24");

        lastPlay3.setForeground(new java.awt.Color(102, 102, 102));
        lastPlay3.setText("asdfasdfa");
        lastPlay3.setFocusable(false);
        jScrollPane5.setViewportView(lastPlay3);

        poss3.setForeground(new java.awt.Color(255, 255, 255));
        poss3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        poss3.setText("Poss:");

        javax.swing.GroupLayout gamePane3Layout = new javax.swing.GroupLayout(gamePane3);
        gamePane3.setLayout(gamePane3Layout);
        gamePane3Layout.setHorizontalGroup(
            gamePane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gamePane3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(poss3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(possesionPicture3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePane3Layout.createSequentialGroup()
                        .addGroup(gamePane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teamLogo5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gamePane3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(teamLogo6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gamePane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(gamePane3Layout.createSequentialGroup()
                                .addComponent(teamName5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(score5))
                            .addGroup(gamePane3Layout.createSequentialGroup()
                                .addComponent(teamName6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(score6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(gamePane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameTime3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gamestatus3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gamePane3Layout.setVerticalGroup(
            gamePane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePane3Layout.createSequentialGroup()
                        .addGroup(gamePane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gamePane3Layout.createSequentialGroup()
                                .addComponent(gameTime3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gamestatus3))
                            .addGroup(gamePane3Layout.createSequentialGroup()
                                .addGroup(gamePane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teamLogo5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(gamePane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName5)
                                        .addComponent(score5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gamePane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gamePane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName6)
                                        .addComponent(score6))
                                    .addComponent(teamLogo6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(gamePane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(possesionPicture3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(poss3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        gamePane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        teamName7.setText("0");

        teamName8.setText("BUF");

        score7.setText("0");

        score8.setText("7");

        gameTime4.setText("2:01 1st");

        gamestatus4.setText("3rd & 6 on KC 24");

        lastPlay4.setForeground(new java.awt.Color(102, 102, 102));
        lastPlay4.setText("asdfasdfa");
        lastPlay4.setFocusable(false);
        jScrollPane6.setViewportView(lastPlay4);

        poss4.setForeground(new java.awt.Color(255, 255, 255));
        poss4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        poss4.setText("Poss:");

        javax.swing.GroupLayout gamePane4Layout = new javax.swing.GroupLayout(gamePane4);
        gamePane4.setLayout(gamePane4Layout);
        gamePane4Layout.setHorizontalGroup(
            gamePane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gamePane4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(poss4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(possesionPicture4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePane4Layout.createSequentialGroup()
                        .addGroup(gamePane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teamLogo7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gamePane4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(teamLogo8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gamePane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(gamePane4Layout.createSequentialGroup()
                                .addComponent(teamName7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(score7))
                            .addGroup(gamePane4Layout.createSequentialGroup()
                                .addComponent(teamName8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(score8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(gamePane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameTime4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gamestatus4, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gamePane4Layout.setVerticalGroup(
            gamePane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePane4Layout.createSequentialGroup()
                        .addGroup(gamePane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gamePane4Layout.createSequentialGroup()
                                .addComponent(gameTime4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gamestatus4))
                            .addGroup(gamePane4Layout.createSequentialGroup()
                                .addGroup(gamePane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teamLogo7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(gamePane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName7)
                                        .addComponent(score7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gamePane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gamePane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName8)
                                        .addComponent(score8))
                                    .addComponent(teamLogo8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(gamePane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(possesionPicture4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(poss4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        gamePane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        teamName9.setText("0");

        teamName10.setText("BUF");

        score9.setText("0");

        score10.setText("7");

        gameTime5.setText("2:01 1st");

        gamestatus5.setText("3rd & 6 on KC 24");

        lastPlay5.setForeground(new java.awt.Color(102, 102, 102));
        lastPlay5.setText("asdfasdfa");
        lastPlay5.setFocusable(false);
        jScrollPane8.setViewportView(lastPlay5);

        poss5.setForeground(new java.awt.Color(255, 255, 255));
        poss5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        poss5.setText("Poss:");

        javax.swing.GroupLayout gamePane5Layout = new javax.swing.GroupLayout(gamePane5);
        gamePane5.setLayout(gamePane5Layout);
        gamePane5Layout.setHorizontalGroup(
            gamePane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gamePane5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(poss5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(possesionPicture5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePane5Layout.createSequentialGroup()
                        .addGroup(gamePane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teamLogo9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gamePane5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(teamLogo10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gamePane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(gamePane5Layout.createSequentialGroup()
                                .addComponent(teamName9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(score9))
                            .addGroup(gamePane5Layout.createSequentialGroup()
                                .addComponent(teamName10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(score10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(gamePane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameTime5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gamestatus5, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gamePane5Layout.setVerticalGroup(
            gamePane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePane5Layout.createSequentialGroup()
                        .addGroup(gamePane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gamePane5Layout.createSequentialGroup()
                                .addComponent(gameTime5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gamestatus5))
                            .addGroup(gamePane5Layout.createSequentialGroup()
                                .addGroup(gamePane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teamLogo9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(gamePane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName9)
                                        .addComponent(score9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gamePane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gamePane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName10)
                                        .addComponent(score10))
                                    .addComponent(teamLogo10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(gamePane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(possesionPicture5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(poss5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        gamePane6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        teamName11.setText("0");

        teamName12.setText("BUF");

        score11.setText("0");

        score12.setText("7");

        gameTime6.setText("2:01 1st");

        gamestatus6.setText("3rd & 6 on KC 24");

        lastPlay6.setForeground(new java.awt.Color(102, 102, 102));
        lastPlay6.setText("asdfasdfa");
        lastPlay6.setFocusable(false);
        jScrollPane9.setViewportView(lastPlay6);

        poss6.setForeground(new java.awt.Color(255, 255, 255));
        poss6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        poss6.setText("Poss:");

        javax.swing.GroupLayout gamePane6Layout = new javax.swing.GroupLayout(gamePane6);
        gamePane6.setLayout(gamePane6Layout);
        gamePane6Layout.setHorizontalGroup(
            gamePane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gamePane6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(poss6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(possesionPicture6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePane6Layout.createSequentialGroup()
                        .addGroup(gamePane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teamLogo11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gamePane6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(teamLogo12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gamePane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(gamePane6Layout.createSequentialGroup()
                                .addComponent(teamName11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(score11))
                            .addGroup(gamePane6Layout.createSequentialGroup()
                                .addComponent(teamName12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(score12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(gamePane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameTime6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gamestatus6, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gamePane6Layout.setVerticalGroup(
            gamePane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePane6Layout.createSequentialGroup()
                        .addGroup(gamePane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gamePane6Layout.createSequentialGroup()
                                .addComponent(gameTime6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gamestatus6))
                            .addGroup(gamePane6Layout.createSequentialGroup()
                                .addGroup(gamePane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teamLogo11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(gamePane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName11)
                                        .addComponent(score11)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gamePane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gamePane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName12)
                                        .addComponent(score12))
                                    .addComponent(teamLogo12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(gamePane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(possesionPicture6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(poss6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        gamePane7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        teamName13.setText("0");

        teamName14.setText("BUF");

        score13.setText("0");

        score14.setText("7");

        gameTime7.setText("2:01 1st");

        gamestatus7.setText("3rd & 6 on KC 24");

        lastPlay7.setForeground(new java.awt.Color(102, 102, 102));
        lastPlay7.setText("asdfasdfa");
        lastPlay7.setFocusable(false);
        jScrollPane10.setViewportView(lastPlay7);

        poss7.setForeground(new java.awt.Color(255, 255, 255));
        poss7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        poss7.setText("Poss:");

        javax.swing.GroupLayout gamePane7Layout = new javax.swing.GroupLayout(gamePane7);
        gamePane7.setLayout(gamePane7Layout);
        gamePane7Layout.setHorizontalGroup(
            gamePane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gamePane7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(poss7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(possesionPicture7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePane7Layout.createSequentialGroup()
                        .addGroup(gamePane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teamLogo13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gamePane7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(teamLogo14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gamePane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(gamePane7Layout.createSequentialGroup()
                                .addComponent(teamName13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(score13))
                            .addGroup(gamePane7Layout.createSequentialGroup()
                                .addComponent(teamName14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(score14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(gamePane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameTime7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gamestatus7, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gamePane7Layout.setVerticalGroup(
            gamePane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePane7Layout.createSequentialGroup()
                        .addGroup(gamePane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gamePane7Layout.createSequentialGroup()
                                .addComponent(gameTime7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gamestatus7))
                            .addGroup(gamePane7Layout.createSequentialGroup()
                                .addGroup(gamePane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teamLogo13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(gamePane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName13)
                                        .addComponent(score13)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gamePane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gamePane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName14)
                                        .addComponent(score14))
                                    .addComponent(teamLogo14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(gamePane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(possesionPicture7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(poss7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        gamePane8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        teamName15.setText("0");

        teamName16.setText("BUF");

        score15.setText("0");

        score16.setText("7");

        gameTime8.setText("2:01 1st");

        gamestatus8.setText("3rd & 6 on KC 24");

        lastPlay8.setForeground(new java.awt.Color(102, 102, 102));
        lastPlay8.setText("asdfasdfa");
        lastPlay8.setFocusable(false);
        jScrollPane11.setViewportView(lastPlay8);

        poss8.setForeground(new java.awt.Color(255, 255, 255));
        poss8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        poss8.setText("Poss:");

        javax.swing.GroupLayout gamePane8Layout = new javax.swing.GroupLayout(gamePane8);
        gamePane8.setLayout(gamePane8Layout);
        gamePane8Layout.setHorizontalGroup(
            gamePane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gamePane8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(poss8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(possesionPicture8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePane8Layout.createSequentialGroup()
                        .addGroup(gamePane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teamLogo15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gamePane8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(teamLogo16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gamePane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(gamePane8Layout.createSequentialGroup()
                                .addComponent(teamName15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(score15))
                            .addGroup(gamePane8Layout.createSequentialGroup()
                                .addComponent(teamName16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(score16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(gamePane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameTime8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gamestatus8, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gamePane8Layout.setVerticalGroup(
            gamePane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePane8Layout.createSequentialGroup()
                        .addGroup(gamePane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gamePane8Layout.createSequentialGroup()
                                .addComponent(gameTime8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gamestatus8))
                            .addGroup(gamePane8Layout.createSequentialGroup()
                                .addGroup(gamePane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teamLogo15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(gamePane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName15)
                                        .addComponent(score15)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gamePane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gamePane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName16)
                                        .addComponent(score16))
                                    .addComponent(teamLogo16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(gamePane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(possesionPicture8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(poss8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        gamePane9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        teamName17.setText("0");

        teamName18.setText("BUF");

        score17.setText("0");

        score18.setText("7");

        gameTime9.setText("2:01 1st");

        gamestatus9.setText("3rd & 6 on KC 24");

        lastPlay9.setForeground(new java.awt.Color(102, 102, 102));
        lastPlay9.setText("asdfasdfa");
        lastPlay9.setFocusable(false);
        jScrollPane12.setViewportView(lastPlay9);

        poss9.setForeground(new java.awt.Color(255, 255, 255));
        poss9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        poss9.setText("Poss:");

        javax.swing.GroupLayout gamePane9Layout = new javax.swing.GroupLayout(gamePane9);
        gamePane9.setLayout(gamePane9Layout);
        gamePane9Layout.setHorizontalGroup(
            gamePane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gamePane9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(poss9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(possesionPicture9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePane9Layout.createSequentialGroup()
                        .addGroup(gamePane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teamLogo17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gamePane9Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(teamLogo18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gamePane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(gamePane9Layout.createSequentialGroup()
                                .addComponent(teamName17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(score17))
                            .addGroup(gamePane9Layout.createSequentialGroup()
                                .addComponent(teamName18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(score18)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(gamePane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameTime9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gamestatus9, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gamePane9Layout.setVerticalGroup(
            gamePane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePane9Layout.createSequentialGroup()
                        .addGroup(gamePane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gamePane9Layout.createSequentialGroup()
                                .addComponent(gameTime9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gamestatus9))
                            .addGroup(gamePane9Layout.createSequentialGroup()
                                .addGroup(gamePane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teamLogo17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(gamePane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName17)
                                        .addComponent(score17)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gamePane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gamePane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName18)
                                        .addComponent(score18))
                                    .addComponent(teamLogo18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(gamePane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(possesionPicture9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(poss9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        gamePane10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        teamName19.setText("0");

        teamName20.setText("BUF");

        score19.setText("0");

        score20.setText("7");

        gameTime10.setText("2:01 1st");

        gamestatus10.setText("3rd & 6 on KC 24");

        lastPlay10.setForeground(new java.awt.Color(102, 102, 102));
        lastPlay10.setText("asdfasdfa");
        lastPlay10.setFocusable(false);
        jScrollPane13.setViewportView(lastPlay10);

        poss10.setForeground(new java.awt.Color(255, 255, 255));
        poss10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        poss10.setText("Poss:");

        javax.swing.GroupLayout gamePane10Layout = new javax.swing.GroupLayout(gamePane10);
        gamePane10.setLayout(gamePane10Layout);
        gamePane10Layout.setHorizontalGroup(
            gamePane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gamePane10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(poss10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(possesionPicture10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePane10Layout.createSequentialGroup()
                        .addGroup(gamePane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teamLogo19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gamePane10Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(teamLogo20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gamePane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(gamePane10Layout.createSequentialGroup()
                                .addComponent(teamName19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(score19))
                            .addGroup(gamePane10Layout.createSequentialGroup()
                                .addComponent(teamName20, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(score20)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(gamePane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameTime10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gamestatus10, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gamePane10Layout.setVerticalGroup(
            gamePane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePane10Layout.createSequentialGroup()
                        .addGroup(gamePane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gamePane10Layout.createSequentialGroup()
                                .addComponent(gameTime10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gamestatus10))
                            .addGroup(gamePane10Layout.createSequentialGroup()
                                .addGroup(gamePane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teamLogo19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(gamePane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName19)
                                        .addComponent(score19)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gamePane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gamePane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName20)
                                        .addComponent(score20))
                                    .addComponent(teamLogo20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(gamePane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(possesionPicture10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(poss10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        gamePane11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        teamName21.setText("0");

        teamName22.setText("BUF");

        score21.setText("0");

        score22.setText("7");

        gameTime11.setText("2:01 1st");

        gamestatus11.setText("3rd & 6 on KC 24");

        lastPlay11.setForeground(new java.awt.Color(102, 102, 102));
        lastPlay11.setText("asdfasdfa");
        lastPlay11.setFocusable(false);
        jScrollPane14.setViewportView(lastPlay11);

        poss11.setForeground(new java.awt.Color(255, 255, 255));
        poss11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        poss11.setText("Poss:");

        javax.swing.GroupLayout gamePane11Layout = new javax.swing.GroupLayout(gamePane11);
        gamePane11.setLayout(gamePane11Layout);
        gamePane11Layout.setHorizontalGroup(
            gamePane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gamePane11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(poss11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(possesionPicture11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePane11Layout.createSequentialGroup()
                        .addGroup(gamePane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teamLogo21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gamePane11Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(teamLogo22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gamePane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(gamePane11Layout.createSequentialGroup()
                                .addComponent(teamName21, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(score21))
                            .addGroup(gamePane11Layout.createSequentialGroup()
                                .addComponent(teamName22, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(score22)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(gamePane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameTime11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gamestatus11, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gamePane11Layout.setVerticalGroup(
            gamePane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePane11Layout.createSequentialGroup()
                        .addGroup(gamePane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gamePane11Layout.createSequentialGroup()
                                .addComponent(gameTime11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gamestatus11))
                            .addGroup(gamePane11Layout.createSequentialGroup()
                                .addGroup(gamePane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teamLogo21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(gamePane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName21)
                                        .addComponent(score21)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gamePane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gamePane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName22)
                                        .addComponent(score22))
                                    .addComponent(teamLogo22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(gamePane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(possesionPicture11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(poss11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        gamePane12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        teamName23.setText("0");

        teamName24.setText("BUF");

        score23.setText("0");

        score24.setText("7");

        gameTime12.setText("2:01 1st");

        gamestatus12.setText("3rd & 6 on KC 24");

        lastPlay12.setForeground(new java.awt.Color(102, 102, 102));
        lastPlay12.setText("asdfasdfa");
        lastPlay12.setFocusable(false);
        jScrollPane15.setViewportView(lastPlay12);

        poss12.setForeground(new java.awt.Color(255, 255, 255));
        poss12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        poss12.setText("Poss:");

        javax.swing.GroupLayout gamePane12Layout = new javax.swing.GroupLayout(gamePane12);
        gamePane12.setLayout(gamePane12Layout);
        gamePane12Layout.setHorizontalGroup(
            gamePane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gamePane12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(poss12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(possesionPicture12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePane12Layout.createSequentialGroup()
                        .addGroup(gamePane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teamLogo23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gamePane12Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(teamLogo24, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gamePane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(gamePane12Layout.createSequentialGroup()
                                .addComponent(teamName23, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(score23))
                            .addGroup(gamePane12Layout.createSequentialGroup()
                                .addComponent(teamName24, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(score24)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(gamePane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameTime12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gamestatus12, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gamePane12Layout.setVerticalGroup(
            gamePane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePane12Layout.createSequentialGroup()
                        .addGroup(gamePane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gamePane12Layout.createSequentialGroup()
                                .addComponent(gameTime12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gamestatus12))
                            .addGroup(gamePane12Layout.createSequentialGroup()
                                .addGroup(gamePane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teamLogo23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(gamePane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName23)
                                        .addComponent(score23)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gamePane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gamePane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName24)
                                        .addComponent(score24))
                                    .addComponent(teamLogo24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(gamePane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(possesionPicture12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(poss12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        gamePane13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        teamName25.setText("0");

        teamName26.setText("BUF");

        score25.setText("0");

        score26.setText("7");

        gameTime13.setText("2:01 1st");

        gamestatus13.setText("3rd & 6 on KC 24");

        lastPlay13.setForeground(new java.awt.Color(102, 102, 102));
        lastPlay13.setText("asdfasdfa");
        lastPlay13.setFocusable(false);
        jScrollPane16.setViewportView(lastPlay13);

        poss13.setForeground(new java.awt.Color(255, 255, 255));
        poss13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        poss13.setText("Poss:");

        javax.swing.GroupLayout gamePane13Layout = new javax.swing.GroupLayout(gamePane13);
        gamePane13.setLayout(gamePane13Layout);
        gamePane13Layout.setHorizontalGroup(
            gamePane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gamePane13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(poss13, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(possesionPicture13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePane13Layout.createSequentialGroup()
                        .addGroup(gamePane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teamLogo25, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gamePane13Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(teamLogo26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gamePane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(gamePane13Layout.createSequentialGroup()
                                .addComponent(teamName25, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(score25))
                            .addGroup(gamePane13Layout.createSequentialGroup()
                                .addComponent(teamName26, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(score26)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(gamePane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameTime13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gamestatus13, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gamePane13Layout.setVerticalGroup(
            gamePane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePane13Layout.createSequentialGroup()
                        .addGroup(gamePane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gamePane13Layout.createSequentialGroup()
                                .addComponent(gameTime13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gamestatus13))
                            .addGroup(gamePane13Layout.createSequentialGroup()
                                .addGroup(gamePane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teamLogo25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(gamePane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName25)
                                        .addComponent(score25)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gamePane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gamePane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName26)
                                        .addComponent(score26))
                                    .addComponent(teamLogo26, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(gamePane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(possesionPicture13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(poss13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        gamePane14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        teamName27.setText("0");

        teamName28.setText("BUF");

        score27.setText("0");

        score28.setText("7");

        gameTime14.setText("2:01 1st");

        gamestatus14.setText("3rd & 6 on KC 24");

        lastPlay14.setForeground(new java.awt.Color(102, 102, 102));
        lastPlay14.setText("asdfasdfa");
        lastPlay14.setFocusable(false);
        jScrollPane17.setViewportView(lastPlay14);

        poss14.setForeground(new java.awt.Color(255, 255, 255));
        poss14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        poss14.setText("Poss:");

        javax.swing.GroupLayout gamePane14Layout = new javax.swing.GroupLayout(gamePane14);
        gamePane14.setLayout(gamePane14Layout);
        gamePane14Layout.setHorizontalGroup(
            gamePane14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gamePane14Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(poss14, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(possesionPicture14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePane14Layout.createSequentialGroup()
                        .addGroup(gamePane14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teamLogo27, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gamePane14Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(teamLogo28, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gamePane14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(gamePane14Layout.createSequentialGroup()
                                .addComponent(teamName27, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(score27))
                            .addGroup(gamePane14Layout.createSequentialGroup()
                                .addComponent(teamName28, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(score28)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(gamePane14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameTime14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gamestatus14, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gamePane14Layout.setVerticalGroup(
            gamePane14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePane14Layout.createSequentialGroup()
                        .addGroup(gamePane14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gamePane14Layout.createSequentialGroup()
                                .addComponent(gameTime14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gamestatus14))
                            .addGroup(gamePane14Layout.createSequentialGroup()
                                .addGroup(gamePane14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teamLogo27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(gamePane14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName27)
                                        .addComponent(score27)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gamePane14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gamePane14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName28)
                                        .addComponent(score28))
                                    .addComponent(teamLogo28, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(gamePane14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(possesionPicture14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(poss14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        gamePane15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        teamName29.setText("0");

        teamName30.setText("BUF");

        score29.setText("0");

        score30.setText("7");

        gameTime15.setText("2:01 1st");

        gamestatus15.setText("3rd & 6 on KC 24");

        lastPlay15.setForeground(new java.awt.Color(102, 102, 102));
        lastPlay15.setText("asdfasdfa");
        lastPlay15.setFocusable(false);
        jScrollPane18.setViewportView(lastPlay15);

        poss15.setForeground(new java.awt.Color(255, 255, 255));
        poss15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        poss15.setText("Poss:");

        javax.swing.GroupLayout gamePane15Layout = new javax.swing.GroupLayout(gamePane15);
        gamePane15.setLayout(gamePane15Layout);
        gamePane15Layout.setHorizontalGroup(
            gamePane15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gamePane15Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(poss15, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(possesionPicture15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePane15Layout.createSequentialGroup()
                        .addGroup(gamePane15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teamLogo29, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gamePane15Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(teamLogo30, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gamePane15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(gamePane15Layout.createSequentialGroup()
                                .addComponent(teamName29, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(score29))
                            .addGroup(gamePane15Layout.createSequentialGroup()
                                .addComponent(teamName30, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(score30)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(gamePane15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameTime15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gamestatus15, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gamePane15Layout.setVerticalGroup(
            gamePane15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePane15Layout.createSequentialGroup()
                        .addGroup(gamePane15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gamePane15Layout.createSequentialGroup()
                                .addComponent(gameTime15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gamestatus15))
                            .addGroup(gamePane15Layout.createSequentialGroup()
                                .addGroup(gamePane15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teamLogo29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(gamePane15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName29)
                                        .addComponent(score29)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gamePane15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gamePane15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName30)
                                        .addComponent(score30))
                                    .addComponent(teamLogo30, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(gamePane15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(possesionPicture15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(poss15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        gamePane16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        teamName31.setText("0");

        teamName32.setText("BUF");

        score31.setText("0");

        score32.setText("7");

        gameTime16.setText("2:01 1st");

        gamestatus16.setText("3rd & 6 on KC 24");

        lastPlay16.setForeground(new java.awt.Color(102, 102, 102));
        lastPlay16.setText("asdfasdfa");
        lastPlay16.setFocusable(false);
        jScrollPane19.setViewportView(lastPlay16);

        poss16.setForeground(new java.awt.Color(255, 255, 255));
        poss16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        poss16.setText("Poss:");

        javax.swing.GroupLayout gamePane16Layout = new javax.swing.GroupLayout(gamePane16);
        gamePane16.setLayout(gamePane16Layout);
        gamePane16Layout.setHorizontalGroup(
            gamePane16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gamePane16Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(poss16, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(possesionPicture16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePane16Layout.createSequentialGroup()
                        .addGroup(gamePane16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teamLogo31, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gamePane16Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(teamLogo32, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gamePane16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(gamePane16Layout.createSequentialGroup()
                                .addComponent(teamName31, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(score31))
                            .addGroup(gamePane16Layout.createSequentialGroup()
                                .addComponent(teamName32, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(score32)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(gamePane16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameTime16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gamestatus16, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gamePane16Layout.setVerticalGroup(
            gamePane16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePane16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePane16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePane16Layout.createSequentialGroup()
                        .addGroup(gamePane16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gamePane16Layout.createSequentialGroup()
                                .addComponent(gameTime16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gamestatus16))
                            .addGroup(gamePane16Layout.createSequentialGroup()
                                .addGroup(gamePane16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teamLogo31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(gamePane16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName31)
                                        .addComponent(score31)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gamePane16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gamePane16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamName32)
                                        .addComponent(score32))
                                    .addComponent(teamLogo32, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(gamePane16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(possesionPicture16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(poss16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout mainGameScorePanelLayout = new javax.swing.GroupLayout(mainGameScorePanel);
        mainGameScorePanel.setLayout(mainGameScorePanelLayout);
        mainGameScorePanelLayout.setHorizontalGroup(
            mainGameScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainGameScorePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainGameScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gamePane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gamePane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gamePane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gamePane5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gamePane6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gamePane7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gamePane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gamePane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gamePane10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gamePane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gamePane12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gamePane13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gamePane14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gamePane15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gamePane16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gamePane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainGameScorePanelLayout.setVerticalGroup(
            mainGameScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainGameScorePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gamePane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gamePane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gamePane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gamePane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gamePane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gamePane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gamePane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gamePane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gamePane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gamePane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gamePane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gamePane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gamePane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gamePane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gamePane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gamePane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        scrollPane.setViewportView(mainGameScorePanel);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("QB");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("RB");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("RB");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("WR");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("WR");

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("TE");

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("FLEX");

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("D/ST");

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("K");

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("BE");

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("BE");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("BE");

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("BE");

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("BE");

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("BE");

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("BE");

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("BE");

        jPanel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        playerName35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        playerName35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        playerName35.setText("TOTAL SCORE:");

        total1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        total1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        total1.setText("0");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(playerName35, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(total1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(playerName35, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addComponent(total1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        playerName36.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        playerName36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        playerName36.setText("TOTAL SCORE:");

        total2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        total2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        total2.setText("0");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(playerName36, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(total2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(playerName36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(total2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        teamInfo1.setOpaque(false);

        toPlay1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        toPlay1.setText("To Play:");

        inPlay1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        inPlay1.setText("In Play:");

        projection1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        projection1.setText("Proj:");

        javax.swing.GroupLayout teamInfo1Layout = new javax.swing.GroupLayout(teamInfo1);
        teamInfo1.setLayout(teamInfo1Layout);
        teamInfo1Layout.setHorizontalGroup(
            teamInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teamInfo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toPlay1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inPlay1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(projection1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        teamInfo1Layout.setVerticalGroup(
            teamInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teamInfo1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(teamInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toPlay1)
                    .addComponent(inPlay1)
                    .addComponent(projection1))
                .addContainerGap())
        );

        fantasyTeamInfo1.setOpaque(false);

        fantasyTeamName1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fantasyTeamName1.setText("Born for This");
        fantasyTeamName1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        owner1.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        owner1.setText("(0-0) Kyle Owens");
        owner1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout fantasyTeamInfo1Layout = new javax.swing.GroupLayout(fantasyTeamInfo1);
        fantasyTeamInfo1.setLayout(fantasyTeamInfo1Layout);
        fantasyTeamInfo1Layout.setHorizontalGroup(
            fantasyTeamInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fantasyTeamInfo1Layout.createSequentialGroup()
                .addGroup(fantasyTeamInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fantasyTeamName1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(owner1))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        fantasyTeamInfo1Layout.setVerticalGroup(
            fantasyTeamInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fantasyTeamInfo1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fantasyTeamName1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(owner1)
                .addContainerGap())
        );

        fantasyTeamInfo2.setOpaque(false);

        fantasyTeamName2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fantasyTeamName2.setText("Born for This");
        fantasyTeamName2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        owner2.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        owner2.setText("(0-0) Kyle Owens");

        javax.swing.GroupLayout fantasyTeamInfo2Layout = new javax.swing.GroupLayout(fantasyTeamInfo2);
        fantasyTeamInfo2.setLayout(fantasyTeamInfo2Layout);
        fantasyTeamInfo2Layout.setHorizontalGroup(
            fantasyTeamInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fantasyTeamInfo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fantasyTeamInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(owner2)
                    .addComponent(fantasyTeamName2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fantasyTeamInfo2Layout.setVerticalGroup(
            fantasyTeamInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fantasyTeamInfo2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fantasyTeamName2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(owner2)
                .addContainerGap())
        );

        playerPanel1.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel1.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName1.setText("n Contreras, ChC");
        playerName1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame1.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame1.setText(":05 ET");

        playerStats1.setText("2 Yds");
        playerStats1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore1.setText("0");

        javax.swing.GroupLayout playerPanel1Layout = new javax.swing.GroupLayout(playerPanel1);
        playerPanel1.setLayout(playerPanel1Layout);
        playerPanel1Layout.setHorizontalGroup(
            playerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel1Layout.setVerticalGroup(
            playerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel1Layout.createSequentialGroup()
                .addGroup(playerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel1Layout.createSequentialGroup()
                        .addGroup(playerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel1Layout.createSequentialGroup()
                                .addComponent(playerName1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats1))
                            .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        teamInfo2.setOpaque(false);

        toPlay2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        toPlay2.setText("To Play:");

        inPlay2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        inPlay2.setText("In Play:");

        projection2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        projection2.setText("Proj:");

        javax.swing.GroupLayout teamInfo2Layout = new javax.swing.GroupLayout(teamInfo2);
        teamInfo2.setLayout(teamInfo2Layout);
        teamInfo2Layout.setHorizontalGroup(
            teamInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teamInfo2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(toPlay2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inPlay2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(projection2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        teamInfo2Layout.setVerticalGroup(
            teamInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teamInfo2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(teamInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toPlay2)
                    .addComponent(inPlay2)
                    .addComponent(projection2))
                .addContainerGap())
        );

        playerPanel2.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel2.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName2.setText("n Contreras, ChC");
        playerName2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame2.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame2.setText(":05 ET");

        playerStats2.setText("2 Yds");
        playerStats2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore2.setText("0");

        javax.swing.GroupLayout playerPanel2Layout = new javax.swing.GroupLayout(playerPanel2);
        playerPanel2.setLayout(playerPanel2Layout);
        playerPanel2Layout.setHorizontalGroup(
            playerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerGame2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerStats2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel2Layout.setVerticalGroup(
            playerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(playerScore2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(playerPanel2Layout.createSequentialGroup()
                .addGroup(playerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerPanel2Layout.createSequentialGroup()
                        .addComponent(playerName2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerGame2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(playerStats2))
                    .addComponent(image2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        playerPanel3.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel3.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName3.setText("n Contreras, ChC");
        playerName3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame3.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame3.setText(":05 ET");

        playerStats3.setText("2 Yds");
        playerStats3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore3.setText("0");

        javax.swing.GroupLayout playerPanel3Layout = new javax.swing.GroupLayout(playerPanel3);
        playerPanel3.setLayout(playerPanel3Layout);
        playerPanel3Layout.setHorizontalGroup(
            playerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel3Layout.setVerticalGroup(
            playerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel3Layout.createSequentialGroup()
                .addGroup(playerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel3Layout.createSequentialGroup()
                        .addGroup(playerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel3Layout.createSequentialGroup()
                                .addComponent(playerName3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats3))
                            .addComponent(image3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel4.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel4.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName4.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName4.setText("n Contreras, ChC");
        playerName4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame4.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame4.setText(":05 ET");

        playerStats4.setText("2 Yds");
        playerStats4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore4.setText("0");

        javax.swing.GroupLayout playerPanel4Layout = new javax.swing.GroupLayout(playerPanel4);
        playerPanel4.setLayout(playerPanel4Layout);
        playerPanel4Layout.setHorizontalGroup(
            playerPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel4Layout.setVerticalGroup(
            playerPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel4Layout.createSequentialGroup()
                .addGroup(playerPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel4Layout.createSequentialGroup()
                        .addGroup(playerPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel4Layout.createSequentialGroup()
                                .addComponent(playerName4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame4, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats4))
                            .addComponent(image4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel5.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel5.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName5.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName5.setText("n Contreras, ChC");
        playerName5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame5.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame5.setText(":05 ET");

        playerStats5.setText("2 Yds");
        playerStats5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore5.setText("0");

        javax.swing.GroupLayout playerPanel5Layout = new javax.swing.GroupLayout(playerPanel5);
        playerPanel5.setLayout(playerPanel5Layout);
        playerPanel5Layout.setHorizontalGroup(
            playerPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel5Layout.setVerticalGroup(
            playerPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel5Layout.createSequentialGroup()
                .addGroup(playerPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel5Layout.createSequentialGroup()
                        .addGroup(playerPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel5Layout.createSequentialGroup()
                                .addComponent(playerName5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame5, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats5))
                            .addComponent(image5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel6.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel6.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName6.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName6.setText("n Contreras, ChC");
        playerName6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame6.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame6.setText(":05 ET");

        playerStats6.setText("2 Yds");
        playerStats6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore6.setText("0");

        javax.swing.GroupLayout playerPanel6Layout = new javax.swing.GroupLayout(playerPanel6);
        playerPanel6.setLayout(playerPanel6Layout);
        playerPanel6Layout.setHorizontalGroup(
            playerPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel6Layout.setVerticalGroup(
            playerPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel6Layout.createSequentialGroup()
                .addGroup(playerPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel6Layout.createSequentialGroup()
                        .addGroup(playerPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel6Layout.createSequentialGroup()
                                .addComponent(playerName6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame6, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats6))
                            .addComponent(image6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel7.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel7.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName7.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName7.setText("n Contreras, ChC");
        playerName7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame7.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame7.setText(":05 ET");

        playerStats7.setText("2 Yds");
        playerStats7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore7.setText("0");

        javax.swing.GroupLayout playerPanel7Layout = new javax.swing.GroupLayout(playerPanel7);
        playerPanel7.setLayout(playerPanel7Layout);
        playerPanel7Layout.setHorizontalGroup(
            playerPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel7Layout.setVerticalGroup(
            playerPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel7Layout.createSequentialGroup()
                .addGroup(playerPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel7Layout.createSequentialGroup()
                        .addGroup(playerPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel7Layout.createSequentialGroup()
                                .addComponent(playerName7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame7, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats7))
                            .addComponent(image7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel8.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel8.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName8.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName8.setText("n Contreras, ChC");
        playerName8.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame8.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame8.setText(":05 ET");

        playerStats8.setText("2 Yds");
        playerStats8.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore8.setText("0");

        javax.swing.GroupLayout playerPanel8Layout = new javax.swing.GroupLayout(playerPanel8);
        playerPanel8.setLayout(playerPanel8Layout);
        playerPanel8Layout.setHorizontalGroup(
            playerPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel8Layout.setVerticalGroup(
            playerPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel8Layout.createSequentialGroup()
                .addGroup(playerPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel8Layout.createSequentialGroup()
                        .addGroup(playerPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel8Layout.createSequentialGroup()
                                .addComponent(playerName8, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame8, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats8))
                            .addComponent(image8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel9.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel9.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName9.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName9.setText("n Contreras, ChC");
        playerName9.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame9.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame9.setText(":05 ET");

        playerStats9.setText("2 Yds");
        playerStats9.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore9.setText("0");

        javax.swing.GroupLayout playerPanel9Layout = new javax.swing.GroupLayout(playerPanel9);
        playerPanel9.setLayout(playerPanel9Layout);
        playerPanel9Layout.setHorizontalGroup(
            playerPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats9, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel9Layout.setVerticalGroup(
            playerPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel9Layout.createSequentialGroup()
                .addGroup(playerPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel9Layout.createSequentialGroup()
                        .addGroup(playerPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel9Layout.createSequentialGroup()
                                .addComponent(playerName9, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame9, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats9))
                            .addComponent(image9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel10.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel10.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName10.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName10.setText("n Contreras, ChC");
        playerName10.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame10.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame10.setText(":05 ET");

        playerStats10.setText("2 Yds");
        playerStats10.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore10.setText("0");

        javax.swing.GroupLayout playerPanel10Layout = new javax.swing.GroupLayout(playerPanel10);
        playerPanel10.setLayout(playerPanel10Layout);
        playerPanel10Layout.setHorizontalGroup(
            playerPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats10, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel10Layout.setVerticalGroup(
            playerPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel10Layout.createSequentialGroup()
                .addGroup(playerPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel10Layout.createSequentialGroup()
                        .addGroup(playerPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel10Layout.createSequentialGroup()
                                .addComponent(playerName10, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame10, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats10))
                            .addComponent(image10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel11.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel11.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName11.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName11.setText("n Contreras, ChC");
        playerName11.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame11.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame11.setText(":05 ET");

        playerStats11.setText("2 Yds");
        playerStats11.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore11.setText("0");

        javax.swing.GroupLayout playerPanel11Layout = new javax.swing.GroupLayout(playerPanel11);
        playerPanel11.setLayout(playerPanel11Layout);
        playerPanel11Layout.setHorizontalGroup(
            playerPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats11, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel11Layout.setVerticalGroup(
            playerPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel11Layout.createSequentialGroup()
                .addGroup(playerPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel11Layout.createSequentialGroup()
                        .addGroup(playerPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel11Layout.createSequentialGroup()
                                .addComponent(playerName11, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame11, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats11))
                            .addComponent(image11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel12.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel12.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName12.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName12.setText("n Contreras, ChC");
        playerName12.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame12.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame12.setText(":05 ET");

        playerStats12.setText("2 Yds");
        playerStats12.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore12.setText("0");

        javax.swing.GroupLayout playerPanel12Layout = new javax.swing.GroupLayout(playerPanel12);
        playerPanel12.setLayout(playerPanel12Layout);
        playerPanel12Layout.setHorizontalGroup(
            playerPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel12Layout.setVerticalGroup(
            playerPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel12Layout.createSequentialGroup()
                .addGroup(playerPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel12Layout.createSequentialGroup()
                        .addGroup(playerPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel12Layout.createSequentialGroup()
                                .addComponent(playerName12, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame12, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats12))
                            .addComponent(image12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel13.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel13.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName13.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName13.setText("n Contreras, ChC");
        playerName13.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame13.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame13.setText(":05 ET");

        playerStats13.setText("2 Yds");
        playerStats13.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore13.setText("0");

        javax.swing.GroupLayout playerPanel13Layout = new javax.swing.GroupLayout(playerPanel13);
        playerPanel13.setLayout(playerPanel13Layout);
        playerPanel13Layout.setHorizontalGroup(
            playerPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats13, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel13Layout.setVerticalGroup(
            playerPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel13Layout.createSequentialGroup()
                .addGroup(playerPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel13Layout.createSequentialGroup()
                        .addGroup(playerPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel13Layout.createSequentialGroup()
                                .addComponent(playerName13, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame13, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats13))
                            .addComponent(image13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel14.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel14.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName14.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName14.setText("n Contreras, ChC");
        playerName14.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame14.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame14.setText(":05 ET");

        playerStats14.setText("2 Yds");
        playerStats14.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore14.setText("0");

        javax.swing.GroupLayout playerPanel14Layout = new javax.swing.GroupLayout(playerPanel14);
        playerPanel14.setLayout(playerPanel14Layout);
        playerPanel14Layout.setHorizontalGroup(
            playerPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats14, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel14Layout.setVerticalGroup(
            playerPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel14Layout.createSequentialGroup()
                .addGroup(playerPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel14Layout.createSequentialGroup()
                        .addGroup(playerPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel14Layout.createSequentialGroup()
                                .addComponent(playerName14, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame14, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats14))
                            .addComponent(image14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel15.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel15.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName15.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName15.setText("n Contreras, ChC");
        playerName15.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame15.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame15.setText(":05 ET");

        playerStats15.setText("2 Yds");
        playerStats15.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore15.setText("0");

        javax.swing.GroupLayout playerPanel15Layout = new javax.swing.GroupLayout(playerPanel15);
        playerPanel15.setLayout(playerPanel15Layout);
        playerPanel15Layout.setHorizontalGroup(
            playerPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats15, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore15, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel15Layout.setVerticalGroup(
            playerPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel15Layout.createSequentialGroup()
                .addGroup(playerPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel15Layout.createSequentialGroup()
                        .addGroup(playerPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel15Layout.createSequentialGroup()
                                .addComponent(playerName15, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame15, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats15))
                            .addComponent(image15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel16.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel16.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName16.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName16.setText("n Contreras, ChC");
        playerName16.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame16.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame16.setText(":05 ET");

        playerStats16.setText("2 Yds");
        playerStats16.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore16.setText("0");

        javax.swing.GroupLayout playerPanel16Layout = new javax.swing.GroupLayout(playerPanel16);
        playerPanel16.setLayout(playerPanel16Layout);
        playerPanel16Layout.setHorizontalGroup(
            playerPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats16, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel16Layout.setVerticalGroup(
            playerPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel16Layout.createSequentialGroup()
                .addGroup(playerPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel16Layout.createSequentialGroup()
                        .addGroup(playerPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel16Layout.createSequentialGroup()
                                .addComponent(playerName16, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame16, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats16))
                            .addComponent(image16, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel17.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel17.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName17.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName17.setText("n Contreras, ChC");
        playerName17.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame17.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame17.setText(":05 ET");

        playerStats17.setText("2 Yds");
        playerStats17.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore17.setText("0");

        javax.swing.GroupLayout playerPanel17Layout = new javax.swing.GroupLayout(playerPanel17);
        playerPanel17.setLayout(playerPanel17Layout);
        playerPanel17Layout.setHorizontalGroup(
            playerPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image17, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats17, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel17Layout.setVerticalGroup(
            playerPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel17Layout.createSequentialGroup()
                .addGroup(playerPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel17Layout.createSequentialGroup()
                        .addGroup(playerPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel17Layout.createSequentialGroup()
                                .addComponent(playerName17, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame17, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats17))
                            .addComponent(image17, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel18.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel18.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName18.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName18.setText("n Contreras, ChC");
        playerName18.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame18.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame18.setText(":05 ET");

        playerStats18.setText("2 Yds");
        playerStats18.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore18.setText("0");

        javax.swing.GroupLayout playerPanel18Layout = new javax.swing.GroupLayout(playerPanel18);
        playerPanel18.setLayout(playerPanel18Layout);
        playerPanel18Layout.setHorizontalGroup(
            playerPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats18, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore18, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel18Layout.setVerticalGroup(
            playerPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel18Layout.createSequentialGroup()
                .addGroup(playerPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel18Layout.createSequentialGroup()
                        .addGroup(playerPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel18Layout.createSequentialGroup()
                                .addComponent(playerName18, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame18, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats18))
                            .addComponent(image18, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel19.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel19.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName19.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName19.setText("n Contreras, ChC");
        playerName19.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame19.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame19.setText(":05 ET");

        playerStats19.setText("2 Yds");
        playerStats19.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore19.setText("0");

        javax.swing.GroupLayout playerPanel19Layout = new javax.swing.GroupLayout(playerPanel19);
        playerPanel19.setLayout(playerPanel19Layout);
        playerPanel19Layout.setHorizontalGroup(
            playerPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats19, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore19, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel19Layout.setVerticalGroup(
            playerPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel19Layout.createSequentialGroup()
                .addGroup(playerPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel19Layout.createSequentialGroup()
                        .addGroup(playerPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel19Layout.createSequentialGroup()
                                .addComponent(playerName19, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame19, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats19))
                            .addComponent(image19, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel20.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel20.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName20.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName20.setText("n Contreras, ChC");
        playerName20.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame20.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame20.setText(":05 ET");

        playerStats20.setText("2 Yds");
        playerStats20.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore20.setText("0");

        javax.swing.GroupLayout playerPanel20Layout = new javax.swing.GroupLayout(playerPanel20);
        playerPanel20.setLayout(playerPanel20Layout);
        playerPanel20Layout.setHorizontalGroup(
            playerPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats20, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore20, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel20Layout.setVerticalGroup(
            playerPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel20Layout.createSequentialGroup()
                .addGroup(playerPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel20Layout.createSequentialGroup()
                        .addGroup(playerPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel20Layout.createSequentialGroup()
                                .addComponent(playerName20, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame20, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats20))
                            .addComponent(image20, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel21.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel21.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName21.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName21.setText("n Contreras, ChC");
        playerName21.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame21.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame21.setText(":05 ET");

        playerStats21.setText("2 Yds");
        playerStats21.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore21.setText("0");

        javax.swing.GroupLayout playerPanel21Layout = new javax.swing.GroupLayout(playerPanel21);
        playerPanel21.setLayout(playerPanel21Layout);
        playerPanel21Layout.setHorizontalGroup(
            playerPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats21, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel21Layout.setVerticalGroup(
            playerPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel21Layout.createSequentialGroup()
                .addGroup(playerPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel21Layout.createSequentialGroup()
                        .addGroup(playerPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel21Layout.createSequentialGroup()
                                .addComponent(playerName21, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame21, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats21))
                            .addComponent(image21, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel22.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel22.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName22.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName22.setText("n Contreras, ChC");
        playerName22.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame22.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame22.setText(":05 ET");

        playerStats22.setText("2 Yds");
        playerStats22.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore22.setText("0");

        javax.swing.GroupLayout playerPanel22Layout = new javax.swing.GroupLayout(playerPanel22);
        playerPanel22.setLayout(playerPanel22Layout);
        playerPanel22Layout.setHorizontalGroup(
            playerPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats22, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel22Layout.setVerticalGroup(
            playerPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel22Layout.createSequentialGroup()
                .addGroup(playerPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel22Layout.createSequentialGroup()
                        .addGroup(playerPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel22Layout.createSequentialGroup()
                                .addComponent(playerName22, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame22, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats22))
                            .addComponent(image22, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel23.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel23.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName23.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName23.setText("n Contreras, ChC");
        playerName23.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame23.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame23.setText(":05 ET");

        playerStats23.setText("2 Yds");
        playerStats23.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore23.setText("0");

        javax.swing.GroupLayout playerPanel23Layout = new javax.swing.GroupLayout(playerPanel23);
        playerPanel23.setLayout(playerPanel23Layout);
        playerPanel23Layout.setHorizontalGroup(
            playerPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image23, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats23, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel23Layout.setVerticalGroup(
            playerPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel23Layout.createSequentialGroup()
                .addGroup(playerPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel23Layout.createSequentialGroup()
                        .addGroup(playerPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel23Layout.createSequentialGroup()
                                .addComponent(playerName23, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame23, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats23))
                            .addComponent(image23, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel24.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel24.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName24.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName24.setText("n Contreras, ChC");
        playerName24.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame24.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame24.setText(":05 ET");

        playerStats24.setText("2 Yds");
        playerStats24.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore24.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore24.setText("0");

        javax.swing.GroupLayout playerPanel24Layout = new javax.swing.GroupLayout(playerPanel24);
        playerPanel24.setLayout(playerPanel24Layout);
        playerPanel24Layout.setHorizontalGroup(
            playerPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image24, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats24, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore24, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel24Layout.setVerticalGroup(
            playerPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel24Layout.createSequentialGroup()
                .addGroup(playerPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel24Layout.createSequentialGroup()
                        .addGroup(playerPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel24Layout.createSequentialGroup()
                                .addComponent(playerName24, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame24, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats24))
                            .addComponent(image24, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel25.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel25.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName25.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName25.setText("n Contreras, ChC");
        playerName25.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame25.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame25.setText(":05 ET");

        playerStats25.setText("2 Yds");
        playerStats25.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore25.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore25.setText("0");

        javax.swing.GroupLayout playerPanel25Layout = new javax.swing.GroupLayout(playerPanel25);
        playerPanel25.setLayout(playerPanel25Layout);
        playerPanel25Layout.setHorizontalGroup(
            playerPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image25, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats25, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore25, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel25Layout.setVerticalGroup(
            playerPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel25Layout.createSequentialGroup()
                .addGroup(playerPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel25Layout.createSequentialGroup()
                        .addGroup(playerPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel25Layout.createSequentialGroup()
                                .addComponent(playerName25, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame25, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats25))
                            .addComponent(image25, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel26.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel26.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName26.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName26.setText("n Contreras, ChC");
        playerName26.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame26.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame26.setText(":05 ET");

        playerStats26.setText("2 Yds");
        playerStats26.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore26.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore26.setText("0");

        javax.swing.GroupLayout playerPanel26Layout = new javax.swing.GroupLayout(playerPanel26);
        playerPanel26.setLayout(playerPanel26Layout);
        playerPanel26Layout.setHorizontalGroup(
            playerPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image26, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats26, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore26, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel26Layout.setVerticalGroup(
            playerPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel26Layout.createSequentialGroup()
                .addGroup(playerPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel26Layout.createSequentialGroup()
                        .addGroup(playerPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel26Layout.createSequentialGroup()
                                .addComponent(playerName26, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame26, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats26))
                            .addComponent(image26, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel27.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel27.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName27.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName27.setText("n Contreras, ChC");
        playerName27.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame27.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame27.setText(":05 ET");

        playerStats27.setText("2 Yds");
        playerStats27.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore27.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore27.setText("0");

        javax.swing.GroupLayout playerPanel27Layout = new javax.swing.GroupLayout(playerPanel27);
        playerPanel27.setLayout(playerPanel27Layout);
        playerPanel27Layout.setHorizontalGroup(
            playerPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image27, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats27, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore27, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel27Layout.setVerticalGroup(
            playerPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel27Layout.createSequentialGroup()
                .addGroup(playerPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel27Layout.createSequentialGroup()
                        .addGroup(playerPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel27Layout.createSequentialGroup()
                                .addComponent(playerName27, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame27, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats27))
                            .addComponent(image27, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel28.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel28.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName28.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName28.setText("n Contreras, ChC");
        playerName28.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame28.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame28.setText(":05 ET");

        playerStats28.setText("2 Yds");
        playerStats28.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore28.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore28.setText("0");

        javax.swing.GroupLayout playerPanel28Layout = new javax.swing.GroupLayout(playerPanel28);
        playerPanel28.setLayout(playerPanel28Layout);
        playerPanel28Layout.setHorizontalGroup(
            playerPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image28, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats28, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore28, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel28Layout.setVerticalGroup(
            playerPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel28Layout.createSequentialGroup()
                .addGroup(playerPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel28Layout.createSequentialGroup()
                        .addGroup(playerPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel28Layout.createSequentialGroup()
                                .addComponent(playerName28, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame28, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats28))
                            .addComponent(image28, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel29.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel29.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName29.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName29.setText("n Contreras, ChC");
        playerName29.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame29.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame29.setText(":05 ET");

        playerStats29.setText("2 Yds");
        playerStats29.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore29.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore29.setText("0");

        javax.swing.GroupLayout playerPanel29Layout = new javax.swing.GroupLayout(playerPanel29);
        playerPanel29.setLayout(playerPanel29Layout);
        playerPanel29Layout.setHorizontalGroup(
            playerPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image29, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats29, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore29, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel29Layout.setVerticalGroup(
            playerPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel29Layout.createSequentialGroup()
                .addGroup(playerPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel29Layout.createSequentialGroup()
                        .addGroup(playerPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel29Layout.createSequentialGroup()
                                .addComponent(playerName29, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame29, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats29))
                            .addComponent(image29, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel30.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel30.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName30.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName30.setText("n Contreras, ChC");
        playerName30.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame30.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame30.setText(":05 ET");

        playerStats30.setText("2 Yds");
        playerStats30.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore30.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore30.setText("0");

        javax.swing.GroupLayout playerPanel30Layout = new javax.swing.GroupLayout(playerPanel30);
        playerPanel30.setLayout(playerPanel30Layout);
        playerPanel30Layout.setHorizontalGroup(
            playerPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image30, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats30, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore30, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel30Layout.setVerticalGroup(
            playerPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel30Layout.createSequentialGroup()
                .addGroup(playerPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel30Layout.createSequentialGroup()
                        .addGroup(playerPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel30Layout.createSequentialGroup()
                                .addComponent(playerName30, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame30, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats30))
                            .addComponent(image30, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel31.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel31.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName31.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName31.setText("n Contreras, ChC");
        playerName31.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame31.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame31.setText(":05 ET");

        playerStats31.setText("2 Yds");
        playerStats31.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore31.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore31.setText("0");

        javax.swing.GroupLayout playerPanel31Layout = new javax.swing.GroupLayout(playerPanel31);
        playerPanel31.setLayout(playerPanel31Layout);
        playerPanel31Layout.setHorizontalGroup(
            playerPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image31, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats31, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore31, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel31Layout.setVerticalGroup(
            playerPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel31Layout.createSequentialGroup()
                .addGroup(playerPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel31Layout.createSequentialGroup()
                        .addGroup(playerPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel31Layout.createSequentialGroup()
                                .addComponent(playerName31, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame31, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats31))
                            .addComponent(image31, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel32.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel32.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName32.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName32.setText("n Contreras, ChC");
        playerName32.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame32.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame32.setText(":05 ET");

        playerStats32.setText("2 Yds");
        playerStats32.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore32.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore32.setText("0");

        javax.swing.GroupLayout playerPanel32Layout = new javax.swing.GroupLayout(playerPanel32);
        playerPanel32.setLayout(playerPanel32Layout);
        playerPanel32Layout.setHorizontalGroup(
            playerPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image32, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats32, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore32, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel32Layout.setVerticalGroup(
            playerPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel32Layout.createSequentialGroup()
                .addGroup(playerPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel32Layout.createSequentialGroup()
                        .addGroup(playerPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel32Layout.createSequentialGroup()
                                .addComponent(playerName32, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame32, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats32))
                            .addComponent(image32, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel33.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel33.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName33.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName33.setText("n Contreras, ChC");
        playerName33.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame33.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame33.setText(":05 ET");

        playerStats33.setText("2 Yds");
        playerStats33.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore33.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore33.setText("0");

        javax.swing.GroupLayout playerPanel33Layout = new javax.swing.GroupLayout(playerPanel33);
        playerPanel33.setLayout(playerPanel33Layout);
        playerPanel33Layout.setHorizontalGroup(
            playerPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image33, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats33, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore33, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel33Layout.setVerticalGroup(
            playerPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel33Layout.createSequentialGroup()
                .addGroup(playerPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel33Layout.createSequentialGroup()
                        .addGroup(playerPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel33Layout.createSequentialGroup()
                                .addComponent(playerName33, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame33, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats33))
                            .addComponent(image33, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        playerPanel34.setBackground(new java.awt.Color(92, 43, 32));
        playerPanel34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerPanel34.setPreferredSize(new java.awt.Dimension(232, 61));

        playerName34.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerName34.setText("n Contreras, ChC");
        playerName34.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerGame34.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        playerGame34.setText(":05 ET");

        playerStats34.setText("2 Yds");
        playerStats34.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        playerScore34.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerScore34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerScore34.setText("0");

        javax.swing.GroupLayout playerPanel34Layout = new javax.swing.GroupLayout(playerPanel34);
        playerPanel34.setLayout(playerPanel34Layout);
        playerPanel34Layout.setHorizontalGroup(
            playerPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image34, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerStats34, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerGame34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerName34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerScore34, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerPanel34Layout.setVerticalGroup(
            playerPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanel34Layout.createSequentialGroup()
                .addGroup(playerPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerScore34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerPanel34Layout.createSequentialGroup()
                        .addGroup(playerPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerPanel34Layout.createSequentialGroup()
                                .addComponent(playerName34, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerGame34, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(playerStats34))
                            .addComponent(image34, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        settingsButton.setFocusable(false);
        settingsButton.setOpaque(false);
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clicked(evt);
            }
        });

        jLabel1.setText("Current Delay:");

        delayBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60", "65", "70", "75", "80", "85", "90" }));
        delayBox.setFocusable(false);

        javax.swing.GroupLayout mainPlayerPanelLayout = new javax.swing.GroupLayout(mainPlayerPanel);
        mainPlayerPanel.setLayout(mainPlayerPanelLayout);
        mainPlayerPanelLayout.setHorizontalGroup(
            mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPlayerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(teamInfo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fantasyTeamInfo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainPlayerPanelLayout.createSequentialGroup()
                        .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(playerPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playerPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playerPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playerPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPlayerPanelLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(playerPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPlayerPanelLayout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(playerPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPlayerPanelLayout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(playerPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPlayerPanelLayout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(playerPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(teamInfo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fantasyTeamInfo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPlayerPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delayBox, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainPlayerPanelLayout.createSequentialGroup()
                        .addComponent(playerPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(playerPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPlayerPanelLayout.createSequentialGroup()
                        .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(playerPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(playerPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(playerPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(playerPanel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(playerPanel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(playerPanel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(playerPanel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(playerPanel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(playerPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playerPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playerPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(playerPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playerPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playerPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playerPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playerPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playerPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playerPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playerPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPlayerPanelLayout.createSequentialGroup()
                        .addComponent(playerPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPlayerPanelLayout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(playerPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPlayerPanelLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(playerPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainPlayerPanelLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPlayerPanelLayout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(playerPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPlayerPanelLayout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(playerPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        mainPlayerPanelLayout.setVerticalGroup(
            mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPlayerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(delayBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fantasyTeamInfo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fantasyTeamInfo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teamInfo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teamInfo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPlayerPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(playerPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(mainPlayerPanelLayout.createSequentialGroup()
                        .addComponent(playerPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(playerPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPlayerPanelLayout.createSequentialGroup()
                        .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playerPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(playerPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPlayerPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPlayerPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(playerPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playerPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(playerPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(playerPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(playerPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(mainPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPlayerPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPlayerPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPlayerPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        jScrollPane3.setViewportView(mainPlayerPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clicked
        if(!config.isVisible()){
            config.setVisible(true);
        }
    }//GEN-LAST:event_clicked

    public int getScoringOffset(){
        return config.getOffset();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fantasycast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fantasycast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fantasycast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fantasycast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fantasycast().setVisible(true);
            }
        });
    }

    public void initAgain() {
        try {
            BufferedImage source = ImageIO.read(new File("Resources\\Icons\\settingIcon.png"));
            settingsButton.setIcon(new ImageIcon(source));
        } catch (IOException ex) {
            Logger.getLogger(Fantasycast.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        config = new ConfigDialog(this, false);
    }

    public ArrayList<JPanel> getMainPanels() {
        ArrayList<JPanel> panels = new ArrayList<JPanel>();
        panels.add(mainPlayerPanel);
        panels.add(mainGameScorePanel);
        return panels;
    }

    public JComboBox getDelayBox() {
        return delayBox;
    }

    public ArrayList<JLabel> getPossessionImages() {
        ArrayList<JLabel> labels = new ArrayList<JLabel>();
        labels.add(possesionPicture1);
        labels.add(possesionPicture2);
        labels.add(possesionPicture3);
        labels.add(possesionPicture4);
        labels.add(possesionPicture5);
        labels.add(possesionPicture6);
        labels.add(possesionPicture7);
        labels.add(possesionPicture8);
        labels.add(possesionPicture9);
        labels.add(possesionPicture10);
        labels.add(possesionPicture11);
        labels.add(possesionPicture12);
        labels.add(possesionPicture13);
        labels.add(possesionPicture14);
        labels.add(possesionPicture15);
        labels.add(possesionPicture16);
        return labels;
    }

    public ArrayList<JLabel> getTeamLogos() {
        ArrayList<JLabel> labels = new ArrayList<JLabel>();
        labels.add(teamLogo1);
        labels.add(teamLogo2);
        labels.add(teamLogo3);
        labels.add(teamLogo4);
        labels.add(teamLogo5);
        labels.add(teamLogo6);
        labels.add(teamLogo7);
        labels.add(teamLogo8);
        labels.add(teamLogo9);
        labels.add(teamLogo10);
        labels.add(teamLogo11);
        labels.add(teamLogo12);
        labels.add(teamLogo13);
        labels.add(teamLogo14);
        labels.add(teamLogo15);
        labels.add(teamLogo16);
        labels.add(teamLogo17);
        labels.add(teamLogo18);
        labels.add(teamLogo19);
        labels.add(teamLogo20);
        labels.add(teamLogo21);
        labels.add(teamLogo22);
        labels.add(teamLogo23);
        labels.add(teamLogo24);
        labels.add(teamLogo25);
        labels.add(teamLogo26);
        labels.add(teamLogo27);
        labels.add(teamLogo28);
        labels.add(teamLogo29);
        labels.add(teamLogo30);
        labels.add(teamLogo31);
        labels.add(teamLogo32);
        return labels;
    }

    public ArrayList<JLabel> getImages() {
        ArrayList<JLabel> labels = new ArrayList<JLabel>();
        labels.add(image1);
        labels.add(image2);
        labels.add(image3);
        labels.add(image4);
        labels.add(image5);
        labels.add(image6);
        labels.add(image7);
        labels.add(image8);
        labels.add(image9);
        labels.add(image10);
        labels.add(image11);
        labels.add(image12);
        labels.add(image13);
        labels.add(image14);
        labels.add(image15);
        labels.add(image16);
        labels.add(image17);
        labels.add(image18);
        labels.add(image19);
        labels.add(image20);
        labels.add(image21);
        labels.add(image22);
        labels.add(image23);
        labels.add(image24);
        labels.add(image25);
        labels.add(image26);
        labels.add(image27);
        labels.add(image28);
        labels.add(image29);
        labels.add(image30);
        labels.add(image31);
        labels.add(image32);
        labels.add(image33);
        labels.add(image34);
        return labels;
    }

    public ArrayList<JPanel> getGamePanels() {
        ArrayList<JPanel> panels = new ArrayList<JPanel>();
        panels.add(gamePane1);
        panels.add(gamePane2);
        panels.add(gamePane3);
        panels.add(gamePane4);
        panels.add(gamePane5);
        panels.add(gamePane6);
        panels.add(gamePane7);
        panels.add(gamePane8);
        panels.add(gamePane9);
        panels.add(gamePane10);
        panels.add(gamePane11);
        panels.add(gamePane12);
        panels.add(gamePane13);
        panels.add(gamePane14);
        panels.add(gamePane15);
        panels.add(gamePane16);
        return panels;
    }

    public ArrayList<JLabel> getFantasyTeamNames() {
        ArrayList<JLabel> labels = new ArrayList<JLabel>();
        labels.add(fantasyTeamName1);
        labels.add(fantasyTeamName2);
        return labels;
    }

    public ArrayList<JLabel> getOwnerNames() {
        ArrayList<JLabel> labels = new ArrayList<JLabel>();
        labels.add(owner1);
        labels.add(owner2);
        return labels;
    }

    public ArrayList<JLabel> getTeamInfo() {
        ArrayList<JLabel> labels = new ArrayList<JLabel>();
        labels.add(owner1);
        labels.add(owner2);
        return labels;
    }

    public ArrayList<JLabel> getToPlay() {
        ArrayList<JLabel> labels = new ArrayList<JLabel>();
        labels.add(toPlay1);
        labels.add(toPlay2);
        return labels;
    }

    public ArrayList<JLabel> getInPlay() {
        ArrayList<JLabel> labels = new ArrayList<JLabel>();
        labels.add(inPlay1);
        labels.add(inPlay2);
        return labels;
    }

    public ArrayList<JLabel> getProjections() {
        ArrayList<JLabel> labels = new ArrayList<JLabel>();
        labels.add(projection1);
        labels.add(projection2);
        return labels;
    }

    public ArrayList<JLabel> getTeamLabels() {
        ArrayList<JLabel> labels = new ArrayList<JLabel>();
        labels.add(teamName1);
        labels.add(teamName2);
        labels.add(teamName3);
        labels.add(teamName4);
        labels.add(teamName5);
        labels.add(teamName6);
        labels.add(teamName7);
        labels.add(teamName8);
        labels.add(teamName9);
        labels.add(teamName10);
        labels.add(teamName11);
        labels.add(teamName12);
        labels.add(teamName13);
        labels.add(teamName14);
        labels.add(teamName15);
        labels.add(teamName16);
        labels.add(teamName17);
        labels.add(teamName18);
        labels.add(teamName19);
        labels.add(teamName20);
        labels.add(teamName21);
        labels.add(teamName22);
        labels.add(teamName23);
        labels.add(teamName24);
        labels.add(teamName25);
        labels.add(teamName26);
        labels.add(teamName27);
        labels.add(teamName28);
        labels.add(teamName29);
        labels.add(teamName30);
        labels.add(teamName31);
        labels.add(teamName32);
        return labels;
    }

    public ArrayList<JLabel> getTotalScores() {
        ArrayList<JLabel> labels = new ArrayList<JLabel>();
        labels.add(total1);
        labels.add(total2);
        return labels;
    }

    public ArrayList<JLabel> getPlayerNames() {
        ArrayList<JLabel> labels = new ArrayList<JLabel>();
        labels.add(playerName1);
        labels.add(playerName2);
        labels.add(playerName3);
        labels.add(playerName4);
        labels.add(playerName5);
        labels.add(playerName6);
        labels.add(playerName7);
        labels.add(playerName8);
        labels.add(playerName9);
        labels.add(playerName10);
        labels.add(playerName11);
        labels.add(playerName12);
        labels.add(playerName13);
        labels.add(playerName14);
        labels.add(playerName15);
        labels.add(playerName16);
        labels.add(playerName17);
        labels.add(playerName18);
        labels.add(playerName19);
        labels.add(playerName20);
        labels.add(playerName21);
        labels.add(playerName22);
        labels.add(playerName23);
        labels.add(playerName24);
        labels.add(playerName25);
        labels.add(playerName26);
        labels.add(playerName27);
        labels.add(playerName28);
        labels.add(playerName29);
        labels.add(playerName30);
        labels.add(playerName31);
        labels.add(playerName32);
        labels.add(playerName33);
        labels.add(playerName34);
        return labels;
    }

    public ArrayList<JPanel> getPlayerPanels() {
        ArrayList<JPanel> labels = new ArrayList<JPanel>();
        labels.add(playerPanel1);
        labels.add(playerPanel2);
        labels.add(playerPanel3);
        labels.add(playerPanel4);
        labels.add(playerPanel5);
        labels.add(playerPanel6);
        labels.add(playerPanel7);
        labels.add(playerPanel8);
        labels.add(playerPanel9);
        labels.add(playerPanel10);
        labels.add(playerPanel11);
        labels.add(playerPanel12);
        labels.add(playerPanel13);
        labels.add(playerPanel14);
        labels.add(playerPanel15);
        labels.add(playerPanel16);
        labels.add(playerPanel17);
        labels.add(playerPanel18);
        labels.add(playerPanel19);
        labels.add(playerPanel20);
        labels.add(playerPanel21);
        labels.add(playerPanel22);
        labels.add(playerPanel23);
        labels.add(playerPanel24);
        labels.add(playerPanel25);
        labels.add(playerPanel26);
        labels.add(playerPanel27);
        labels.add(playerPanel28);
        labels.add(playerPanel29);
        labels.add(playerPanel30);
        labels.add(playerPanel31);
        labels.add(playerPanel32);
        labels.add(playerPanel33);
        labels.add(playerPanel34);
        return labels;
    }

    public ArrayList<JLabel> getPlayerGames() {
        ArrayList<JLabel> labels = new ArrayList<JLabel>();
        labels.add(playerGame1);
        labels.add(playerGame2);
        labels.add(playerGame3);
        labels.add(playerGame4);
        labels.add(playerGame5);
        labels.add(playerGame6);
        labels.add(playerGame7);
        labels.add(playerGame8);
        labels.add(playerGame9);
        labels.add(playerGame10);
        labels.add(playerGame11);
        labels.add(playerGame12);
        labels.add(playerGame13);
        labels.add(playerGame14);
        labels.add(playerGame15);
        labels.add(playerGame16);
        labels.add(playerGame17);
        labels.add(playerGame18);
        labels.add(playerGame19);
        labels.add(playerGame20);
        labels.add(playerGame21);
        labels.add(playerGame22);
        labels.add(playerGame23);
        labels.add(playerGame24);
        labels.add(playerGame25);
        labels.add(playerGame26);
        labels.add(playerGame27);
        labels.add(playerGame28);
        labels.add(playerGame29);
        labels.add(playerGame30);
        labels.add(playerGame31);
        labels.add(playerGame32);
        labels.add(playerGame33);
        labels.add(playerGame34);
        return labels;
    }

    public ArrayList<JLabel> getPosessionLabels() {
        ArrayList<JLabel> labels = new ArrayList<JLabel>();
        labels.add(poss1);
        labels.add(poss2);
        labels.add(poss3);
        labels.add(poss4);
        labels.add(poss5);
        labels.add(poss6);
        labels.add(poss7);
        labels.add(poss8);
        labels.add(poss9);
        labels.add(poss10);
        labels.add(poss11);
        labels.add(poss12);
        labels.add(poss13);
        labels.add(poss14);
        labels.add(poss15);
        labels.add(poss16);
        return labels;
    }

    public ArrayList<JLabel> getPlayerStats() {
        ArrayList<JLabel> labels = new ArrayList<JLabel>();
        labels.add(playerStats1);
        labels.add(playerStats2);
        labels.add(playerStats3);
        labels.add(playerStats4);
        labels.add(playerStats5);
        labels.add(playerStats6);
        labels.add(playerStats7);
        labels.add(playerStats8);
        labels.add(playerStats9);
        labels.add(playerStats10);
        labels.add(playerStats11);
        labels.add(playerStats12);
        labels.add(playerStats13);
        labels.add(playerStats14);
        labels.add(playerStats15);
        labels.add(playerStats16);
        labels.add(playerStats17);
        labels.add(playerStats18);
        labels.add(playerStats19);
        labels.add(playerStats20);
        labels.add(playerStats21);
        labels.add(playerStats22);
        labels.add(playerStats23);
        labels.add(playerStats24);
        labels.add(playerStats25);
        labels.add(playerStats26);
        labels.add(playerStats27);
        labels.add(playerStats28);
        labels.add(playerStats29);
        labels.add(playerStats30);
        labels.add(playerStats31);
        labels.add(playerStats32);
        labels.add(playerStats33);
        labels.add(playerStats34);
        return labels;
    }

    public ArrayList<JLabel> getPlayerScores() {
        ArrayList<JLabel> labels = new ArrayList<JLabel>();
        labels.add(playerScore1);
        labels.add(playerScore2);
        labels.add(playerScore3);
        labels.add(playerScore4);
        labels.add(playerScore5);
        labels.add(playerScore6);
        labels.add(playerScore7);
        labels.add(playerScore8);
        labels.add(playerScore9);
        labels.add(playerScore10);
        labels.add(playerScore11);
        labels.add(playerScore12);
        labels.add(playerScore13);
        labels.add(playerScore14);
        labels.add(playerScore15);
        labels.add(playerScore16);
        labels.add(playerScore17);
        labels.add(playerScore18);
        labels.add(playerScore19);
        labels.add(playerScore20);
        labels.add(playerScore21);
        labels.add(playerScore22);
        labels.add(playerScore23);
        labels.add(playerScore24);
        labels.add(playerScore25);
        labels.add(playerScore26);
        labels.add(playerScore27);
        labels.add(playerScore28);
        labels.add(playerScore29);
        labels.add(playerScore30);
        labels.add(playerScore31);
        labels.add(playerScore32);
        labels.add(playerScore33);
        labels.add(playerScore34);
        return labels;
    }

    public ArrayList<JLabel> getTimeLabels() {
        ArrayList<JLabel> labels = new ArrayList<JLabel>();
        labels.add(gameTime1);
        labels.add(gameTime2);
        labels.add(gameTime3);
        labels.add(gameTime4);
        labels.add(gameTime5);
        labels.add(gameTime6);
        labels.add(gameTime7);
        labels.add(gameTime8);
        labels.add(gameTime9);
        labels.add(gameTime10);
        labels.add(gameTime11);
        labels.add(gameTime12);
        labels.add(gameTime13);
        labels.add(gameTime14);
        labels.add(gameTime15);
        labels.add(gameTime16);
        return labels;
    }

    public ArrayList<JLabel> getGameScores() {
        ArrayList<JLabel> labels = new ArrayList<JLabel>();
        labels.add(score1);
        labels.add(score2);
        labels.add(score3);
        labels.add(score4);
        labels.add(score5);
        labels.add(score6);
        labels.add(score7);
        labels.add(score8);
        labels.add(score9);
        labels.add(score10);
        labels.add(score11);
        labels.add(score12);
        labels.add(score13);
        labels.add(score14);
        labels.add(score15);
        labels.add(score16);
        labels.add(score17);
        labels.add(score18);
        labels.add(score19);
        labels.add(score20);
        labels.add(score21);
        labels.add(score22);
        labels.add(score23);
        labels.add(score24);
        labels.add(score25);
        labels.add(score26);
        labels.add(score27);
        labels.add(score28);
        labels.add(score29);
        labels.add(score30);
        labels.add(score31);
        labels.add(score32);
        return labels;
    }

    public ArrayList<JLabel> getStatusLabels() {
        ArrayList<JLabel> labels = new ArrayList<JLabel>();
        labels.add(gamestatus1);
        labels.add(gamestatus2);
        labels.add(gamestatus3);
        labels.add(gamestatus4);
        labels.add(gamestatus5);
        labels.add(gamestatus6);
        labels.add(gamestatus7);
        labels.add(gamestatus8);
        labels.add(gamestatus9);
        labels.add(gamestatus10);
        labels.add(gamestatus11);
        labels.add(gamestatus12);
        labels.add(gamestatus13);
        labels.add(gamestatus14);
        labels.add(gamestatus15);
        labels.add(gamestatus16);
        return labels;
    }

    public ArrayList<JTextPane> getPlays() {
        ArrayList<JTextPane> plays = new ArrayList<JTextPane>();
        plays.add(lastPlay1);
        plays.add(lastPlay2);
        plays.add(lastPlay3);
        plays.add(lastPlay4);
        plays.add(lastPlay5);
        plays.add(lastPlay6);
        plays.add(lastPlay7);
        plays.add(lastPlay8);
        plays.add(lastPlay9);
        plays.add(lastPlay10);
        plays.add(lastPlay11);
        plays.add(lastPlay12);
        plays.add(lastPlay13);
        plays.add(lastPlay14);
        plays.add(lastPlay15);
        plays.add(lastPlay16);
        return plays;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public JScrollPane getScrollPane2() {
        return jScrollPane3;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> delayBox;
    private javax.swing.JPanel fantasyTeamInfo1;
    private javax.swing.JPanel fantasyTeamInfo2;
    private javax.swing.JLabel fantasyTeamName1;
    private javax.swing.JLabel fantasyTeamName2;
    private javax.swing.JPanel gamePane1;
    private javax.swing.JPanel gamePane10;
    private javax.swing.JPanel gamePane11;
    private javax.swing.JPanel gamePane12;
    private javax.swing.JPanel gamePane13;
    private javax.swing.JPanel gamePane14;
    private javax.swing.JPanel gamePane15;
    private javax.swing.JPanel gamePane16;
    private javax.swing.JPanel gamePane2;
    private javax.swing.JPanel gamePane3;
    private javax.swing.JPanel gamePane4;
    private javax.swing.JPanel gamePane5;
    private javax.swing.JPanel gamePane6;
    private javax.swing.JPanel gamePane7;
    private javax.swing.JPanel gamePane8;
    private javax.swing.JPanel gamePane9;
    private javax.swing.JLabel gameTime1;
    private javax.swing.JLabel gameTime10;
    private javax.swing.JLabel gameTime11;
    private javax.swing.JLabel gameTime12;
    private javax.swing.JLabel gameTime13;
    private javax.swing.JLabel gameTime14;
    private javax.swing.JLabel gameTime15;
    private javax.swing.JLabel gameTime16;
    private javax.swing.JLabel gameTime2;
    private javax.swing.JLabel gameTime3;
    private javax.swing.JLabel gameTime4;
    private javax.swing.JLabel gameTime5;
    private javax.swing.JLabel gameTime6;
    private javax.swing.JLabel gameTime7;
    private javax.swing.JLabel gameTime8;
    private javax.swing.JLabel gameTime9;
    private javax.swing.JLabel gamestatus1;
    private javax.swing.JLabel gamestatus10;
    private javax.swing.JLabel gamestatus11;
    private javax.swing.JLabel gamestatus12;
    private javax.swing.JLabel gamestatus13;
    private javax.swing.JLabel gamestatus14;
    private javax.swing.JLabel gamestatus15;
    private javax.swing.JLabel gamestatus16;
    private javax.swing.JLabel gamestatus2;
    private javax.swing.JLabel gamestatus3;
    private javax.swing.JLabel gamestatus4;
    private javax.swing.JLabel gamestatus5;
    private javax.swing.JLabel gamestatus6;
    private javax.swing.JLabel gamestatus7;
    private javax.swing.JLabel gamestatus8;
    private javax.swing.JLabel gamestatus9;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel image10;
    private javax.swing.JLabel image11;
    private javax.swing.JLabel image12;
    private javax.swing.JLabel image13;
    private javax.swing.JLabel image14;
    private javax.swing.JLabel image15;
    private javax.swing.JLabel image16;
    private javax.swing.JLabel image17;
    private javax.swing.JLabel image18;
    private javax.swing.JLabel image19;
    private javax.swing.JLabel image2;
    private javax.swing.JLabel image20;
    private javax.swing.JLabel image21;
    private javax.swing.JLabel image22;
    private javax.swing.JLabel image23;
    private javax.swing.JLabel image24;
    private javax.swing.JLabel image25;
    private javax.swing.JLabel image26;
    private javax.swing.JLabel image27;
    private javax.swing.JLabel image28;
    private javax.swing.JLabel image29;
    private javax.swing.JLabel image3;
    private javax.swing.JLabel image30;
    private javax.swing.JLabel image31;
    private javax.swing.JLabel image32;
    private javax.swing.JLabel image33;
    private javax.swing.JLabel image34;
    private javax.swing.JLabel image4;
    private javax.swing.JLabel image5;
    private javax.swing.JLabel image6;
    private javax.swing.JLabel image7;
    private javax.swing.JLabel image8;
    private javax.swing.JLabel image9;
    private javax.swing.JLabel inPlay1;
    private javax.swing.JLabel inPlay2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextPane lastPlay1;
    private javax.swing.JTextPane lastPlay10;
    private javax.swing.JTextPane lastPlay11;
    private javax.swing.JTextPane lastPlay12;
    private javax.swing.JTextPane lastPlay13;
    private javax.swing.JTextPane lastPlay14;
    private javax.swing.JTextPane lastPlay15;
    private javax.swing.JTextPane lastPlay16;
    private javax.swing.JTextPane lastPlay2;
    private javax.swing.JTextPane lastPlay3;
    private javax.swing.JTextPane lastPlay4;
    private javax.swing.JTextPane lastPlay5;
    private javax.swing.JTextPane lastPlay6;
    private javax.swing.JTextPane lastPlay7;
    private javax.swing.JTextPane lastPlay8;
    private javax.swing.JTextPane lastPlay9;
    private javax.swing.JPanel mainGameScorePanel;
    private javax.swing.JPanel mainPlayerPanel;
    private javax.swing.JLabel owner1;
    private javax.swing.JLabel owner2;
    private javax.swing.JLabel playerGame1;
    private javax.swing.JLabel playerGame10;
    private javax.swing.JLabel playerGame11;
    private javax.swing.JLabel playerGame12;
    private javax.swing.JLabel playerGame13;
    private javax.swing.JLabel playerGame14;
    private javax.swing.JLabel playerGame15;
    private javax.swing.JLabel playerGame16;
    private javax.swing.JLabel playerGame17;
    private javax.swing.JLabel playerGame18;
    private javax.swing.JLabel playerGame19;
    private javax.swing.JLabel playerGame2;
    private javax.swing.JLabel playerGame20;
    private javax.swing.JLabel playerGame21;
    private javax.swing.JLabel playerGame22;
    private javax.swing.JLabel playerGame23;
    private javax.swing.JLabel playerGame24;
    private javax.swing.JLabel playerGame25;
    private javax.swing.JLabel playerGame26;
    private javax.swing.JLabel playerGame27;
    private javax.swing.JLabel playerGame28;
    private javax.swing.JLabel playerGame29;
    private javax.swing.JLabel playerGame3;
    private javax.swing.JLabel playerGame30;
    private javax.swing.JLabel playerGame31;
    private javax.swing.JLabel playerGame32;
    private javax.swing.JLabel playerGame33;
    private javax.swing.JLabel playerGame34;
    private javax.swing.JLabel playerGame4;
    private javax.swing.JLabel playerGame5;
    private javax.swing.JLabel playerGame6;
    private javax.swing.JLabel playerGame7;
    private javax.swing.JLabel playerGame8;
    private javax.swing.JLabel playerGame9;
    private javax.swing.JLabel playerName1;
    private javax.swing.JLabel playerName10;
    private javax.swing.JLabel playerName11;
    private javax.swing.JLabel playerName12;
    private javax.swing.JLabel playerName13;
    private javax.swing.JLabel playerName14;
    private javax.swing.JLabel playerName15;
    private javax.swing.JLabel playerName16;
    private javax.swing.JLabel playerName17;
    private javax.swing.JLabel playerName18;
    private javax.swing.JLabel playerName19;
    private javax.swing.JLabel playerName2;
    private javax.swing.JLabel playerName20;
    private javax.swing.JLabel playerName21;
    private javax.swing.JLabel playerName22;
    private javax.swing.JLabel playerName23;
    private javax.swing.JLabel playerName24;
    private javax.swing.JLabel playerName25;
    private javax.swing.JLabel playerName26;
    private javax.swing.JLabel playerName27;
    private javax.swing.JLabel playerName28;
    private javax.swing.JLabel playerName29;
    private javax.swing.JLabel playerName3;
    private javax.swing.JLabel playerName30;
    private javax.swing.JLabel playerName31;
    private javax.swing.JLabel playerName32;
    private javax.swing.JLabel playerName33;
    private javax.swing.JLabel playerName34;
    private javax.swing.JLabel playerName35;
    private javax.swing.JLabel playerName36;
    private javax.swing.JLabel playerName4;
    private javax.swing.JLabel playerName5;
    private javax.swing.JLabel playerName6;
    private javax.swing.JLabel playerName7;
    private javax.swing.JLabel playerName8;
    private javax.swing.JLabel playerName9;
    private javax.swing.JPanel playerPanel1;
    private javax.swing.JPanel playerPanel10;
    private javax.swing.JPanel playerPanel11;
    private javax.swing.JPanel playerPanel12;
    private javax.swing.JPanel playerPanel13;
    private javax.swing.JPanel playerPanel14;
    private javax.swing.JPanel playerPanel15;
    private javax.swing.JPanel playerPanel16;
    private javax.swing.JPanel playerPanel17;
    private javax.swing.JPanel playerPanel18;
    private javax.swing.JPanel playerPanel19;
    private javax.swing.JPanel playerPanel2;
    private javax.swing.JPanel playerPanel20;
    private javax.swing.JPanel playerPanel21;
    private javax.swing.JPanel playerPanel22;
    private javax.swing.JPanel playerPanel23;
    private javax.swing.JPanel playerPanel24;
    private javax.swing.JPanel playerPanel25;
    private javax.swing.JPanel playerPanel26;
    private javax.swing.JPanel playerPanel27;
    private javax.swing.JPanel playerPanel28;
    private javax.swing.JPanel playerPanel29;
    private javax.swing.JPanel playerPanel3;
    private javax.swing.JPanel playerPanel30;
    private javax.swing.JPanel playerPanel31;
    private javax.swing.JPanel playerPanel32;
    private javax.swing.JPanel playerPanel33;
    private javax.swing.JPanel playerPanel34;
    private javax.swing.JPanel playerPanel4;
    private javax.swing.JPanel playerPanel5;
    private javax.swing.JPanel playerPanel6;
    private javax.swing.JPanel playerPanel7;
    private javax.swing.JPanel playerPanel8;
    private javax.swing.JPanel playerPanel9;
    private javax.swing.JLabel playerScore1;
    private javax.swing.JLabel playerScore10;
    private javax.swing.JLabel playerScore11;
    private javax.swing.JLabel playerScore12;
    private javax.swing.JLabel playerScore13;
    private javax.swing.JLabel playerScore14;
    private javax.swing.JLabel playerScore15;
    private javax.swing.JLabel playerScore16;
    private javax.swing.JLabel playerScore17;
    private javax.swing.JLabel playerScore18;
    private javax.swing.JLabel playerScore19;
    private javax.swing.JLabel playerScore2;
    private javax.swing.JLabel playerScore20;
    private javax.swing.JLabel playerScore21;
    private javax.swing.JLabel playerScore22;
    private javax.swing.JLabel playerScore23;
    private javax.swing.JLabel playerScore24;
    private javax.swing.JLabel playerScore25;
    private javax.swing.JLabel playerScore26;
    private javax.swing.JLabel playerScore27;
    private javax.swing.JLabel playerScore28;
    private javax.swing.JLabel playerScore29;
    private javax.swing.JLabel playerScore3;
    private javax.swing.JLabel playerScore30;
    private javax.swing.JLabel playerScore31;
    private javax.swing.JLabel playerScore32;
    private javax.swing.JLabel playerScore33;
    private javax.swing.JLabel playerScore34;
    private javax.swing.JLabel playerScore4;
    private javax.swing.JLabel playerScore5;
    private javax.swing.JLabel playerScore6;
    private javax.swing.JLabel playerScore7;
    private javax.swing.JLabel playerScore8;
    private javax.swing.JLabel playerScore9;
    private javax.swing.JLabel playerStats1;
    private javax.swing.JLabel playerStats10;
    private javax.swing.JLabel playerStats11;
    private javax.swing.JLabel playerStats12;
    private javax.swing.JLabel playerStats13;
    private javax.swing.JLabel playerStats14;
    private javax.swing.JLabel playerStats15;
    private javax.swing.JLabel playerStats16;
    private javax.swing.JLabel playerStats17;
    private javax.swing.JLabel playerStats18;
    private javax.swing.JLabel playerStats19;
    private javax.swing.JLabel playerStats2;
    private javax.swing.JLabel playerStats20;
    private javax.swing.JLabel playerStats21;
    private javax.swing.JLabel playerStats22;
    private javax.swing.JLabel playerStats23;
    private javax.swing.JLabel playerStats24;
    private javax.swing.JLabel playerStats25;
    private javax.swing.JLabel playerStats26;
    private javax.swing.JLabel playerStats27;
    private javax.swing.JLabel playerStats28;
    private javax.swing.JLabel playerStats29;
    private javax.swing.JLabel playerStats3;
    private javax.swing.JLabel playerStats30;
    private javax.swing.JLabel playerStats31;
    private javax.swing.JLabel playerStats32;
    private javax.swing.JLabel playerStats33;
    private javax.swing.JLabel playerStats34;
    private javax.swing.JLabel playerStats4;
    private javax.swing.JLabel playerStats5;
    private javax.swing.JLabel playerStats6;
    private javax.swing.JLabel playerStats7;
    private javax.swing.JLabel playerStats8;
    private javax.swing.JLabel playerStats9;
    private javax.swing.JLabel poss1;
    private javax.swing.JLabel poss10;
    private javax.swing.JLabel poss11;
    private javax.swing.JLabel poss12;
    private javax.swing.JLabel poss13;
    private javax.swing.JLabel poss14;
    private javax.swing.JLabel poss15;
    private javax.swing.JLabel poss16;
    private javax.swing.JLabel poss2;
    private javax.swing.JLabel poss3;
    private javax.swing.JLabel poss4;
    private javax.swing.JLabel poss5;
    private javax.swing.JLabel poss6;
    private javax.swing.JLabel poss7;
    private javax.swing.JLabel poss8;
    private javax.swing.JLabel poss9;
    private javax.swing.JLabel possesionPicture1;
    private javax.swing.JLabel possesionPicture10;
    private javax.swing.JLabel possesionPicture11;
    private javax.swing.JLabel possesionPicture12;
    private javax.swing.JLabel possesionPicture13;
    private javax.swing.JLabel possesionPicture14;
    private javax.swing.JLabel possesionPicture15;
    private javax.swing.JLabel possesionPicture16;
    private javax.swing.JLabel possesionPicture2;
    private javax.swing.JLabel possesionPicture3;
    private javax.swing.JLabel possesionPicture4;
    private javax.swing.JLabel possesionPicture5;
    private javax.swing.JLabel possesionPicture6;
    private javax.swing.JLabel possesionPicture7;
    private javax.swing.JLabel possesionPicture8;
    private javax.swing.JLabel possesionPicture9;
    private javax.swing.JLabel projection1;
    private javax.swing.JLabel projection2;
    private javax.swing.JLabel score1;
    private javax.swing.JLabel score10;
    private javax.swing.JLabel score11;
    private javax.swing.JLabel score12;
    private javax.swing.JLabel score13;
    private javax.swing.JLabel score14;
    private javax.swing.JLabel score15;
    private javax.swing.JLabel score16;
    private javax.swing.JLabel score17;
    private javax.swing.JLabel score18;
    private javax.swing.JLabel score19;
    private javax.swing.JLabel score2;
    private javax.swing.JLabel score20;
    private javax.swing.JLabel score21;
    private javax.swing.JLabel score22;
    private javax.swing.JLabel score23;
    private javax.swing.JLabel score24;
    private javax.swing.JLabel score25;
    private javax.swing.JLabel score26;
    private javax.swing.JLabel score27;
    private javax.swing.JLabel score28;
    private javax.swing.JLabel score29;
    private javax.swing.JLabel score3;
    private javax.swing.JLabel score30;
    private javax.swing.JLabel score31;
    private javax.swing.JLabel score32;
    private javax.swing.JLabel score4;
    private javax.swing.JLabel score5;
    private javax.swing.JLabel score6;
    private javax.swing.JLabel score7;
    private javax.swing.JLabel score8;
    private javax.swing.JLabel score9;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JButton settingsButton;
    private javax.swing.JPanel teamInfo1;
    private javax.swing.JPanel teamInfo2;
    private javax.swing.JLabel teamLogo1;
    private javax.swing.JLabel teamLogo10;
    private javax.swing.JLabel teamLogo11;
    private javax.swing.JLabel teamLogo12;
    private javax.swing.JLabel teamLogo13;
    private javax.swing.JLabel teamLogo14;
    private javax.swing.JLabel teamLogo15;
    private javax.swing.JLabel teamLogo16;
    private javax.swing.JLabel teamLogo17;
    private javax.swing.JLabel teamLogo18;
    private javax.swing.JLabel teamLogo19;
    private javax.swing.JLabel teamLogo2;
    private javax.swing.JLabel teamLogo20;
    private javax.swing.JLabel teamLogo21;
    private javax.swing.JLabel teamLogo22;
    private javax.swing.JLabel teamLogo23;
    private javax.swing.JLabel teamLogo24;
    private javax.swing.JLabel teamLogo25;
    private javax.swing.JLabel teamLogo26;
    private javax.swing.JLabel teamLogo27;
    private javax.swing.JLabel teamLogo28;
    private javax.swing.JLabel teamLogo29;
    private javax.swing.JLabel teamLogo3;
    private javax.swing.JLabel teamLogo30;
    private javax.swing.JLabel teamLogo31;
    private javax.swing.JLabel teamLogo32;
    private javax.swing.JLabel teamLogo4;
    private javax.swing.JLabel teamLogo5;
    private javax.swing.JLabel teamLogo6;
    private javax.swing.JLabel teamLogo7;
    private javax.swing.JLabel teamLogo8;
    private javax.swing.JLabel teamLogo9;
    private javax.swing.JLabel teamName1;
    private javax.swing.JLabel teamName10;
    private javax.swing.JLabel teamName11;
    private javax.swing.JLabel teamName12;
    private javax.swing.JLabel teamName13;
    private javax.swing.JLabel teamName14;
    private javax.swing.JLabel teamName15;
    private javax.swing.JLabel teamName16;
    private javax.swing.JLabel teamName17;
    private javax.swing.JLabel teamName18;
    private javax.swing.JLabel teamName19;
    private javax.swing.JLabel teamName2;
    private javax.swing.JLabel teamName20;
    private javax.swing.JLabel teamName21;
    private javax.swing.JLabel teamName22;
    private javax.swing.JLabel teamName23;
    private javax.swing.JLabel teamName24;
    private javax.swing.JLabel teamName25;
    private javax.swing.JLabel teamName26;
    private javax.swing.JLabel teamName27;
    private javax.swing.JLabel teamName28;
    private javax.swing.JLabel teamName29;
    private javax.swing.JLabel teamName3;
    private javax.swing.JLabel teamName30;
    private javax.swing.JLabel teamName31;
    private javax.swing.JLabel teamName32;
    private javax.swing.JLabel teamName4;
    private javax.swing.JLabel teamName5;
    private javax.swing.JLabel teamName6;
    private javax.swing.JLabel teamName7;
    private javax.swing.JLabel teamName8;
    private javax.swing.JLabel teamName9;
    private javax.swing.JLabel toPlay1;
    private javax.swing.JLabel toPlay2;
    private javax.swing.JLabel total1;
    private javax.swing.JLabel total2;
    // End of variables declaration//GEN-END:variables
    private ConfigDialog config;
}
