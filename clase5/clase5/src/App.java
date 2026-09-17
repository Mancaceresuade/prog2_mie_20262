public class App {
    public static void main(String[] args) throws Exception {

        ArbolBinarioBusqueda<Integer> abb = new ArbolBinarioBusqueda<>();
        abb.agregar(10);
        abb.agregar(15);
        abb.agregar(30);
        abb.agregar(50);
        abb.agregar(150);

        abb.imprimirPostOrder();

        // Nodo<Integer> prueba = new Nodo<Integer>(34);
        // injección en constructor, usando agregacion
        // ArbolBinario<Integer> arbolBinario1 = new ArbolBinario<>(prueba);


        //int[] numeros = {4,5,6,1}; // 16
        //System.out.println(calcularSuma(numeros));

        /*
        ArbolBinario<Integer> arbolBinario = new ArbolBinario<Integer>();

        arbolBinario.inicializaArbol();
        arbolBinario.agregarRaiz(6);
        arbolBinario.agregarANodoHijoIzq(6, 20);
        arbolBinario.agregarANodoHijoDer(6, 8);
        arbolBinario.agregarANodoHijoIzq(20, 100);
        arbolBinario.agregarANodoHijoDer(20, 5);
        arbolBinario.agregarANodoHijoDer(8, 9);
        arbolBinario.agregarANodoHijoIzq(100, 900);

         */
        //arbolBinario.agregarANodoHijoIzq(500, 90);

        //System.out.println(arbolBinario);
        //arbolBinario.imprimirPostOrder();
        //nivel 0
        //arbolBinario.imprimirNivel(0);
        //nivel 1
        //arbolBinario.imprimirNivel(1);
        //nivel 2
        //arbolBinario.imprimirNivel(2);

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
