// Top K Frequent Elements (LeetCode #347) — Arrays & Hashing + Bucket Sort
// Idea: count frequencies, then BUCKET numbers by frequency (index = how many times it appears);
// walk buckets high→low and collect until you have k. A number appears at most n times → at most
// n+1 buckets → no sorting needed.
// Time O(n), Space O(n).
//
// [2026-07-24] First solve — bucket sort, correct on the first try after learning the idea. 🎉
//
// Two cleanups:
//  1) `int[] finalAns = new int[k]` at the top is DEAD (never used; final_ans is the real one). Delete it.
//  2) Redundant re-set — the SAME lesson as Group Anagrams (#49):
//        List<Integer> l = new ArrayList<>();   // thrown away immediately
//        l = arrList.get(value);                // l points at the bucket
//        l.add(key);                            // mutates it IN PLACE
//        arrList.set(value, l);                 // ← does nothing: l is already that object
//     → just:  arrList.get(value).add(key);
//  Pull a list out of a collection and add to it = you mutate in place; no re-put / re-set needed.

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] finalAns = new int[k];
        Map<Integer,Integer> numMap = new HashMap<>();
        for(int i: nums){
            numMap.put(i,numMap.getOrDefault(i,0)+1);
        }
        List<List<Integer>> arrList = new ArrayList<>(nums.length + 1);
        for (int i = 0; i <= nums.length; i++) {
            arrList.add(new ArrayList<>());
        }
        numMap.forEach( (key,value) -> {
            List<Integer> l = new ArrayList<>();
            l = arrList.get(value);
            l.add(key);
            arrList.set(value,l);
        });
        int[] final_ans = new int[k]; int j=0;
        for(int x=arrList.size()-1 ;x>=0;--x){
            List<Integer> list = arrList.get(x);
            for(int i: list){
                if(j >= k)return final_ans;
                final_ans[j] = i;
                j++;
            }
        }
        return final_ans;
    }
}

/* Cleaned:
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count = new HashMap<>();
        for (int x : nums) count.put(x, count.getOrDefault(x, 0) + 1);

        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) buckets.add(new ArrayList<>());
        count.forEach((num, freq) -> buckets.get(freq).add(num));   // mutate in place

        int[] ans = new int[k];
        int j = 0;
        for (int f = buckets.size() - 1; f >= 0 && j < k; f--)
            for (int num : buckets.get(f)) {
                ans[j++] = num;
                if (j == k) return ans;
            }
        return ans;
    }
}
*/
