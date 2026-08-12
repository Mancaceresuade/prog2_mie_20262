public class Main {
    public static void main(String[] args) {


        int[] numeros = {5,6,7,8};
        numeros[3] = 10;
        // imprimirLista(numeros);
        int[][] matriz = {{4,5,9},{1,2,3},{2,3,1},{5,6,4}};
        // imprimirPorFila(matriz);
        imprimirPorColumna(matriz);
        // imprimirPorColumna(matriz);
    }

    private static void imprimirPorColumna(int[][] matriz) {
        for (int c = 0; c < matriz[0].length; c++) {
            imprimirColumna(matriz,c);
            System.out.println("");
        }
        // matriz[0][0] = 100;
    }
    private static void imprimirColumna(int[][] matriz, int c) {
        for (int f = 0; f < matriz.length; f++) {
            System.out.print(matriz[f][c] + " ");
        }
    }

    private static void imprimirPorFila(int[][] matriz) {
        for (int f = 0; f < matriz.length; f++) {
            imprimirLista(matriz[f]);
            System.out.println(" ");
            /*
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.println(matriz[f][c]);
            }
             */
        }
    }

    private static void imprimirLista(int[] numeros) {
        for (int i=0; i < numeros.length; i++) {
            System.out.print(numeros[i]+ " ");
        }
    }


}