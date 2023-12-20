package Tree;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class LowestCommonAncestor {
    

    // Example Binary Search Tree (BST)
    //       6
    //      / \
    //     2   8
    //    / \ / \
    //   0  4 7  9
    //      / \
    //     3   5

    // Driver function
    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        System.out.println("Example Binary Search Tree:");
        printTree(root);

        TreeNode p =  root.left.left; 
        TreeNode q = root.right.right; 
        TreeNode lca = lowestCommonAncestor(root, p, q);

        // Output
        System.out.println("\nLowest Common Ancestor of " + p.val + " and " + q.val + ": " + lca.val);
    }

    public static void printTree(TreeNode root) {
        if (root != null) {
            printTree(root.left);
            System.out.print(root.val + " ");
            printTree(root.right);
        }
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return root;
        }
    
        if (root.val < q.val && root.val < p.val) {
            return lowestCommonAncestor(root.right, p, q); 
        }
    
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q); 
        }
    
        if (root.val > p.val && root.val < q.val) {
            return root;
        }
    
        return null; 
    }
    
}

