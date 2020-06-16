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
public class Fruta implements Comparable<Fruta>{
    String nombre;
    String color;

    
    public Fruta(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    } 

    @Override
    public int compareTo(Fruta f){
        if (getNombre() != null && f.getNombre() != null)
            return getNombre().compareTo(f.getNombre());
        return -1;
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String toString(){
        return getNombre() + " - " + getColor();
        
    }
    
}
