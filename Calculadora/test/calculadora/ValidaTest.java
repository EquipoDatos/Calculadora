/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcopalermo
 */
public class ValidaTest {
    
    public ValidaTest() {
    }

    /**
     * Test of esNumero method, of class Valida.
     */
    @Test
    public void testEsNumero() {
        System.out.println("esNumero");
        char e = '1';
        boolean expResult = true;
        boolean result = Valida.esNumero(e);
        assertEquals(expResult, result);
    }

    /**
     * Test of esOperador method, of class Valida.
     */
    @Test
    public void testEsOperador() {
        System.out.println("esOperador");
        char e = '+', f = '-', g = '*', h = '/';
        boolean expResult = true;
        boolean result = Valida.esOperador(e) && Valida.esOperador(f) && Valida.esOperador(g) && Valida.esOperador(h);
        assertEquals(expResult, result);
    }

    /**
     * Test of esParentesis method, of class Valida.
     */
    @Test
    public void testEsParentesis() {
        System.out.println("esParentesis");
        char e = '(';
        boolean expResult = true;
        boolean result = Valida.esParentesis(e);
        assertEquals(expResult, result);
    }

    /**
     * Test of esNegativo method, of class Valida.
     */
    @Test
    public void testEsNegativo() {
        System.out.println("esNegativo");
        char e = '~';
        boolean expResult = true;
        boolean result = Valida.esNegativo(e);
        assertEquals(expResult, result);
    }

    /**
     * Test of ordenParentesis method, of class Valida.
     */
    @Test
    public void testOrdenParentesis() {
        System.out.println("ordenParentesis");
        boolean expResult = false;
        boolean result = Valida.ordenParentesis(")1+2(") || Valida.ordenParentesis("((1+2)") || Valida.ordenParentesis("(1+2))");
        assertEquals(expResult, result);
    }

    /**
     * Test of fixNegativo method, of class Valida.
     */
    @Test
    public void testFixNegativo() {
        System.out.println("fixNegativo");
        String expresion = "~1-1";
        String expResult = "0-1-1";
        String result = Valida.fixNegativo(expresion);
        assertEquals(expResult, result);
    }

    /**
     * Test of noColindaParentesis method, of class Valida.
     */
    @Test
    public void testNoColindaParentesis() {
        System.out.println("noColindaParentesis");
        boolean expResult = false;
        boolean result = Valida.noColindaParentesis("1+2+()") || Valida.noColindaParentesis("(1+2)(1+2)") || Valida.noColindaParentesis("(1+2(1+2))") || Valida.noColindaParentesis("((1+2)1+2)");
        assertEquals(expResult, result);
    }

    /**
     * Test of validaParentesis method, of class Valida.
     */
    @Test
    public void testValidaParentesis() {
        System.out.println("validaParentesis");
        boolean expResult = true;
        boolean result = Valida.validaParentesis("(5-(2*2))");
        assertEquals(expResult, result);
    }

    /**
     * Test of noColindaOperadoresParentesis method, of class Valida.
     */
    @Test
    public void testNoColindaOperadoresParentesis() {
        System.out.println("noColindaOperadoresParentesis");
        boolean expResult = false;
        boolean result = Valida.noColindaOperadoresParentesis("1++2") || Valida.noColindaOperadoresParentesis("(+1+2)") || Valida.noColindaOperadoresParentesis("(1+2+)");
        assertEquals(expResult, result);
    }

    /**
     * Test of noOperadorPrincipioFinal method, of class Valida.
     */
    @Test
    public void testNoOperadorPrincipioFinal() {
        System.out.println("noOperadorPrincipioFinal");
        String expresion = "";
        boolean expResult = false;
        boolean result = Valida.noOperadorPrincipioFinal("+1+2") || Valida.noOperadorPrincipioFinal("1+2+");
        assertEquals(expResult, result);
    }

    /**
     * Test of validaOperadores method, of class Valida.
     */
    @Test
    public void testValidaOperadores() {
        System.out.println("validaOperadores");
        String expresion = "1+2*4/2";
        boolean expResult = true;
        boolean result = Valida.validaOperadores(expresion);
        assertEquals(expResult, result);
    }

    /**
     * Test of unPuntoPorNumero method, of class Valida.
     */
    @Test
    public void testUnPuntoPorNumero() {
        System.out.println("unPuntoPorNumero");
        boolean expResult = false;
        boolean result = Valida.unPuntoPorNumero(".1.2") || Valida.unPuntoPorNumero("1+2..") || Valida.unPuntoPorNumero("1+..2");
        assertEquals(expResult, result);
    }

    /**
     * Test of noPuntoEntreOperadoresParentesis method, of class Valida.
     */
    @Test
    public void testNoPuntoEntreOperadoresParentesis() {
        System.out.println("noPuntoEntreOperadoresParentesis");
        boolean expResult = false;
        boolean result = Valida.noPuntoEntreOperadoresParentesis("1+.+2") || Valida.noPuntoEntreOperadoresParentesis("1+2+(.)");
        assertEquals(expResult, result);
    }

    /**
     * Test of validaNegativo method, of class Valida.
     */
    @Test
    public void testValidaNegativo() {
        System.out.println("validaNegativo");
        String expresion = "~1+3";
        boolean expResult = false;
        boolean result = Valida.validaNegativo(expresion);
        assertEquals(expResult, result);
    }

    /**
     * Test of validaDecimales method, of class Valida.
     */
    @Test
    public void testValidaDecimales() {
        System.out.println("validaDecimales");
        String expresion = "(1.2+2)*1.2";
        boolean expResult = true;
        boolean result = Valida.validaDecimales(expresion);
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class Valida.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        String expresion = "~2.4*(1.2+4/2)";
        boolean expResult = true;
        boolean result = Valida.valida(expresion);
        assertEquals(expResult, result);
    }
    
}
