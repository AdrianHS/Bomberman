
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


public class matrizGraficaMedia extends javax.swing.JFrame implements KeyListener{
    private JPanel  panel;
    private GridBagConstraints gbc;
    private int x;
    private int y;
    JLabel [][] matriz = new JLabel[25][25];
    
    
    public matrizGraficaMedia() {
        addKeyListener(this);
        int num = 30;
        int cont = 0;
        this.pack();
        this.panel = new JPanel();
        this.panel.setLayout(new GridBagLayout());
        this.gbc=new GridBagConstraints();
        
        Globales globales = Globales.getInstance();
        
       /**
        * Ciclos para crear la matriz
        */
        for (int y = 0; y < 25; y++) {
            for (int x = 0; x < 25; x++) {
                JLabel lbl = new JLabel();

                lbl.setBounds(x*num, y*num, num, num);
                lbl.setIcon(setIcon(num,"/Images/bloque.png"));
                matriz[x][y] = lbl;
                globales.getGbc().gridx = x*num;
                //globales.getGbc().gridy = y*num;
                //this.gbc.gridx=x*num;
                this.gbc.gridy=y*num;
                //globales.getPanel().add(lbl,this.gbc);
                this.panel.add(lbl,this.gbc);

                //getContentPane().add(lbl);

                if(((x%2)!=0) ||((y%2)!=0)){

                    matriz[x][y].setIcon(setIcon(num,"/Images/bloqueVacio.png"));
                }
            }            
        }
        
        /*
        *Este ciclo es para pintar la pared de arriba y de abajo de la matriz
        */
        for(int x =0;x<matriz.length;x++){
            matriz[0][x].setIcon(setIcon(num,"/Images/bloque.png"));
            matriz[24][x].setIcon(setIcon(num,"/Images/bloque.png"));
            matriz[x][0].setIcon(setIcon(num,"/Images/bloque.png"));
            matriz[x][24].setIcon(setIcon(num,"/Images/bloque.png"));
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

    @Override
    public void keyPressed(KeyEvent ke) {
        
        System.out.println(ke.getKeyCode());
        
        if(ke.getKeyCode()==32)    //espacio
        {
            JOptionPane.showMessageDialog(this, "Presionó espacio");
           
        }
        
        if(ke.getKeyCode()==37)
        {
            JOptionPane.showMessageDialog(this, "Presionó izquierda");
        }
        
        if(ke.getKeyCode()==40)
        {
            JOptionPane.showMessageDialog(this, "Presionó abajo");
        }
        
        if(ke.getKeyCode()==39)
        {
            JOptionPane.showMessageDialog(this, "Presionó derecha");
        }
        
        if(ke.getKeyCode()==38)
        {
            JOptionPane.showMessageDialog(this, "Presionó arriba");
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