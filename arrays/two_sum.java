import java.io.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
     Map<Integer, Integer> map_find = new HashMap<>();
     for(int i=0;i<nums.length;i++){
        int abs_value =target - nums[i];
        if(map_find.containsKey(abs_value)){
            return new int[]{map_find.get(abs_value),i};
        }
        map_find.put(nums[i],i);
     }
     return new int[]{};
    }
}
