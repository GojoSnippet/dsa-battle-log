class Solution {

    private void solve(int idx, int arr[], List<Integer> curr, List<List<Integer>> result){
        if(idx == arr.length){
            result.add(new ArrayList<>(curr));
            return;
        }
        solve(idx+1, arr, curr, result);
        curr.add(arr[idx]);
        solve(idx+1, arr, curr, result);
        curr.remove(curr.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        solve(0, nums, new ArrayList<>(), result);
        return result;
    }
}
