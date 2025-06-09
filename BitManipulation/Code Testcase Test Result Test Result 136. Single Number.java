class Solution {
    public int singleNumber(int[] nums) {
        int final_ans= nums[0];
        for(int i=1;i<nums.length;i++){
            final_ans = final_ans ^ nums[i];
        }
        return final_ans;
    }
}
