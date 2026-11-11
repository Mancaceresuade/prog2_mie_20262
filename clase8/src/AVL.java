public class AVL<T extends Comparable<T>> {

    ArbolBinarioBusqueda<T> abb = new ArbolBinarioBusqueda<>();

    // irep AVL: es un ABB y para todo nodo la diferencia de alturas
    // entre el subarbol izquierdo y el derecho es -1, 0 o 1
    public void agregar(T elemento) {
        abb.agregar(elemento);
        // la raiz puede cambiar si se rota en la raiz
        abb.arbol.raiz = balancearRec(abb.arbol.raiz, elemento);
    }

    // baja por el camino hacia el elemento insertado y a la vuelta
    // de la recursion actualiza alturas y balancea de abajo hacia arriba
    private Nodo<T> balancearRec(Nodo<T> nodo, T elemento) {
        if (nodo == null) return null;

        int comparacion = elemento.compareTo(nodo.elemento);
        if (comparacion < 0) {
            nodo.izq = balancearRec(nodo.izq, elemento);
        } else if (comparacion > 0) {
            nodo.der = balancearRec(nodo.der, elemento);
        }

        actualizarAltura(nodo);
        return balancear(nodo, elemento);
    }

    private Nodo<T> balancear(Nodo<T> nodo, T elemento) {
        int factor = factorBalance(nodo);

        // cargado a la izquierda
        if (factor > 1) {
            if (elemento.compareTo(nodo.izq.elemento) > 0) {
                // caso LR
                nodo.izq = rotarIzquierda(nodo.izq);
            }
            // caso LL
            return rotarDerecha(nodo);
        }

        // cargado a la derecha
        if (factor < -1) {
            if (elemento.compareTo(nodo.der.elemento) < 0) {
                // caso RL
                nodo.der = rotarDerecha(nodo.der);
            }
            // caso RR
            return rotarIzquierda(nodo);
        }

        return nodo;
    }

    //       y            x
    //      / \          / \
    //     x   C  =>    A   y
    //    / \              / \
    //   A   B            B   C
    private Nodo<T> rotarDerecha(Nodo<T> y) {
        Nodo<T> x = y.izq;
        y.izq = x.der;
        x.der = y;
        actualizarAltura(y);
        actualizarAltura(x);
        return x;
    }

    //     x                y
    //    / \              / \
    //   A   y     =>     x   C
    //      / \          / \
    //     B   C        A   B
    private Nodo<T> rotarIzquierda(Nodo<T> x) {
        Nodo<T> y = x.der;
        x.der = y.izq;
        y.izq = x;
        actualizarAltura(x);
        actualizarAltura(y);
        return y;
    }

    private int altura(Nodo<T> nodo) {
        return nodo == null ? 0 : nodo.altura;
    }

    private void actualizarAltura(Nodo<T> nodo) {
        nodo.altura = 1 + Math.max(altura(nodo.izq), altura(nodo.der));
    }

    private int factorBalance(Nodo<T> nodo) {
        return altura(nodo.izq) - altura(nodo.der);
    }

    public void imprimirPostOrder() {
        abb.imprimirPostOrder();
    }

    public void imprimirNivel(int nivel) {
        abb.arbol.imprimirNivel(nivel);
    }

    @Override
    public String toString() {
        return abb.arbol.raiz == null ? "AVL vacio" : "raiz=" + abb.arbol.raiz.elemento;
    }
}
