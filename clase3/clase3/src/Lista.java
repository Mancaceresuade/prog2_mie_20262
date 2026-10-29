public class Lista<T> implements IListaTDA<T> {
   
    Nodo<T> primero;
    Nodo<T> ultimo;

    public Lista() {
        this.primero = new Nodo<>();
    }

    public void add(T elemento) {
        Nodo<T> nuevo = new Nodo<>(); //1
        nuevo.setInfo(elemento); // 1
        Nodo<T> pivote = new Nodo<>(); //2
        pivote = this.primero; // 2
        while(pivote.getNext() != null) {
            pivote = pivote.getNext(); // va hasta el ultino => n
        }
        pivote.setNext(nuevo); // 2
    } // complejidad ? f(n)= 8+2n =>  O(n)

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        Nodo<T> pivote = primero.getNext();
        while(pivote != null) {
            System.out.println("imprimiendo");
            out.append(pivote.getInfo() + " ");
            pivote = pivote.getNext();
        }
        return out.toString();
    }
    
}
