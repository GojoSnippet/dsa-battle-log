class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> myset = new HashSet<>();
        int k=0;
        for(int i=0;i<nums.length;++i){
            if(myset.contains(nums[i]))nums[i]=-200;
            else{
                myset.add(nums[i]);
                k++;
            }
        }
        int startIndex=0,iterator=0;
        while(iterator < nums.length){
            if(nums[iterator] != -200){
                int temp = nums[startIndex];
                nums[startIndex] = nums[iterator];
                nums[iterator] = temp;
                startIndex++;
                iterator++;
            }
            else{
                iterator++;
            }
        }
        return k;
    }
}
