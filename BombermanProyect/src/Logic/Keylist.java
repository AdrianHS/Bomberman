/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author AndrewJ
 */
public class Keylist extends javax.swing.JFrame implements KeyListener {

    public Keylist() {
        System.out.println("Hoooola");
        addKeyListener(this);
        System.out.println("Hoooola");
    }
    

        
@Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        
        System.out.println(ke.getKeyCode());

        if(ke.getKeyCode()==32)    
        {
            
            
            //JOptionPane.showMessageDialog(this, "Presionó espacio");
     
        }
        
        if(ke.getKeyCode()==37)
        {
            
            
            
        }
        if(ke.getKeyCode()==40)
        {   
            
        }
        
        if(ke.getKeyCode()==39)
        {
            
            //JOptionPane.showMessageDialog(this, "Presionó derecha");
        }
        
        if(ke.getKeyCode()==38)
        {
            
            //JOptionPane.showMessageDialog(this, "Presionó arriba");
        }
        
        
    }

  
     
    
    
    @Override
    public void keyReleased(KeyEvent ke) {
        
    }

}