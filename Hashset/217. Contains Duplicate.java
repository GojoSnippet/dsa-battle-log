class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> myset = new HashSet<>();
        for(int i=0;i<nums.length;++i){
           myset.add(nums[i]);
        }
        if(myset.size() == nums.length)return false;
        return true;

    }
}
