/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listab;

/**
 *
 * @author vramos
 */
public class Caja<T> {
    private T contenido;
    
    public Caja(T c){
        contenido = c;
    }
    
    public T getContenido(){
        return contenido;
    }
    
    public void setContenido(T c){
        contenido = c;
    }
    
    
    public String toString(){
        return getContenido().toString();
    }
    
}
