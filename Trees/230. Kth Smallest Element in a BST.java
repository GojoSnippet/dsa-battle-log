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
    public int counter=0;
    public int final_ans;
    public void recursiveTree(TreeNode root,int k){
        if(root == null)return ;
        recursiveTree(root.left,k);
        counter++;
        if(counter == k)final_ans = root.val;
        recursiveTree(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        recursiveTree(root,k);
        return final_ans;
    }
}
