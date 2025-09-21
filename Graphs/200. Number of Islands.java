class Solution {
    public void dfs(int i,int j,boolean[][] visited,char[][] grid,int m,int n){
        if(visited[i][j])return;
        visited[i][j]=true;
        if(i-1>=0 && grid[i-1][j]== '1')dfs(i-1,j,visited,grid,m,n);
        if(j-1>=0 && grid[i][j-1] == '1')dfs(i,j-1,visited,grid,m,n);
        if(i+1 < m && grid[i+1][j] == '1')dfs(i+1,j,visited,grid,m,n);
        if(j+1 < n && grid[i][j+1] == '1')dfs(i,j+1,visited,grid,m,n);
        return;
    }
    public int numIslands(char[][] grid) {
        int m=grid.length;int n=grid[0].length;
        int count=0;
        boolean[][] visited = new boolean[m][n];
        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                if(!visited[i][j] && grid[i][j] == '1'){
                    count++;
                    dfs(i,j,visited,grid,m,n);
                }
            }
        }
        return count;
    }
}
