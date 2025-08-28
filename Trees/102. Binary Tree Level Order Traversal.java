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
    public int calcHeight(TreeNode root){
        if(root== null)return 0;
        return 1+ Math.max(calcHeight(root.left),calcHeight(root.right));
    }
    List<List<Integer>> order_func(TreeNode root,List<List<Integer>> final_list,int level){
        if(root == null)return final_list;
        final_list.get(level).add(root.val);
        final_list = order_func(root.left,final_list,level+1);
        return order_func(root.right,final_list,level+1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        int height = calcHeight(root);
        System.out.println(height);
        List<List<Integer>> final_list = new ArrayList<>(height);
        for(int i=0;i<height;++i)final_list.add(new ArrayList<>());
        return order_func(root,final_list,0);
    }
}
