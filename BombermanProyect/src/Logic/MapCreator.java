/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

/**
* Imported libraries
*/

import java.util.Random;

/**
 *
 * @author _ADRIAN_
 */
public class MapCreator {
    Hero hero = new Hero();
    Element [][] matrix;
    int size;
    int xDoor;
    int yDoor;
   
    public MapCreator() {
    }
    /**
    * Create the Logic Matrix
    */
    public void LogicMatrix(int size, int blocQ,int balloons,int barrels,int items){ 
        this.size=size;
        matrix = new Element[size][size];
        SolidBloc bloc = new SolidBloc();
        /**
        * Fill all in SolidBlocs
        */
        for (int x=0; x < size; x++) {
            for (int y=0; y < size; y++) {            
                
                matrix[x][y] = bloc;
                
                if(((x%2)!=0) ||((y%2)!=0)){
                    Blank blank = new Blank();
                    matrix[x][y]=blank;
                }
            }
        }
        /**
        * Put the Blanks
        */
        for(int x =0;x<size;x++){
            matrix[0][x]=bloc;
            matrix[size-1][x]=bloc;
            matrix[x][0]=bloc;
            matrix[x][size-1]=bloc;
        }
        /**
        * Space for boomberman
        */
        matrix[1][1].ID = -1;
        matrix[1][2].ID = -1;
        matrix[2][1].ID = -1;
        
        /**
        * Put the BarrierBlocs
        */
        int cantBuffs = items;
        boolean door = true;
        
        for(int cont = blocQ; cont != 0;){
            Random r1 = new Random();
            Random r2 = new Random();
            int q = r1.nextInt(size);
            int w = r2.nextInt(size);

            if(matrix[q][w].ID == 2 && matrix[q][w].ID != -1){
                BarrierBloc b = new BarrierBloc();
                matrix[q][w]= b;
                
                if(cantBuffs!=0){
                    b.ID=8;
                    cantBuffs--;
                }
                else if(door && cantBuffs==0){
                    b.ID=9;
                    door=false;
                    this.xDoor=q;
                    this.yDoor=w;
                }
                cont--; 
                }                   
        }
        
        /**
        * Put the balloons
        */
        for(int cont = balloons; cont != 0;){
            Random r1 = new Random();
            Random r2 = new Random();
            int q = r1.nextInt(size);
            int w = r2.nextInt(size);

            if(matrix[q][w].ID == 2 && matrix[q][w].ID != -1){
                
                matrix[q][w]= new EnemyBalloon();
                cont--; 
            }                    
        }
        /**
        * Put the barrels
        */
        for(int cont = barrels; cont != 0;){
            Random r1 = new Random();
            Random r2 = new Random();
            int q = r1.nextInt(size);
            int w = r2.nextInt(size);

            if(matrix[q][w].ID == 2 && matrix[q][w].ID != -1){
                
                matrix[q][w]= new EnemyBarrel();
                cont--; 
            
                }                   
        }

        matrix[1][1].ID = 2;
        matrix[1][2].ID = 2;
        matrix[2][1].ID = 2;
        
        /**
        * Hero on his place
        */
        matrix[1][1] = hero;
        
        printAll();
        
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
    /**
    *Set and Get class
    */
    public Element[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(Element[][] matrix) {
        this.matrix = matrix;
    }

    public Hero getHero() {
        return hero;
    }

    public void printAll(){
        /**
        *Print in console
        */        
        for(int x =0;x<size;x++){
            for(int y =0;y<size;y++){
                if (matrix[x][y].ID==1){
                    System.out.print("▓");          
                }
                else if(matrix[x][y].ID==2){ //|| matrix[x][y].ID==-1
                    System.out.print("░");
                }
                else if(matrix[x][y].ID==3 ){
                    System.out.print("▒");
                }              
                else if (matrix[x][y].ID==4 ){
                    System.out.print("♂");
                }
                else if (matrix[x][y].ID==5 ){
                    System.out.print("○");
                }
                else if (matrix[x][y].ID==6 ){
                    System.out.print("♀");
                }
                else if (matrix[x][y].ID==7 ){
                    System.out.print("┼");
                }
                else if (matrix[x][y].ID==8 ){
                    System.out.print("┼");
                }
                else if (matrix[x][y].ID==9 ){
                    System.out.print("┼");
                }
            }       
            System.out.println("\n");

        }
    }
        
}
