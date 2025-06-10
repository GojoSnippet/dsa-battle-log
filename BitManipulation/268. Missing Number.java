class Solution {
    public int missingNumber(int[] nums) {
        int final_ans=0;
        for(int i=0;i<nums.length;++i){
            final_ans ^= nums[i] ^ i;
        }
        final_ans ^= nums.length;
        return final_ans;
    }
}
