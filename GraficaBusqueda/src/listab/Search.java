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
public class Search <T extends Comparable<T>>{
    
    public int lineal(ListaSimple<T> a, T b, boolean d){
        int iter =0;
        for (int i=1; i <= a.size(); i++){
             if (b.compareTo(a.get(i)) == 0){
                if (d)
                    System.out.print(" iteraciones: " + iter);
                return i;
            }
            if (d)
                iter++;
        }
        if (d)
            System.out.print(" iteraciones: " + iter);
        return -1;
    }
    
 // Implementar    
    public int binaria(ListaSimple<T> a, T b, boolean d){
        int resultado = -1;
        return resultado;
    }
    
    
    
}

