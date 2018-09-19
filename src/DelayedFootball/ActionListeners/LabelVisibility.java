/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DelayedFootball.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author Kyle
 */
public class LabelVisibility implements ActionListener{

    private JLabel label;
    private boolean visible;
    
    public LabelVisibility(JLabel label, Boolean visible) {
        this.label = label;
        this.visible = visible;
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        label.setVisible(visible);
    }
    
}
