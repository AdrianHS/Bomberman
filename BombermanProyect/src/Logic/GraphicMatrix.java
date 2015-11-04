
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class GraphicMatrix extends javax.swing.JFrame implements KeyListener{
    private JPanel  panel;
    private GridBagConstraints gbc;
    private int x;
    private int y;
    JLabel [][] matrix = new JLabel[15][15];
    
    
    public GraphicMatrix() {
        addKeyListener(this);
        int num = 25;
        int cont = 0;
        this.pack();
        this.panel = new JPanel();
        this.panel.setLayout(new GridBagLayout());
        this.gbc=new GridBagConstraints();
        
        Globals globals = Globals.getInstance();
        
       /**
        * Ciclos para crear la matriz
        */
        for (int y = 0; y < 15; y++) {
            for (int x = 0; x < 15; x++) {
                JLabel lbl = new JLabel();

                lbl.setBounds(x*num, y*num, num, num);
                lbl.setIcon(setIcon(num,"/Images/bloque.png"));
                matrix[x][y] = lbl;
                globals.getGbc().gridx = x*num;
                //globals.getGbc().gridy = y*num;
                //this.gbc.gridx=x*num;
                this.gbc.gridy=y*num;
                //globales.getPanel().add(lbl,this.gbc);
                this.panel.add(lbl,this.gbc);

                //getContentPane().add(lbl);

                if(((x%2)!=0) ||((y%2)!=0)){

                    matrix[x][y].setIcon(setIcon(num,"/Images/bloqueVacio.png"));
                }
            }            
        }
        
        /*
        *Este ciclo es para pintar la pared de arriba y de abajo de la matrix
        */
        for(int x =0;x<matrix.length;x++){
            matrix[0][x].setIcon(setIcon(num,"/Images/bloque.png"));
            matrix[14][x].setIcon(setIcon(num,"/Images/bloque.png"));
            matrix[x][0].setIcon(setIcon(num,"/Images/bloque.png"));
            matrix[x][14].setIcon(setIcon(num,"/Images/bloque.png"));
        }
     
        this.getContentPane().add(panel,BorderLayout.NORTH);
      

        JLabel label = new JLabel();
        this.add(label);
        this.x = 0;
        this.y = 0;
      
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {
        
    }
    int Q =1;
    int W =1;
    @Override
    public void keyPressed(KeyEvent ke) {
        
        System.out.println(ke.getKeyCode());

        if(ke.getKeyCode()==32)    //espacio
        {
            //JOptionPane.showMessageDialog(this, "Presionó espacio");
            matrix[Q][W].setIcon(setIcon(25,"/Images/bomba.png"));
            W++;
            matrix[Q][W].setIcon(setIcon(25,"/Images/bomba.png"));
        }
        
        if(ke.getKeyCode()==37)
        {
            //JOptionPane.showMessageDialog(this, "Presionó izquierda");
            matrix[Q][W].setIcon(setIcon(25,"/Images/bloqueVacio.png"));
            Q--;
            matrix[Q][W].setIcon(setIcon(25,"/Images/esqueleto.png"));
        }
        
        if(ke.getKeyCode()==40)
        {
            //JOptionPane.showMessageDialog(this, "Presionó abajo");
            matrix[Q][W].setIcon(setIcon(25,"/Images/bloqueVacio.png"));
            W++;
            matrix[Q][W].setIcon(setIcon(25,"/Images/esqueleto.png"));
        }
        
        if(ke.getKeyCode()==39)
        {
            matrix[Q][W].setIcon(setIcon(25,"/Images/bloqueVacio.png"));
            Q++;
            matrix[Q][W].setIcon(setIcon(25,"/Images/esqueleto.png"));
            //JOptionPane.showMessageDialog(this, "Presionó derecha");
        }
        
        if(ke.getKeyCode()==38)
        {
            matrix[Q][W].setIcon(setIcon(25,"/Images/bloqueVacio.png"));
            W--;
            matrix[Q][W].setIcon(setIcon(25,"/Images/esqueleto.png"));
            //JOptionPane.showMessageDialog(this, "Presionó arriba");
        }
        
        
    }
    
    public void setX(int i){
        this.x = i;
    }
    
    public void setY(int i){
        this.y = i;
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