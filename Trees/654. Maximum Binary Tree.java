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
    public int findMax(int[] nums,int start,int end){
        int val = Integer.MIN_VALUE;
        int index = -1;
        for(int i=start;i<=end;++i){
            if(nums[i] >= val){
                val = nums[i];
                index = i;
            }
        }
        return index;
    }
    public TreeNode buildTree(int[] nums,int start,int end){
        if(start > end)return null;
        int index= findMax(nums,start,end);
        return new TreeNode(nums[index],buildTree(nums,start,index-1),buildTree(nums,index+1,end));
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return buildTree(nums,0,nums.length-1);
    }
}
