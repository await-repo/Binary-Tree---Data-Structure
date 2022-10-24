public class Three {

    /*
        El nodo root es la raiz del arbol binario
    */
    Node root;

    /*
        La variable min sirve de auxiliar cuando se trata de encontrar el menor nodo de una subrama,
        mas adelante utilizaremos el metodo findMinimumNode para encontrar el menor nodo de una subrama derecha
    */
    Node min;
    /*
        La variable preview sirve como auxiliar para indicar el nodo previo al valor minimo de una subrama, se
        utiliza en el metodo findMinimumNode para establecer una posicion previa antes del nodo min
    */
    Node preview;

    Three () {
        this.root = null;
    }

    Three(Node root) {
        this.root = root;
    }

    /*
        Los nodos se agregar de la siguiente forma :

            Los nodos de menor valor siempre se añadiran a la izquierda del padre
            Los nodos de mayor valor siempre se añadiran a la derecha del padre
            Solo hay dos hijos (Nodos izquierdo y Nodo derecho)
            No se aceptan dos o más nodos del mismo valor (No se agregam duplicados)
    */
    void addNode (Node father, Node node) {

        /*
            Cuando la raiz es nula agregamos el primer nodo recibido como el nodo raiz
        */
        if (root == null) {
            root = node;
            return;
        }

        /*
            Comprobamos que los nodos hijos no sean nulos
        */

        /*
            Si el hijo izquierdo es nulo y el valor del nodo (hijo) es menor a su padre entonces el hijo
            izquierdo del padre sera el valor del nodo a ingresar
        */
        if (father.left == null && node.number < father.number) {
            father.left = node;
            return;
        }
        /*
            Si el hijo derecho es nulo y el valor del nodo (hijo) es menor a su padre entonces el hijo
            derecho del padre sera el valor del nodo a ingresar
        */
        if (father.right == null && node.number > father.number) {
            father.right = node;
            return;
        }

        /*
            El grafo no permite nodos repetidos
        */
        if (node.number == father.number){
            System.out.println("El nodo que intenta agregar (" + node.number + ") ya existe en el Arbol Binario\n");
            return;
        }

        /*
            Si los dos hijos no son nulos recorremos el arbol recursivamente, si el nodo es menor al valor
            del padre recorremos a la izquierda y si el nodo es mayor al valor del padre entonces recorremos
            a la derecha
        */
        if (node.number < father.number) {
            addNode(father.left, node);
        } else { /*if (number > father.number)*/
            addNode(father.right, node);
        }
    }


    void deleteNode(Node father, Node node) {
        /*
            Si la raiz es nula entonces retornamos ya que eñ arbol esta vacio
        */
        if (root == null) {
            return;
        }
        /*
            Si la raiz es igual al nodo actual el nuevo valor de la raiz será el proximo valor de sus hijos,
            ya sea la subrama derecha o la izquierda (si no hay hijo derecho)
        */
        if (root.number == node.number) {
            root = nextNodeOf(root);
            return;
        }
        /*
            Si el padre es nullo simplemente retornamos
        */
        if (father == null) {
            return;
        }

        /*
            Si el hijo izquierdo del padre no es nulo y el hijo izquierdo coincide con el valor del
            nodo a remover entonces el nuevo hijo izquierdo del padre será el nodo siguiente del nodo
            a remover
        */
        if (father.left != null && father.left.number == node.number) {
            father.left = nextNodeOf(node);
            return;
        }
        /*
            Si el hijo derecho del padre no es nulo y el hijo derecho coincide con el valor del
            nodo a remover entonces el nuevo hijo derecho del padre será el nodo siguiente del nodo
            a remover
        */
        if (father.right != null && father.right.number == node.number) {
            father.right = nextNodeOf(node);
            return;
        }

        deleteNode(father.left, node);
        deleteNode(father.right, node);
    }


    Node nextNodeOf(Node node) {
        if (node.left != null && node.right != null) {
            /*
                Si el nodo tiene a sus dos hijos entonces debemos encontrar al nodo de menor valor
                de la subrama derecha
            */
            deleteMinNode(node);
            return node;
        } else {
            /*
                Si el nodo no tiene a sus dos hijos eontonces buscamos su caso de eliminacion especifico
            */
            return eliminationCases(node);
        }
    }

    /*
        Son los casos de eliminacion, dependiendo de la cantidad de hijos sera el nodo que retorne
    */
    Node eliminationCases(Node node) {
        if ( isLeaf(node) ) { /*Si el nodo no tiene hijos retorna null*/
            return null;
        } else if (node.left == null) { /*Si el hijo izquierdo es nulo retorna el hijo derecho*/
            return node.right;
        } else { /*Si el hijo derecho es nulo entonces retorna al hijo izquierdo*/
            return node.left;
        }
    }

    void deleteMinNode (Node node) {
        preview = node;
        min = node.right; /*Se toma el primer valor de la subrama derecha*/
        findMinimumNode( min ); /*Buscamos el menor nodo de toda la subrama derecha*/
        node.number = min.number;

        /*
            Como el nodo preview esta un nodo antes del nodo con el valor minimo, si el hijo izquierdo de preview
            tiene el valor de min entonces el hijo izquierdo apunta hacia al valor proximo nodo despues de min
        */
        if (preview.left.number == min.number) {
            preview.left = eliminationCases(min);
            return;
        }
        /*
            Como el nodo preview esta un nodo antes del nodo con el valor minimo, si el hijo derecho de preview
            tiene el valor de min entonces el hijo derecho apunta hacia al valor proximo nodo despues de min
        */
        if (preview.right.number == min.number) {
            preview.right = eliminationCases(min);
            return;
        }
    }


    /*
        Busca el nodo de menor valor dentro de una subrama (en este caso la subrama derecha) establece que
        el nodo previo esta antes del nodo minimo, una vez ubicados el nodo preview y el nodo min entonces
        conectamos el nodo preview al nodo siguiente del nodo min
    */
    void findMinimumNode(Node node) {
        if (node == null) {
            return;
        }
        /*
            Si el nodo a su izquierda no es nulo y además el minimo es mayor al hijo izquierdo de node entonces
            se establece que el valor minimo sera el hijo izquierdo de node, preview estara un nodo antes de min
        */
        if (node.left != null && min.number > node.left.number) {
            min = node.left;
            preview = node;
        }
        /*
            Si el nodo min es mayor al hijo izquierdo del hijo derecho de node el valor del nodo min sera
            el valor del hijo derecho de node, el nodo preview estara antes de min
        */
        if (node.right != null && min.number > node.right.number) {
            min = node.right;
            preview = node;
        }
        findMinimumNode(node.left);
        findMinimumNode(node.right);
    }

    /*
        Un nodo es hoja cuando su hijo izquierdo e hijo derecho son nulos
    */
    boolean isLeaf (Node node) {
        if (node == null) {
            return false;
        }
       return node.left == null && node.right == null;
    }

    /*
        Mostrar el Arbol Binario
    */
    void showThree(Node node, String tab, String direction) {

        if (node == null) {
            System.out.println( tab + direction + "null" );
            return;
        }

        System.out.println( tab + direction + "Node { \n" + tab + "\t\tNumber : " + node.number );
        tab = tab + "\t\t";
        showThree(node.left, tab, "left -> ");
        showThree(node.right, tab, "right -> ");
        System.out.println( tab + "}" );
    }

}