public class App {
    public static void main(String[] args) throws Exception {
        int[][] matriz = {{3,4,5},{1,2,3},{3,2,1}};
        imprimirPorFila(matriz);
    }
    private static void imprimirPorFila(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            imprimirFila(matriz[i]);
        }
    }
    private static void imprimirFila(int[] fila) {
        for (int i = 0; i < fila.length; i++) {
            System.out.println(fila[i]);
        }
    }
    
}
