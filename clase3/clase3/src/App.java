import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        DesdeHasta<Integer,Integer> desdeHasta = 
            new DesdeHasta<>(10, 10);
        System.out.println(desdeHasta);

        DesdeHasta<String,String> desdeHastaString = 
            new DesdeHasta<>("lunes", "martes");
        System.out.println(desdeHastaString);

        DesdeHasta<Double,String> desdeHasta2 = 
            new DesdeHasta<>(100.0, "martes");
        System.out.println(desdeHasta2);

        DesdeHasta<List<Integer>,String> desdeHasta3 = 
            new DesdeHasta<>(new ArrayList<>(), "martes");
        System.out.println(desdeHasta3);

    }
}
