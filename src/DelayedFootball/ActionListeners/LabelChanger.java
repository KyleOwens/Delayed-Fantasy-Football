/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DelayedFootball.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import org.jsoup.select.Elements;

/**
 *
 * @author Kyle
 */
public class LabelChanger implements ActionListener{
    private JLabel label;
    private String s;

    public LabelChanger(JLabel label, String s) {
        this.label = label;
        this.s = s;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText(s);
    }
    
}
