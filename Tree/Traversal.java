package Tree;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class Traversal {

    // Example binary tree
    //       1
    //      / \
    //     2   3
    //    / \
    //   4   5

    // Driver function
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("\nIn-Order Traversal:");
        inOrderTraversal(root);

        System.err.println("\nPre-Order Traversal:");
        preOrderTraversal(root);

         System.err.println("\nPre-Order Traversal:");
        postOrderTraversal(root);
    }

    
    public static void inOrderTraversal(TreeNode root) {
        if(root == null){
            return;
        }

        inOrderTraversal(root.left);
        System.out.println(root.val);
        inOrderTraversal(root.right);
    }

    public static void preOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }

        System.out.println(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void postOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.val);
    }
}
