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
public class Libro {
    String titulo;
    String autor;
    String isbn;
    
    public Libro (String t, String a, String i){
        titulo = t;
        autor = a;
        isbn = i;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
 
    @Override
    public String toString(){
        return getTitulo() + " - " + getAutor();
    }
    
    
}
