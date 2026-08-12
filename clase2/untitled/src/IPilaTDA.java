public interface IPilaTDA {
    void InicializarPila(); // sin precondiciones
    void Apilar (int x); // pila inicializada
    void Desapilar (); // pila inicializada y no vacía
    boolean PilaVacia(); // pila inicializada
    int Tope(); // pila inicializada y no vacía
}
