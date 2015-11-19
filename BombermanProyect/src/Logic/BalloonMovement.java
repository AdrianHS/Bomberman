/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.awt.Image;
import java.net.URL;
import java.util.Random;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author AndrewJ
 */
public class BalloonMovement extends Thread {
    Globals globals = Globals.getInstance();
    public BalloonMovement() {
    }
    /**
    * Method and thread to move balloons
    */
    @Override
    public void run(){
       
        
        try {
            
            while(true){
                Thread.sleep(1000);
                
                for (int x = 0; x < globals.getLogic().getMatrix().length; x++) {
                        for (int y = 0; y < globals.getLogic().getMatrix().length; y++) {
                            if(globals.getLogic().getMatrix()[x][y].ID==5){
                                Random r1 = new Random();
                                int mov = r1.nextInt(4);
                                //System.out.println(mov);
                                if(mov==0 && globals.getLogic().getMatrix()[x][y-1].ID==2){
                                    globals.getLogic().getMatrix()[x][y]= new Blank();
                                    globals.getLogic().getMatrix()[x][y-1]= new EnemyBalloon();
                                    globals.getGraphic().matrix[y][x].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                                    globals.getGraphic().matrix[y-1][x].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/balloon.png"));
                                }
                                else if(mov==1 && globals.getLogic().getMatrix()[x][y+1].ID==2){
                                    globals.getLogic().getMatrix()[x][y]= new Blank();
                                    globals.getLogic().getMatrix()[x][y+1]= new EnemyBalloon();
                                    globals.getGraphic().matrix[y][x].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                                    globals.getGraphic().matrix[y+1][x].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/balloon.png"));
                                }
                                else if(mov==2 && globals.getLogic().getMatrix()[x-1][y].ID==2){
                                    globals.getLogic().getMatrix()[x][y]= new Blank();
                                    globals.getLogic().getMatrix()[x-1][y]= new EnemyBalloon();
                                    globals.getGraphic().matrix[y][x].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                                    globals.getGraphic().matrix[y][x-1].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/balloon.png"));
                                }
                                else if(mov==3 && globals.getLogic().getMatrix()[x+1][y].ID==2){
                                    globals.getLogic().getMatrix()[x][y]= new Blank();
                                    globals.getLogic().getMatrix()[x+1][y]= new EnemyBalloon();
                                    globals.getGraphic().matrix[y][x].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                                    globals.getGraphic().matrix[y][x+1].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/balloon.png"));
                                }
                                
                            }

                        }
                    }
                }
            } catch (InterruptedException e) {
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
