package Tree;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class MaximumDepth {

    // Example Binary Tree
    //       1
    //      / \
    //     2   3
    //    / \
    //   4   5
    // ans - 3 - 3 levels

    // Driver function
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Example Binary Tree:");
        printTree(root);

        int maxDepth = maxDepth(root);

        System.out.println("\nMaximum Depth: " + maxDepth);
    }

    public static void printTree(TreeNode root) {
        if (root != null) {
            printTree(root.left);
            System.out.print(root.val + " ");
            printTree(root.right);
        }
    }

    public static int maxDepth(TreeNode root) {

        if(root == null){
            return 0;
        }

        // level order traversal - bfs

        int count = 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++) {
                TreeNode current = q.poll();
               
                if(current.left != null){
                    q.offer(current.left);
                }

                if(current.right != null){
                    q.offer(current.right);
                }
            }
            count++;
        }

        return count; 
    }
}
