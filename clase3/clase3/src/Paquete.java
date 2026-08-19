public class Paquete<T> {
    int id;
    String destino;
    double peso;
    T contenido;
    public Paquete(int id, String destino, double peso, T contenido) {
        this.id = id;
        this.destino = destino;
        this.peso = peso;
        this.contenido = contenido;
    }
    @Override
    public String toString() {
        return "Paquete [id=" + id + ", destino=" + destino + ", peso=" + peso + ", contenido=" + contenido + "]";
    }

    
}
