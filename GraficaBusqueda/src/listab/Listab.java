/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listab;

import java.util.Random;

/**
 *
 * @author vramos
 */
public class Listab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaSimple<Integer> listaNumero = new ListaSimple<>();
        
        Random random = new Random();
        SearchG<Integer> busca = new SearchG<>();
        
        int N = 100; //Cantidad de objetos en la lista.
        int tope = 5000; //Numero de maximo que se genera como aleatorio para almacenar en la lista.
        int M = 10; //Cantidad de iteraciones incrementando N en cada iteracion.
        
        int aLineal[] = new int[M];
        int aBinaria[] = new int[M];
        
        
        // llena la lista con valores aleatorios
        for (int i = 0; i< N; i++){
            Integer valor = random.nextInt(tope);
            listaNumero.add(valor);
        }
        
        
        // Lineal
        for (int ejecucion = 1; ejecucion <= M; ejecucion ++){
            // llena la lista con numero aleatorios
            listaNumero = new ListaSimple<>();
            for (int i = 0; i< N*ejecucion; i++){
                Integer valor = random.nextInt(tope);
                listaNumero.add(valor);
            }
            int suma = 0;
            for (int j = 0; j < N*ejecucion; j++){
                Resultado resultado = busca.lineal(listaNumero, random.nextInt(tope), true);
               // System.out.println("" + resultado.getNumero()+ ","+ resultado.getIter() + "," + resultado.isEncontrado());
                suma += resultado.getIter();
            }
            aLineal[ejecucion-1] = suma/(N*ejecucion);
            //System.out.println("" + N*ejecucion  + "," + suma/(N*ejecucion)); 
        }
        
        
        // Binaria
        //System.out.println("Binaria");
        for (int ejecucion = 1; ejecucion <= M; ejecucion ++){
            // llena la lista con numero aleatorios
            listaNumero = new ListaSimple<>();
            for (int i = 0; i< N*ejecucion; i++){
                Integer valor = random.nextInt(tope);
                listaNumero.add(valor);
            }
            int suma = 0;
            for (int j = 0; j < N*ejecucion; j++){
                Resultado resultado = busca.binaria(listaNumero, random.nextInt(tope), true);
               // System.out.println("" + resultado.getNumero()+ ","+ resultado.getIter() + "," + resultado.isEncontrado());
                suma += resultado.getIter();
            }
            aBinaria[ejecucion-1] = suma/(N*ejecucion);
            //System.out.println("" + N*ejecucion  + "," + suma/(N*ejecucion)); 
        }
        String titulo ="\t\t\t\t\t\t\t\t"+ "REPRESENTACIONES GRAFICAS DE GENERACION LINEAL Y BINARIA";
        String subtitulo ="\t\t"+ "GRAFICA DE PROCESO ";
        String colorRed="\033[31m";
        String colorBlue="\033[34m"; 
        String colorWhite="\033[37m"; 
        
        System.out.println(titulo);
        System.out.println("Lineal");
        grafica(aLineal, .010f, N,subtitulo,colorRed,colorBlue,colorWhite);
        System.out.println("\n");
        System.out.println("Binaria");
        grafica(aBinaria,1, N,subtitulo,colorRed,colorBlue,colorWhite);
    }

    public static void grafica(int[] valores, float escala, int N, String subtitulo,String colorRed,String colorBlue,String colorWhite){
        int i;
        
        System.out.println(colorWhite + "--------------------------------------------------");
        for (i = 0; i< valores.length; i++){
            System.out.print(colorBlue+N*(i+1) + "\t");
            System.out.println("|"+" ---> Elemento de la lista");
            for (int r = 0; r < valores[i]*escala; r ++){
                System.out.print(colorRed + "°");
            }
            System.out.println(""+"  ---> Resultado del elemento");
        }
        System.out.println("\nResultado de iteraciones: " + i);
        System.out.println("Rango de elementos de la lista: " + N+"-"+N*(i));
        System.out.println(colorWhite + "--------------------------------------------------");
        System.out.println(subtitulo); 
    }    
}
