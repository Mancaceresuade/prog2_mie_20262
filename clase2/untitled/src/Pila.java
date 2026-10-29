
public class Pila implements IPilaTDA{
    int[] datos;
    int indice;
    @Override
    public void InicializarPila() {
        datos = new int[100]; // harcodeo
        indice = 0;
    }

    @Override
    public void Apilar(int x) {
        // falta lanzar excepcion si indice > 100
        datos[indice] = x;
        indice++; // indice = indice +1
    } // son 4 operciones => O(1)

    @Override
    public void Desapilar() {
        indice--;
    }

    @Override
    public boolean PilaVacia() {
        return (indice==0);
    }

    @Override
    public int Tope() {
        return datos[indice-1];
    }
}
