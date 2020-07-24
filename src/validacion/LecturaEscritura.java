/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Asus
 */
public class LecturaEscritura {
     public File archivo;
    
    public LecturaEscritura(String file){
        archivo=new File(file);
    }
    
    public String leerArchivo(){
        BufferedReader br=null;
        String lec="";
        try{
            br= new BufferedReader(new FileReader(archivo));
            String read="";
            while((read=br.readLine()) != null){
                lec=lec+read+"\n";
            }
        }catch(IOException ex){
            System.err.println(ex.getMessage());
        }
        return lec;
    }
    
    public void escribirArchivo(String cadena){
        BufferedWriter archescr= null;
        PrintWriter escribir=null;
        try{
            archescr = new BufferedWriter(new FileWriter(archivo));
            escribir= new PrintWriter(archescr);
            escribir.write(cadena);
            archescr.close();
            escribir.close();
        }catch(IOException ex){
            System.err.println(ex.getMessage());
        }
    }
}
