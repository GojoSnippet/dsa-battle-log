class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = new TreeNode(val,null,null);
        if(root == null)return node;
        if(val <= root.val) root.left =insertIntoBST(root.left,val);
        else root.right =  insertIntoBST(root.right,val);
        return root;
    }
}
