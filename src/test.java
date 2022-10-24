public class test {
    public static void main(String[] args) {

        Three three = new Three();

        Node A = new Node(12);
        Node B = new Node(5);
        Node C = new Node(15);
        Node D = new Node(3);
        Node E = new Node(7);
        Node F = new Node(13);
        Node G = new Node(17);
        Node H = new Node(1);
        Node I = new Node(9);
        Node J = new Node(4);
        Node K = new Node(6);

        Node L = new Node(0);
        Node M = new Node(2);
        Node N = new Node(8);
        Node O = new Node(10);
        Node P = new Node(11);
        Node Q = new Node(12);

        three.addNode(three.root, A);
        three.addNode(three.root, B);
        three.addNode(three.root, C);
        three.addNode(three.root, D);
        three.addNode(three.root, E);
        three.addNode(three.root, F);
        three.addNode(three.root, G);
        three.addNode(three.root, H);
        three.addNode(three.root, I);
        three.addNode(three.root, J);
        three.addNode(three.root, K);

        System.out.println("\n\nShowing the binary tree ...\n");
        three.showThree(three.root, "", "");

        System.out.println("\n\nDeleting Nodes ...\n");

        three.deleteNode(three.root, B);
        System.out.println("Node : " + B.number + " deleted");
        three.deleteNode(three.root, E);
        System.out.println("Node : " + E.number + " deleted");
        three.deleteNode(three.root, H);
        System.out.println("Node : " + H.number + " deleted");
        three.deleteNode(three.root, I);
        System.out.println("Node : " + I.number + " deleted");
        three.deleteNode(three.root, C);
        System.out.println("Node : " + C.number + " deleted");


        System.out.println("\n\nShowing the binary tree ...\n");
        three.showThree(three.root, "", "");


        System.out.println("\n\nAdding new nodes ...\n");

        three.addNode(three.root, O);
        three.addNode(three.root, Q);
        three.addNode(three.root, L);
        three.addNode(three.root, P);
        three.addNode(three.root, M);
        three.addNode(three.root, N);

        System.out.println("\n\nShowing the binary tree ...\n");
        three.showThree(three.root, "", "");

    }
}