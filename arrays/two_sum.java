// Two Sum (LeetCode #1) — Arrays & Hashing
// One-pass hash map (value -> index): for each x, check if (target - x) was already seen; else store x.
// Time O(n), Space O(n).
// KEY TRAP: check the complement BEFORE inserting x — inserting first lets x pair with itself
//           when target == 2*x. ✅ You got this right in both attempts.
//
// [2026-07-24] Refined re-solve. Correct + optimal. vs the earlier version: dropped the stray
// `import java.io.*;`, cleaner name (numMap). One nit: you evaluate (target - nums[i]) twice
// (containsKey + get) = two hash lookups. See the single-lookup variant below.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numMap = new HashMap<>();
        for(int i=0;i<nums.length;++i){
            if(numMap.containsKey(target - nums[i])) return new int[]{i, numMap.get(target - nums[i])};
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }
}

/* Cleaner variant — one hash lookup instead of two, and a clear name:
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> seen = new HashMap<>();   // value -> index
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            Integer j = seen.get(need);                // null if absent -> single lookup
            if (j != null) return new int[]{j, i};     // [earlier, current] = conventional order
            seen.put(nums[i], i);
        }
        return new int[]{};                            // problem guarantees exactly one answer
    }
}
*/
