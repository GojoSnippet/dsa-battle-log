class Solution {
    public void rotateSub(int[] nums,int startIndex,int lastIndex){
        int length = lastIndex - startIndex +1;
        for(int i=0;i< length/2;++i){
            int temp=nums[startIndex + i];
            nums[startIndex + i] = nums[lastIndex-i];
            nums[lastIndex-i]= temp;
        }
    }
    public void rotate(int[] nums, int k) {
        rotateSub(nums,0,nums.length -1);
        rotateSub(nums,0,k % nums.length - 1);
        rotateSub(nums,k % nums.length,nums.length -1);
    }
}
