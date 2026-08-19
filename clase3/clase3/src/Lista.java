public class Lista<T> implements IListaTDA<T> {
   
    Nodo<T> primero;
    Nodo<T> ultimo;

    public Lista() {
        this.primero = new Nodo<>();
    }

    public void add(T elemento) {
        Nodo<T> nuevo = new Nodo<>();
        nuevo.setInfo(elemento);
        Nodo<T> pivote = new Nodo<>();
        pivote = this.primero;
        while(pivote.getNext() != null) {
            pivote = pivote.getNext();
        }
        pivote.setNext(nuevo);
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        Nodo<T> pivote = primero.getNext();
        while(pivote.getNext() != null) {
            out.append(pivote.getInfo());
            pivote = pivote.getNext();
        }
        return out.toString();
    }
    
}
