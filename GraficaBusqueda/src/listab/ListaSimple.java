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
class ListaSimple<T extends Comparable<T>> {
    // Referencia  a el node raiz o la cabeza de la lista.
    private Node<T> head;
    private int listCount;
 
    // constructor
    public ListaSimple() {
        // Se asigna la cabeza a un nodo nulo y el contador a 0
        head = new Node<>(null);
        listCount = 0;
    }
 
    public void add(T data)
    // Agrega el nodo al final de la lista.
    {
        Node<T> Temp = new Node<>(data);
        Node<T> Current = head;
        // Se tiene que posicionar en la cabeza para poder recorrer la lista y llegar al fin
        while (Current.getNext() != null) {
            Current = Current.getNext();
			//System.out.println("recorriendo:" + Current.data);
        }
        // Asignamos el nuevo nodo como "next" 
        Current.setNext(Temp);
        listCount++;// incrementamos el contador de nodos
    }
 
    
    public boolean add(T data, boolean o)
    // Agrega el nodo al final de la lista.
    {
        Node<T> Temp = new Node<>(data);
        Node<T> Current = head;
        // Se tiene que posicionar en la cabeza para poder recorrer la lista y llegar al fin
        while (Current.getNext() != null) {
            T s = Current.getNext().getData();
            if (s != null && Temp.getData() != null) {
                if (s.compareTo(Temp.getData()) > 0){
                    System.out.println("Lugar para insertar: " + s);
                    Temp.setNext(Current.getNext());
                    Current.setNext(Temp);
                    listCount++;
                    return true;
                }
            } 
            Current = Current.getNext();
        }
        // Asignamos el nuevo nodo como "next" 
        System.out.println("Insertar al final");
        Current.setNext(Temp);
        listCount++;// incrementamos el contador de nodos
        return true;
    }
 
    
    
    
     public T get(int index)
    // Regresa el nodo en la posicion indicada por index
    {
        if (index <= 0 || index > size())
            return null;
 
        Node<T> Current = head.getNext();
        for (int i = 1; i < index; i++) {
            Current = Current.getNext();
        }
        return Current.getData();
    }
 
    public boolean remove(int index)
    // remueve el elemento en la posicion indicada
    {
        // 
        if (index < 1 || index > size())
            return false;
        Node<T> Current = head;
        for (int i = 1; i < index; i++) {
            if (Current.getNext() == null)
                return false;
             Current = Current.getNext();
        }
        Current.setNext(Current.getNext().getNext());
        listCount--; // disminuimos el contador de nodos
        return true;
    }
 
    public int size()
    // returns the number of elements in this list.
    {
        return listCount;
    }
 
    public String toString() {
        Node<T> Current = head.getNext();
        String output = "";
        while (Current != null) {
            output += "[" + Current.getData().toString() + "]";
            Current = Current.getNext();
        }
        return output;
    }
 
    private class Node<T extends Comparable<T>> {
        //Referencia al siguiente elemento o a NULL si es el ultimo
        Node<T> next;
        T data;
        // Node constructor
        public Node(T dataValue) {
            next = null;
            data = dataValue;
        }
        // Constructor que incluye el siguiente nodo
        public Node(T dataValue, Node nextValue) {
            next = nextValue;
            data = dataValue;
        }
 
        public T getData() {
            return data;
        }
 
        public void setData(T dataValue) {
            data = dataValue;
        }
 
        public Node<T> getNext() {
            return next;
        }
 
        public void setNext(Node<T> nextValue) {
            next = nextValue;
        }
    }
}
