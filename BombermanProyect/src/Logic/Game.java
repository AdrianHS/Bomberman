/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
* Imported libraries
*/
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
    
   
    
    public Game(int size, int block, int balloons, int barrels, int itemSize) {
        
        //addKeyListener(this);
        logicMap = new MapCreator();
        logicMap.LogicMatrix(size,block,balloons,barrels);
        b = new GraphicMatrix(logicMap,size,itemSize); 
        b.setSize(648, 667);
        b.setLocationRelativeTo(null);
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.setVisible(true);
        b.setTitle("BOMBERMAN");
        b.setIconImage(new ImageIcon(getClass().getResource("/Images/Hero2.png")).getImage());
        
        
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
