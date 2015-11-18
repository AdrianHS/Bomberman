/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

/**
 *
 * @author _ADRIAN_
 */
public class Factory implements InterfaceGame{

    @Override
    public Game createGame(int size, int block, int balloons, int barrels, int itemSize) {
        if(size ==15){
            Game game = new Game(size,block,balloons,barrels,itemSize);
            
        }
        else if(size ==21){
            Game game = new Game(size,block,balloons,barrels,itemSize);
            
        }
        else if(size ==25){
            Game game = new Game(size,block,balloons,barrels,itemSize);
            
        }
        return null;
    }
    
    
    
}
