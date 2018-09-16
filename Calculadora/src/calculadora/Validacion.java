/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author alberto
 */
public class Validacion {
    
    public boolean validacionParentesis(String expresion){
        boolean resp = true;
        PilaA<Character> pila = new PilaA();
        int i, n;
        i=0;
        n=expresion.length();
        while(i<n && resp){
            if(expresion.charAt(i) == '(')
                pila.push(expresion.charAt(i));
            else
                if(expresion.charAt(i) == ')')
                    try{
                        pila.pop();
                    }catch(EmptyCollectionException e){
                        resp=false;
                    }
            i++;
        }
        return pila.isEmpty() && resp;
    }
    
    public boolean validaOperandos(String expresion){
        boolean resp=true;
        int i=0;
        int n=expresion.length();
        while(i<n && resp){
            
        }
    }
    
}
