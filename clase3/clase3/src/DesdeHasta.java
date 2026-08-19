public class DesdeHasta<T,V> {
    private T desde;
    private V hasta;
    DesdeHasta(T desde, V hasta) {
        this.desde = desde;
        this.hasta = hasta;
    }
    @Override
    public String toString() {
        return desde + " " + hasta;
    }
}
