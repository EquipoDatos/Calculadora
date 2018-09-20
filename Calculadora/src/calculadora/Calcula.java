/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.ArrayList;

/**
 *
 * @author alberto
 */
public class Calcula {
    public static ArrayList<Object> convierteAArrayList(String expresion){
       StringBuilder cadena = new StringBuilder();
       ArrayList<Object> resultado = new ArrayList();
       char c;
       for(int i=0; i<expresion.length(); i++){
           c=expresion.charAt(i);
           if(!(cadena.toString().isEmpty()) && !Validacion.esNumero(c)){
               resultado.add(Double.valueOf(cadena.toString()));
               cadena= new StringBuilder();
               resultado.add(c);
           }
           else if((cadena.toString().isEmpty()) && !Validacion.esNumero(c)){
               resultado.add(c);
               cadena= new StringBuilder();
           }
           else
               cadena.append(c);  
        }
       return resultado;
       }
    
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
    
        public static void testCalcula(String expresion) {
            System.out.println("\nTest Calcula:");
            String cadena;
            cadena = "";
            ArrayList<Object> array, postfija;
            array=convierteAArrayList(expresion);
            postfija=traduccionAPostfija(array);
            for(int i=0; i<postfija.size(); i++){
                cadena += postfija.get(i);
                cadena += " ";
            }
            System.out.println(expresion);
            System.out.println(cadena);
    } 
}
