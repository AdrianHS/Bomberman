/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;


import java.awt.Image;
import java.net.URL;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


/**
 *
 * @author AndrewJ
 */
public class BoomOperations extends Thread{
    Globals globals = Globals.getInstance();
    public BoomOperations() {
    }
    /**
    * Method and thread to move bombs
    */
    @Override
    public void run(){
        try{
            int x = globals.getGraphic().heroX;
            int y = globals.getGraphic().heroY;
            
            Thread.sleep(3000);
            //Items
            if(globals.getLogic().getMatrix()[y][x+1].ID==8){
                globals.getLogic().getMatrix()[y][x+1].ID=10;
                globals.getGraphic().matrix[x+1][y].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/item.png"));
            } 
            if(globals.getLogic().getMatrix()[y][x-1].ID==8){
                globals.getLogic().getMatrix()[y][x-1].ID=10;
                globals.getGraphic().matrix[x-1][y].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/item.png"));
            } 
            if(globals.getLogic().getMatrix()[y+1][x].ID==8){
                globals.getLogic().getMatrix()[y+1][x].ID=10;
                globals.getGraphic().matrix[x][y+1].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/item.png"));
            } 
            if(globals.getLogic().getMatrix()[y-1][x].ID==8){
                globals.getLogic().getMatrix()[y-1][x].ID=10;
                globals.getGraphic().matrix[x][y-1].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/item.png"));
            } 
            //Door
            if(globals.getLogic().getMatrix()[y][x+1].ID==9){
                globals.getLogic().getMatrix()[y][x+1].ID=11;
                globals.getGraphic().matrix[x+1][y].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/door.png"));
            } 
            if(globals.getLogic().getMatrix()[y][x-1].ID==9){
                globals.getLogic().getMatrix()[y][x-1].ID=11;
                globals.getGraphic().matrix[x-1][y].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/door.png"));
            } 
            if(globals.getLogic().getMatrix()[y+1][x].ID==9){
                globals.getLogic().getMatrix()[y+1][x].ID=11;
                globals.getGraphic().matrix[x][y+1].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/door.png"));
            } 
            if(globals.getLogic().getMatrix()[y-1][x].ID==9){
                globals.getLogic().getMatrix()[y-1][x].ID=11;
                globals.getGraphic().matrix[x][y-1].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/door.png"));
            } 
            //All, enemies and blocks
            if(globals.getLogic().getMatrix()[y][x+1].ID==3||globals.getLogic().getMatrix()[y][x+1].ID==5||globals.getLogic().getMatrix()[y][x+1].ID==6){
            
                globals.getGraphic().matrix[x+1][y].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                
                globals.getLogic().getMatrix()[y][x+1]=new Blank();
            }
            if(globals.getLogic().getMatrix()[y][x-1].ID==3||globals.getLogic().getMatrix()[y][x-1].ID==5||globals.getLogic().getMatrix()[y][x-1].ID==6){
                globals.getGraphic().matrix[x-1][y].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                
                globals.getLogic().getMatrix()[y][x-1]=new Blank();
            }
            if(globals.getLogic().getMatrix()[y-1][x].ID==3||globals.getLogic().getMatrix()[y-1][x].ID==5||globals.getLogic().getMatrix()[y-1][x].ID==6){
                globals.getGraphic().matrix[x][y-1].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                
                globals.getLogic().getMatrix()[y-1][x]=new Blank();
            }
            if(globals.getLogic().getMatrix()[y+1][x].ID==3||globals.getLogic().getMatrix()[y+1][x].ID==5||globals.getLogic().getMatrix()[y+1][x].ID==6){
                globals.getGraphic().matrix[x][y+1].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                
                globals.getLogic().getMatrix()[y+1][x]=new Blank();
            }
            globals.getGraphic().matrix[x][y].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
            globals.getLogic().getMatrix()[y][x]=new Blank();
            
            
            
            //This make sure that they are more enemies
            boolean enemies=false;
            for (int x1=0; x1 < globals.getLogic().getMatrix().length; x1++) {
                for (int y1=0; y1 < globals.getLogic().getMatrix().length; y1++) {
                           
                    if (globals.getLogic().getMatrix()[x1][y1].ID==5||globals.getLogic().getMatrix()[x1][y1].ID==6){
                        enemies=true;
                            
                    }
                }
            }
            if(enemies==false){
                globals.getLogic().getMatrix()[globals.getLogic().xDoor][globals.getLogic().yDoor].ID=12;
                globals.getGraphic().getMatrix()[globals.getLogic().yDoor][globals.getLogic().xDoor].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/door.png"));
                
            }
            
            
        }catch(InterruptedException e){
            Logger.getLogger(null);
        }
    }
    public ImageIcon setIcon(int scale,String direction){
    URL url = getClass().getResource(direction);
    ImageIcon icon = new ImageIcon(url);
    ImageIcon tempIcon = new ImageIcon(icon.getImage().getScaledInstance(scale, -1, Image.SCALE_DEFAULT));
    return tempIcon;
    }
     
}
