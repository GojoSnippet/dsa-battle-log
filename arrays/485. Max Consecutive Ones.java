class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_count = 0;
        int x=0,y=0;int j;
        for( int i=0;i<nums.length; ){
            if(nums[i] ==1){
                int count =1;
                for( j = i+1; j < nums.length; ++j){
                    if(nums[j] == 1){
                        count++;
                    }else{
                        max_count = Math.max(count,max_count);
                        break;
                    }
                }
                if(j == nums.length)max_count = Math.max(count,max_count);
                i = j;
            }
            else{
                i++;
            }
            
        }
        return max_count;
    }
}
