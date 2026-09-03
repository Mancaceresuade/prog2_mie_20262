import java.io.FileNotFoundException;
import java.io.FileReader;
import com.google.gson.Gson;

/**
 * GestonJson
 */
public class GestorJson {

    public static Sistema obtenerDatos() {
        Gson gson = new Gson();
        FileReader fileReader;
        Sistema sistema=null;
        try {
            fileReader = new FileReader("datos.json");
            sistema = gson.fromJson(fileReader, Sistema.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sistema;
    }

}
