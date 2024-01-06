package Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    public TreeNode(int val) {
        this.val = val;
    }
}

public class PathSumInTrees {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null && targetSum - root.val == 0) {
            return true;
        }

        boolean leftResult = hasPathSum(root.left, targetSum - root.val);
        boolean rightResult = hasPathSum(root.right, targetSum - root.val);

        return leftResult || rightResult;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22;

        PathSumInTrees solution = new PathSumInTrees();
        boolean result = solution.hasPathSum(root, targetSum);

        System.out.println(result); 
    }
}
