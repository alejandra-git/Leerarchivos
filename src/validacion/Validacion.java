/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacion;

import java.util.Scanner;
import javax.swing.JOptionPane;
import static validacion.SoloLetras.esSoloLetras;

/**
 *
 * @author Usuario
 */
public class Validacion {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        // TODO code application logic here

        LecturaEscritura les = new LecturaEscritura("Prueba.txt");

        les.escribirArchivo("hola");

        String cadena = les.leerArchivo();
        cadena= cadena.replace("\n", "");
        
        int numero= cadena.length();

        while (!cadena.isEmpty()) {
            if (esSoloLetras(cadena)) {
                JOptionPane.showMessageDialog(null, "dfjvnrfivjnrfvijnrvr");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "La cadena tiene caracteres que NO son letras");
                break;
            }
        }
      
        Ruleta r= new Ruleta();
        r.ruleta(numero);

        System.out.println("\n\t\tFIN DE PROGRAMA");
    }
}
