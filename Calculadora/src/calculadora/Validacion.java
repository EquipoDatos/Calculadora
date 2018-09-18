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
        boolean resp = false;
        if ((e>='0' && e<='9') || (e=='.')) {
            resp = true;
        }
        return resp;
    }
    
    public static boolean esOperador(char e){
        boolean resp = false;
        char[] set = {'+','-','*','/'};
        int i = 0;
        while( resp == false && i<set.length){
            if(set[i] == e)
                resp = true;
            i++;
        }
        return resp;
    }
    
    public static boolean esParentesis(char e){
        boolean resp = false;
        char[] set = {'(',')'};
        int i = 0;
        while( resp == false && i<set.length){
            if(set[i] == e)
                resp = true;
            i++;
        }
        return resp;
    }
    
    public static boolean ordenParentesis(String expresion){
        boolean resp = true;
        PilaA<Character> pila = new PilaA();
        char a;
        int i, n;
        i=0;
        n=expresion.length();
        while(i<n && resp){
            a = expresion.charAt(i);
            if(a == '(')
                pila.push(a);
            else
                if(a == ')')
                    try{
                        pila.pop();
                    }catch(EmptyCollectionException e){
                        resp=false;
                    }
            i++;
        }
        if (!(pila.isEmpty()))
                resp = false;
        return resp;
    }
    
    public static boolean noColindaParentesis(String expresion){
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
    
    public static boolean validaParentesis(String expresion){
        return ordenParentesis(expresion) && noColindaParentesis(expresion);
    }
    
    public static boolean noColindaOperadoresParentesis(String expresion){
        char a, b;
        int i=1;
        boolean resp=true;
        while(i<expresion.length() && resp){
            a=expresion.charAt(i-1);
            b=expresion.charAt(i);
            if(esOperador(a) && (b==')' || esOperador(b)))
                resp=false;
            if(a=='(' && esOperador(b))
                resp=false;
            i++;
        }
    return resp;
    }
    
    public static boolean noOperadorPrincipioFinal(String expresion){
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
        return noColindaOperadoresParentesis(expresion) && noOperadorPrincipioFinal(expresion);
    }
    
    public static boolean unPuntoPorNumero(String expresion){
        boolean resp=true;
        char a;
        int i=1;
        boolean bandera= false;
        int n=expresion.length();
        if(expresion.length()>0 && expresion.charAt(0) == '.')
                bandera = true;
        while(i<n && resp){
            a = expresion.charAt(i);
            if(esOperador(a))
                bandera = false;
            if(bandera && a == '.')
                    resp = false;
            else if(!(bandera) && a == '.')
                bandera = true;
             i++;
            }
        return resp;
    }
    
    public static boolean noPuntoEntreOperadoresParentesis(String expresion){
        char a, b, c;
        int i=2;
        boolean resp=true;
        while(i<expresion.length() && resp){
            a=expresion.charAt(i-2);
            b=expresion.charAt(i-1);
            c=expresion.charAt(i);
            if(esOperador(a) && b == '.' && esOperador(c))
                resp=false;
            if(a=='(' && b=='.' && c==')')
                resp=false;
            i++;
        }
    return resp;
        }
    
    public static boolean validaDecimales(String expresion){
        return unPuntoPorNumero(expresion) && noPuntoEntreOperadoresParentesis(expresion);
    }
    
    public static boolean valida(String expresion){
        return validaParentesis(expresion) && validaDecimales(expresion) && validaOperadores(expresion);
    }
    
    /* Todos los prints del test deben ser 'true' */
    public static void testValida(){
        /* ordenParentesis */
        System.out.println(valida(")1+2(")==false);
        System.out.println(valida("(1+2)")==true);
        System.out.println(valida("((1+2)")==false);
        System.out.println(valida("((1+2))")==true);
        System.out.println(valida("(1+2))")==false);
        /* noColindaParentesis */
        System.out.println(valida("1+2+()")==false);
        System.out.println(valida("(1+2)(1+2)")==false);
        System.out.println(valida("(1+2)*(1+2)")==true);
        System.out.println(valida("(1+2(1+2))")==false);
        System.out.println(valida("((1+2)1+2)")==false);
        /* noColindaOperadoresParentesis */
        System.out.println(valida("1++2")==false);
        System.out.println(valida("(+1+2)")==false);
        System.out.println(valida("(1+2+)")==false);
        /* noOperadorPrincipioFinal */
        System.out.println(valida("+1+2")==false);
        System.out.println(valida("1+2+")==false);
        /* unPuntoPorNumero */
        System.out.println(valida("1.2")==true);
        System.out.println(valida(".12")==true);
        System.out.println(valida("12.")==true);
        System.out.println(valida(".1.2")==false);
        System.out.println(valida("1+2..")==false);
        System.out.println(valida("1+..2")==false);
        /* noPuntoEntreOperadoresParentesis */
        System.out.println(valida("1+.+2")==false);
        System.out.println(valida("1+2+(.)")==false);
        System.out.println(valida("1+(2)")==true);
    }
    
}

