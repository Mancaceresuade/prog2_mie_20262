import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;


public class SistemaTest {

    // caso prueba 1: obtener producto
    @Test
    void dadoUnIdExistenteDeberiaObtenerElProducto() {
        // preparar
        Sistema sistema = new Sistema();
        sistema.agregarProducto("1000", "Silla");
        // procesar
        Producto productoObtenido = sistema.obtenerProducto("1000");
        // comparar     
        Producto productoEsperado = new Producto("1000", "Silla");
        assertEquals(productoEsperado, productoObtenido);      
    }

    // caso prueba 2
    @Test
    void tresProductosCargadosDeberiaDevolverTres() {
        // preparar
        Sistema sistema = new Sistema();
        sistema.agregarProducto("1000", "Silla");
        sistema.agregarProducto("1001", "Silla 1");
        sistema.agregarProducto("1002", "Silla 2");
        // procesar
        int cantidadProductosObtenido = sistema.cantidadProductos();
        // comparar
        assertEquals(cantidadProductosObtenido, 3);
    }


}
