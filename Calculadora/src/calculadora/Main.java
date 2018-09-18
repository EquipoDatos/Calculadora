/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import calculadora.Validacion.*;
import calculadora.Calcula.*;
/**
 *
 * @author marcopalermo
 */
public class Main {
    
    public static void main(String[] args) {
        Validacion.testValida();
        Calcula.testCalcula();
    }
    
}
