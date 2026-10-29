import java.util.Set;

public class Grafo implements GrafoTDA {
    private int[][] mAdy; //Matriz de adyacencia
    private int[] etiqs; //Vector para mapeo a indices
    private int cantNodos;

    @Override
    public void inicializarGrafo() {
        mAdy = new int[100][100];
        etiqs = new int[100];
        cantNodos = 0;
    }

    @Override
    public void agregarVertice(int v) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarVertice'");
    }

    @Override
    public void eliminarVertice(int v) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarVertice'");
    }

    @Override
    public Set<Integer> vertices() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'vertices'");
    }

    @Override
    public void agregarArista(int v1, int v2, int peso) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarArista'");
    }

    @Override
    public void eliminarArista(int v1, int v2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarArista'");
    }

    @Override
    public boolean existeArista(int v1, int v2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existeArista'");
    }

    @Override
    public int pesoArista(int v1, int v2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pesoArista'");
    }
    
}
