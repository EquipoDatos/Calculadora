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
               cadena= new StringBuilder();
               resultado.add(c);
           }
           else if((cadena.toString().isEmpty()) && !Validacion.esNumero(c)){
               resultado.add(c);
               cadena= new StringBuilder();
           }
           else
               cadena.append(c);
           if(i==expresion.length()-1)
               resultado.add(Double.valueOf(cadena.toString()));
        }
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
    
    
       /* public static void testCalcula(String expresion) {
            System.out.println("\nTest Calcula:");
            String cadena;
            PilaA<Object> pila;
            cadena = "";
            ArrayList<Object> array, postfija;
            array=convierteAArrayList(expresion);
            postfija=traduccionAPostfija(array);
            pila=traduccionAPilaA(postfija);
            for(int i=0; i<=pila.getTope(); i++){
                cadena += pila.pop();
                cadena += " ";
            }
            System.out.println(expresion);
            System.out.println(cadena);
            System.out.println(calcula(pila));
            System.out.println(calcula(traduccionAPilaA(traduccionAPostfija(convierteAArrayList(expresion)))));
    } 
        */
    public static void main(String[] args) {
        /*
        Validacion.testValida("(1+1.1)+1");
        Calcula.testCalcula("(1+1)*3");
*/
        String expresion = "(1+1)*3.1+1";
        ArrayList <Object> arreglo = new ArrayList();
        ArrayList <Object> postfija = new ArrayList();
        PilaA<Object> pila = new PilaA();
        arreglo=convierteAArrayList(expresion);
        System.out.println("Arreglo:"+"\n");
        for(int i=0; i<arreglo.size(); i++)
            System.out.println(arreglo.get(i));
        postfija=traduccionAPostfija(arreglo);
        System.out.println("Postfija:"+"\n");
        for(int i=0; i<postfija.size(); i++)
            System.out.println(postfija.get(i));
        pila = traduccionAPilaA(postfija);
        System.out.println("Pila:"+"\n");
        int n=pila.getTope();
           // System.out.println(pila.pop());
        System.out.println(calcula(pila));
    
}
}
