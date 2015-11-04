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
public class MapCreator {
    
    private int x;
    private int y;
    Element [][] matrix;

    public MapCreator() {
    }
    SolidBloc bloc = new SolidBloc();
    Blank blank = new Blank();
    
    public void LogicMatrix(int size){ 
        matrix = new Element[size][size];
        for (int x=0; x < size; x++) {
            for (int y=0; y < size; y++) {
                //System.out.println (matriz[x][y]);             
                
                matrix[x][y] = bloc;
                
                if(((x%2)!=0) ||((y%2)!=0)){

                    matrix[x][y]=blank;
                }
            }
            
            
        }
        for(int x =0;x<size;x++){
            matrix[0][x]=bloc;
            matrix[size-1][x]=bloc;
            matrix[x][0]=bloc;
            matrix[x][size-1]=bloc;
        }
        
        for(int x =0;x<size;x++){
            for(int y =0;y<size;y++){
                if (matrix[x][y].ID==1){
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
