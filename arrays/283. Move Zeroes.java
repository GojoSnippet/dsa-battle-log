class Solution {
    public void moveZeroes(int[] nums) {
        int x=0,y=0;
        for(int i=0;i<nums.length;){
            if(nums[i] == 0){
                for(int j=y;j<nums.length ; ++j){
                    if(nums[j] != 0){
                        int temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                        y=j;
                        break;
                    }
                }
            }
            i++;
            y++;
        }
    }
}
