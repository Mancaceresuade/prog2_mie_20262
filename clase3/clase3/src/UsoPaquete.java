
public class UsoPaquete {

    public static void main(String[] args) {
        //List<Paquete<Electronica>> paquetes 
        //    = new LinkedList<>();

        IListaTDA<Paquete<Electronica>> listaTDA = new Lista<>();
        Electronica electronica = new Electronica(1, "Telefonos");
        Paquete<Electronica> paq1 = new Paquete<>(1,"Salta",100.0,electronica);
        Paquete<Electronica> paq2 = new Paquete<>(1,"Salta",1000.0,electronica);
        listaTDA.add(paq1);
        listaTDA.add(paq2);
        System.out.println(listaTDA);
    }
    
}
