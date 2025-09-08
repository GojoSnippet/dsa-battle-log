class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last_pointer = nums1.length-1;
        int nums2Pointer=nums2.length-1;
        int nums1Pointer = m-1;
        while(nums1Pointer>=0 && last_pointer>=0 && nums2Pointer>=0){
            if(nums1[nums1Pointer] >= nums2[nums2Pointer]){
                nums1[last_pointer] = nums1[nums1Pointer];
                nums1Pointer--;
            }
            else{
                nums1[last_pointer] = nums2[nums2Pointer];
                nums2Pointer--;
            }
            last_pointer--;
        }
        while(nums1Pointer >=0){
            nums1[last_pointer] = nums1[nums1Pointer];
            nums1Pointer--;
            last_pointer--;
        }
        while(nums2Pointer>=0){
            nums1[last_pointer]= nums2[nums2Pointer];
            nums2Pointer--;
            last_pointer--;
        }
    }
}
