class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int p1,p2;
        List<List<Integer>> final_ans = new ArrayList<>();
        for(int i=0;i<nums.length;++i){
            if(i>0 && nums[i]==nums[i-1])continue;
            p1=i+1;p2=nums.length-1;
            while(p1 < p2){
                int final_sum = nums[i] + nums[p1] + nums[p2];
                if(final_sum > 0){
                    p2--;
                }
                else{
                    if(final_sum < 0)p1++;
                    else{
                        final_ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[p1],nums[p2])));
                        p1++;
                        while(p1<p2 && nums[p1] == nums[p1-1])p1++;
                        p2--;
                        while(p1<p2 && nums[p2] == nums[p2+1])p2--;
                    }
                }
            }
        }
        return final_ans;
    }
}
