package Trees;
class BinarySearchTree{
    Node Insert(Node root,int data){
        Node newNode = new Node(data);
        if(root==null){
            root = newNode;
            return root;
        }
        else if(root.val>data){
            root.left = Insert(root.left,data);
        }
        else{
            root.right = Insert(root.right,data);
        }
        return root;
    }
    void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print("\t"+root.val+"\t");
        Inorder(root.right);
    }
}
class Node{
    Node left;
    int val;
    Node right;
    int height;
    public Node(){
    }
    public Node(int val) {
        this.val = val;
        left = null;
        right = null;
        height = 0;
    }
}
public class BST {
    public static void main(String[] args) {
        Node root = new Node();
        BinarySearchTree tree = new BinarySearchTree();
        root = tree.Insert(null,9);
        root = tree.Insert(root,10);
        root = tree.Insert(root,7);
        tree.Inorder(root);
    }
}
