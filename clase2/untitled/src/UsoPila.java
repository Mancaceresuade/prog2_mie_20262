public class UsoPila {
    public static void main(String[] args) {
        IPilaTDA pila = new Pila();
        pila.InicializarPila();
        System.out.println(pila.PilaVacia());
        pila.Apilar(10); // rojo
        pila.Apilar(20); // verde
        pila.Apilar(15);
        System.out.println(pila.Tope());
    }
}
