/* no debería necesitar importar nada, implemente usted su árbol */

public class BinaryTreeMain {

    public static void main (String[] args) {
        BinaryTree ab = new BinaryTree();

        int[] nums = {65, 44, 76, 31, 47, 48, 67, 64, 78, 74};

        for(int n : nums){
            ab.meter(n);
        }

        ab.ver();
    }
}
/* Más del mismo ejemplo de google*/
/* public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.print("In-order traversal: ");
        tree.inOrderTraversal(); // Expected output: 20 30 40 50 60 70 80 
    }
}

*/