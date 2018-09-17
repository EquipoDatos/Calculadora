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
    
    public static boolean esOperando(char e){
        boolean respuesta = false;
        if ((e>='0' && e<='9') || (e=='.')) {
            respuesta = true;
        }
        return respuesta;
    }
    
    public static boolean esOperador(char e){
        boolean respuesta = false;
        char[] set = {'+','-','*','/'};
        int i=0;
        while (i<set.length && e != set[i])
            i++;
        if (i != set.length)
            respuesta = true;
        return respuesta;
    }
    
    public static boolean colindaParentesis(String expresion){
            char a, b;
            int i=1;
            boolean resp = true;
            while(i<expresion.length() && resp){
                a=expresion.charAt(i-1);
                b=expresion.charAt(i);
                if(b == '(')
                    if(esOperando(a) || a == ')' )
                        resp = false;
                if(a == ')')
                    if(esOperando(b) || b == '(' )
                        resp = false;
                i++;
            }
            return resp;
    }
    
    public static boolean parentesisVacio(String expresion){
        boolean resp = true;
        int i = 1;
        char a, b;
        while(resp && i<expresion.length()){ 
            a = expresion.charAt(i-1);
            b = expresion.charAt(i);
            if(a=='(' && b==')') 
                resp=false;
            i++;
        } 
        return resp;
    }
    
    public static boolean validaParentesis(String expresion){
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
        return pila.isEmpty() && resp && colindaParentesis(expresion) && parentesisVacio(expresion);
    }
    
    public static boolean validaOperadores(String expresion){
        boolean resp=true;
        int i=0;
        int n=expresion.length();
        if(esOperador(expresion.charAt(i)))
            resp=false;
        while(i<n && resp){
            if(esOperador(expresion.charAt(i)))
                if(i == n-1 || esOperador(expresion.charAt(i+1)))
                    resp=false;
            i++;
        }
        return resp;
    }
    
    public static boolean puntoEntreOperandos(String expresion){
        char a, b, c;
        int i=2;
        boolean resp=true;
        while(i<expresion.length() && resp){
            a=expresion.charAt(i-2);
            b=expresion.charAt(i-1);
            c=expresion.charAt(i);
            if(b == '.' && esOperador(a) && esOperador(c))
                resp=false;
            i++;
        }
        return resp;
    }
    
    public static boolean validaDecimales(String expresion){
        boolean resp=true;
        int i=1;
        boolean bandera= false;
        int n=expresion.length();
        if(expresion.charAt(0) == '.')
            bandera = true;
        while(i<n && resp){
            if(esOperador(expresion.charAt(i)))
                bandera = false;
            if(bandera && expresion.charAt(i) == '.')
                    resp = false;
            else if(bandera == false && expresion.charAt(i) == '.')
                bandera = true;
             i++;
            }
        return resp && puntoEntreOperandos(expresion);
    }
    
    
    public static boolean valida(String expresion){
        return validaParentesis(expresion) && validaDecimales(expresion) && validaOperadores(expresion);
    }
    
    public static void main(String[] args) {
        System.out.println(valida("(7+6)+9+.(.+)"));
        /*
        falta validar que no haya puros operadores o un punto entre paréntesis.
        */
    }
}
