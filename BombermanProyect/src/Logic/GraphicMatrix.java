
package Logic;

/**
* Imported libraries
*/
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GraphicMatrix extends javax.swing.JFrame implements KeyListener{
    private JPanel  panel;
    private GridBagConstraints gbc;
    Globals globals = Globals.getInstance();
    JLabel [][] matrix; 
    Bomb bomb = new Bomb();
    int itemSize;
    MapCreator map;
    Timer timer = new Timer();;
    
    
    public GraphicMatrix(MapCreator map,int size,int itemSize) {
        matrix = new JLabel[size][size];
        
        this.itemSize=itemSize;
        this.map=map;
        
        
        addKeyListener(this);
        
        this.pack();
        this.panel = new JPanel();
        this.panel.setLayout(new GridBagLayout());
        this.gbc=new GridBagConstraints();
        
        
       /**
        * Cycles to create the array
        */
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                JLabel lbl = new JLabel();
                /**
                * Paint the entire matrix
                */
                lbl.setBounds(x*itemSize, y*itemSize, itemSize, itemSize);
                lbl.setIcon(setIcon(itemSize,"/Images/block.png"));
                matrix[x][y] = lbl;
                globals.getGbc().gridx = x*itemSize;
                this.gbc.gridy=y*itemSize;
                this.panel.add(lbl,this.gbc);

                /**
                * Putting green block in odd positions
                */
                if(((x%2)!=0) ||((y%2)!=0)){

                    matrix[x][y].setIcon(setIcon(itemSize,"/Images/emptyBlock.png"));
                }
            }            
        }
        
        /**
        * This cycle is to paint the wall above and below the matrix
        */
        for(int x =0;x<size;x++){
            matrix[0][x].setIcon(setIcon(itemSize,"/Images/bloque.png"));
            matrix[size-1][x].setIcon(setIcon(itemSize,"/Images/block.png"));
            matrix[x][0].setIcon(setIcon(itemSize,"/Images/block.png"));
            matrix[x][size-1].setIcon(setIcon(itemSize,"/Images/block.png"));
            
        }
     
        this.getContentPane().add(panel,BorderLayout.NORTH);
        /**
        * puts the correct image by ID
        */ 
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                if(this.map.getMatrix()[x][y].ID==3){
                     matrix[y][x].setIcon(setIcon(itemSize,"/Images/barrierBlock.png"));
                }
                else if(this.map.getMatrix()[x][y].ID==4){
                     matrix[y][x].setIcon(setIcon(itemSize,"/Images/Hero1.png"));
                }
                else if(this.map.getMatrix()[x][y].ID==5){
                     matrix[y][x].setIcon(setIcon(itemSize,"/Images/balloon.png"));
                }
                else if(this.map.getMatrix()[x][y].ID==6){
                     matrix[y][x].setIcon(setIcon(itemSize,"/Images/barrel.png"));
                }
                else if(this.map.getMatrix()[x][y].ID==8){
                     matrix[y][x].setIcon(setIcon(itemSize,"/Images/barrierBlock.png"));
                }
                else if(this.map.getMatrix()[x][y].ID==9){
                     matrix[y][x].setIcon(setIcon(itemSize,"/Images/barrierBlock.png"));
                }
            }            
        } 
        
        
        BalloonMovement b = new BalloonMovement();
        b.start();
        
        
        
        
        this. timer=timer;
        this.timer.start();
    }
    
    /**
    * The set and get
    */
    public JLabel[][] getMatrix() {
        return matrix;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public void setMatrix(JLabel[][] matrix) {
        this.matrix = matrix;
    }

    public Timer getTimer() {
        return timer;
    }

    
    /**
    * To capture keystrokes
    */
    @Override
    public void keyTyped(KeyEvent ke) {
        
    }
    int heroX =1;
    int heroY =1;
    @Override
    public void keyPressed(KeyEvent ke) {
        
        //System.out.println(ke.getKeyCode());
        
        //Space
        if(ke.getKeyCode()==32)    
        {
            //JOptionPane.showMessageDialog(this, "Presionó espacio");
            matrix[heroX][heroY].setIcon(setIcon(itemSize,"/Images/BombAndHero1.png"));
            matrix[heroX][heroY].setIcon(setIcon(itemSize,"/Images/BombAndHero1.png"));
            
            //Sound s = new Sound();
            //s.boom();
            
            map.getMatrix()[heroY][heroX] = bomb;           
            BoomOperations t = new BoomOperations();
            t.start();
            
            //matrix[Q][W].setIcon(setIcon(itemSize,"/Images/emptyBlock.png"));
            //map.getMatrix()[W][Q]=new Blank();
            
            
            
            //This moves the balloons......
            /*
            
            */

        }
        
        // Move Left
        if(ke.getKeyCode()==37)
        {
            globals.getLogic().getHero().moveLeft();
                
            
        }
        // Move Down
        if(ke.getKeyCode()==40)
        {
            globals.getLogic().getHero().moveDown();
        }
        // Move Rigth
        if(ke.getKeyCode()==39)
        {
            globals.getLogic().getHero().moveRight();
            
        }
        // Move up
        if(ke.getKeyCode()==38)
        {
            globals.getLogic().getHero().moveUp();
        }
        
    }

  
     
    
    
    @Override
    public void keyReleased(KeyEvent ke) {
        
    }
    /**
    * It is used to set icons
    */
    public ImageIcon setIcon(int scale,String direction){
    URL url = getClass().getResource(direction);
    ImageIcon icon = new ImageIcon(url);
    ImageIcon tempIcon = new ImageIcon(icon.getImage().getScaledInstance(scale, -1, Image.SCALE_DEFAULT));
    return tempIcon;
    }
    
}