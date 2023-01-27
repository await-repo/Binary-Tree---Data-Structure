## **Árbol Binario**

El proyecto contiene las siguientes clases:

* **`Three`** donde se establece la lógica de los métodos para manipular un Árbol Binario.
* **`Node`** contiene la informacion de un nodo, un nodo tiene dos apuntadores el primero hacía el próximo nodo izquierdo y el segundo hacía el próximo nodo derecho.
* **`test`** prueba un ejemplo para observar el funcionamiento del Árbol Binario.

### **Tipo de Árbol**

A continuación describimos las caracteristicas de un Árbol Binario.

**Árbol Binario**, en los árboles binarios los nodos de cada rama pueden estar desbalanceados, la única condicion que deben tener es que cada nodo tenga solo dos apuntadores: hijo izquierdo e hijo derecho. Además, un arbol binario debe tener a sus hijos ordenados de la siguiente manera, los hijos izquierdo de menor valor siempre deben estar más a la izquierda mientras que los hijos derechos de mayor valor siempre deben estar más a la derecha.

En el siguiente ejemplo mostramos un árbol binario, notese el orden en el que los Nodos son agregados al árbol. Desde el primer Nodo que se agrego (Nodo 5) después se agregaron dos Nodos (Nodo 6 y Nodo 3) es importante observar el orden en que se van agregando los nodos, específicamente la dirección de los Nodos. 

![ThreeExample1](https://user-images.githubusercontent.com/115047831/214984037-f09131a2-0699-4b1b-9398-630b2143ebd6.PNG)

## Ejemplo de cómo se agregan los Nodos al Árbol

**Agregar** | **Imagen** | **Nota**
--- | --- | ---
**Nodo 5** | ![ThreeExample2](https://user-images.githubusercontent.com/115047831/214997315-35d23c12-d0f2-4f43-8757-43a33c4964ec.PNG) | Al ser el Nodo 5 el primer nodo, se le conciderá la raíz del árbol.
**Nodo 6** | ![ThreeExample3](https://user-images.githubusercontent.com/115047831/214997658-50c3d2fa-9a69-42e9-b7a1-e971a672ad38.PNG) | Al ser el Nodo 6 mayor que el nodo 5, se agrega a la derecha del Nodo 5 (El nodo 6 es el hijo derecho del Nodo 5).
**Nodo 3** | ![ThreeExample4](https://user-images.githubusercontent.com/115047831/214998155-96bb6819-5d39-4e53-ab63-f871b9e2f587.PNG) | Al ser el Nodo 3 menor que el nodo 5, se agrega a la izquierda del Nodo 5 (El nodo 6 es el hijo izquierda del Nodo 5).
**Nodo 7** | ![ThreeExample5](https://user-images.githubusercontent.com/115047831/214997896-43827d7a-6cd8-4548-aa37-810a2718b8f1.PNG) | Al ser el Nodo 7 mayor que el nodo 6, se agrega a la derecha del Nodo 6 (El nodo 7 es el hijo derecho del Nodo 6).
**Nodo 4** | ![ThreeExample6](https://user-images.githubusercontent.com/115047831/214998231-ccd66bfb-d81e-4d60-b7e8-d7bd6c39f3b3.PNG) | Al ser el Nodo 4 mayor que el nodo 3, se agrega a la derecha del Nodo 3 (El nodo 4 es el hijo derecho del Nodo 3).
**Nodo 2** | ![ThreeExample7](https://user-images.githubusercontent.com/115047831/214998450-c45f06e2-7433-46f2-84cc-1c542865eb3d.PNG) | Al ser el Nodo 2 menor que el nodo 3, se agrega a la izquierda del Nodo 3 (El nodo 2 es el hijo izquierdo del Nodo 3).
**Nodo 1** | ![ThreeExample8](https://user-images.githubusercontent.com/115047831/215181761-63649f28-d242-4cfc-959c-648ace27be86.PNG) | Al ser el Nodo 1 menor que el nodo 2, se agrega a la izquierda del Nodo 2 (El nodo 1 es el hijo izquierdo del Nodo 2).

## Eliminar Nodo

Un árbol binario tiene tres casos particulares para eliminar un nodo.

* **Nodo Hoja** si un nodo esta al final del arbol y no tiene nodos hijos (Nodo izquierdo y derecho son nulos) entonces simplemente se remueve el nodo del árbol.
* **Busca el menor de los Nodos en la sub rama derecha** el método buscará el valor mínimo de la rama derecha cuando lo encuentra copia su valor y elimina el dublicado de la sub rama.
* **Busca el mayor de los Nodos en  la sub rama izquierda** el método buscará el valor máximo de la rama izquierda cuando lo encuentra copia su valor y elimina el dublicado de la sub rama.

## Diagrama de clases con UML

> **Nota:** El siguiente diagrama de clases representa la lógica de programación utilizada para construir un **Árbol Binario**. La clase **test** no se incluye en el diagrama UML porque solo contiene el método main y únicamente es utilizada para demostrar el funcionamiento de los métodos del Árbol Binario.

![UML Three](https://user-images.githubusercontent.com/115047831/214981613-d6d92ac1-c396-4e81-905f-7625e1af3874.png)
