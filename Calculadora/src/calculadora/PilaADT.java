/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 * <pre>
 *  Interfaz PilaADT
 *  Indica a la clase PilaA a tener ciertas funcionalidades y métodos. 
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
public interface PilaADT <T>{
    public void push(T dato);
    public T pop ();
    public T peek ();
    public boolean isEmpty ();
    
}
