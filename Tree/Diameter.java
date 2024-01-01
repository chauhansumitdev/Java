package Tree;

/**
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
 * This path may or may not pass through the root. The length of the path between two nodes is
 * represented by the number of edges between them.
 * // Example tree construction: // 1 // / \ // 2   3 // / \ // 4   5
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

        int[] diameter = {0};

        maxDepth(root, diameter);

        System.out.println("Diameter of the Binary Tree: " + diameter[0]);
    }

    public static int maxDepth(TreeNode root, int[] diameter) {
        // Brute force is to traverse through every node and add the current node's left height
        // and right height and store the max of every node.

        if (root == null) {
            return 0;
        }

        int leftHeight = maxDepth(root.left, diameter);
        int rightHeight = maxDepth(root.right, diameter);

        diameter[0] = Math.max(diameter[0], leftHeight + rightHeight);

        return 1 + Math.max(rightHeight, leftHeight);
    }
}
