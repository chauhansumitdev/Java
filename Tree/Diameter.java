package Tree;

/**
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root. The length of the path between two nodes is represented by the number of edges between them.
 */

 class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class Diameter {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int  = maxDepth(root,0);

        System.out.println("Diameter of the Binary Tree: " + diameter);
    }

    public static int maxDepth(TreeNode root, int count) {

        
        return 0; // Placeholder
    }
}
