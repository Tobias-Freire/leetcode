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
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<Integer>();
        
        List<Integer> result = new ArrayList<Integer>();
        auxFn(root, result);
        return result;
    }

    public void auxFn(TreeNode root, List<Integer> result) {
        if (root == null) return;

        auxFn(root.left, result);
        result.add(root.val);
        auxFn(root.right, result);
    }
}