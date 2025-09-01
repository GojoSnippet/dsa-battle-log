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
    public int count = 0;
    public void recursiveTree(TreeNode root,int maxVal){
        if(root == null)return;
        if(root.val >= maxVal)this.count++;
        maxVal = Math.max(root.val,maxVal);
        recursiveTree(root.left,maxVal);
        recursiveTree(root.right,maxVal);
        return;
    }
    public int goodNodes(TreeNode root) {
        recursiveTree(root,root.val);
        return count;
    }
}
