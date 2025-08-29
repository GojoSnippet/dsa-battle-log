/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public int low;
    public int high;
    public TreeNode lca(TreeNode root){
        if(low <= root.val && high >= root.val)return root;
        if(low > root.val && high > root.val)return lca(root.right);
        else return lca(root.left);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        low = Math.min(p.val,q.val);
        high = Math.max(p.val,q.val);
        return lca(root);        
    }
}
