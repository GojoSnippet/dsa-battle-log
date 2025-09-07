class Solution {
    public int findNextMax(int[] nums,int curr,int startIndex,int endIndex){
        for(int i=endIndex;i>=startIndex;--i){
            if(nums[i] > curr)return i;
        }
        return endIndex;
    }
    public void reverse(int startIndex,int endIndex,int[] nums){
        while(startIndex < endIndex){
             int temp2=nums[startIndex];
            nums[startIndex] = nums[endIndex];
            nums[endIndex] = temp2;
            startIndex++;
            endIndex--;
        }
    }
    public void nextPermutation(int[] nums) {
        int pointer1=-1;
        for(int i=nums.length-1;i>0;--i){
            if(nums[i-1] < nums[i]){pointer1=i-1;break;}
        }
        if(pointer1 == -1){pointer1 = -1;}else{
        int maxIndex= findNextMax(nums,nums[pointer1],pointer1+1,nums.length-1);
        int temp=nums[maxIndex];
        nums[maxIndex] = nums[pointer1];
        nums[pointer1] = temp;}
        reverse(pointer1+1,nums.length-1,nums);
        return;
    }
}
