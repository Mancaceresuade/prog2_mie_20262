public class App {
    public static void main(String[] args) throws Exception {
        //int[] numeros = {4,5,6,1}; // 16
        //System.out.println(calcularSuma(numeros));
        ArbolBinario<Integer> arbolBinario = new ArbolBinario<>();
        arbolBinario.inicializaArbol();
        arbolBinario.agregarRaiz(6);
        arbolBinario.agregarANodoHijoIzq(6, 2);
        //System.out.println(arbolBinario);
        arbolBinario.imprimirPostOrder();


    }
    private static int calcularSuma(int[] numeros) {
        return  calcularSumaRec(numeros,numeros.length-1);
    }
	private static int calcularSumaRec(int[] numeros, int i) { // apila y desapila en memoria
        if(i == 0) return numeros[i];
        return numeros[i] + calcularSumaRec(numeros, i-1);
	}    
    // Apila i=3 => 1 + calcularSumaRec(int[] numeros, 2)
    // Apila i=2 => 1 + calcularSumaRec(int[] numeros, 1)
    // Apila i=1 => 1 + calcularSumaRec(int[] numeros, 0)
    // Caso base
    // desapila 1
    // desapila 1+6
    // desapila 7+5
    // desapila 12+4
    // 16
}
