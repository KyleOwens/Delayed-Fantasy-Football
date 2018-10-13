/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DelayedFootball;

import DelayedFootball.UserInterfaces.ErrorDialog;
import Updates.FileFormatter;
import Updates.VersionChecker;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Kyle
 */
public class DelayedFantasyFootball {

    public static void main(String[] args) throws IOException {        
        FileFormatter dependencyCheck = new FileFormatter();        
        dependencyCheck.checkForFiles();
        
        VersionChecker vc = new VersionChecker();
        vc.checkForUpdates();
        
        try {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            ErrorDialog ed = new ErrorDialog(new JFrame(), true);
            ed.setText(e.getMessage());
            ed.setVisible(true);
            System.exit(0);
        }

        Manager manager = new Manager();
        
        manager.run();
    }
}
