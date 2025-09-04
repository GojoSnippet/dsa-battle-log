class Solution {
    public List<List<Integer>> final_ans = new ArrayList<>();
    public void dfs(int[] nums,List<Integer> subset,int index){
        if(index >= nums.length ){
            final_ans.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[index]);
        dfs(nums,subset,index+1);
        subset.remove(subset.size()-1);
        if(subset.size()==0 || (nums[index] != subset.get(subset.size()-1))){
            dfs(nums,subset,index+1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums,subset,0);
        return final_ans;
    }
}
