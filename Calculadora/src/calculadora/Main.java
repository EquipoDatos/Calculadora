/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import static calculadora.Calcula.convierteAArrayList;
import java.util.ArrayList;

/**
 *
 * @author marcopalermo
 */
public class Main {
    
    public static void main(String[] args) {
        /*
        Validacion.testValida("(1+1.1)+1");
        Calcula.testCalcula("(1+1)*3");
*/
        String expresion = "(1+1)*3";
        ArrayList <Object> arreglo = new ArrayList();
        ArrayList <Object> postfija = new ArrayList();
        PilaA<Object> pila = new PilaA();
        arreglo=convierteAArrayList(expresion);
        postfija=traduccionAPostfija(arreglo);
        pila = traduccionAPilaA(postfija);
    
}
