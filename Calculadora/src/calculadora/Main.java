/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author marcopalermo
 */
public class Main {
    
    public static void main(String[] args) {
        Validacion.testValida("1+1");
        Calcula.testCalcula("((4.2+7)-8)+(7*2)");
    }
}
