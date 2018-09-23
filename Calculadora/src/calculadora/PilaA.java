/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 * <pre>
 * Clase Pila
 * Se utiliza para formar pilas en las demás clases de la calculadora y asi guardar estructuar datos.
 * Implementa la interfaz PilaADT que onbliga a esta clase a tener ciertos métodos. 
 * 
 * 
 *
 * @author Alberto Harari
 * @author Abraham Attie
 * @author David Ramos
 * @author Marco Palermo
 * @author Patricio Falcon
 * 
 * </pre>
 */

public class PilaA<T> implements PilaADT<T> {
    private T[] pila;
    private int tope;
    private final int MAX=20;
    
    public PilaA(){
        pila=(T[])new Object[MAX];
        tope=-1;
    }
    
    public PilaA(int max){
        pila=(T[])new Object[max];
        tope=-1;
    }

    public T[] getPila() {
        return pila;
    }

    public int getTope() {
        return tope;
    }
    
    @Override
    public boolean isEmpty(){
        return tope == -1;
    }
    
    @Override
    public void push(T dato){
        if(tope == pila.length-1)
            expand();
        tope ++;
        pila[tope]=dato;
    }
    

    private void expand(){
        T[] nuevo = (T[])new Object[pila.length*2];
        for(int i=0; i<=tope; i++)
            nuevo[i]=pila[i];
        pila=nuevo;
    }
    

    @Override
    public T pop(){
        if(isEmpty())
            throw new EmptyCollectionException("Pila vacía");
        //El else es de adorno porque la exception lo saca del método
        else{
            T resultado = pila[tope];
            pila[tope] = null;
            tope--;
            return resultado;  
        }  
    }
    
    @Override
    public T peek(){
        if(isEmpty())
            throw new EmptyCollectionException("Pila vacía");
        //El else es de adorno porque la exception lo saca del método
        else{
            T resultado = pila[tope];
            return resultado;  
        }
    }
    
    
}
