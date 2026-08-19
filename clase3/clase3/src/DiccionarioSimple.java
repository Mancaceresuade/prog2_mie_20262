public class DiccionarioSimple implements IDiccionarioSimpleTDA{

    // invariante de representacion
    // la clave no debe repetirse

    class Elemento{
        int clave;
        int valor;
    }

    Elemento[] elementos;
    int cantidad;

    @Override
    public void inicializarDiccionario() {
        this.cantidad = 0;
        this.elementos = new Elemento[100]; // hardcodeo
    }

    @Override
    public void agregar(int clave, int valor) {
        if(cantidad > 100)
            throw new RuntimeException("Acepta hasta 100 elementos");
        if(existeClave(clave)) 
            throw new RuntimeException("Clave duplicada");
        Elemento elemento = new Elemento();            
        elemento.clave = clave;
        elemento.valor = valor;
        this.elementos[cantidad] = elemento;
    }


    private boolean existeClave(int clave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existeClave'");
    }

    @Override
    public void eliminar(int clave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public int recuperar(int clave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'recuperar'");
    }
    
}
