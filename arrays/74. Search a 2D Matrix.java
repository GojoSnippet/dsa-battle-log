class Solution {
    public int binarySearchElem(int[] nums,int start,int last,int target){
        if(start > last)return -1;
        int mid = start +(last- start)/2;
        if(nums[mid] == target)return mid;
        else{
            if(nums[mid] > target)return binarySearchElem(nums,start,mid-1,target);
            else return binarySearchElem(nums,mid+1,last,target);
        }
    }
    public int binarySearchRow(int[][] rows,int start, int last, int target,int len){
        if(start > last)return -1;
        int mid = last - (last - start)/2;
        if(target >=rows[mid][0] && target <= rows[mid][len-1])return mid;
        else {
            if(target < rows[mid][0])return binarySearchRow(rows,start,mid-1,target,len);
            else return binarySearchRow(rows,mid+1,last,target,len);
        }
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int x = binarySearchRow(matrix,0,matrix.length-1,target,matrix[0].length);
        if(x == -1)return false;
        else {
            int y = binarySearchElem(matrix[x],0,matrix[0].length-1,target);
            if(y == -1)return false;
            else return true;
        }
    }
}
