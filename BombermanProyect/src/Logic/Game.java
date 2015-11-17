/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



/**
 *
 * @author AndrewJ
 */

public class Game {//extends javax.swing.JFrame implements KeyListener{
    MapCreator logicMap;
    GraphicMatrix b;   
    int num=25;
    int Q =1;
    int W =1;
    
   
    
    public Game() {
        
        //addKeyListener(this);
        logicMap = new MapCreator();
        logicMap.LogicMatrix(25,175,12,10);
        b = new GraphicMatrix(logicMap,25); 
        b.setSize(648, 667);
        b.setLocationRelativeTo(null);
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.setVisible(true);
        b.setTitle("BOMBERMAN");
        
        
    }
    
    
    /*
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
    public void keyReleased(KeyEvent e) {
        
    }
    */
    /*
    public ImageIcon setIcon(int scale,String direction){
    URL url = getClass().getResource(direction);
    ImageIcon icon = new ImageIcon(url);
    ImageIcon tempIcon = new ImageIcon(icon.getImage().getScaledInstance(scale, -1, Image.SCALE_DEFAULT));
    return tempIcon;
    }
*/
    
}
