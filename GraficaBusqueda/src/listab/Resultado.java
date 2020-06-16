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
public class Resultado <T extends Comparable<T>> {
    private T numero;
    private boolean encontrado;
    private int iter;

    public Resultado(T numero, boolean encontrado, int iter) {
        this.numero = numero;
        this.encontrado = encontrado;
        this.iter = iter;
    }

    public T getNumero() {
        return numero;
    }

    public boolean isEncontrado() {
        return encontrado;
    }

    public int getIter() {
        return iter;
    }
    
    
    
}
