public interface IColaTDA {
    void inicializarCola(); // sin precondiciones
    void acolar (int x); // cola inicializada
    void desacolar ();// cola inicializada y no vacía
    boolean colaVacia(); // cola inicializada
    int primero();
}
