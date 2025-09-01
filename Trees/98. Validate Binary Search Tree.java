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
    public boolean final_ans = true;
    public void recursiveTree(TreeNode root,long minVal, long maxVal){
        if(root == null)return;
        if((root.left != null && root.left.val >= root.val) || (root.right != null && root.right.val <= root.val) ){final_ans= false;return;}
        if(root.val <= minVal || root.val >= maxVal){final_ans = false;return;}
        recursiveTree(root.left,minVal,Math.min(maxVal,root.val));
        recursiveTree(root.right,Math.max(minVal,root.val),maxVal);
    }
    public boolean isValidBST(TreeNode root) {
        recursiveTree(root,Long.MIN_VALUE,Long.MAX_VALUE);
        return final_ans;
    }
}
