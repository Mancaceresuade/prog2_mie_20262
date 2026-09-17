public class ArbolBinarioBusqueda<T extends Comparable<T>> {
 
    ArbolBinario<T> arbol = new ArbolBinario<>();

    // para que sea MST el irep indica: todos los hijos
    // menores a la izquierda y los mayores a la derecha
    public void agregar(T elemento) {
        if (arbol.raiz == null) {
            arbol.raiz = new Nodo<>(elemento);
            return;
        }
        agregarRec(arbol.raiz, elemento);
    }

    private void agregarRec(Nodo<T> raiz, T elemento) {
        if (this.arbol.raiz == null) {
            this.arbol.raiz = new Nodo<>(elemento);
            return;
        }

        int comparacion = elemento.compareTo(raiz.elemento);

        if (comparacion < 0) {
            if (raiz.izq == null) {
                raiz.izq = new Nodo<>(elemento);
            } else {
                agregarRec(raiz.izq, elemento);
            }
        } else if (comparacion > 0) {
            if (raiz.der == null) {
                raiz.der = new Nodo<>(elemento);
            } else {
                agregarRec(raiz.der, elemento);
            }
        } else {
            throw new RuntimeException("Elemento ya existente");
        }
    }

    public void imprimirPostOrder() {
        this.arbol.imprimirPostOrder();        
    }

}
