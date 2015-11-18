package Logic;

import Graphic.Principal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Ultima modificacion: 3/11/15  ---  21:54


/**
 *
 * @author _ADRIAN_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        /*
        MapCreator logicMap = new MapCreator();
        logicMap.LogicMatrix(25,175);
         
        GraphicMatrix b = new GraphicMatrix(logicMap.getMatrix(),25);
        b.setSize(648, 667);
        b.setLocationRelativeTo(null);
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.setVisible(true);

        */
        /*
        Keylist keylis = new Keylist();
        keylis.setVisible(true);
        */
        
        //Easy 15,35,5,3,42
        //Medium 21,75,8,5,30
        //Hard 25,120,12,10,25
        
        //Game game = new Game(21,75,8,5,30);
        
        //game.setVisible(true);
        //Sound s = new Sound();
        //s.player.play();
        
        
        Graphic.Principal p = new Principal();
        p.setVisible(true);
        
        System.out.println("Hoooola");  
    }
    
}
