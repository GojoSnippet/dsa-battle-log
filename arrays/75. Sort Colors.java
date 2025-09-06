class Solution {
    public int helper_func(int[] nums,int pointer1,int pointer2,int first_val){
            while(pointer1 < pointer2){
            while(pointer1< nums.length && nums[pointer1] == first_val)pointer1++;
            while(pointer2 >= 0 && nums[pointer2] != first_val)pointer2--;
            if(pointer1 > pointer2)break;
            else{
            int temp= nums[pointer1];
            nums[pointer1] = nums[pointer2];
            nums[pointer2] = temp;}
        }
        return pointer2;
    }
    public void sortColors(int[] nums) {
        int pointer1 = 0;int pointer2 = nums.length-1;
        pointer2 = helper_func(nums,pointer1,pointer2,0);
        helper_func(nums,pointer2+1,nums.length-1,1);
        return;
    }
}
