public class Ejemplo {
    public static void main(String[] args) {
        // suposicion matriz cuadrada
        int[][] matriz = {{2,3,4},{1,2,3},{4,5,6}};
        recorrerPorFilaEImprimirDiaganalDescendente(matriz);
    }


    private static void recorrerPorFilaEImprimirDiaganalDescendente(int[][] matriz) {
        recorrerPorFila(matriz); // O(n**2)
        imprimirDiaganalDescendente(matriz); // O(n)
    } // ¿ complejidad algoritmica estimida ?
    // peor caso
    // t(n)  se estima que pertenece a O(n**2)
 
    private static void imprimirDiaganalDescendente(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][i]);
        }
    }


    private static void recorrerPorFila(int[][] matriz) {
        // 1 + 2n + n = 1+3n
        for (int i = 0; i < matriz.length; i++) { 
            imprimirFila(matriz[i]); // n * f(n)
        }
    } // t(n) = 1+3n+n*f(n) = 1+3n*(1+5n)= 1+3n+15n^2 
    // t(n) pertenece a O(n**2)

    private static void imprimirFila(int[] fila) {
        // 1 + 2n + n = 1+3n
        for (int i = 0; i < fila.length; i++) {             
            System.out.println(fila[i]); // 2 n
        }
    } // f(n) = 1+5n   => O(n)
    // justificacion matematica, cota superior
    // f(n) <= c g(n)
    // termino dominante mas 1
    // 1+5n <= 6n
    // divido todo por n
    //  1/n+5n/n <= 6n/n   
    //  1/n+5 <= 6   
    // a partir de que valor se cumple ?
    // n0 > 0
    // f(n) pertenece a O(n) para c= 6 y desde n0 >= 1
}
