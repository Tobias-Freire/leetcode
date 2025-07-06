/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        int currentSum = 0;
        return auxFn(root, currentSum, targetSum);
    }

    public boolean auxFn(TreeNode root, int currentSum, int targetSum) {
        

        if (root.left == null && root.right == null) {
            if (currentSum + root.val == targetSum) return true;
        } else {
            if (root.left != null && root.right != null){
                return auxFn(root.left, currentSum + root.val, targetSum) || auxFn(root.right, currentSum + root.val, targetSum);
            } else if (root.left != null) {
                return auxFn(root.left, currentSum + root.val, targetSum);
            } else if (root.right != null) {
                return auxFn(root.right, currentSum + root.val, targetSum);
            }
        }

        return false;
    }
}