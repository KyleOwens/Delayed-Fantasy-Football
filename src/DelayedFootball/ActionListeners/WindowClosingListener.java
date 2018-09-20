/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DelayedFootball.ActionListeners;

import DelayedFootball.WebNavigator;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import org.jsoup.nodes.Document;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Kyle
 */
public class WindowClosingListener implements WindowListener {

    private WebNavigator nav;

    public WindowClosingListener(WebNavigator nav) {
        this.nav = nav;
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        nav.closeDrivers();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        nav.closeDrivers();
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

}
