public class UsoColaPrioridad {
    public static void main(String[] args) {
        IColaPrioridadTDA colaPrioridadTDA = new ColaPrioridad();
        colaPrioridadTDA.inicializarCola();
        System.out.println(colaPrioridadTDA.colaVacia());
        try {
            System.out.println(colaPrioridadTDA.primero());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        colaPrioridadTDA.acolarPrioridad(20,5);
        colaPrioridadTDA.acolarPrioridad(100, 20);
        colaPrioridadTDA.acolarPrioridad(15, 2);
        System.out.println(colaPrioridadTDA.prioridad());
        System.out.println(colaPrioridadTDA.primero());
        System.out.println("El sistema no se cuelga");
    }
}
