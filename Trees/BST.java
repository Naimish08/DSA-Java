package Trees;

import java.util.Scanner;

class BinarySearchTree {
    private Node root;
    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    public void root_populate(Scanner s){
        System.out.println("Enter the root Node:\n");
        int x = s.nextInt();
        root = new Node(x);
        populate(s,root);
    }
    private void populate(Scanner s, Node node){
        System.out.println("Do you want to enter the left of "+node.value+"(true/false)");
        boolean res_left = s.nextBoolean();
        if(res_left){
            System.out.println("Enter the value of left Node");
            int x = s.nextInt();
            if(x < node.value){
                node.left = new Node(x);
                populate(s,node.left);
            }
            else{
                System.out.println("Can't add this value as it is greater than the root:  "+node.value);
            }

        }
        System.out.println("Do you want to enter the right of "+node.value+"(true/false)");
        boolean res_right = s.nextBoolean();
        if(res_right){
            System.out.println("Enter the value of right Node");
            int x = s.nextInt();
            if(x > node.value){
                node.right = new Node(x);
                populate(s,node.right);
            }
            else{
                System.out.println("Can't add this value as it is less than the root:  "+node.value);
            }
        }
    }
    void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.value);
        inorder(root.right);
    }
}
public class BST {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinarySearchTree Tree = new BinarySearchTree();
        Tree.root_populate(s);
        System.out.println("New commit done to check for github");
    }

}
