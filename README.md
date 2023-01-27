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

## Eliminar Nodo

Un árbol binario tiene tres casos particulares para eliminar un nodo.

* **Nodo Hoja** si un nodo esta al final del arbol y no tiene nodos hijos (Nodo izquierdo y derecho son nulos) entonces simplemente se remueve el nodo del árbol.
* **Busca el menor de los Nodos en la sub rama derecha** el método buscará el valor mínimo de la rama derecha cuando lo encuentra copia su valor y elimina el dublicado de la sub rama.
* **Busca el mayor de los Nodos en  la sub rama izquierda** el método buscará el valor máximo de la rama izquierda cuando lo encuentra copia su valor y elimina el dublicado de la sub rama.

## Diagrama de clases con UML

> **Nota:** El siguiente diagrama de clases representa la lógica de programación utilizada para construir un **Árbol Binario**. La clase **test** no se incluye en el diagrama UML porque solo contiene el método main y únicamente es utilizada para demostrar el funcionamiento de los métodos del Árbol Binario.

![UML Three](https://user-images.githubusercontent.com/115047831/214981613-d6d92ac1-c396-4e81-905f-7625e1af3874.png)
