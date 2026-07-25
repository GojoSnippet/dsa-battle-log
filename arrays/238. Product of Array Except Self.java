// Product of Array Except Self (LeetCode #238) — Prefix × Suffix products (no division)
// answer[i] = (product of everything LEFT of i) × (product of everything RIGHT of i).
// Pass 1 (left→right): fill output with LEFT products. Pass 2 (right→left): multiply each by a
// running SUFFIX product. No division → works even with zeros.
// Time O(n).  Space O(1) EXTRA — the output array is required output, so it's NOT counted.
//
// [2026-07-24] First solve — nailed the O(1)-extra-space version right after learning it. 🎉
// Nit: `output_array[nums.length-1]=1;` is DEAD — the left-pass loop (i runs up to n-1) overwrites it.
//      Safe to remove; output[n-1] ends up = product of all-but-last, which IS its answer (nothing to its right).

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output_array = new int[nums.length];
        output_array[0]=1;output_array[nums.length-1]=1;
        for(int i=1;i<nums.length;++i){
            output_array[i]=output_array[i-1]*nums[i-1];
        }
        int sfix=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;--i){
            output_array[i]*=sfix;
            sfix*=nums[i];
        }
        return output_array;
    }
}
