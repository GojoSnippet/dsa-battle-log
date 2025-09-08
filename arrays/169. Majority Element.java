class Solution {
    public int majorityElement(int[] nums) {
        int res=nums[0];int count=1;
        for(int i=1;i<nums.length;++i){
            if(res == nums[i] && count>=0)count++;
            else{
                if(count > 0 )count--;
                else {res=nums[i];count++;}
            }
        }
        return res;
    }
}
