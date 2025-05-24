class Solution {
    public int BinarySearchleastIndex(int[] nums,int startIndex,int lastIndex,int target){
        if(startIndex > lastIndex)return -1;
        int mid = (startIndex + lastIndex)/2;
        if(startIndex == lastIndex && nums[mid] == target){
            return mid;}
        if(nums[mid] == target){
           return BinarySearchleastIndex(nums,startIndex,mid,target);
        }
        else if(nums[mid] >target){
             return BinarySearchleastIndex(nums,startIndex,mid-1,target);
        }
        else{
           return BinarySearchleastIndex(nums,mid+1,lastIndex,target);
        }
    }
public int BinarySearchHighestIndex(int[] nums,int startIndex,int lastIndex,int target){
        if(startIndex > lastIndex)return -1;
        int mid = (startIndex + lastIndex+1)/2;
       
        if(startIndex == lastIndex && nums[mid] == target){
            return mid;}
        if(nums[mid] == target){
           return BinarySearchHighestIndex(nums,mid,lastIndex,target);
        }
        else if(nums[mid] >target){
             return BinarySearchHighestIndex(nums,startIndex,mid-1,target);
        }
        else{
           return BinarySearchHighestIndex(nums,mid+1,lastIndex,target);
        }
    }
    public int[] searchRange(int[] nums, int target) {
        int[] mylist = new int[2];
        mylist[0]= BinarySearchleastIndex(nums,0,nums.length-1,target);
        mylist[1]= BinarySearchHighestIndex(nums,0,nums.length-1,target);
        return mylist;
    }
}
