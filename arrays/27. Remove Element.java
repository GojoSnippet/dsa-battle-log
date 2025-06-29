class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;++i){
            if(val == nums[i])nums[i] ='_';
            else k++;
        }
        int startIndex = 0,iterator=0;
        while(iterator < nums.length){
            if(nums[iterator] != '_'){
                int temp = nums[startIndex];
                nums[startIndex] = nums[iterator];
                nums[iterator] =temp;
                startIndex++;
                iterator++;
            }
            else iterator++;
        }
        
        return k;
    }
}
