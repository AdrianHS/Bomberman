/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author _ADRIAN_
 */
public class Timer extends Thread{
    private int segundo,minutos;
    private boolean timing=true;
    @Override
    public void run(){
        
        try {

            while(timing) {
                Thread.sleep(1000);
                segundo++;
                if(segundo>59){
                    segundo = 0;
                    minutos++;
                }
                if(minutos>59){
                    minutos = 0;
                    
                }    
            }
  
        } 
        catch (InterruptedException ex) {
            Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);  
        }  
    } 

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public boolean isTiming() {
        return timing;
    }

    public void setTiming(boolean timing) {
        this.timing = timing;
    }
    
    
}
    

