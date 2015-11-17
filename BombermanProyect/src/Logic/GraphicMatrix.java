
package Logic;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class GraphicMatrix extends javax.swing.JFrame implements KeyListener{
    private JPanel  panel;
    private GridBagConstraints gbc;
    Globals globals = Globals.getInstance();
    JLabel [][] matrix; 
    
    
    MapCreator map;
    public GraphicMatrix(MapCreator map,int size) {
        matrix = new JLabel[size][size];
        
        this.map=map;
        
        
        addKeyListener(this);
        
        this.pack();
        this.panel = new JPanel();
        this.panel.setLayout(new GridBagLayout());
        this.gbc=new GridBagConstraints();
        
        
       /**
        * Ciclos para crear la matriz
        */
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                JLabel lbl = new JLabel();

                lbl.setBounds(x*globals.getNum2(), y*globals.getNum2(), globals.getNum2(), globals.getNum2());
                lbl.setIcon(setIcon(globals.getNum2(),"/Images/bloque.png"));
                matrix[x][y] = lbl;
                globals.getGbc().gridx = x*globals.getNum2();
                //globals.getGbc().gridy = y*num;
                //this.gbc.gridx=x*num;
                this.gbc.gridy=y*globals.getNum2();
                //globales.getPanel().add(lbl,this.gbc);
                this.panel.add(lbl,this.gbc);

                //getContentPane().add(lbl);

                if(((x%2)!=0) ||((y%2)!=0)){

                    matrix[x][y].setIcon(setIcon(globals.getNum2(),"/Images/bloqueVacio.png"));
                }
            }            
        }
        
        /*
        *Este ciclo es para pintar la pared de arriba y de abajo de la matrix
        */
        for(int x =0;x<size;x++){
            matrix[0][x].setIcon(setIcon(globals.getNum2(),"/Images/bloque.png"));
            matrix[size-1][x].setIcon(setIcon(globals.getNum2(),"/Images/bloque.png"));
            matrix[x][0].setIcon(setIcon(globals.getNum2(),"/Images/bloque.png"));
            matrix[x][size-1].setIcon(setIcon(globals.getNum2(),"/Images/bloque.png"));
            
        }
     
        this.getContentPane().add(panel,BorderLayout.NORTH);
        
       for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                if(this.map.getMatrix()[x][y].ID==3){
                    matrix[y][x].setIcon(setIcon(globals.getNum2(),"/Images/BarrierBloc.png"));
                }
                else if(this.map.getMatrix()[x][y].ID==4){
                    matrix[y][x].setIcon(setIcon(globals.getNum2(),"/Images/Hero1.png"));
                }
            }            
        } 
    }

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
            matrix[Q][W].setIcon(setIcon(globals.getNum2(),"/Images/BombAndHero1.png"));
            matrix[Q][W].setIcon(setIcon(globals.getNum2(),"/Images/BombAndHero1.png"));
            if(map.getMatrix()[W][Q+1].ID==3){
                matrix[Q+1][W].setIcon(setIcon(globals.getNum2(),"/Images/bloqueVacio.png"));
                map.getMatrix()[W][Q+1]=new Blank();
            }
            if(map.getMatrix()[W][Q-1].ID==3){
                matrix[Q-1][W].setIcon(setIcon(globals.getNum2(),"/Images/bloqueVacio.png"));
                map.getMatrix()[W][Q-1]=new Blank();
            }
            if(map.getMatrix()[W-1][Q].ID==3){
                matrix[Q][W-1].setIcon(setIcon(globals.getNum2(),"/Images/bloqueVacio.png"));
                map.getMatrix()[W-1][Q]=new Blank();
            }
            if(map.getMatrix()[W+1][Q].ID==3){
                matrix[Q][W+1].setIcon(setIcon(globals.getNum2(),"/Images/bloqueVacio.png"));
                map.getMatrix()[W+1][Q]=new Blank();
            }
            
        }
        
        //Left
        if(ke.getKeyCode()==37)
        {
            if(map.getMatrix()[W][Q-1].ID==2){
                //JOptionPane.showMessageDialog(this, "Presionó izquierda");
                matrix[Q][W].setIcon(setIcon(globals.getNum2(),"/Images/bloqueVacio.png"));
                map.getMatrix()[W][Q]=new Blank();
                
                Q--;
                map.getMatrix()[W][Q]=map.getHero();
                matrix[Q][W].setIcon(setIcon(globals.getNum2(),"/Images/Hero1.png"));
                //map.printAll();
            }
        }
        //Down
        if(ke.getKeyCode()==40)
        {
            if(map.getMatrix()[W+1][Q].ID==2){
                //JOptionPane.showMessageDialog(this, "Presionó abajo");
                matrix[Q][W].setIcon(setIcon(globals.getNum2(),"/Images/bloqueVacio.png"));
                map.getMatrix()[W][Q]=new Blank();
                W++;
                matrix[Q][W].setIcon(setIcon(globals.getNum2(),"/Images/Hero1.png"));
                map.getMatrix()[W][Q]=map.getHero();
                //map.printAll();
            }
        }
        //Rigth
        if(ke.getKeyCode()==39)
        {
            if(map.getMatrix()[W][Q+1].ID==2){
                matrix[Q][W].setIcon(setIcon(globals.getNum2(),"/Images/bloqueVacio.png"));
                map.getMatrix()[W][Q]=new Blank();
                Q++;
                matrix[Q][W].setIcon(setIcon(globals.getNum2(),"/Images/Hero1.png"));
                //JOptionPane.showMessageDialog(this, "Presionó derecha");
                map.getMatrix()[W][Q]=map.getHero();
                //map.printAll();
            }
            
        }
        //Up
        if(ke.getKeyCode()==38)
        {
            if(map.getMatrix()[W-1][Q].ID==2){
                matrix[Q][W].setIcon(setIcon(globals.getNum2(),"/Images/bloqueVacio.png"));
                map.getMatrix()[W][Q]=new Blank();
                W--;
                matrix[Q][W].setIcon(setIcon(globals.getNum2(),"/Images/Hero1.png"));
                //JOptionPane.showMessageDialog(this, "Presionó arriba");
                map.getMatrix()[W][Q]=map.getHero();
                //map.printAll();
            }
        }
        
    }

  
     
    
    
    @Override
    public void keyReleased(KeyEvent ke) {
        
    }
    
    public ImageIcon setIcon(int scale,String direction){
    URL url = getClass().getResource(direction);
    ImageIcon icon = new ImageIcon(url);
    ImageIcon tempIcon = new ImageIcon(icon.getImage().getScaledInstance(scale, -1, Image.SCALE_DEFAULT));
    return tempIcon;
    }
    
}