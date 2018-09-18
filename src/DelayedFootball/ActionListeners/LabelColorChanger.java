/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DelayedFootball.ActionListeners;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author Kyle
 */
public class LabelColorChanger implements ActionListener{

    private JLabel label;
    private Color color;

    public LabelColorChanger(JLabel label, Color color) {
        this.label = label;
        this.color = color;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        label.setForeground(color);
    }
    
    
}
