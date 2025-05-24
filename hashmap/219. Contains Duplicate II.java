class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    int i = 0;
    int j;
    Map<Integer,Integer> mymap = new HashMap<>();
    j=k;
    for(int l=i;l<=j && l< nums.length;++l){
        if(mymap.containsKey(nums[l]))return true;
        mymap.put(nums[l],l);
    }
    for(int m=k+1;m<nums.length;m++){
        mymap.remove(nums[i]);
        if(mymap.containsKey(nums[m]))return true;
        mymap.put(nums[m],m);
        i++;
    }
    return false;
    }
}
