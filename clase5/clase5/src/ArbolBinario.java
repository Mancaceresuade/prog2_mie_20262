public class ArbolBinario<T> implements IArbolBinario<T>{
    
    Nodo<T> raiz;

    @Override
	public void inicializaArbol() {
        this.raiz = null;
	}

	@Override
	public void agregarRaiz(T elemento) {
        if(raiz!=null)
            throw new RuntimeException("Raiz existente"); 
        this.raiz = new Nodo<>(elemento);
	}

    public void agregarANodoHijoIzq(T aAgregar, T elemento) {
        agregarANodoHijoIzq(raiz, aAgregar, elemento);
    }

    private void agregarANodoHijoIzq(Nodo<T> nodo, T aAgregar, T elemento) {
        Nodo<T> aux = buscarNodo(nodo,aAgregar) ;
        if(aux == null) 
            throw new RuntimeException("elemento no encontrado");  
        if(aux.izq!=null)
            throw new RuntimeException("hijo izquierdo ya cargado");  
        aux.izq = new Nodo<>(elemento);
	}

	private Nodo<T> buscarNodo(Nodo<T> nodo, T aAgregar) {
        if(nodo == null) return null;
        if(nodo.elemento==aAgregar) {
            return nodo;
        }
        Nodo<T> aux = buscarNodo(nodo.izq, aAgregar);
        if(aux == null)
            aux = buscarNodo(nodo.der, aAgregar);
        return aux;
	}


    public void imprimirPostOrder() {
        imprimirPostOrderRec(this.raiz);
    }

    
	private void imprimirPostOrderRec(Nodo<T> nodo) {
        if(nodo==null) return;
        imprimirPostOrderRec(nodo.izq);
        imprimirPostOrderRec(nodo.der);
        System.out.println(nodo);
	}

	@Override
    public String toString() {
        return this.raiz.elemento.toString();
    }
}
