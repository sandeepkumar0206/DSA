class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int up=i>0?grid[i-1][j]:0;
                int left=j>0?grid[i][j-1]:0;
                int diag=i>0&&j>0 ? grid[i-1][j-1]:0;

                grid[i][j]=(int)(grid[i][j]+up+left-diag);
                if(grid[i][j]<=k){
                    ans++;
                }
                else{
                    if(j==0){
                        return ans;
                    }
                    break;
                }
            }
        }
        return ans;
    }
}