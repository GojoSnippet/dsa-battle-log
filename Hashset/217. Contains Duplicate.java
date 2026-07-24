// Contains Duplicate (LeetCode #217) — Arrays & Hashing ("have I seen it?")
// Time O(n), Space O(n).
//
// [2026-07-24] Now using EARLY EXIT — return true the instant a repeat is seen. Real upgrade over
// the older "add everything, then compare set.size() to nums.length" version, which always scans
// all n even if the duplicate is at index 1. ✅
//
// One tidy-up: this is a pure "have I seen it?" question → a HashSet's job, not a HashMap. You stored
// i→0 but never use the value. Cleanest idiom (Set.add returns false if the element was already there):
//     Set<Integer> seen = new HashSet<>();
//     for (int x : nums) if (!seen.add(x)) return true;
//     return false;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> numsMap = new HashMap<>();
        for(int i : nums){
            if(numsMap.containsKey(i)) return true;
            numsMap.put(i, 0);
        }
        return false;
    }
}
