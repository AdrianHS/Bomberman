/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

/**
 *
 * @author _ADRIAN_
 */
public class Globals {
    
    private MapCreator logic;
    private GraphicMatrix graphic;
    
    public static Globals instance;
    private JPanel  panel;
    private GridBagConstraints gbc;

    private int matrizSizeEasy;
    private int barrierBlockEasy;
    private int balloonsEasy;
    private int barrelsEasy;
    private int itemSizeEasy;
    private int itemsEasy;
    
    private int matrizSizeIntermediate;
    private int barrierBlockIntermediate;
    private int balloonsIntermediate;
    private int barrelsIntermediate;
    private int itemSizeIntermediate;
    private int itemsIntermediate;
    
    private int matrizSizeDifficult;
    private int barrierBlockDifficult;
    private int balloonsDifficult;
    private int barrelsDifficult;
    private int itemSizeDifficult; 
    private int itemsDifficult;
    
    
    private Globals() {
    }
    
    public static Globals getInstance(){
        if(instance == null){
            instance = new Globals();
            instance.gbc = new GridBagConstraints();
            instance.panel = new JPanel(); 
            
            instance.matrizSizeEasy = 15;
            instance.barrierBlockEasy = 35;
            instance.balloonsEasy = 6;
            instance.barrelsEasy = 3;
            instance.itemSizeEasy = 42;
            instance.itemsEasy = 3;
            
            instance.matrizSizeIntermediate = 21;
            instance.barrierBlockIntermediate = 75;
            instance.balloonsIntermediate = 10;
            instance.barrelsIntermediate =  8;
            instance.itemSizeIntermediate = 30;
            instance.itemsIntermediate = 2;
            
            instance.matrizSizeDifficult = 25;
            instance.barrierBlockDifficult = 120;
            instance.balloonsDifficult = 15;
            instance.barrelsDifficult = 12;
            instance.itemSizeDifficult = 25;
            instance.itemsDifficult = 1;
          
            instance.logic=null;
            instance.graphic=null;
       
        }
        return instance;
    }

    public MapCreator getLogic() {
        return instance.logic;
    }

    public void setLogic(MapCreator logic) {
        instance.logic = logic;
    }

    public GraphicMatrix getGraphic() {
        return instance.graphic;
    }

    public void setGraphic(GraphicMatrix graphic) {
        instance.graphic = graphic;
    }

 
    
    public JPanel getPanel() {
        return instance.panel;
    }

    public void setPanel(JPanel panel) {
        instance.panel = panel;
    }

    public GridBagConstraints getGbc() {
        return instance.gbc;
    }

    public void setGbc(GridBagConstraints gbc) {
        instance.gbc = gbc;
        instance.panel.setLayout(new GridBagLayout());
    }

    public int getMatrizSizeEasy() {
        return instance.matrizSizeEasy;
    }

    public void setMatrizSizeEasy(int matrizSizeEasy) {
        instance.matrizSizeEasy = matrizSizeEasy;
    }

    public int getBarrierBlockEasy() {
        return instance.barrierBlockEasy;
    }

    public void setBarrierBlockEasy(int barrierBlockEasy) {
        instance.barrierBlockEasy = barrierBlockEasy;
    }

    public int getBalloonsEasy() {
        return instance.balloonsEasy;
    }

    public void setBalloonsEasy(int balloonsEasy) {
        instance.balloonsEasy = balloonsEasy;
    }

    public int getBarrelsEasy() {
        return instance.barrelsEasy;
    }

    public void setBarrelsEasy(int barrelsEasy) {
        instance.barrelsEasy = barrelsEasy;
    }

    public int getItemSizeEasy() {
        return instance.itemSizeEasy;
    }

    public void setItemSizeEasy(int itemSizeEasy) {
        instance.itemSizeEasy = itemSizeEasy;
    }

    public int getMatrizSizeIntermediate() {
        return instance.matrizSizeIntermediate;
    }

    public void setMatrizSizeIntermediate(int matrizSizeIntermediate) {
        instance.matrizSizeIntermediate = matrizSizeIntermediate;
    }

    public int getBarrierBlockIntermediate() {
        return instance.barrierBlockIntermediate;
    }

    public void setBarrierBlockIntermediate(int barrierBlockIntermediate) {
        instance.barrierBlockIntermediate = barrierBlockIntermediate;
    }

    public int getBalloonsIntermediate() {
        return instance.balloonsIntermediate;
    }

    public void setBalloonsIntermediate(int balloonsIntermediate) {
        instance.balloonsIntermediate = balloonsIntermediate;
    }

    public int getBarrelsIntermediate() {
        return instance.barrelsIntermediate;
    }

    public void setBarrelsIntermediate(int barrelsIntermediate) {
        instance.barrelsIntermediate = barrelsIntermediate;
    }

    public int getItemSizeIntermediate() {
        return instance.itemSizeIntermediate;
    }

    public void setItemSizeIntermediate(int itemSizeIntermediate) {
        instance.itemSizeIntermediate = itemSizeIntermediate;
    }

    public int getMatrizSizeDifficult() {
        return instance.matrizSizeDifficult;
    }

    public void setMatrizSizeDifficult(int matrizSizeDifficult) {
        instance.matrizSizeDifficult = matrizSizeDifficult;
    }

    public int getBarrierBlockDifficult() {
        return instance.barrierBlockDifficult;
    }

    public void setBarrierBlockDifficult(int barrierBlockDifficult) {
        instance.barrierBlockDifficult = barrierBlockDifficult;
    }

    public int getBalloonsDifficult() {
        return instance.balloonsDifficult;
    }

    public void setBalloonsDifficult(int balloonsDifficult) {
        instance.balloonsDifficult = balloonsDifficult;
    }

    public int getBarrelsDifficult() {
        return instance.barrelsDifficult;
    }

    public void setBarrelsDifficult(int barrelsDifficult) {
        instance.barrelsDifficult = barrelsDifficult;
    }

    public int getItemSizeDifficult() {
        return instance.itemSizeDifficult;
    }

    public void setItemSizeDifficult(int itemSizeDifficult) {
        instance.itemSizeDifficult = itemSizeDifficult;
    }

    public int getItemsEasy() {
        return itemsEasy;
    }

    public void setItemsEasy(int itemsEasy) {
        this.itemsEasy = itemsEasy;
    }

    public int getItemsIntermediate() {
        return itemsIntermediate;
    }

    public void setItemsIntermediate(int itemsIntermediate) {
        this.itemsIntermediate = itemsIntermediate;
    }

    public int getItemsDifficult() {
        return itemsDifficult;
    }

    public void setItemsDifficult(int itemsDifficult) {
        this.itemsDifficult = itemsDifficult;
    }
    
  
}
