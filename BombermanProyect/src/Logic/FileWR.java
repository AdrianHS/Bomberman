/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;




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
    public void crear(String name,String min,String seg, String l){
        File f;

        f = new File("Socores.txt");

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
            

        }catch(IOException e){System.out.println("Error: "+e.getMessage());};
    }
    
    
    
    public void leer(String name){
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
                
                //System.out.println(linea);
            }
            
            br.close();
            fr.close();
        } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
        }
        
    }
}
