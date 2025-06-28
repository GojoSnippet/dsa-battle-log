class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[][] new_array = new int[nums.length][2];
        for(int i=0;i<nums.length;++i){
            new_array[i][0]= nums[i];
            new_array[i][1] = i;
        }
        Arrays.sort(new_array, Comparator.comparingInt((int[] a) -> a[0]).reversed());
        Arrays.sort(new_array,0,k,Comparator.comparingInt((int[] a) -> a[1]));
        int[] final_ans = new int[k];
        for(int i=0;i<k;++i){
            final_ans[i] =new_array[i][0];
        }
        return final_ans;
    }
}
