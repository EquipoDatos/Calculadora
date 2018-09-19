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
       int index = 0;
       char b;
       ArrayList<Object> resultado = new ArrayList();
       for(int i=0; i<expresion.length(); i++){
           b=expresion.charAt(i);
           if(!(cadena.toString().isEmpty()) && !Validacion.esNumero(b)){
               resultado.add(Double.valueOf(cadena.toString()));
               cadena= new StringBuilder();
               resultado.add(b);
           }
           else if((cadena.toString().isEmpty()) && !Validacion.esNumero(b)){
               resultado.add(b);
               cadena= new StringBuilder();
           }
           else
               cadena.append(b);  
        }
       return resultado;
       }
    
    public static int indicaPrioridad(char a){
        int resp=0;
    
        switch(a){
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
    public static ArrayList<Object> traduccionAPostfija(ArrayList<Object> a){
        ArrayList<Object> resultado = new ArrayList();
        PilaA<Character> pila= new PilaA();
        int i=0;
        Object obj;
        while(i<a.size()){
            obj = a.get(i);
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
    
        public static void testCalcula() {
            String a, cadena;
            a="((4.2+7)-8)+(7*2)";
            cadena = "";
            ArrayList<Object> b, c;
            b=convierteAArrayList(a);
            c=traduccionAPostfija(b);
            for(int i=0; i<c.size(); i++){
                cadena += c.get(i);
                cadena += " ";
            }
            System.out.println(a);
            System.out.println(cadena);
    } 
}
