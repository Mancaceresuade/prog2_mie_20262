public class Electronica {
    int id;
    String descripcion;
    // datos de electronica
    public Electronica(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    @Override
    public String toString() {
        return "Electronica [id=" + id + ", descripcion=" + descripcion + "]";
    }
    
}
