public class UsoCola {
    public static void main(String[] args) {
        IColaTDA cola = new Cola();
        cola.inicializarCola();
        System.out.println(cola.colaVacia());
        cola.acolar(10);
        cola.acolar(20);
        cola.acolar(5);
        System.out.println(cola.primero());
        cola.desacolar();
        System.out.println(cola.primero());
        cola.desacolar();
        System.out.println(cola.primero());
    }
}
