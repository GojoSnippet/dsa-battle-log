class Solution {
    public List<List<Integer>> final_ans  = new ArrayList<>();

    public void dfs(int numRows,List<Integer> prev){
        if(numRows < 0 )return;
        final_ans.add(prev);
        List<Integer> curr = new ArrayList<>();
        curr.add(1);
        for(int i=0;i<prev.size()-1;++i){
            curr.add(prev.get(i)+prev.get(i+1));
        }
        curr.add(1);
        dfs(numRows-1,curr);
    }
    public List<List<Integer>> generate(int numRows) {
        List<Integer> temp_array =  new ArrayList<>();
        temp_array.add(1);
        dfs(numRows-1,temp_array);
        return final_ans;
    }
}
