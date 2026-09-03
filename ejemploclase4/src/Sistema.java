import java.util.ArrayList;
import java.util.HashMap;

public class Sistema {
    String nombre;

    // Busqueda en O(n)
    ArrayList<Producto> productos
    = new ArrayList<>();
    // Diccionario<Clave,Valor>
    // si el requerimiento es busqueda en O(1)
    HashMap<Integer,Producto> otrosProductos 
    = new HashMap<>();

    public Sistema() {
        
    }
    public Sistema(String nombre,ArrayList<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    public int cantidadProductos() {
        return this.productos.size();
    }



    public Producto obtenerProducto(String id) {
        // evitar uso de nulos
        Producto producto = null;
        for (Producto producto2 : this.productos) {
            if(id.equals(producto2.getId())) {
                producto = producto2;
            }
        }
        return producto;
    } // complejidad O(n)

    public void agregarProducto(String id, String nombre) {
        // TODO falta verificar si esta registrado el id
        Producto producto = new Producto(id, nombre);
        productos.add(producto);
    }






    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public HashMap<Integer, Producto> getOtrosProductos() {
        return otrosProductos;
    }

    public void setOtrosProductos(HashMap<Integer, Producto> otrosProductos) {
        this.otrosProductos = otrosProductos;
    }

    @Override
    public String toString() {
        return "Sistema [nombre=" + nombre + ", productos=" + productos + ", otrosProductos=" + otrosProductos + "]";
    }

    
    
    
}
