package Tree;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int value) {
        val = value;
        left = right = null;
    }
}

public class SymmetricTree {

    public static boolean isSymmetric(TreeNode left, TreeNode right) {
        // brute force is to check every nodes left and right node and !eq || eq the nodes equal are to be in opposite 
        // positions like leftnodeval == rightnodeval
        // another approach would be to traverse the left and right subtree individually then adding to any data structure like queue or stack and trversing it then checking for equality

        if(right == null || left == null ){
            return left == right;
        }

        if(left.val == right.val){
            return false;
        }

        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }

    public static void main(String[] args) {
        // Example tree construction:
        // Symmetric Tree:
        //        1
        //       / \
        //      2   2
        //     / \ / \
        //    3  4 4  3

        TreeNode symmetricRoot = new TreeNode(1);
        symmetricRoot.left = new TreeNode(2);
        symmetricRoot.right = new TreeNode(2);
        symmetricRoot.left.left = new TreeNode(3);
        symmetricRoot.left.right = new TreeNode(4);
        symmetricRoot.right.left = new TreeNode(4);
        symmetricRoot.right.right = new TreeNode(3);

        boolean symmetricResult = isSymmetric(symmetricRoot.left, symmetricRoot.right);

        System.out.println("Is the tree symmetric? " + symmetricResult);


        // Example tree construction:
        // Non-symmetric Tree:
        //        1
        //       / \
        //      2   2
        //       \   \
        //        3   3

        TreeNode nonSymmetricRoot = new TreeNode(1);
        nonSymmetricRoot.left = new TreeNode(2);
        nonSymmetricRoot.right = new TreeNode(2);
        nonSymmetricRoot.left.right = new TreeNode(3);
        nonSymmetricRoot.right.right = new TreeNode(3);

        boolean nonSymmetricResult = isSymmetric(nonSymmetricRoot.left, nonSymmetricRoot.right);

        System.out.println("Is the tree symmetric? " + nonSymmetricResult);
    }
}

