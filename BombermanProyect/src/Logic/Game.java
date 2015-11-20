/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
* Imported libraries
*/

import javax.swing.ImageIcon;
import javax.swing.JFrame;




/**
 *
 * @author AndrewJ
 */

public class Game {
    /**
    *Initializing variables
    */
    private MapCreator logicMap;
    private GraphicMatrix graphicMap;       
    Globals globals = Globals.getInstance();
    
    /**
    *initializing logic Map and graphic Map
    */
    public Game(int size, int block, int balloons, int barrels, int itemSize,int items) {

        logicMap = new MapCreator();
        logicMap.LogicMatrix(size,block,balloons,barrels,items);
        
        graphicMap = new GraphicMatrix(logicMap,size,itemSize); 
        graphicMap.setSize(648, 667);
        graphicMap.setLocationRelativeTo(null);
        graphicMap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        graphicMap.setVisible(true);
        graphicMap.setTitle("BOMBERMAN");
        graphicMap.setIconImage(new ImageIcon(getClass().getResource("/Images/Hero2.png")).getImage());
        
        globals.setLogic(logicMap);
        globals.setGraphic(graphicMap);
        
    }
    
    /**
    *Create the set and get
    */
    public MapCreator getLogicMap() {
        return logicMap;
    }

    public void setLogicMap(MapCreator logicMap) {
        this.logicMap = logicMap;
    }

    public GraphicMatrix getGraphicMap() {
        return graphicMap;
    }

    public void setGraphicMap(GraphicMatrix graphicMap) {
        this.graphicMap = graphicMap;
    }
     
    
}
