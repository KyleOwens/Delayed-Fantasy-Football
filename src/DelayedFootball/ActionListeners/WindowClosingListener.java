/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DelayedFootball.ActionListeners;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import org.jsoup.nodes.Document;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Kyle
 */
public class WindowClosingListener implements WindowListener {

    private WebDriver d;
    private WebDriver d2;

    public WindowClosingListener(WebDriver d, WebDriver d2) {
        this.d = d;
        this.d2 = d2;
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        d.quit();
        d2.quit();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        d.quit();
        d2.quit();
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
