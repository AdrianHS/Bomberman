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
    private int num1;
    private int num2;
    private int num3;
    

    public Globals() {
    }
    
    public static Globals getInstance(){
        if(instance == null){
            instance = new Globals();
            instance.gbc = new GridBagConstraints();
            instance.panel = new JPanel();  
            instance.num1 = 35;
            instance.num2 = 25;
            instance.num3 = 20;
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

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    
    
}
