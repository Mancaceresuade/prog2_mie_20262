public class Producto implements Comparable<Producto>{
    String id;
    String nombre;
    public Producto(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Producto [id=" + id + ", nombre=" + nombre + "]";
    }
    @Override
    public int compareTo(Producto productoAComparar) {
        // 
        if(this.id.equals(productoAComparar.getId())) {
            return 0;
        }
        return -1;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Producto other = (Producto) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
    
    


}
