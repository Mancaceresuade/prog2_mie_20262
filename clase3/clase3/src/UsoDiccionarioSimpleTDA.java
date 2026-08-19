public class UsoDiccionarioSimpleTDA {
    public static void main(String[] args) {
        IDiccionarioSimpleTDA diccionarioSimpleTDA
            = new DiccionarioSimple();
        diccionarioSimpleTDA.inicializarDiccionario();
        diccionarioSimpleTDA.agregar(100, 1000);    
    }
}
