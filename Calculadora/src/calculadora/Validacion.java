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
    
    public static boolean esNumero(char e){
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
                if(esNumero(a) && b=='(')
                    resp = false;
                if(a == ')' && (esNumero(b) || b == '('))
                    resp = false;
                if(a=='(' && b==')') 
                    resp=false;
                i++;
                }
            return resp;
        }
    
    public static boolean puntoEntreParentesis(String expresion){
        boolean resp = true;
        int i = 2;
        char a, b, c;
        while(resp && i<expresion.length()){ 
            a = expresion.charAt(i-2);
            b = expresion.charAt(i-1);
            c = expresion.charAt(i);
            if(a=='(' && b=='.' && c==')')
                resp=false;
            i++;
        } 
    return resp;
    }
    
    public static boolean ordenParentesis(String expresion){
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
    
    public static boolean validaParentesis(String expresion){
        return ordenParentesis(expresion) && colindaParentesis(expresion) && puntoEntreParentesis(expresion);
    }
    
    public static boolean colindaOperadorParentesis(String expresion){
        char a, b;
        int i=1;
        boolean resp=true;
        while(i<expresion.length() && resp){
            a=expresion.charAt(i-1);
            b=expresion.charAt(i);
            if(esOperador(a) && b==')')
                resp=false;
            if(a=='(' && esOperador(b))
                resp=false;
            i++;
        }
    return resp;
    }
    
    public static boolean colindaOperadores(String expresion){
        char a, b;
        int i=1;
        boolean resp=true;
        while(i<expresion.length() && resp){
            a=expresion.charAt(i-1);
            b=expresion.charAt(i);
            if(esOperador(a) && esOperador(b))
                resp=false;
            i++;
        }
    return resp;
    }
    
    public static boolean operatorPrincipioFinal(String expresion){
        char a;
        int i=0;
        int n=expresion.length();
        boolean resp=true;
        while(i<expresion.length() && resp){
            a=expresion.charAt(i);
            if(esOperador(a) && (i==0 || i==n-1))
                resp=false;
            i++;
        }
    return resp;
    }
    
    public static boolean validaOperadores(String expresion){
        return colindaOperadores(expresion) && colindaOperadorParentesis(expresion) && operatorPrincipioFinal(expresion);
    }
    
    public static boolean puntoEntreOperadores(String expresion){
        char a, b, c;
        int i=2;
        boolean resp=true;
        while(i<expresion.length() && resp){
            a=expresion.charAt(i-2);
            b=expresion.charAt(i-1);
            c=expresion.charAt(i);
            if(esOperador(a) && b == '.' && esOperador(c))
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
        if(expresion.length()>0 && expresion.charAt(0) == '.')
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
        return resp && puntoEntreOperadores(expresion);
    }
    
    public static boolean valida(String expresion){
        return validaParentesis(expresion) && validaDecimales(expresion) && validaOperadores(expresion);
    }
    
    public static void testValida(){
        System.out.println(valida("2+(1*3)"));
        System.out.println(valida("2+(.1.)"));
        System.out.println(valida("(2)"));
    }
    
    public static void main(String[] args) {
        testValida();
    }
}

