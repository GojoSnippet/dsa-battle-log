class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> first_set = new HashSet<>();
        Set<Integer> second_set = new HashSet<>();
        for(int i : nums1)first_set.add(i);
       for(int i : nums2)second_set.add(i);
        Set<Integer> uniqueToNums1 = new HashSet<>(first_set);
        Set<Integer> uniqueToNums2 = new HashSet<>(second_set);
       uniqueToNums1.removeAll(second_set);
       uniqueToNums2.removeAll(first_set);
       return List.of(new ArrayList<>(uniqueToNums1),new ArrayList<>(uniqueToNums2));
    }
}
