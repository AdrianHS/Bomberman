/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;


/**
* Imported libraries
*/

import static Graphic.End.jTextArea1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author _ADRIAN_
 */
public class FileWR {
    Globals globals = Globals.getInstance();
    /**
    *Method to write files
    */
    public void createFile(String name,String min,String seg, String l){
        File f;
        if(globals.getLogic().getMatrix().length==15){
            f = new File("SocoresEasy.txt");

            FileWriter escribir;
            BufferedWriter bw;
            PrintWriter wr;

            try{
                if(f.exists()) {
                    bw = new BufferedWriter(new FileWriter(f, true));//el true es para que no pise el archivo
                    bw.write(name+" "+min+":"+seg+l);
                    bw.close();
                }else {
                    bw = new BufferedWriter(new FileWriter(f));
                    bw.write(name+" "+min+":"+seg+l);
                    bw.close();
                }    
            }catch(IOException e){System.out.println("ErrorE: "+e.getMessage());};
        
        }
        else if(globals.getLogic().getMatrix().length==21){
            f = new File("SocoresMedium.txt");

            FileWriter escribir;
            BufferedWriter bw;
            PrintWriter wr;

            try{
                if(f.exists()) {
                    bw = new BufferedWriter(new FileWriter(f, true));//el true es para que no pise el archivo
                    bw.write(name+" "+min+":"+seg+l);
                    bw.close();
                }else {
                    bw = new BufferedWriter(new FileWriter(f));
                    bw.write(name+" "+min+":"+seg+l);
                    bw.close();
                }    
            }catch(IOException e){System.out.println("ErrorM: "+e.getMessage());};
        
        }
        else if(globals.getLogic().getMatrix().length==25){
            f = new File("SocoresDifficul.txt");

            FileWriter escribir;
            BufferedWriter bw;
            PrintWriter wr;

            try{
                if(f.exists()) {
                    bw = new BufferedWriter(new FileWriter(f, true));//el true es para que no pise el archivo
                    bw.write(name+" "+min+":"+seg+l);
                    bw.close();
                }else {
                    bw = new BufferedWriter(new FileWriter(f));
                    bw.write(name+" "+min+":"+seg+l);
                    bw.close();
                }    
            }catch(IOException e){System.out.println("ErrorD: "+e.getMessage());};
        
        }
    }
    /**
    *Method to read files
    */
    public void readFile(String name){
        File archivos;
        FileReader fr;
        BufferedReader br;
        try {
            archivos = new File(name);
            fr =new FileReader(archivos);
            br = new BufferedReader(fr);
            String linea;
            while((linea=br.readLine())!=null){
                jTextArea1.append(linea+ "\n");
                
            }
            
            br.close();
            fr.close();
        } catch (Exception ex2) {
            System.out.println(ex2.getMessage());
        }
        
        
    }
}
