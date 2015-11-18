
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
            }            
        } 
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

    
    /**
    * To capture keystrokes
    */
    @Override
    public void keyTyped(KeyEvent ke) {
        
    }
    int Q =1;
    int W =1;
    @Override
    public void keyPressed(KeyEvent ke) {
        
        //System.out.println(ke.getKeyCode());
        
        //Space
        if(ke.getKeyCode()==32)    
        {
            //JOptionPane.showMessageDialog(this, "Presionó espacio");
            matrix[Q][W].setIcon(setIcon(itemSize,"/Images/BombAndHero1.png"));
            matrix[Q][W].setIcon(setIcon(itemSize,"/Images/BombAndHero1.png"));
            
            map.getMatrix()[W][Q] = bomb;
            
            if(map.getMatrix()[W][Q+1].ID==3){
                matrix[Q+1][W].setIcon(setIcon(itemSize,"/Images/emptyBlock.png"));
                map.getMatrix()[W][Q+1]=new Blank();
            }
            if(map.getMatrix()[W][Q-1].ID==3){
                matrix[Q-1][W].setIcon(setIcon(itemSize,"/Images/emptyBlock.png"));
                map.getMatrix()[W][Q-1]=new Blank();
            }
            if(map.getMatrix()[W-1][Q].ID==3){
                matrix[Q][W-1].setIcon(setIcon(itemSize,"/Images/emptyBlock.png"));
                map.getMatrix()[W-1][Q]=new Blank();
            }
            if(map.getMatrix()[W+1][Q].ID==3){
                matrix[Q][W+1].setIcon(setIcon(itemSize,"/Images/emptyBlock.png"));
                map.getMatrix()[W+1][Q]=new Blank();
            }
            
        }
        
        // Move Left
        if(ke.getKeyCode()==37)
        {
            if(map.getMatrix()[W][Q-1].ID==2){
                if(map.getMatrix()[W][Q].ID==7){
                    matrix[Q][W].setIcon(setIcon(itemSize,"/Images/bomb.png"));
                }
                else{
                    matrix[Q][W].setIcon(setIcon(itemSize,"/Images/emptyBlock.png"));
                    map.getMatrix()[W][Q]=new Blank(); 
                }
                
                Q--;
                map.getMatrix()[W][Q]=map.getHero();
                matrix[Q][W].setIcon(setIcon(itemSize,"/Images/Hero1.png"));
                //map.printAll();
            }
        }
        // Move Down
        if(ke.getKeyCode()==40)
        {
            if(map.getMatrix()[W+1][Q].ID==2){
                if(map.getMatrix()[W][Q].ID==7){
                    matrix[Q][W].setIcon(setIcon(itemSize,"/Images/bomb.png"));
                }
                else{
                    matrix[Q][W].setIcon(setIcon(itemSize,"/Images/emptyBlock.png"));
                    map.getMatrix()[W][Q]=new Blank();
                }
                
                W++;
                matrix[Q][W].setIcon(setIcon(itemSize,"/Images/Hero1.png"));
                map.getMatrix()[W][Q]=map.getHero();
                //map.printAll();
            }
        }
        // Move Rigth
        if(ke.getKeyCode()==39)
        {
            if(map.getMatrix()[W][Q+1].ID==2){
                if(map.getMatrix()[W][Q].ID==7){
                    matrix[Q][W].setIcon(setIcon(itemSize,"/Images/bomb.png"));
                }
                else{
                    matrix[Q][W].setIcon(setIcon(itemSize,"/Images/emptyBlock.png"));
                    map.getMatrix()[W][Q]=new Blank();
                }
                
                Q++;
                matrix[Q][W].setIcon(setIcon(itemSize,"/Images/Hero1.png"));
                map.getMatrix()[W][Q]=map.getHero();
                //map.printAll();
            }
            
        }
        // Move up
        if(ke.getKeyCode()==38)
        {
            if(map.getMatrix()[W-1][Q].ID==2){
                if(map.getMatrix()[W][Q].ID==7){
                    matrix[Q][W].setIcon(setIcon(itemSize,"/Images/bomb.png"));
                }
                else{
                    matrix[Q][W].setIcon(setIcon(itemSize,"/Images/emptyBlock.png"));
                    map.getMatrix()[W][Q]=new Blank();
                }
                
                W--;
                matrix[Q][W].setIcon(setIcon(itemSize,"/Images/Hero1.png"));
                map.getMatrix()[W][Q]=map.getHero();
                //map.printAll();
            }
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