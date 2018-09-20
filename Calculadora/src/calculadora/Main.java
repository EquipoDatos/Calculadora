/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import static calculadora.Calcula.*;

/**
 *
 * @author marcopalermo
 */
public class Main {
    
    public static void main(String[] args) {
        /*
        Validacion.testValida("(1+1.1)+1");
        */
        String expresion="(1+2)+1";
        testConvierteAArrayList(expresion);
        testTraduccionAPostfija(expresion);
        testTraduccionAPilaA(expresion);
        testCalcula(expresion);
        }
}
