/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DelayedFootball.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Kyle
 */
public class ImageChanger implements ActionListener{

    private BufferedImage image;
    private JLabel label;
    
    public ImageChanger(BufferedImage image, JLabel label) {
        this.image = image;
        this.label = label;
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        label.setIcon(new ImageIcon(image));
    }
    
}
