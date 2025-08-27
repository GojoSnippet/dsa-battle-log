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
    private int maxValue = 0;
    public int maxDiam(TreeNode root){
        if(root == null)return 0;
        int left = maxDiam(root.left);
        int right = maxDiam(root.right);
        this.maxValue = Math.max(this.maxValue,left+right);
        return Math.max(1+ left,1+ right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        maxDiam(root);
        return this.maxValue;
    }
}
