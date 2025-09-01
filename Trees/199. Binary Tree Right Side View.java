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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> myQueue = new LinkedList<>();
        List<Integer> final_list = new ArrayList<>();
        myQueue.add(root);
        while(!myQueue.isEmpty()){
            for(int i=myQueue.size() ; i > 0; i--){
                TreeNode temp = myQueue.remove();
                if(temp != null){
                if(temp.left != null)myQueue.add(temp.left);
                if(temp.right != null)myQueue.add(temp.right);
                if(i == 1)final_list.add(temp.val);
                }
            }
        }
        return final_list;
    }
}
