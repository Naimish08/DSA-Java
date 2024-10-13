package Trees;

class TreeOperation{
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
    Node Deletion(Node root,int data){
        if(root==null){
            return null;
        }
        else if(root.val>data){
            root.left = Insert(root.left,data);
        }
        else if(root.val<data){
            root.right = Insert(root.right,data);
        }
        else{
            if(root==null){
                return null;
            }
            else if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            else{
                root.val = successordel(root);
                root.right = Deletion(root.right,root.val);
            }
        }
        return root;
    }
    Node search(Node root,int data){
        if(root==null){
            return null;
        }
        else if(root.val>data){
            return search(root.left,data);
        }
        else if(root.val<data){
            return search(root.right,data);
        }
         return root;
    }
    int max(Node root){
        if(root.right == null){
            return root.val;
        }
        return max(root.right);
    }
    int min(Node root){
        if(root.left == null){
            return root.val;
        }
        return min(root.left);
    }
    int successordel(Node curr){
        return min(curr.right);
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

public class AVL{
    public static void main(String[] args) {
        Node root = new Node();
        TreeOperation tree = new TreeOperation();
        root = tree.Insert(null,9);
        root = tree.Insert(root,5);
        root = tree.Insert(root,15);
        root = tree.Insert(root,4);
        root = tree.Insert(root,7);
        root = tree.Insert(root,14);
        root = tree.Insert(root,18);
        tree.Inorder(root);
        int a= tree.max(root);
    }
}
