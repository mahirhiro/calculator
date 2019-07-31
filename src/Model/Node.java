package Model;

public class Node {
    static int decider;
    static char checker;
    static Node root = null;
    char data;
    Node left;
    Node right;

    public Node(char data) {
        this.data = data;
    }
}
