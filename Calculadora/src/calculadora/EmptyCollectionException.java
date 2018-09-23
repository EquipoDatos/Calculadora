/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 * <pre>
 * Clase de Excepción:
 * 
 * Unicamente sirve para expresar un error en caso de ser encontrado.
 * 
 *
 * @author Alberto Harari
 * @author Abraham Attie
 * @author David Ramos
 * @author Marco 
 * @author Patricio Falcon
 * 
 * </pre>
 */
public class EmptyCollectionException extends RuntimeException {
    
    EmptyCollectionException(){
        super("Error");
    }
    
    EmptyCollectionException(String mensaje){
        super(mensaje);
    }
}
