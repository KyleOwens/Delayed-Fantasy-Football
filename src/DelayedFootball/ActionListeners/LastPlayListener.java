/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DelayedFootball.ActionListeners;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import org.jsoup.select.Elements;

/**
 *
 * @author Kyle
 */
public class LastPlayListener implements ActionListener {

    private JTextPane jtp;
    private ArrayList<String> parts;
    private ArrayList<String> compareNames;
    private ArrayList<String> compareNames2;

    public LastPlayListener(JTextPane jtp, ArrayList<String> parts, ArrayList<String> compareNames, ArrayList<String> compareNames2) {
        this.jtp = jtp;
        this.parts = parts;
        this.compareNames = compareNames;
        this.compareNames2 = compareNames2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
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
}
