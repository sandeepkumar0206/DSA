class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i!=m-1 && grid[i][j]!=grid[i+1][j]){
                    return  false;
                }
                if(j!=n-1 && grid[i][j]==grid[i][j+1]){
                    return  false;
                }
            }
        }
        return true;
    }
}