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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = new TreeNode(val,null,null);
        if(root == null)return node;
        if(val <= root.val){
            root.left = root.left == null ? node : insertIntoBST(root.left,val);
        }
        else{
           root.right = root.right == null ? node : insertIntoBST(root.right,val);
        }
        return root;
    }
}
