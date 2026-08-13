public class Cola implements IColaTDA{
    int[] datos;
    int indice;
    @Override
    public void inicializarCola() {
        datos = new int[100];
        indice = 0;
    }
    @Override
    public void acolar(int x) {
        if(indice >= 100)
            throw new RuntimeException("Excede capadidad");
        // alternativa redimensionar array interno
        for (int i =indice-1; i >= 0; i--) {
            datos[i+1] = datos[i];
        }
        datos[0] = x;
        indice ++;
    }

    @Override
    public void desacolar() {
        if(!colaVacia()) {
            indice--; // indice = indice - 1;
        }
    }

    @Override
    public boolean colaVacia() {
        return (indice==0);
    }

    @Override
    public int primero() {
        return datos[indice-1];
    }
}
