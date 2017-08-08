/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise;

/**
 *
 * @author BLANK
 */
public class TestBinaryTree {

    public static void main(String[] args) {
        // Create a BST
        BinaryTree<String> tree = new BinaryTree<String>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");

        // Traverse tree
        System.out.print("Inorder (sorted): ");
        tree.inorder();
        System.out.print("\nPostorder: ");
        tree.postorder();
        System.out.print("\nPreorder: ");
        tree.preorder();
        System.out.print("\nThe number of nodes is " + tree.getSize());

        // Search for an element
        System.out.print("\nIs Peter in the tree? "
                + tree.search("Peter"));

        // Get a path from the root to Peter
        System.out.print("\nA path from the root to Peter is: ");
        java.util.ArrayList<BinaryTree.TreeNode<String>> path
                = tree.path("Peter");
        for (int i = 0; path != null && i < path.size(); i++) {
            System.out.print(path.get(i).element + " ");
        }

        Integer[] numbers = {2, 4, 3, 1, 8, 5, 6, 7};
        BinaryTree<Integer> intTree = new BinaryTree<Integer>(numbers);
        System.out.print("\nInorder (sorted): ");
        intTree.inorder();

        Integer[] numberList = {19,2,3,15,16,8,1,11,12,17,18,9,10,4,5,6,7,13,14,20};
        BinaryTree<Integer> treeNumber = new BinaryTree<Integer>(numberList);
      
        System.out.println("\nNumber of leaves : " + treeNumber.getNumberOfLeaves());
        System.out.print("Inorder (sorted): ");
        treeNumber.inorder();
        System.out.println("\nTotal: " + treeNumber.getSum());
    }
}
