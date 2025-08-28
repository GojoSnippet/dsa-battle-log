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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> levelQueue = new LinkedList<>();
        levelQueue.add(root);
        List<List<Integer>> final_list= new ArrayList<>();
        while(!levelQueue.isEmpty()){
            List<Integer> levelList = new ArrayList<>();
            for(int i=levelQueue.size();i>0;--i){
                TreeNode temp = levelQueue.remove();
                if(temp != null){
                levelList.add(temp.val);
                levelQueue.add(temp.left);
                levelQueue.add(temp.right);
                }
            }
            if(levelList.size() > 0)final_list.add(levelList);
        }
        return final_list;

    }
}
