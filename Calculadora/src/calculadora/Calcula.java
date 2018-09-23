/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.ArrayList;
/**
 * <pre>
 * Clase Calcula:
 *  Contiene todos los métodos que realiza la calculadora para obtener un resultado.
 * 
 *
 * @author Alberto Jafif
 * @author Abraham Attie
 * @author David Ramos
 * @author Marco Palermo
 * @author Patricio Falcón
 * 
 * </pre>
 */

public class Calcula {
    
    /**
     * <pre>
     *
     * Indica la jerarquía de un operador
     * Da cierta jerarquia a los operadores para poder comparar entre ellos al realizar la traducción a postfija
     * </pre>
     * @param c recibe un operador 
     * @return int <ul>
     *  <li> 1: si es ( </li>
     *  <li> 2: si es + ó - </li>
     *  <li> 3: si es * ó /</li>
     * </ul>
     * 
     */
    public static int indicaPrioridad(char c){
        int resp=0;
    
        switch(c){
            case '(': 
                resp=1;
                break;
            case '+': 
                resp=2;
                break;
            case '-': 
                resp=2;
                break;
            case '*': 
                resp=3;
                break;
            case '/': 
                resp=3;
                break;    
        }
        return resp;
    }
    /**
     * <pre>
     * Convierte la expresión de String que el usuario escribe en la calculadora a un ArrayList con los elementos de la operación utilizando StringBuilder
     * Se creo para ordenar la cadena y trabajarla de una manera más sencilla
     * @param expresion  La cadena de Operandos, Operadores y puntos que el usuario escribe en la calculadora
     * @return un ArrayList en la cual en cada casilla contiene un numero double, un operador o paréntesis
     * </pre>
     */
    public static ArrayList<Object> convierteAArrayList(String expresion){
       StringBuilder cadena = new StringBuilder();
       ArrayList<Object> resultado = new ArrayList();
       char c;
       for(int i=0; i<expresion.length(); i++){
           c=expresion.charAt(i);
           if(!(cadena.toString().isEmpty()) && !Valida.esNumero(c)){
               resultado.add(Double.valueOf(cadena.toString()));
               resultado.add(c);
               cadena= new StringBuilder();
           }
           else if((cadena.toString().isEmpty()) && !Valida.esNumero(c)){
               resultado.add(c);
           }
           else
               cadena.append(c);
        }
       if(!(cadena.toString().isEmpty()))
            resultado.add(Double.valueOf(cadena.toString()));
       return resultado;
       }
    
    /**
     * <pre>
     * Convierte de notación infija a postfija
     * @param array recibe el ArrayList del metodo convierteAArrayList
     * @return Regresa un ArrayList con los mismos elementos pero en orden de notación postfija
     * @see convierteAArrayList 
     * @see indicaPrioridad
     * </pre>
     */
    public static ArrayList<Object> traduccionAPostfija(ArrayList<Object> array){
        ArrayList<Object> resultado = new ArrayList();
        PilaA<Character> pila= new PilaA();
        int i=0;
        Object obj;
        while(i<array.size()){
            obj = array.get(i);
            if(obj instanceof Double)
                resultado.add(obj);
            else{
            if(obj.equals('('))
                pila.push((char)obj);
            else if(obj.equals(')')){
                while(!pila.isEmpty() && !pila.peek().equals('('))
                    resultado.add(pila.pop());
                pila.pop();
            }
            else{
                while(!pila.isEmpty() && indicaPrioridad((char)obj)<=indicaPrioridad((char)pila.peek()))
                    resultado.add(pila.pop());
                pila.push((char)obj);
            }    
            }
            i++;
         }
        while(!pila.isEmpty())
            resultado.add(pila.pop());
        return resultado;
    }
    
    /**
     * <pre>
     * Inserta un ArrayList a una pila, con el útimo elemento del ArrayList como el primero en la pila
     * @param arreglo recibe el ArrayList del metodo traduccionAPostfija
     * @return Regresa una pila con los elementos
     * @see traduccionAPostfija
     * </pre>
     */
    public static PilaA<Object> traduccionAPilaA(ArrayList<Object> arreglo){
        PilaA<Object> resultado = new PilaA();
        for(int i=arreglo.size()-1; i>=0; i--){
            resultado.push(arreglo.get(i));
        }
        
        return resultado;
    }
    
    /**
     * <pre>
     * Calcula el resultado de la operación utilizando una pila auxiliar
     * @param pila La pila con la expresión en postfija
     * @return Regresa el resultado de la operación en double
     * </pre>
     */
    public static double calculaResultado(PilaA<Object> pila){
        
        double primerNumero=0, segundoNumero=0, resultado=0;
        Object obj;
        PilaA<Object> aux= new PilaA();
        while(!(pila.isEmpty())){
            obj=pila.pop();
            if (obj instanceof Double){
                aux.push(obj);
                resultado=(double)obj;
            }
            else if(obj instanceof Character){
                segundoNumero = (double)aux.pop();
                primerNumero = (double)aux.pop();
                switch ((char)obj){
                    case '+':
                        resultado = primerNumero+segundoNumero;
                        break;
                    case '-':
                        resultado = primerNumero-segundoNumero;
                        break;
                    case '*':
                        resultado = primerNumero*segundoNumero;
                        break;
                    case '/':
                        if (segundoNumero == 0) {
                            System.out.println("DIVISION BY ZERO!!");
                            throw new ArithmeticException("No se puede divider por zero!!");}
                        resultado = primerNumero/segundoNumero;
                        break;
            }
                aux.push(resultado);
            }
        }
        return resultado;
    }
    /* Utilizado para pruebas
    public static void testConvierteAArrayList(String expresion){
        ArrayList <Object> arreglo;
        arreglo = convierteAArrayList(expresion);
        System.out.println("\ntestconvierteAArrayList");
        System.out.println("expresion: "+expresion);
        for(int i=0; i<arreglo.size(); i++)
           System.out.println(arreglo.get(i));
    }    
    
    public static void testTraduccionAPostfija(String expresion){
        ArrayList <Object> postfija;
        postfija=traduccionAPostfija(convierteAArrayList(expresion));
        System.out.println("\ntestTraduccionAPostfija");
        System.out.println("expresion: "+expresion);
        for(int i=0; i<postfija.size(); i++)
            System.out.println(postfija.get(i));
    }
    
    public static void testTraduccionAPilaA(String expresion){
        PilaA<Object> pila;
        pila = traduccionAPilaA(traduccionAPostfija(convierteAArrayList(expresion)));
        int n=pila.getTope();
        System.out.println("\ntestTraduccionAPilaA");
        System.out.println("expresion: "+expresion);
        for(int i=0; i<=n; i++)
            System.out.println(pila.pop());
    }
    
    public static void testCalculaResultado(String expresion){
        PilaA<Object> pila;
        pila = traduccionAPilaA(traduccionAPostfija(convierteAArrayList(expresion)));
        int n=pila.getTope();
        System.out.println("\ntestCalcula");
        System.out.println("expresion: "+expresion);
        System.out.println(calculaResultado(pila));
    }
    
    public static void testCalcula(String expresion){
        testConvierteAArrayList(expresion);
        testTraduccionAPostfija(expresion);
        testTraduccionAPilaA(expresion);
        testCalculaResultado(expresion);
    }*/
}


    


