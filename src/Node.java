public class Node {

    int number;
    Node left;
    Node right;

    Node (int number) {
        this.number = number;
        this.left = null;
        this.right = null;
    }

    Node (int number, Node left, Node right) {
        this.number = number;
        this.left = left;
        this.right = right;
    }

    Node (Node node) {
        this.number = node.number;
        this.left = node.left;
        this.right = node.right;
    }

    @Override
    public String toString() {
        return "Node {\n" +
                "\tnumber = " + number + ",\n" +
                "\tleft = " + left + ",\n" +
                "\tright = " + right + "\n}";
    }
}
