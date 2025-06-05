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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        List<Integer> result1 = new ArrayList<Integer>();
        List<Integer> result2 = new ArrayList<Integer>();

        auxFn(p, result1);
        auxFn(q, result2);

        return result1.equals(result2);

    }

    public void auxFn(TreeNode root, List<Integer> result) {
        if (root == null) {
            result.add(null);
            return;
        }

        result.add(root.val);
        auxFn(root.left, result);
        auxFn(root.right, result);
    }
}