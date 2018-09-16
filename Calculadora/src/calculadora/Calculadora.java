/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author alberto
 */


public class Calculadora {
    
    public static boolean esOperando(char e){
        boolean respuesta = false;
        if ((e>='0' && e<='9') || (e=='.')) {
            respuesta = true;
        }
        return respuesta;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola");
        System.out.println("");
        System.out.println("Soy Mar");
        System.out.println("Soy Alberto");
        System.out.println("Soy David");
        System.out.println("Soy pato");
    }
    
}
