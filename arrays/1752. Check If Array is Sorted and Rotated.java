class Solution {
    public boolean check(int[] nums) {
        int flag=0;int min_val=nums[0];
        int i;
        for( i=0;i<nums.length-1;++i){
            if(nums[i+1] >= nums[i] && flag==0){
                min_val = Math.min(nums[i],min_val);
            }
            else{
                if(flag==0)i++;
                flag=1;
                if((i==nums.length-1 && nums[i] > min_val) || (i<nums.length-1 && nums[i+1] < nums[i]) || nums[i] > min_val)return false;
            }
        }

        if(i==nums.length-1 && nums[i] > min_val && flag==1)return false;

        return true;
    }
}
