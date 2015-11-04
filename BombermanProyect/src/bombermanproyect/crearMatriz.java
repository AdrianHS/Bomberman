/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bombermanproyect;

/**
 *
 * @author _ADRIAN_
 */
public class crearMatriz {
    
    private int x;
    private int y;
    int matriz[][] = new int[21][21];

    public crearMatriz() {
    }
    
    public void matriz(){
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                System.out.println (matriz[x][y]);
                
                Element element = new Element(x,y);
 
            }
        }
    
    }    
        
}
