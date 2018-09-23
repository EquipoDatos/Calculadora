/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
/**
 * <pre>
 * Clase Valida:
 * 
 * Contiene las validaciones previas al cálculo de la expresión.
 * Se implementan varios métodos que revisan y validan la cadena char por char.
 * Considera los paréntesis, operadores y números (con sus decimales).
 *  
 * 
 * 
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
public class Valida {
    /**
    * Revisa si un char es dígito o punto decimal
     * @param e Un char de la expresión
     * @return <ul>
     *  <li> true: si el char es un dígito o punto decimal </li>
     *  <li> false: si el char no es un dígito o punto decimal  </li>
     * </ul>
     */
    public static boolean esNumero(char e){
        boolean resp = false;
        if ((e>='0' && e<='9') || (e=='.')) {
            resp = true;
        }
        return resp;
    }
    
    /**
     * Revisa si un char es operador
     * @param e Un char de la expresión
     * @return <ul>
     *  <li> true: si el char es un operador </li>
     *  <li> false: si el char no es un operador </li>
     * </ul>
     */
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
    
    /**
    * Revisa si un char es paréntesis
     * @param e Un char de la expresión
     * @return <ul>
     *  <li> true: si el char es un paréntesis que abre o cierra </li>
     *  <li> false: si el char no es un paréntesis que abre o cierra </li>
     * </ul>
     */
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
    
    /**
     * Revisa si un char es símbolo negativo
     * @param e Un char de la expresión
     * @return <ul>
     *  <li> true: si el char es un símbolo negativo </li>
     *  <li> false: si el char no es un símbolo negativo </li>
     * </ul>
     */
    public static boolean esNegativo(char e){
        boolean resp = false;
        if (e =='~')
            resp = true;
        return resp;
    }
    
    /**
     * <pre>
     * Valida el orden y cantidad de los paréntesis
     * Ej. false: ((9+8) ó 9+8) ó )9+8)
     * </pre>
     * @param expresion La expresión ingresada en la calculadora
     * @return <ul>
     *  <li> true: si el orden de los paréntesis es válido y correcto </li>
     *  <li> false: si es incorrecto el orden o cantidad de paréntesis</li>
     * </ul>
     */
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
    
    /**
     * Al ubicar ~ convierte un número o expresión en parénteis a negativo
     * @param expresion La expresión ingresada en la calculadora
     * @return String de la expresión con números negativos
     */
    public static String fixNegativo(String expresion){
        int i=0, n=expresion.length();
        boolean par=false;
        char b;
        PilaA pila = new PilaA();
        PilaA pila2 = new PilaA();
        while(!"".equals(expresion)){
            b = expresion.charAt(0);
            expresion = expresion.substring(1, expresion.length());
            if (pila.isEmpty() && esNegativo(b)){
                pila.push('0');
                pila.push('-');
            }
            else if (par==true && !(esNumero(b))){
                pila.push(')');
                pila.push(b);
                par=false;
            }
            else if (!pila.isEmpty() && (char)pila.peek()=='(' && esNegativo(b)){
                pila.push('0');
                pila.push('-');
            }
            else if (!pila.isEmpty() && esOperador((char)pila.peek()) && esNegativo(b)){
                pila.push('(');
                pila.push('0');
                pila.push('-');
                par=true;
            }
            else
                pila.push(b);
        }
        if (par)
            pila.push(')');
        while(!(pila.isEmpty()))
            pila2.push(pila.pop());
        StringBuilder cadena = new StringBuilder();
        while(!(pila2.isEmpty()))
            cadena.append(pila2.pop());
        return cadena.toString();
    }
    
    /**
     * <pre>
     * Valida que sólo haya un operador colindando con un paréntesis
     * que abre o cierra
     * Ej. true: 9+(  ó  )-8
     * Ej. false: 9( ó   )8
     * </pre>
     * @param expresion La expresión ingresada en la calculadora
     * @return <ul>
     *  <li> true: si no hay error de colindancia </li>
     *  <li> false: si hay error de colindancia</li>
     * </ul>
     * 
     */
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
    
    /**
     * Implementa tanto noColindaParentesis como ordenParentesis
     * @param expresion La expresión ingresada en la calculadora
     * @return <ul>
     *  <li> true: si los paréntesis son correctos en su totalidad </li>
     *  <li> false: si los paréntesis son incorrectos </li>
     * </ul>
     * @see noColindaParentesis
     * @see ordenParentesis
     */
    
    public static boolean validaParentesis(String expresion){
        return ordenParentesis(expresion) && noColindaParentesis(expresion);
    }
    
    
    /**
     * <pre>
     * Valida la colindancia de paréntesis y operadores, y que no 
     * hayan dos o más operadores juntos.
     * Ej. true: (9+8)
     * Ej. false: (+9+8) o (9++8)
     * </pre>
     * @param expresion La expresión ingresada en la calculadora
     * @return <ul>
     *  <li> true: si la colindancia es válida </li>
     *  <li> false: si la colindancia es inválida</li>
     * </ul> 
     */
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
    /**
     * <pre>
     * Valida que no hayan operadores en el principio o en el final
     * Ej. false: 2+3- ó +2-3
     * </pre>
     * @param expresion La expresión ingresada en la calculadora
     * @return <ul>
     *  <li> true: si no hay operadores en el principio o final </li>
     *  <li> false: si hay operadores en el principio o final </li>
     * </ul> 
     */
    public static boolean noOperadorPrincipioFinal(String expresion){
        char a;
        int i=0;
        int n=expresion.length();
        boolean resp=true;
        while(i<expresion.length() && resp){
            a=expresion.charAt(i);
            if( esOperador(a) && i==0)
                resp=false;
            if((esOperador(a)||a=='~') && i==n-1)
                resp=false;
            i++;
        }
    return resp;
    }
    
    /**
     * Implementa tanto noColindaOperadoresParentesis como noOperadorPrincipioFinal
     * @param expresion La expresión ingresada en la calculadora
     * @return <ul>
     *  <li> true: si la sintaxis de operadores es correcta </li>
     *  <li> false: si la sintaxis de operadores es incorrecta</li>
     * </ul>
     * @see noColindaOperadoresParentesis
     * @see noOperadorPrincipioFinal
     */
    public static boolean validaOperadores(String expresion){
        return noColindaOperadoresParentesis(expresion) && noOperadorPrincipioFinal(expresion);
    }
    
    /**
     * Revisa que no haya más de un punto decimal por número
     * Ej. false: 9.67.8
     * @param expresion La expresión ingresada en la calculadora
     * @return <ul>
     *  <li> true: si no hay más de un punto decimal por número </li>
     *  <li> false: si hay más de un punto decimal por número</li>
     * </ul>
     */
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
    
    /**
     * Revisa que no haya un punto decimal entre paréntesis que abren y cierran u operadores
     * Ej. false: (.) ó +.-
     * @param expresion La expresión ingresada en la calculadora
     * @return <ul>
     *  <li> true: si no hay punto decimal entre paréntesis u operadores </li>
     *  <li> false: si hay punto decimal entre paréntesis u operadores</li>
     * </ul>
     */
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
    
    /**
     * Revisa que se hayan quitado todos los símbolos negativos
     * @param expresion La expresión ingresada en la calculadora
     * @return <ul>
     *  <li> true: si hay símbolos negativos </li>
     *  <li> false: si no hay símbolos negativos</li>
     * </ul>
     */
    public static boolean validaNegativo(String expresion){
        boolean resp=true;
        char a;
        int i=0;
        while(i<expresion.length() && resp){
            a=expresion.charAt(i);
            if (esNegativo(a))
                    resp=false;
             i++;
            }
        return resp; 
    }
    
    /**
     * Implementa tanto unPuntoPorNumero como noPuntoEntreOperadoresParentesis
     * @param expresion La expresión ingresada en la calculadora
     * @return <ul>
     *  <li> true: si la sintaxis de decimales es correcta </li>
     *  <li> false: si la sintaxis de decimales es incorrecta</li>
     * </ul>
     * @see unPuntoPorNumero
     * @see noPuntoEntreOperadoresParentesis
     */
    public static boolean validaDecimales(String expresion){
        return unPuntoPorNumero(expresion) && noPuntoEntreOperadoresParentesis(expresion);
    }
    
    /**
     * <pre>
     * Revisa los paréntesis, decimales, operadores y símbolos negativos en su totalidad
     * Éste método se utiliza al ejecutar el botón de "=".
     * </pre>
     * @param expresion La expresión ingresada en la calculadora
     * @return <ul>
     *  <li> true: si la sintaxis es correcta </li>
     *  <li> false: si existe error de sintáxis</li>
     * </ul>
     * 
     */
    public static boolean valida(String expresion){
        expresion=fixNegativo(expresion);
        return validaParentesis(expresion) && validaDecimales(expresion) && validaOperadores(expresion) && validaNegativo(expresion);
    }
    
    public static void testValida(String expresion){
        boolean valorDeRealidad;
        valorDeRealidad=valida(expresion);
        System.out.println("\nTest Valida:");
        System.out.println(expresion);
        System.out.println("expression Validity is: "+valorDeRealidad);
    }
    
    public static void testValida(String expresion, boolean valorDeRealidad){
        System.out.println(valida(expresion)==valorDeRealidad);
    }
    
    /* Todos los prints del test deben ser 'true' */
    public static void testValida(){
        System.out.println("\nTest Valida:");
        /* ordenParentesis */
        testValida(")1+2(",false);
        testValida("(1+2)",true);
        testValida("((1+2)",false);
        testValida("((1+2))",true);
        testValida("(1+2))",false);
        /* noColindaParentesis */
        testValida("1+2+()",false);
        testValida("(1+2)(1+2)",false);
        testValida("(1+2)*(1+2)",true);
        testValida("(1+2(1+2))",false);
        testValida("((1+2)1+2)",false);
        /* noColindaOperadoresParentesis */
        testValida("1++2",false);
        testValida("(+1+2)",false);
        testValida("(1+2+)",false);
        /* noOperadorPrincipioFinal */
        testValida("+1+2",false);
        testValida("1+2+",false);
        /* unPuntoPorNumero */
        testValida("1.2",true);
        testValida(".12",true);
        testValida("12.",true);
        testValida(".1.2",false);
        testValida("1+2..",false);
        testValida("1+..2",false);
        /* noPuntoEntreOperadoresParentesis */
        testValida("1+.+2",false);
        testValida("1+2+(.)",false);
        testValida("1+(2)",true);
    }
}