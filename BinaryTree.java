/* no debería necesitar importar nada, implemente usted su árbol */

/* de qué está formado un árbol? sería buena idea crear alguna clase para esto */
class Node {
    int val;
    Node izq;
    Node der;

    public Node(int val){
        this.val = val;
        this.izq = null;
        this.der = null;
    }
}

public class BinaryTree {

    Node raiz;

    public BinaryTree(){
        raiz = null;
    }

    public void meter(int num){
        if(raiz == null){
            raiz = new Node(num);
        } else {
            poner(raiz, num);
        }
    }

    private void poner(Node n, int num){
        if(num < n.val){
            if(n.izq == null){
                n.izq = new Node(num);
            } else {
                poner(n.izq, num);
            }
        } else {
            if(n.der == null){
                n.der = new Node(num);
            } else {
                poner(n.der, num);
            }
        }
    }

    public void ver(){
        verRec(raiz);
    }

    private void verRec(Node n){
        if(n == null){
            return;
        }
        verRec(n.izq);
        System.out.println(n.val);
        verRec(n.der);
    }
}

/*Esto de aquí es mera referencia pq no me acordaba plenamente ocmo hacer un árbol, esto lit sale
cuando se googlea "how to implement a binary tree java 21"
/*
public class Node {
    int data; // Data stored in the node
    Node left; // Reference to the left child
    Node right; // Reference to the right child

    public Node(int data) {
        this.data = data;
        this.left = null; // Initially no children
        this.right = null;
    }
}
*/


/*
public class BinaryTree {
    Node root; // The root node of the tree

    public BinaryTree() {
        this.root = null; // Initially an empty tree
    }

    // Method to insert a new node into the tree
    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data); // Insert new node here
        }

        if (data < current.data) {
            current.left = insertRecursive(current.left, data); // Go left
        } else if (data > current.data) {
            current.right = insertRecursive(current.right, data); // Go right
        }
        // If data is equal, you might handle duplicates (e.g., ignore or store in a list)

        return current;
    }

    // Example of in-order traversal (left, root, right)
    public void inOrderTraversal() {
        inOrderRecursive(root);
        System.out.println();
    }

    private void inOrderRecursive(Node node) {
        if (node != null) {
            inOrderRecursive(node.left);
            System.out.print(node.data + " ");
            inOrderRecursive(node.right);
        }
    }

    // You can add other traversal methods (pre-order, post-order) and search methods as needed.
}
*/