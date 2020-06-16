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
public class SearchG <T extends Comparable<T>>{
    
    public Resultado lineal(ListaSimple<T> a, T b, boolean d){
        int iter =0;
        for (int i=1; i <= a.size(); i++){
             if (b.compareTo(a.get(i)) == 0){
                return new Resultado(b, true, iter);
            }
            iter++;
        }
        return new Resultado(b, false, iter);
    }
    
 // Implementar    
    public Resultado binaria(ListaSimple<T> a, T b, boolean d){
        int n = a.size();
          int centro,inf=1,sup=n;
          int iter = 0;
          while(inf<=sup){
             centro=(sup+inf)/2;
             iter++;
             if(a.get(centro).compareTo(b) == 0){ 
                 return new Resultado(b, true, iter);
             }
             else if(b.compareTo(a.get(centro)) < 0 ){
                sup=centro-1;
             }
             else {
               inf=centro+1;
             }
           }
           return new Resultado(b, false, iter);

    }
    
    
    
}

