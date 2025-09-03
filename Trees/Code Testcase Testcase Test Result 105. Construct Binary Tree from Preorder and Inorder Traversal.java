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
    public int findIndex(int[] inorder,int x){
        int i=0;
        for(;i<inorder.length;++i)if(inorder[i] ==x)return i;
        return i;
    } 
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0)return null;
        TreeNode root = new TreeNode(preorder[0]);
        int mid = findIndex(inorder,preorder[0]);
        int[] leftPreOrder = Arrays.copyOfRange(preorder,1 ,mid+1);
        int[] leftInOrder = Arrays.copyOfRange(inorder,0,mid);
        root.left = buildTree(leftPreOrder,leftInOrder);

        int[] rightPreOrder = Arrays.copyOfRange(preorder,mid+1,preorder.length);
        int[] rightInOrder = Arrays.copyOfRange(inorder,mid+1,inorder.length);
        root.right = buildTree(rightPreOrder,rightInOrder);
        return root;
    }
}
