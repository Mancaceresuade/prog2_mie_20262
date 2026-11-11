public class App {
    public static void main(String[] args) throws Exception {
        Grafo grafo = new Grafo();
        grafo.inicializarGrafo();

            public static void bfs(IGrafoTDA grafo, int origen) {
        Set<Integer> visitados = new HashSet<>();
        Queue<Integer> cola = new LinkedList<>();

        visitados.add(origen);
        cola.add(origen);

        while (!cola.isEmpty()) {
            int actual = cola.poll();
            System.out.print(actual + " ");

            for (int vecino : grafo.vertices()) {
                if (grafo.existeArista(actual, vecino) && !visitados.contains(vecino)) {
                    visitados.add(vecino);
                    cola.add(vecino);
                }
            }
        }
    }

    public static void dfs(IGrafoTDA grafo, int origen) {
        Set<Integer> visitados = new HashSet<>();
        dfsRecursivo(grafo, origen, visitados);
    }

    private static void dfsRecursivo(IGrafoTDA grafo, int actual, Set<Integer> visitados) {
        visitados.add(actual);
        System.out.print(actual + " ");

        for (int vecino : grafo.vertices()) {
            if (grafo.existeArista(actual, vecino) && !visitados.contains(vecino)) {
                dfsRecursivo(grafo, vecino, visitados);
            }
        }
    }

    }
}
