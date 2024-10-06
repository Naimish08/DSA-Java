package Trees;
import java.util.*;
class BinaryTree{
    private Node root;
    private static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }
    public void root_populate(Scanner s){
        System.out.println("Enter the root Node:\n");
        int x = s.nextInt();
        root = new Node(x);
        populate(s,root);
        Display(root,0);
    }
    private void populate(Scanner s,Node node){
        System.out.println("Do you want to enter the left of "+node.value+"(true/false)");
        boolean res_left = s.nextBoolean();
        if(res_left){
            System.out.println("Enter the value of left Node");
            int x = s.nextInt();
            node.left = new Node(x);
            populate(s,node.left);
        }
        System.out.println("Do you want to enter the right of "+node.value+"(true/false)");
        boolean res_right = s.nextBoolean();
        if(res_right){
            System.out.println("Enter the value of right Node");
            int x = s.nextInt();
            node.right = new Node(x);
            populate(s,node.right);
        }
    }
    private void Display(Node node,int level){
        if(node==null){
            return;
        }
        Display(node.right,level+1);
        if(level != 0){
            for (int i=0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------->"+node.value);
        }
        else{
            System.out.println(node.value);
        }
        Display(node.left,level+1);
    }
    ArrayList<Integer> arr = new ArrayList<>();
    void inorder(Node node){
        if (node==null){
            return;
        }
        inorder(node.left);
        arr.add(node.value);
        inorder(node.right);
    }
    void inorderprint(){
        inorder(root);
        System.out.println(arr);
    }
    void levelprint(){
        List<List<Integer>> ans = inlevel(root);
        System.out.println(ans);
    }
    List<List<Integer>> inlevel(Node node){
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        List<Integer> level = new ArrayList<>();
        if(node == null){
            return ans;
        }
        q.add(node);
        while (!q.isEmpty()){
            int size = q.size();
            for (int i=0;i<size;i++){
                Node Treenode = q.poll();
                level.add(Treenode.value);
                if(Treenode.left != null){
                    q.add(Treenode.left);
                }
                if(Treenode.right != null){
                    q.add(Treenode.right);
                }
                ans.add(level);
            }
        }
        return ans;
    }
}
public class TreesImplementation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.root_populate(s);
        tree.inorderprint();
        tree.levelprint();
    }
}
