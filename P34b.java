import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class P34b {
    Node root;

    // Method to print leaf nodes
    public void printLeafNodes(Node node) {
        if (node == null)
            return;

        if (node.left == null && node.right == null)
            System.out.print(node.data + " ");

        printLeafNodes(node.left);
        printLeafNodes(node.right);
    }

    public static void main(String args[]) {
        P34b tree = new P34b();

        // Creating the binary search tree
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(40);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(80);

        // Printing the leaf nodes of the binary search tree
        System.out.println("BST Leaf Nodes are : ");
        tree.printLeafNodes(tree.root);
    }
}
