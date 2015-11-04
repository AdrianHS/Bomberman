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
public class crearMatriz {
    
    private int x;
    private int y;
    int matriz[][] = new int[15][15];
    Element [][] matri = new Element[25][25];

    public crearMatriz() {
    }
    bloque bloc = new bloque(1, 1);
    espacioVacio espV = new espacioVacio(1, 2);
    
    public void matriz(){
        for (int x=0; x < 25; x++) {
            for (int y=0; y < 25; y++) {
                //System.out.println (matriz[x][y]);
                
                
                matri[x][y] = bloc;
                
                if(((x%2)!=0) ||((y%2)!=0)){

                    matri[x][y]=espV;
                }
            }
            
            
        }
        for(int x =0;x<matri.length;x++){
            matri[0][x]=bloc;
            matri[24][x]=bloc;
            matri[x][0]=bloc;
            matri[x][24]=bloc;
        }
        
        for(int x =0;x<25;x++){
            for(int y =0;y<25;y++){
                if (matri[x][y].ID==1){
                    System.out.print("▓");
                    
                }
                else{
                    System.out.print("░");
                }
                
            }
            
            System.out.println("\n");
            
            
        }
        
        
    }   
    
        
}
