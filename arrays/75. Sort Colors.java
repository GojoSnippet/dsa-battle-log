class Solution {
    public void helper(int[] nums,int curr_val,int p1,int p2,int count){
         while(p1 != count){
            if(nums[p1] == curr_val){
                p1++;
                continue;
            }
            else{
                if(nums[p2] == curr_val){
                    nums[p2] = nums[p1];
                    nums[p1] = curr_val;
                    p2--;
                    p1++;
                }
                else{
                    p2--;
                }
            }
        }   
    }

    public void sortColors(int[] nums) {
        int x = 0;int y=nums.length - 1;
        int count_zeroes = 0,count_ones = 0;
        for(int i: nums){
            if(i == 0)count_zeroes++;
            else if(i==1)count_ones++;
        }
        int p1=0,p2=nums.length-1;
        helper(nums,0,p1,p2,count_zeroes);
        helper(nums,1,count_zeroes,p2,count_ones+count_zeroes);
    }
}
