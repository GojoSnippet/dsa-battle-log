class Solution {
    public List<List<Integer>> final_ans = new ArrayList<>(); 

    public void dfs(int[] candidates,int index,List<Integer> subset,int target){
        if(index >= candidates.length || target<0)return;
        if(target == 0){
            final_ans.add(new ArrayList<>(subset));
            return;
        }
        subset.add(candidates[index]);
        dfs(candidates,index,new ArrayList<>(subset),target-candidates[index]);
        subset.remove(subset.size() -1);
        dfs(candidates,index+1,new ArrayList<>(subset),target);
        return;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> subset = new ArrayList<>();
        dfs(candidates,0,subset,target);
        return final_ans;
    }
}
