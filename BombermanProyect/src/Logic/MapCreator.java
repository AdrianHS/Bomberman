/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

import java.util.Random;

/**
 *
 * @author _ADRIAN_
 */
public class MapCreator {
    
    Element [][] matrix;

    public MapCreator() {
    }
    
   
    
    public void LogicMatrix(int size, int blocQ){ 
        matrix = new Element[size][size];
        SolidBloc bloc = new SolidBloc();
        //Fill all in SolidBlocs
        for (int x=0; x < size; x++) {
            for (int y=0; y < size; y++) {
                //System.out.println (matriz[x][y]);             
                
                matrix[x][y] = bloc;
                
                if(((x%2)!=0) ||((y%2)!=0)){
                    Blank blank = new Blank();
                    matrix[x][y]=blank;
                }
            }
            
            
        }
        //Put the Blanks
        for(int x =0;x<size;x++){
            matrix[0][x]=bloc;
            matrix[size-1][x]=bloc;
            matrix[x][0]=bloc;
            matrix[x][size-1]=bloc;
        }
        
        //Space for boomberman
        matrix[1][1].ID = -1;
        matrix[1][2].ID = -1;
        matrix[2][1].ID = -1;
        
        //Put the BarrierBlocs
        for(int cont = blocQ; cont != 0;){
            Random r1 = new Random();
            Random r2 = new Random();
            int q = r1.nextInt(size);
            int w = r2.nextInt(size);
            System.out.println(q+" "+w);
            
            
            if(matrix[q][w].ID == 2 && matrix[q][w].ID != -1){
                
                matrix[q][w]= new BarrierBloc();
                cont--; 
            
                }                   
            
        }
   
        //Print all
        for(int x =0;x<size;x++){
            for(int y =0;y<size;y++){
                if (matrix[x][y].ID==1){
                    System.out.print("▓");          
                }
                else if(matrix[x][y].ID==2 || matrix[x][y].ID==-1){
                    System.out.print("░");
                }
                else{
                    System.out.print("▒");
                }              
            }       
            System.out.println("\n");
            
            
        }
        int asd = 0;
        for (int x=0; x < size; x++) {
            for (int y=0; y < size; y++) {
                           
                if (matrix[x][y].ID==3){
                    asd++;
   
                }
            }
            
            
        }
        System.out.println(asd);
        
    }   

    public Element[][] getMatrix() {
        return matrix;
    }
    
    
    
        
}
