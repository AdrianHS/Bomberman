/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

import Graphic.End;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author _ADRIAN_
 */
public class Hero extends Element{
    Globals globals = Globals.getInstance();
    public Hero() {
        super(4);
       
    }
    
    /**
    *método para mover left
    */
    void moveLeft(){
        if(globals.getLogic().getMatrix()[globals.getGraphic().heroY][globals.getGraphic().heroX-1].ID==2){
                if(globals.getLogic().getMatrix()[globals.getGraphic().heroY][globals.getGraphic().heroX].ID==7){
                    globals.getGraphic().matrix[globals.getGraphic().heroX][globals.getGraphic().heroY].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/bomb.png"));
                }    
                else{
                    globals.getGraphic().matrix[globals.getGraphic().heroX][globals.getGraphic().heroY].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                    globals.getLogic().getMatrix()[globals.getGraphic().heroY][globals.getGraphic().heroX]=new Blank(); 
                }
                
                globals.getGraphic().heroX--;
               
                globals.getLogic().getMatrix()[globals.getGraphic().heroY][globals.getGraphic().heroX]=globals.getLogic().getHero();
                globals.getGraphic().matrix[globals.getGraphic().heroX][globals.getGraphic().heroY].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/Hero1.png"));
                //globals.getLogic().printAll();
                
        } 
        
        else if(globals.getLogic().getMatrix()[globals.getGraphic().heroY][globals.getGraphic().heroX-1].ID==12){
            globals.getGraphic().dispose();
            Graphic.End end = new End(1);
            end.setVisible(true);                           
        }
        else if(globals.getLogic().getMatrix()[globals.getGraphic().heroY][globals.getGraphic().heroX-1].ID==5||globals.getLogic().getMatrix()[globals.getGraphic().heroY][globals.getGraphic().heroX-1].ID==6){
            globals.getGraphic().dispose();
            globals.getGraphic().b.stopable=false;
            Graphic.End end = new End(2);
            end.setVisible(true);                           
        }
        
    }
    /**
    *método para mover right
    */
    void moveRight(){
        if(globals.getLogic().getMatrix()[globals.getGraphic().heroY][globals.getGraphic().heroX+1].ID==2){
                if(globals.getLogic().getMatrix()[globals.getGraphic().heroY][globals.getGraphic().heroX].ID==7){
                    globals.getGraphic().matrix[globals.getGraphic().heroX][globals.getGraphic().heroY].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/bomb.png"));
                }
                else{
                    globals.getGraphic().matrix[globals.getGraphic().heroX][globals.getGraphic().heroY].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                    globals.getLogic().getMatrix()[globals.getGraphic().heroY][globals.getGraphic().heroX]=new Blank();
                }
                
                globals.getGraphic().heroX++;
                globals.getGraphic().matrix[globals.getGraphic().heroX][globals.getGraphic().heroY].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/Hero1.png"));
                globals.getLogic().getMatrix()[globals.getGraphic().heroY][globals.getGraphic().heroX]=globals.getLogic().getHero();
                //globals.getLogic().printAll();
        }
         else if(globals.getLogic().getMatrix()[globals.getGraphic().heroY][globals.getGraphic().heroX+1].ID==12){
            globals.getGraphic().dispose();
            Graphic.End end = new End(1);
            end.setVisible(true);                           
        }
         else if(globals.getLogic().getMatrix()[globals.getGraphic().heroY][globals.getGraphic().heroX+1].ID==5||globals.getLogic().getMatrix()[globals.getGraphic().heroY][globals.getGraphic().heroX+1].ID==6){
            globals.getGraphic().dispose();
            globals.getGraphic().b.stopable=false;
            Graphic.End end = new End(2);
            end.setVisible(true);                           
        }
    }
    /**
    *método para mover down
    */
    void moveDown(){
        if(globals.getLogic().getMatrix()[globals.getGraphic().heroY+1][globals.getGraphic().heroX].ID==2){
                if(globals.getLogic().getMatrix()[globals.getGraphic().heroY][globals.getGraphic().heroX].ID==7){
                    globals.getGraphic().matrix[globals.getGraphic().heroX][globals.getGraphic().heroY].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/bomb.png"));
                }
                else{
                    globals.getGraphic().matrix[globals.getGraphic().heroX][globals.getGraphic().heroY].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                    globals.getLogic().getMatrix()[globals.getGraphic().heroY][globals.getGraphic().heroX]=new Blank();
                }
                
                globals.getGraphic().heroY++;
                globals.getGraphic().matrix[globals.getGraphic().heroX][globals.getGraphic().heroY].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/Hero1.png"));
                globals.getLogic().getMatrix()[globals.getGraphic().heroY][globals.getGraphic().heroX]=globals.getLogic().getHero();
                //globals.getLogic().printAll();
        }
         else  if(globals.getLogic().getMatrix()[globals.getGraphic().heroY+1][globals.getGraphic().heroX].ID==12){
            globals.getGraphic().dispose();
            Graphic.End end = new End(1);
            end.setVisible(true);                           
        }
         else  if(globals.getLogic().getMatrix()[globals.getGraphic().heroY+1][globals.getGraphic().heroX].ID==5||globals.getLogic().getMatrix()[globals.getGraphic().heroY+1][globals.getGraphic().heroX].ID==6){
            globals.getGraphic().dispose();
            globals.getGraphic().b.stopable=false;
            Graphic.End end = new End(2);
            end.setVisible(true);                           
        }
    }
    /**
    *método para mover up
    */
    void moveUp(){
        if(globals.getLogic().getMatrix()[globals.getGraphic().heroY-1][globals.getGraphic().heroX].ID==2){
                if(globals.getLogic().getMatrix()[globals.getGraphic().heroY][globals.getGraphic().heroX].ID==7){
                    globals.getGraphic().matrix[globals.getGraphic().heroX][globals.getGraphic().heroY].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/bomb.png"));
                }
                else{
                    globals.getGraphic().matrix[globals.getGraphic().heroX][globals.getGraphic().heroY].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                    globals.getLogic().getMatrix()[globals.getGraphic().heroY][globals.getGraphic().heroX]=new Blank();
                }
                
                globals.getGraphic().heroY--;
                globals.getGraphic().matrix[globals.getGraphic().heroX][globals.getGraphic().heroY].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/Hero1.png"));
                globals.getLogic().getMatrix()[globals.getGraphic().heroY][globals.getGraphic().heroX]=globals.getLogic().getHero();
                //globals.getLogic().printAll();
        }
         else  if(globals.getLogic().getMatrix()[globals.getGraphic().heroY-1 ][globals.getGraphic().heroX].ID==12){
            globals.getGraphic().dispose();
            Graphic.End end = new End(1);
            end.setVisible(true);                           
        }
         else if(globals.getLogic().getMatrix()[globals.getGraphic().heroY-1 ][globals.getGraphic().heroX].ID==5||globals.getLogic().getMatrix()[globals.getGraphic().heroY-1 ][globals.getGraphic().heroX].ID==6){
            globals.getGraphic().dispose();
            globals.getGraphic().b.stopable=false;
            Graphic.End end = new End(2);
            end.setVisible(true);
        }
    }
    
    public ImageIcon setIcon(int scale,String direction){
    URL url = getClass().getResource(direction);
    ImageIcon icon = new ImageIcon(url);
    ImageIcon tempIcon = new ImageIcon(icon.getImage().getScaledInstance(scale, -1, Image.SCALE_DEFAULT));
    return tempIcon;
    }
    
}
