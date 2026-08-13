public class ColaPrioridad implements IColaPrioridadTDA{
    int[] datos;
    int[] prioridades;
    int indice;
    @Override
    public void inicializarCola() {
        indice = 0;
        datos = new int[100];
        prioridades = new int[100];
    }

    @Override
    public void acolarPrioridad(int x, int prioridad) {
        // estos tengan mayor o igual prioridad que la de x
        int j = indice;
        for ( ; j >0 && prioridades[j -1] >= prioridad; j --){
            datos[j] = datos[j -1];
            prioridades[j] = prioridades[j -1];
        }
        datos[j] = x ;
        prioridades[j] = prioridad;
        indice++;
    }

    @Override
    public void desacolar() {
        indice--;
    }

    @Override
    public int primero() {
        if(colaVacia())
            throw new RuntimeException("cola vacia");
        return datos[indice-1];
    }

    @Override
    public int prioridad() {
        return prioridades[indice-1];
    }

    @Override
    public boolean colaVacia() {
        return (indice==0);
    }
}
