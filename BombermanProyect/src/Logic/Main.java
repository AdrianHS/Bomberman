/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Ultima modificacion: 3/11/15  ---  21:54

package Logic;

import javax.swing.JFrame;

/**
 *
 * @author _ADRIAN_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        matrizGraficaMedia b = new matrizGraficaMedia();
        b.setSize(648, 667);
        b.setLocationRelativeTo(null);
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.setVisible(true);
    }
    
}
