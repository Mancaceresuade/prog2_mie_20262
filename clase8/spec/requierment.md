# Requerimientos — Quitar el fondo de una imagen

Fuente: consigna de clase (C1–C4). Convención: `skill/skill.md`.

## Consigna
- C1: «Quiero subir una imagen desde una página y que me devuelva la
  misma imagen sin el fondo.»
- C2: «El fondo es el color que más aparece.»
- C3: «Que no me borre lo que está adentro de la figura aunque sea del
  mismo color que el fondo: el blanco de los ojos tiene que quedar.»
- C4: «Lo hacemos en Java, con lo que vimos: AVL y grafos.»

## Requerimientos funcionales

| ID | Requerimiento | Origen | Criterio de verificación |
|----|---------------|--------|--------------------------|
| RF-01 | El sistema debe permitir cargar una imagen PNG desde la página. | C1 | Se elige un PNG y se ve la imagen original en pantalla. |
| RF-02 | El sistema debe rechazar un archivo que no sea una imagen PNG, informando el motivo. | C1 | Al subir un `.txt` se muestra un mensaje de rechazo y no se procesa nada. |
| RF-03 | El sistema debe determinar el color de fondo como el color con más píxeles en la imagen. [NEEDS CLARIFICATION: C2 dice "el que más aparece", pero si la figura ocupa más de la mitad de la imagen el color más frecuente es el de la figura. ¿Se cuenta sobre toda la imagen o solo sobre el borde?] | C2 | Para una imagen de 10×10 con 64 píxeles blancos y 36 rojos, informa blanco. |
| RF-04 | El sistema debe volver transparentes los píxeles de fondo que estén conectados con el borde de la imagen a través de otros píxeles de fondo (vecinos: arriba, abajo, izquierda, derecha). | C1, C3 | En un cuadrado rojo sobre blanco, todos los blancos quedan transparentes y los rojos intactos. |
| RF-05 | El sistema debe conservar los píxeles del color de fondo que no estén conectados con el borde. | C3 | En un anillo rojo sobre blanco, el blanco interior del anillo no cambia. |
| RF-06 | El sistema debe considerar "de fondo" a un píxel cuyo color difiera del color de fondo en no más que una tolerancia. [NEEDS CLARIFICATION: ningún punto de la consigna define el valor de la tolerancia ni cómo se mide la diferencia entre dos colores.] | C3 | Con tolerancia 0, solo se quitan los píxeles de color idéntico al fondo. |
| RF-07 | El sistema debe mostrar la imagen original y la resultante una al lado de la otra. | C1 | Tras procesar, se ven ambas en pantalla. |
| RF-08 | El sistema debe informar el color de fondo detectado, cuántos píxeles tiene y cuántos se quitaron. | C2, C3 | En el caso del anillo, los píxeles quitados son menos que los píxeles del color de fondo. |
| RF-09 | El sistema debe permitir descargar la imagen resultante en PNG con transparencia. | C1 | El archivo descargado, abierto en otro programa, tiene fondo transparente. |

## Lo que NO es requerimiento funcional

| Origen | Texto | Categoría | Justificación |
|--------|-------|-----------|---------------|
| C4 | «Lo hacemos en Java…» | Restricción de implementación | Nombra un lenguaje, no una función. Se registra abajo como R-01. |
| C4 | «…con lo que vimos: AVL y grafos.» | Restricción de implementación (pedagógica) | No cambia qué hace el sistema sino cómo. Se registra como R-02 a R-04. |

## Restricciones de implementación

| ID | Restricción | Vincula a |
|----|-------------|-----------|
| R-01 | Java con JDK estándar; página servida por el propio programa. | todos |
| R-02 | El conteo de píxeles por color se guarda en el `AVL` de la materia, con un elemento por color distinto. | RF-03, RF-08 |
| R-03 | La región a quitar se obtiene con un recorrido en anchura (BFS) iterativo, donde cada píxel es un vértice y hay arista entre vecinos que son ambos "de fondo". | RF-04, RF-05 |
| R-04 | El grafo de píxeles es implícito: no se construye matriz de adyacencia ni se cargan los píxeles en `Grafo`. | RF-04 |
| R-05 | El procesamiento de la imagen ocurre en Java, no en el navegador. | todos |

## Casos de verificación (manuales, con imágenes de 10×10)

| Caso | Imagen | Resultado esperado | Verifica |
|------|--------|--------------------|----------|
| V1 | Cuadrado rojo de 6×6 centrado sobre blanco | 64 transparentes, 36 rojos | RF-03, RF-04 |
| V2 | Anillo rojo sobre blanco, con blanco adentro | El blanco interior se conserva | RF-05, RF-08 |
| V3 | Toda de un solo color | 100 transparentes | RF-04 |
| V4 | Un archivo `.txt` | Rechazo con mensaje | RF-02 |

## Conflictos, huecos y observaciones

- **Conflicto (RF-03):** C2 y C3 pueden contradecirse cuando la figura
  es más grande que el fondo. No se resuelve acá.
- **Hueco (RF-06):** falta el valor de tolerancia y la forma de medir
  la diferencia entre colores.
- **Hueco:** la consigna no dice qué pasa con imágenes JPG ni con PNG
  que ya traen transparencia. Quedan fuera de alcance hasta aclararlo.
- **Hueco:** no hay límite de tamaño de imagen ni tiempo máximo de
  respuesta (RNF sin métrica).
- **Observación técnica:** el `AVL` actual solo tiene `agregar`, y
  `ArbolBinarioBusqueda` lanza excepción ante un elemento repetido.
  R-02 exige poder buscar un color y actualizar su contador: es una
  operación nueva sobre una clase existente y requiere confirmación
  previa según la skill.
