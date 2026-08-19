import java.util.HashMap;
import java.util.Map;

public class EjemploDic {
    public static void main(String[] args) {
        
        Map<Integer,String> capitulos =
            new HashMap<>();
        capitulos.put(12, "Capitulo 3");
        capitulos.put( 15, "Capitulo 2");
        capitulos.put( 3, "Capitulo 20");

        // System.out.println(capitulos.get(3));

        /*
        for (Integer clave : capitulos.keySet()) {
            System.out.println(clave);
        }
         */
        capitulos.keySet().forEach(e -> System.out.println(e));
        capitulos.values().forEach(v -> System.out.println(v));
    }
}
