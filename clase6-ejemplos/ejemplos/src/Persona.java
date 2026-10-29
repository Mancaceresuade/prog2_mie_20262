public class Persona {
    private int id;
    private String nombre;
    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    } 
    public void cambiarNombre(String nombre){
        this.nombre= nombre;
    }
    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (id == other.id) {
            return true;
        } else {
            return false;
        }   

    }    
}
