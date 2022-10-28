/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio08;

/**
 *
 * @author UTPL
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int multiplicacion = 10 * 9;
        int val1 = 20;
        int division1 = 500/2;
        double potencia1 = Math.pow(3, 2);
        int val2 = 200;
        int val3 = 50;
        int val4 = 51;
        
        System.out.println( (multiplicacion + val1 - division1 + potencia1 >= val2) || (val3 >= val3 - val3 + val4) );
    }
    
}
