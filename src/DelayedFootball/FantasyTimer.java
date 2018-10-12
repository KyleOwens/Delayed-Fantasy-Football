/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DelayedFootball;

import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Kyle
 */
public class FantasyTimer extends Timer {

    private int startTime;

    public FantasyTimer(int delay, ActionListener listener) {
        super(delay, listener);
        startTime = (int) System.currentTimeMillis();
    }
    
    public int getTimeRemaining(){
        int elapsed = (int)(System.currentTimeMillis() -  startTime);
        return (super.getDelay()-elapsed);
    }
    
    @Override
    public void setDelay(int delay){
        super.setDelay(delay);
        this.startTime = (int) System.currentTimeMillis();
    }

}
