package Logic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
* Imported libraries
*/
import java.applet.AudioClip;


/**
 *
 * @author _ADRIAN_
 */
public class Sound {
    /**
    * To take the direction of sound
    */
    AudioClip player;
    
    public Sound() {
        //player = java.applet.Applet.newAudioClip(getClass().getResource("/sonido/musicStart.wav"));
        //player.play();
    }
    public void boom(){
        player = java.applet.Applet.newAudioClip(getClass().getResource("/Sound/Boom.wav"));
        player.play();
    }
    
    public void win(){
        player = java.applet.Applet.newAudioClip(getClass().getResource("/Sound/winer.wav"));
        player.play();
    }
    public void loser(){
        player = java.applet.Applet.newAudioClip(getClass().getResource("/Sound/Die.mid"));
        player.play();
    }
   
    
     
    

    /**
    * To stop the sound
    */
    public void offSound(){
        player.stop();
    }

    
}
