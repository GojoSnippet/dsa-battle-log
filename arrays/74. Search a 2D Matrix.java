class Solution {

    public int binarySearchRow(int[][] matrix, int startRow, int lastRow,int target){
        if(startRow > lastRow)return -1;
        if(startRow ==lastRow)return startRow;
        int mid = (startRow+lastRow)/2;
        if(target >= matrix[mid][0] && target < matrix[mid+1][0])return mid;
        else{
            if(target > matrix[mid][0])return binarySearchRow(matrix,mid+1,lastRow,target);
            else return binarySearchRow(matrix,0,mid-1,target);
        }
    }

    public boolean binarySearchColumn(int[] arr,int startIndex,int lastIndex,int target){
        if(startIndex > lastIndex)return false;
        int mid = lastIndex - (lastIndex - startIndex)/2;
        if(arr[mid] == target)return true;
        else{
            if(target < arr[mid])return binarySearchColumn(arr,startIndex,mid-1,target);
            else return binarySearchColumn(arr,mid+1,lastIndex,target);
        }

    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length-1;
        int n = matrix[0].length-1;
        int rowNum = binarySearchRow(matrix,0,m,target);
        if(rowNum == -1)return false;
        return binarySearchColumn(matrix[rowNum],0,n,target);
    }
}
