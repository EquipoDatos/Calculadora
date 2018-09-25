/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alberto Jafif
 * @author Abraham Attie
 * @author David Ramos
 * @author Marco Palermo
 * @author Patricio Falcón
 */
public class CalculaTest {
    
    public CalculaTest() {
    }

    /**
     * Test of indicaPrioridad method, of class Calcula.
     */
    @Test
    public void testIndicaPrioridad() {
        System.out.println("indicaPrioridad");
        char c = '+';
        int expResult = 2;
        int result = Calcula.indicaPrioridad(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of convierteAArrayList method, of class Calcula.
     */
    @Test
    public void testConvierteAArrayList() {
        System.out.println("convierteAArrayList");
        String expresion = "1+2";
        ArrayList<Object> expResult = new ArrayList();
        expResult.add(1.0);expResult.add('+');expResult.add(2.0);
        ArrayList<Object> result = Calcula.convierteAArrayList(expresion);
        assertEquals(expResult, result);
    }

    /**
     * Test of traduccionAPostfija method, of class Calcula.
     */
    @Test
    public void testTraduccionAPostfija() {
        System.out.println("traduccionAPostfija");
        ArrayList<Object> array = new ArrayList();
        array.add(1.0);array.add('+');array.add(2.0);
        ArrayList<Object> expResult = new ArrayList();
        expResult.add(1.0);expResult.add(2.0);expResult.add('+');
        ArrayList<Object> result = Calcula.traduccionAPostfija(array);
        assertEquals(expResult, result);
    }

    /**
     * Test of traduccionAPilaA method, of class Calcula.
     */
    @Test
    public void testTraduccionAPilaA() {
        System.out.println("traduccionAPilaA");
        ArrayList<Object> arreglo = new ArrayList();
        arreglo.add(1.0);arreglo.add(2.0);arreglo.add('+');
        PilaA<Object> expResult = new PilaA();
        expResult.push('+');expResult.push(2.0);expResult.push(1.0);
        PilaA<Object> result = Calcula.traduccionAPilaA(arreglo);
        Assert.assertArrayEquals(expResult.getPila(), result.getPila());
    }

    /**
     * Test of calculaResultado method, of class Calcula.
     */
    @Test
    public void testCalculaResultado() {
        System.out.println("calculaResultado");
        PilaA<Object> pila = new PilaA();
        pila.push('+');pila.push(2.0);pila.push(1.0);
        double expResult = 3.0;
        double result = Calcula.calculaResultado(pila);
        assertEquals(expResult, result, 0.0);
    }
}
