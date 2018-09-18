/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DelayedFootball;

import DelayedFootball.UserInterfaces.ErrorDialog;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Kyle
 */
public class DelayedFantasyFootball {

    public static void main(String[] args) throws IOException {
        try {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel");
        } catch (Exception e) {
            ErrorDialog ed = new ErrorDialog(new JFrame(), true);
            ed.setText(e.getMessage());
            ed.setVisible(true);
            System.exit(0);
        }

        Manager manager = new Manager();
        
        manager.run();
    }
}
