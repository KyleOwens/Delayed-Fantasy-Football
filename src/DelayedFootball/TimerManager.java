/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DelayedFootball;

import java.util.ArrayList;
import javax.swing.Timer;

/**
 *
 * @author Kyle
 */
public class TimerManager {
    private static TimerManager manager;
    private ArrayList<Timer> timers;
    
    private TimerManager(){
        timers = new ArrayList<>();
    }
    
    public static TimerManager getInstance(){
        if(manager == null){
            manager = new TimerManager();
        }
        return manager;
    }
    
    public ArrayList<Timer> getAllTimers(){
        return this.timers;
    }
    
    public void addTimer(Timer t){
        timers.add(t);
    }
    
    public void changeTimers(int difference){
        for(Timer t : timers){
            if(t.getDelay()-difference > 0){
                t.setDelay(t.getDelay()-difference);
            } else {
                t.setDelay(0);
            }
        }
    }
}
