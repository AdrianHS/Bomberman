/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
* Imported libraries
*/
import Graphic.End;
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
    Sound s = new Sound();
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
            globals.getGraphic().matrix[x][y].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
            globals.getLogic().getMatrix()[y][x]=new Blank();
            
            //Makes sure if the hero its on the bomb.
            if(globals.getGraphic().heroX==x&&globals.getGraphic().heroY==y){
                globals.getGraphic().dispose();
                Graphic.End end = new End(2);
                end.setVisible(true);
                globals.getGraphic().b.stopable=false;
                
            }
            //If hits the hero.
            else if(globals.getLogic().getMatrix()[y][x+1].ID==4){
                globals.getGraphic().dispose();
                Graphic.End end = new End(2);
                end.setVisible(true);
                globals.getGraphic().b.stopable=false;
            } 
            else if(globals.getLogic().getMatrix()[y][x-1].ID==4){
                globals.getGraphic().dispose();
                Graphic.End end = new End(2);
                end.setVisible(true);
                globals.getGraphic().b.stopable=false;
            } 
            else if(globals.getLogic().getMatrix()[y+1][x].ID==4){
                globals.getGraphic().dispose();
                Graphic.End end = new End(2);
                end.setVisible(true);
                globals.getGraphic().b.stopable=false;
            } 
            else if(globals.getLogic().getMatrix()[y-1][x].ID==4){
                globals.getGraphic().dispose();
                Graphic.End end = new End(2);
                end.setVisible(true);
                globals.getGraphic().b.stopable=false;
            } 

            s.boom();
            //Fire Efect
            if(globals.getLogic().getMatrix()[y][x+1].ID!=1&&globals.getLogic().getMatrix()[y][x+1].ID!=7&&globals.getLogic().getMatrix()[y][x+1].ID!=8&&globals.getLogic().getMatrix()[y][x+1].ID!=9&&globals.getLogic().getMatrix()[y][x+1].ID!=10&&globals.getLogic().getMatrix()[y][x+1].ID!=11&&globals.getLogic().getMatrix()[y][x+1].ID!=12){
                globals.getGraphic().matrix[x+1][y].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/fire1.png"));
                globals.getLogic().getMatrix()[y][x+1]=new Blank();
            } 
             if(globals.getLogic().getMatrix()[y][x-1].ID!=1&&globals.getLogic().getMatrix()[y][x-1].ID!=7&&globals.getLogic().getMatrix()[y][x-1].ID!=8&&globals.getLogic().getMatrix()[y][x-1].ID!=9&&globals.getLogic().getMatrix()[y][x-1].ID!=10&&globals.getLogic().getMatrix()[y][x-1].ID!=11&&globals.getLogic().getMatrix()[y][x-1].ID!=12){
                globals.getGraphic().matrix[x-1][y].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/fire1.png"));
                globals.getLogic().getMatrix()[y][x-1]=new Blank();
            } 
            if(globals.getLogic().getMatrix()[y+1][x].ID!=1&&globals.getLogic().getMatrix()[y+1][x].ID!=7&&globals.getLogic().getMatrix()[y+1][x].ID!=8&&globals.getLogic().getMatrix()[y+1][x].ID!=9&&globals.getLogic().getMatrix()[y+1][x].ID!=10&&globals.getLogic().getMatrix()[y+1][x].ID!=11&&globals.getLogic().getMatrix()[y+1][x].ID!=12){
                globals.getGraphic().matrix[x][y+1].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/fire2.png"));
                globals.getLogic().getMatrix()[y+1][x]=new Blank();
            } 
            if(globals.getLogic().getMatrix()[y-1][x].ID!=1&&globals.getLogic().getMatrix()[y-1][x].ID!=7&&globals.getLogic().getMatrix()[y-1][x].ID!=8&&globals.getLogic().getMatrix()[y-1][x].ID!=9&&globals.getLogic().getMatrix()[y-1][x].ID!=10&&globals.getLogic().getMatrix()[y-1][x].ID!=11&&globals.getLogic().getMatrix()[y-1][x].ID!=12 ){
                globals.getGraphic().matrix[x][y-1].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/fire2.png"));
                globals.getLogic().getMatrix()[y-1][x]=new Blank();
            } 
            Thread.sleep(500);
            if(globals.getLogic().getMatrix()[y][x+1].ID!=1&&globals.getLogic().getMatrix()[y][x+1].ID!=7&&globals.getLogic().getMatrix()[y][x+1].ID!=8&&globals.getLogic().getMatrix()[y][x+1].ID!=9&&globals.getLogic().getMatrix()[y][x+1].ID!=10&&globals.getLogic().getMatrix()[y][x+1].ID!=11&&globals.getLogic().getMatrix()[y][x+1].ID!=12){
                globals.getGraphic().matrix[x+1][y].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
           
            } 
            if(globals.getLogic().getMatrix()[y][x-1].ID!=1&&globals.getLogic().getMatrix()[y][x-1].ID!=7&&globals.getLogic().getMatrix()[y][x-1].ID!=8&&globals.getLogic().getMatrix()[y][x-1].ID!=9&&globals.getLogic().getMatrix()[y][x-1].ID!=10&&globals.getLogic().getMatrix()[y][x-1].ID!=11&&globals.getLogic().getMatrix()[y][x-1].ID!=12){
                globals.getGraphic().matrix[x-1][y].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                
            } 
            if(globals.getLogic().getMatrix()[y+1][x].ID!=1&&globals.getLogic().getMatrix()[y+1][x].ID!=7&&globals.getLogic().getMatrix()[y+1][x].ID!=8&&globals.getLogic().getMatrix()[y+1][x].ID!=9&&globals.getLogic().getMatrix()[y+1][x].ID!=10&&globals.getLogic().getMatrix()[y+1][x].ID!=11&&globals.getLogic().getMatrix()[y+1][x].ID!=12){
                globals.getGraphic().matrix[x][y+1].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                
            } 
            if(globals.getLogic().getMatrix()[y-1][x].ID!=1&&globals.getLogic().getMatrix()[y-1][x].ID!=7&&globals.getLogic().getMatrix()[y-1][x].ID!=8&&globals.getLogic().getMatrix()[y-1][x].ID!=9&&globals.getLogic().getMatrix()[y-1][x].ID!=10&&globals.getLogic().getMatrix()[y-1][x].ID!=11&&globals.getLogic().getMatrix()[y-1][x].ID!=12 ){
                globals.getGraphic().matrix[x][y-1].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                
            } 

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
            //Enemies and blocks
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
                globals.getGraphic().getMatrix()[globals.getLogic().yDoor][globals.getLogic().xDoor].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/doorOpen.png"));
                
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
