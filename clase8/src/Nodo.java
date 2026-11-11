public class Nodo<T> {
    T elemento;
    Nodo<T> izq;
    Nodo<T> der;
    int altura = 1; // usado por el AVL, una hoja tiene altura 1

    public Nodo(T elemento) {
        this.elemento = elemento;
    }

	@Override
	public String toString() {
		return "Nodo [elemento=" + elemento + "]";
	}
    
}
