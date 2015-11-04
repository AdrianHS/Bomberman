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
    

    public Globals() {
    }
    
    public static Globals getInstance(){
        if(instance == null){
            instance = new Globals();
            instance.gbc = new GridBagConstraints();
            instance.panel = new JPanel();  
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

    
    
}
