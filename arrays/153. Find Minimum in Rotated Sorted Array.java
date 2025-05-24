class Solution 
{
    public int binarySearchIndex(int[] mylist,int startIndex,int lastIndex,int x , int y){
        if(startIndex == lastIndex)return startIndex;
        int mid_val = (startIndex+lastIndex)/2;
        if(mid_val==0){
            if(mylist[mid_val] < mylist[mid_val+1])return 0;
            else return 1;
        }
        if(mid_val==mylist.length-1){
            if(mylist[mid_val] < mylist[mid_val-1])return mylist.length-1;
            else return mylist.length-2;
        }
        if(mylist[mid_val] < mylist[mid_val+1] && mylist[mid_val] < mylist[mid_val-1]){
            return mid_val;
        }
        else{
            if(mylist[mid_val] > x && mylist[mid_val] > y){
                return binarySearchIndex(mylist,mid_val+1,lastIndex,x,y);
            }
            else{
                return binarySearchIndex(mylist,startIndex,mid_val-1,x,y);
            }
        }

    }
    public int findMin(int[] nums) {
        if(nums.length==1)return nums[0];
        if(nums[0] < nums[nums.length -1])return nums[0];
        int x=nums[nums.length-1];
        int y=nums[0];
        int times_rotate_index= binarySearchIndex(nums,0,nums.length,x,y);
        return nums[times_rotate_index];
    }
}
