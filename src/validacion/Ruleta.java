/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validacion;

/**
 *
 * @author Asus
 */
public class Ruleta {
    public void ruleta(int premios){
        Nodo primer = null;
        Nodo ultimo = null;
        for (int i = 1; i <= premios; i++) {
            Nodo temporal = new Nodo();
            temporal.numero = (int)(Math.random()*100);
            if(ultimo == null) {
                ultimo = temporal;
            }else{
                temporal.siguiente = primer;
            }
            primer = temporal;
            ultimo.siguiente = primer;
        }
        System.out.println("Premios....");
        Nodo imprimir;
        imprimir = primer;
        do {
            System.out.print(imprimir.numero+" $\t");
            imprimir = imprimir.siguiente;
        } while (!imprimir.equals(primer));
        System.out.println("");
        try{
            for (int i = 1; i <= 3; i++) {
                System.out.println("Sorteando");
                for (int j = 0; j < 4; j++) {
                    System.out.print("& ");
                    Thread.sleep(300);
                }
                System.out.println("");
            }
        }catch (InterruptedException ex) {}
        
        
//cambiando de top
        int a = ((int)(Math.random()*100)+10);
        for (int i = 0; i < a; i++) {
            primer = primer.siguiente;
        }
        System.out.println("NÚMERO GANADOR:  "+primer.numero+" $");
        imprimir = primer;
        do {
            System.out.print(imprimir.numero+" $\t");
            imprimir = imprimir.siguiente;
        } while (!imprimir.equals(primer));
        System.out.println("");
    }
}
class Nodo{
    int numero;
    Nodo siguiente;
}