/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacion;

import java.util.Scanner;
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
                System.out.println("La cadena SOLO contiene letras\n");
                break;
            } else {
                System.out.println("La cadena tiene caracteres que NO son letras\n");
                break;
            }
        }

        System.out.println("\n\t\tFIN DE PROGRAMA");
    }
}
