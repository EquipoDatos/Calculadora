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
    
    public static ArrayList<Object> convierteAArrayList(String expresion){
       StringBuilder cadena = new StringBuilder();
       ArrayList<Object> resultado = new ArrayList();
       char c;
       for(int i=0; i<expresion.length(); i++){
           c=expresion.charAt(i);
           if(!(cadena.toString().isEmpty()) && !Validacion.esNumero(c)){
               resultado.add(Double.valueOf(cadena.toString()));
               resultado.add(c);
               cadena= new StringBuilder();
           }
           else if((cadena.toString().isEmpty()) && !Validacion.esNumero(c)){
               resultado.add(c);
           }
           else
               cadena.append(c);
        }
       if(!(cadena.toString().isEmpty()))
            resultado.add(Double.valueOf(cadena.toString()));
       return resultado;
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
    
    public static PilaA<Object> traduccionAPilaA(ArrayList<Object> arreglo){
        PilaA<Object> resultado = new PilaA();
        for(int i=arreglo.size()-1; i>=0; i--){
            resultado.push(arreglo.get(i));
        }
        
        return resultado;
    }
    
    /*public static PilaA<Object> inviertePila()*/
    
    public static double calcula(PilaA<Object> pila){
        
        double resultado=0;
        char operador;
        Object obj;
        PilaA<Object> aux= new PilaA();
        while(!(pila.isEmpty())){
            obj=pila.pop();
            if (obj instanceof Double){
                aux.push(obj);
            }
            else if(obj instanceof Character){
                switch ((char)obj){
                    case '+':
                        resultado=(double)aux.pop()+(double)aux.pop();
                        break;
                    case '-':
                        resultado=(double)aux.pop()-(double)aux.pop();
                        break;
                    case '*':
                        resultado=(double)aux.pop()*(double)aux.pop();
                        break;
                    default:
                        resultado=(double)aux.pop()/(double)aux.pop();
                        break;
            }
                aux.push(resultado);
            }
        }
        return resultado;
    }
    
    
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
    
    public static void testCalcula(String expresion){
        PilaA<Object> pila;
        pila = traduccionAPilaA(traduccionAPostfija(convierteAArrayList(expresion)));
        int n=pila.getTope();
        System.out.println("\ntestCalcula");
        System.out.println("expresion: "+expresion);
        System.out.println(calcula(pila));
    }
    


