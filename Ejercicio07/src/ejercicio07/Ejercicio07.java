/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07;

/**
 *
 * @author UTPL
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double raiz1 = Math.sqrt(81);
        double raiz2 = Math.sqrt(100);
        
        int operacion1 = 100/25;
        boolean comparacion1 = ((raiz1 + 9)/3)==9;
        boolean comparacion2 = 10 >1;
        
        System.out.println( (comparacion1) || (comparacion2) && (operacion1 > raiz2)); //Se cambia el + ed la última operación por un mayor que.
    }
    
}
