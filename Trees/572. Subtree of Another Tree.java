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
    public boolean isSub(TreeNode root,TreeNode subRoot){
        if(root == null && subRoot == null)return true;
        if((root == null && subRoot != null) || (root != null && subRoot == null) || root.val != subRoot.val)return false;
        return isSub(root.left,subRoot.left) && isSub(root.right,subRoot.right);
    }
    public int checktheRoot(TreeNode root,int leftNodesCount,int rightNodesCount,TreeNode subRoot){
        if(root == null)return 0;
        int left = checktheRoot(root.left,leftNodesCount,rightNodesCount,subRoot);
        if(left == -1)return -1;
        int right = checktheRoot(root.right,leftNodesCount,rightNodesCount,subRoot);
        if(right == -1)return -1;
        if(left == leftNodesCount && right == rightNodesCount && root.val == subRoot.val){
            boolean sub = isSub(root,subRoot);
            if(sub == true)return -1;
        }
        return left+right+1;
    }
    public int count(TreeNode root){
        if(root == null)return 0;
        return 1+ count(root.left) + count(root.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        int leftNodesCount = count(subRoot.left);
        int rightNodesCount = count(subRoot.right);
        return checktheRoot(root,leftNodesCount,rightNodesCount,subRoot)== -1? true: false;
    }
}
