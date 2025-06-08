class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int len = nums.length;
        double final_size = Math.pow(2,len);
        List<List<Integer>> final_list = new ArrayList<>();
        for(int i=0;i<final_size;++i){
            List<Integer> subset =  new ArrayList<>();
            for(int j=0;j<len;++j){
                if((i & (1 << j)) != 0){
                    subset.add(nums[j]);
                }
            }
            final_list.add(subset);
        }
        return final_list;
    }
}
