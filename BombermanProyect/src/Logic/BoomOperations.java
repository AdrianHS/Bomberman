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
    @Override
    public void run(){
        try{
            int x = globals.getGraphic().heroX;
            int y = globals.getGraphic().heroY;
            
            Thread.sleep(3000);
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
