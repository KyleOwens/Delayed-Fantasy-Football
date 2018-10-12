/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DelayedFootball;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Timer;

/**
 *
 * @author Kyle
 */
public class TimerManager {

    private static TimerManager manager;
    private ArrayList<FantasyTimer> timers;

    private TimerManager() {
        timers = new ArrayList<>();
    }

    public static TimerManager getInstance() {
        if (manager == null) {
            manager = new TimerManager();
        }
        return manager;
    }

    public ArrayList<FantasyTimer> getAllTimers() {
        return this.timers;
    }

    public void addTimer(FantasyTimer t) {
        timers.add(t);
    }

    public void changeTimers(int difference) {       
        purgeList();
        for (FantasyTimer t : timers) {
            System.out.println(t.getTimeRemaining());
            if(t.getTimeRemaining() - difference > 0){
                t.setInitialDelay(t.getTimeRemaining() - difference);
                t.setDelay(t.getTimeRemaining() - difference);
                t.restart();
            } else {
                t.setInitialDelay(1);
                t.setDelay(1);
                t.restart();
            }
            System.out.println(t.getTimeRemaining());
        }
    }

    private void purgeList() {
        ArrayList<FantasyTimer> found = new ArrayList<>();
        for (FantasyTimer t : timers) {
            if (t.getTimeRemaining() < 0) {
                found.add(t);
            }
        }
        
        timers.removeAll(found);
    }
}
