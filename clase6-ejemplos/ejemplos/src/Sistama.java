import java.util.ArrayList;
import java.util.HashMap;

public class Sistama {
    // para acceso en O(n) pueden usar listas
    // private  ArrayList<Persona> personas = new ArrayList<>();
    // requerimiento: acceso en O(1) a buscar y agregar
    // HashMap es una implementacion de java de diccionario
    private HashMap<String,Persona> personas = new  HashMap<>();


    Sistama() {
        Persona persona1 = new Persona(1,"Juan");
        Persona persona2 = new Persona(1, "Pedro");
        personas.put("1",persona1); // O(1)
        personas.put("2",persona2); // O(1)
    }

    // dependencia de la clase Persona
    public void hardCodearDatos() {
        Persona persona1 = new Persona(1,"Juan");
        Persona persona2 = new Persona(1, "Pedro");
        procesoDatos(persona1);
        System.out.println(persona1);
        // System.out.println(persona1.equals(persona2));

    }

    private static void procesoDatos(Persona per1) {
        per1.cambiarNombre("otro nombre");
    }

}
