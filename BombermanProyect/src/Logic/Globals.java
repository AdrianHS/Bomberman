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
    public static Globals instance;
    private JPanel  panel;
    private GridBagConstraints gbc;

    private int matrizSizeEasy;
    private int barrierBlockEasy;
    private int balloonsEasy;
    private int barrelsEasy;
    private int itemSizeEasy;   
    
    private int matrizSizeIntermediate;
    private int barrierBlockIntermediate;
    private int balloonsIntermediate;
    private int barrelsIntermediate;
    private int itemSizeIntermediate; 
    
    private int matrizSizeDifficult;
    private int barrierBlockDifficult;
    private int balloonsDifficult;
    private int barrelsDifficult;
    private int itemSizeDifficult; 
    
    
    private Globals() {
    }
    
    public static Globals getInstance(){
        if(instance == null){
            instance = new Globals();
            instance.gbc = new GridBagConstraints();
            instance.panel = new JPanel(); 
            
            instance.matrizSizeEasy = 15;
            instance.barrierBlockEasy = 35;
            instance.balloonsEasy = 5;
            instance.barrelsEasy = 3;
            instance.itemSizeEasy = 42;
            
            instance.matrizSizeIntermediate = 21;
            instance.barrierBlockIntermediate = 75;
            instance.balloonsIntermediate = 8;
            instance.barrelsIntermediate =  5;
            instance.itemSizeIntermediate = 30;
            
            instance.matrizSizeDifficult = 25;
            instance.barrierBlockDifficult = 120;
            instance.balloonsDifficult = 12;
            instance.barrelsDifficult = 10;
            instance.itemSizeDifficult = 25;
                                            
       
        }
        return instance;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public GridBagConstraints getGbc() {
        return gbc;
    }

    public void setGbc(GridBagConstraints gbc) {
        this.gbc = gbc;
        this.panel.setLayout(new GridBagLayout());
    }

    public int getMatrizSizeEasy() {
        return matrizSizeEasy;
    }

    public void setMatrizSizeEasy(int matrizSizeEasy) {
        this.matrizSizeEasy = matrizSizeEasy;
    }

    public int getBarrierBlockEasy() {
        return barrierBlockEasy;
    }

    public void setBarrierBlockEasy(int barrierBlockEasy) {
        this.barrierBlockEasy = barrierBlockEasy;
    }

    public int getBalloonsEasy() {
        return balloonsEasy;
    }

    public void setBalloonsEasy(int balloonsEasy) {
        this.balloonsEasy = balloonsEasy;
    }

    public int getBarrelsEasy() {
        return barrelsEasy;
    }

    public void setBarrelsEasy(int barrelsEasy) {
        this.barrelsEasy = barrelsEasy;
    }

    public int getItemSizeEasy() {
        return itemSizeEasy;
    }

    public void setItemSizeEasy(int itemSizeEasy) {
        this.itemSizeEasy = itemSizeEasy;
    }

    public int getMatrizSizeIntermediate() {
        return matrizSizeIntermediate;
    }

    public void setMatrizSizeIntermediate(int matrizSizeIntermediate) {
        this.matrizSizeIntermediate = matrizSizeIntermediate;
    }

    public int getBarrierBlockIntermediate() {
        return barrierBlockIntermediate;
    }

    public void setBarrierBlockIntermediate(int barrierBlockIntermediate) {
        this.barrierBlockIntermediate = barrierBlockIntermediate;
    }

    public int getBalloonsIntermediate() {
        return balloonsIntermediate;
    }

    public void setBalloonsIntermediate(int balloonsIntermediate) {
        this.balloonsIntermediate = balloonsIntermediate;
    }

    public int getBarrelsIntermediate() {
        return barrelsIntermediate;
    }

    public void setBarrelsIntermediate(int barrelsIntermediate) {
        this.barrelsIntermediate = barrelsIntermediate;
    }

    public int getItemSizeIntermediate() {
        return itemSizeIntermediate;
    }

    public void setItemSizeIntermediate(int itemSizeIntermediate) {
        this.itemSizeIntermediate = itemSizeIntermediate;
    }

    public int getMatrizSizeDifficult() {
        return matrizSizeDifficult;
    }

    public void setMatrizSizeDifficult(int matrizSizeDifficult) {
        this.matrizSizeDifficult = matrizSizeDifficult;
    }

    public int getBarrierBlockDifficult() {
        return barrierBlockDifficult;
    }

    public void setBarrierBlockDifficult(int barrierBlockDifficult) {
        this.barrierBlockDifficult = barrierBlockDifficult;
    }

    public int getBalloonsDifficult() {
        return balloonsDifficult;
    }

    public void setBalloonsDifficult(int balloonsDifficult) {
        this.balloonsDifficult = balloonsDifficult;
    }

    public int getBarrelsDifficult() {
        return barrelsDifficult;
    }

    public void setBarrelsDifficult(int barrelsDifficult) {
        this.barrelsDifficult = barrelsDifficult;
    }

    public int getItemSizeDifficult() {
        return itemSizeDifficult;
    }

    public void setItemSizeDifficult(int itemSizeDifficult) {
        this.itemSizeDifficult = itemSizeDifficult;
    }
  
}
