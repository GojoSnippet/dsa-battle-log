class Solution {
    public int[][] helper_arr = new int[100][100];

    public int recursive(int i,int j,int m,int n){
        if(i>=m || j>=n)return 0;
        if(helper_arr[i][j]!=0)return helper_arr[i][j];
        helper_arr[i][j] =1+ recursive(i+1,j,m,n)+recursive(i,j+1,m,n);
        return helper_arr[i][j];
    }
    public int uniquePaths(int m, int n) {
        return 1+ recursive(1,1,m,n);
    }
}
