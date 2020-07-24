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
    
		Scanner teclado = new Scanner(System.in);
 
		String cadena = " ";
 
		while (!cadena.isEmpty())
		{
			System.out.print("Introduzca cadena a comprobar (Cadena vacia = FIN): ");
			cadena = teclado.nextLine();
			if (esSoloLetras(cadena))
				System.out.println("La cadena SOLO contiene letras\n");
			else
				System.out.println("La cadena tiene caracteres que NO son letras\n");
		}
 
		System.out.println("\n\t\tFIN DE PROGRAMA");
		teclado.close();
 
	}
    
    
}
