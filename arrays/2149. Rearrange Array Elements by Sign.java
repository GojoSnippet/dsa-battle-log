class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] final_arr = new int[nums.length];
        int posIndex=0,negIndex=0;int i=0;
        int posFlag = 0;int negFlag=0;
        while(i< nums.length){
            while(posFlag == 0 && posIndex < nums.length){
                if(nums[posIndex] > 0)posFlag =1;
                else posIndex ++;
            }
            if(posFlag ==1 )
            {
            final_arr[i] = nums[posIndex];
            i++;
            posIndex++;
            posFlag = 0;
            }
            while(negFlag == 0 && negIndex < nums.length){
                if(nums[negIndex] < 0)negFlag =1;
                else negIndex ++;
            }
            if(negFlag == 1){
            final_arr[i] = nums[negIndex];
            i++;
            negIndex++;
            negFlag = 0;
            }
        }
        return final_arr;
    }
}
