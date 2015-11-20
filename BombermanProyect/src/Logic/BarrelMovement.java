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
public class BarrelMovement extends Thread{
    Globals globals = Globals.getInstance();
    boolean stopable= true;
    @Override
    public void run(){

        try {
            while(stopable){
                Thread.sleep(1500);
                
                for (int x = 0; x < globals.getLogic().getMatrix().length; x++) {
                    for (int y = 0; y < globals.getLogic().getMatrix().length; y++) {
                            
                        //If this is barrel
                        if(globals.getLogic().getMatrix()[x][y].ID==6){
                            
                            
                            //Hero up and left
                            if(globals.getGraphic().heroX<y&&globals.getGraphic().heroY<x){
                                //System.out.println("El barril esta abajo y a la derecha");
                                //System.out.println(globals.getGraphic().heroX+","+globals.getGraphic().heroY+"  "+y+","+x);
                                
                                //Goes left
                                if(globals.getLogic().getMatrix()[x][y-1].ID==2){
                                    globals.getLogic().getMatrix()[x][y] = new Blank();
                                    globals.getLogic().getMatrix()[x][y-1] = new EnemyBarrel();
                                    globals.getGraphic().getMatrix()[y][x].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                                    globals.getGraphic().getMatrix()[y-1][x].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/barrel.png"));
                                }
                                //Goes up
                                else if(globals.getLogic().getMatrix()[x-1][y].ID==2){
                                    globals.getLogic().getMatrix()[x][y] = new Blank();
                                    globals.getLogic().getMatrix()[x-1][y] = new EnemyBarrel();
                                    globals.getGraphic().getMatrix()[y][x].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                                    globals.getGraphic().getMatrix()[y][x-1].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/barrel.png"));
                                }
                                
                            }  
                            //Hero down and left.
                            else if(globals.getGraphic().heroX<y&&globals.getGraphic().heroY>x){
                                //System.out.println("El barril esta arriba y a la derecha");
                                //System.out.println(globals.getGraphic().heroX+","+globals.getGraphic().heroY+"  "+y+","+x);
                                //Goes down.
                                if(globals.getLogic().getMatrix()[x+1][y].ID==2){
                                    globals.getLogic().getMatrix()[x][y] = new Blank();
                                    globals.getLogic().getMatrix()[x+1][y] = new EnemyBarrel();
                                    globals.getGraphic().getMatrix()[y][x].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                                    globals.getGraphic().getMatrix()[y][x+1].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/barrel.png"));
                                }
                                //Goes left.
                                else if(globals.getLogic().getMatrix()[x][y-1].ID==2){
                                    globals.getLogic().getMatrix()[x][y] = new Blank();
                                    globals.getLogic().getMatrix()[x][y-1] = new EnemyBarrel();
                                    globals.getGraphic().getMatrix()[y][x].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                                    globals.getGraphic().getMatrix()[y-1][x].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/barrel.png"));
                                }
                                
                            }  
                            //Hero down and right
                            else if(globals.getGraphic().heroX>y&&globals.getGraphic().heroY>x){
                                //System.out.println("El barril esta ariba y a la izquierda");
                                //System.out.println(globals.getGraphic().heroX+","+globals.getGraphic().heroY+"  "+y+","+x);
                                
                                //Goes right.
                                 if(globals.getLogic().getMatrix()[x][y+1].ID==2){
                                    globals.getLogic().getMatrix()[x][y] = new Blank();
                                    globals.getLogic().getMatrix()[x][y+1] = new EnemyBarrel();
                                    globals.getGraphic().getMatrix()[y][x].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                                    globals.getGraphic().getMatrix()[y+1][x].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/barrel.png"));
                                }
                                //Goes down.
                                else if(globals.getLogic().getMatrix()[x+1][y].ID==2){
                                    globals.getLogic().getMatrix()[x][y] = new Blank();
                                    globals.getLogic().getMatrix()[x+1][y] = new EnemyBarrel();
                                    globals.getGraphic().getMatrix()[y][x].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                                    globals.getGraphic().getMatrix()[y][x+1].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/barrel.png"));
                                }
                                
                            }  
                            
                            //Hero ud and right
                            else if(globals.getGraphic().heroX>y&&globals.getGraphic().heroY<x){
                                //System.out.println("El barril esta abajo y a la izquierda");
                                //System.out.println(globals.getGraphic().heroX+","+globals.getGraphic().heroY+"  "+y+","+x);
                                //Goes up
                                if(globals.getLogic().getMatrix()[x-1][y].ID==2){
                                    globals.getLogic().getMatrix()[x][y] = new Blank();
                                    globals.getLogic().getMatrix()[x-1][y] = new EnemyBarrel();
                                    globals.getGraphic().getMatrix()[y][x].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                                    globals.getGraphic().getMatrix()[y][x-1].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/barrel.png"));
                                }
                                //Goes rigth
                                else if(globals.getLogic().getMatrix()[x][y+1].ID==2){
                                    globals.getLogic().getMatrix()[x][y] = new Blank();
                                    globals.getLogic().getMatrix()[x][y+1] = new EnemyBarrel();
                                    globals.getGraphic().getMatrix()[y][x].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                                    globals.getGraphic().getMatrix()[y+1][x].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/barrel.png"));
                                }
                            }
                            //If hero on the same coloumn or row
                            if(globals.getGraphic().heroX==y&&globals.getGraphic().heroY<x){
                                if(globals.getLogic().getMatrix()[x-1][y].ID==4){
                                    globals.getGraphic().dispose();
                                    Graphic.End end = new End(2);
                                    end.setVisible(true);
                                    stopable=false;
                                }
                                else if(globals.getLogic().getMatrix()[x-1][y].ID==2){
                                    globals.getLogic().getMatrix()[x][y] = new Blank();
                                    globals.getLogic().getMatrix()[x-1][y] = new EnemyBarrel();
                                    globals.getGraphic().getMatrix()[y][x].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                                    globals.getGraphic().getMatrix()[y][x-1].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/barrel.png"));
                                }
                            }
                            else if(globals.getGraphic().heroX<y&&globals.getGraphic().heroY==x){
                                if(globals.getLogic().getMatrix()[x][y-1].ID==4){
                                    globals.getGraphic().dispose();
                                    Graphic.End end = new End(2);
                                    end.setVisible(true);
                                    stopable=false;
                                }
                                else if(globals.getLogic().getMatrix()[x][y-1].ID==2){
                                    globals.getLogic().getMatrix()[x][y] = new Blank();
                                    globals.getLogic().getMatrix()[x][y-1] = new EnemyBarrel();
                                    globals.getGraphic().getMatrix()[y][x].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                                    globals.getGraphic().getMatrix()[y-1][x].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/barrel.png"));
                                }
                            }
                            else if(globals.getGraphic().heroX==y&&globals.getGraphic().heroY>x){
                                if(globals.getLogic().getMatrix()[x+1][y].ID==4){
                                    globals.getGraphic().dispose();
                                    Graphic.End end = new End(2);
                                    end.setVisible(true);
                                    stopable=false;
                                }
                                else if(globals.getLogic().getMatrix()[x+1][y].ID==2){
                                    globals.getLogic().getMatrix()[x][y] = new Blank();
                                    globals.getLogic().getMatrix()[x+1][y] = new EnemyBarrel();
                                    globals.getGraphic().getMatrix()[y][x].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                                    globals.getGraphic().getMatrix()[y][x+1].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/barrel.png"));
                                }
                                
                            }
                            else if(globals.getGraphic().heroX>y&&globals.getGraphic().heroY==x){
                                if(globals.getLogic().getMatrix()[x][y+1].ID==4){
                                    globals.getGraphic().dispose();
                                    Graphic.End end = new End(2 );
                                    end.setVisible(true);
                                    stopable=false;
                                }
                                else if(globals.getLogic().getMatrix()[x][y+1].ID==2){
                                    globals.getLogic().getMatrix()[x][y] = new Blank();
                                    globals.getLogic().getMatrix()[x][y+1] = new EnemyBarrel();
                                    globals.getGraphic().getMatrix()[y][x].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/emptyBlock.png"));
                                    globals.getGraphic().getMatrix()[y+1][x].setIcon(setIcon(globals.getGraphic().itemSize,"/Images/barrel.png"));
                                }
                            }
      
                        }

                    }
                }
            }
        } 
        catch (InterruptedException e) {
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
