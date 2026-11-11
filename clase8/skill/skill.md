# Skill: implementación con los TDAs de la materia (Programación II)

## Alcance por defecto — no agregar sin pedirlo
Generar la solución MÁS SIMPLE posible:
- Proyecto Java plano: archivos en `src/`, sin paquetes, sin Maven ni Gradle.
- Solo JDK estándar. Sin librerías externas ni frameworks (ni Spring, ni
  OpenCV, ni librerías de imágenes).
- Sin capas, sin patrones de diseño, sin tests automatizados, sin README,
  salvo que se pidan por nombre.
- Si la tarea necesita más estructura de la pedida, DECIRLO Y PREGUNTAR
  antes de implementarlo.

## Estructuras de datos: se usan las de la materia
- Árboles y grafos: usar y extender las clases que ya existen en `src/`
  (`AVL`, `ArbolBinarioBusqueda`, `Nodo`, `IGrafoTDA`). No reemplazarlas
  por `TreeMap`, `HashMap`, `TreeSet` ni equivalentes de `java.util`.
- `Queue`, `LinkedList`, `Set` y `List` de `java.util` sí están permitidas
  como auxiliares de un recorrido, igual que en `AppGrafo.java`.
- Si una clase existente no alcanza (le falta una operación), no
  reescribirla: listar en el plan previo qué operación se agrega y por
  qué, y esperar confirmación.
- Los recorridos sobre estructuras grandes son iterativos. No usar
  recursión cuya profundidad dependa de la cantidad de datos.
- Mantener el estilo del código existente: nombres en español,
  precondiciones como comentario junto a la firma.

## Formato de entrega: programa Java + una sola página
- Un programa Java que se ejecuta desde `main` y sirve la página en
  `http://localhost:8080` con el servidor HTTP incluido en el JDK.
- Un único `index.html`, con CSS en `<style>` y JS en `<script>`. Sin
  frameworks ni CDN: debe funcionar sin internet.
- El JavaScript solo envía datos y muestra resultados. Toda la lógica
  del problema se ejecuta en Java.
- Los datos viven en memoria. Sin base de datos ni archivos temporales.
- Cada regla de la spec tiene que verse en pantalla: cuando el sistema
  rechaza algo o toma una decisión, muestra un mensaje que diga qué
  regla aplicó (citando el ID).

## Qué hacer con `[NEEDS CLARIFICATION]`
El código no puede elegir un valor por su cuenta:
1. En el plan previo, listar cada punto pendiente y preguntar.
2. Si el usuario dice que se avance sin resolverlo, implementarlo como
   parámetro visible y editable en la página, con un aviso de que está
   pendiente de confirmar.

## Confirmación obligatoria antes de escribir código
Presentar primero un plan breve: archivos a crear/modificar, operaciones
que se agregan a clases existentes y enfoque general (2-4 líneas).
Esperar confirmación explícita ("dale", "sí", "procedé").

## Trazabilidad
Cada método que implementa un requerimiento lleva un comentario con su
ID (`// RF-03`). Un RF sin código que lo cite, o código que no cita
ningún RF ni restricción, se informa al terminar.
