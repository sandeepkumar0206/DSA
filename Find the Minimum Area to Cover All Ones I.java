class Solution {
    public int minimumArea(int[][] grid) {
        int minx=1001,miny=1001,maxx=0,maxy=0;
        int n=grid.length,m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    minx=Math.min(minx,i);
                    miny=Math.min(miny,j);
                    maxx=Math.max(maxx,i);
                    maxy=Math.max(maxy,j);
                }
            }
        }
        return (maxx-minx+1)*(maxy-miny+1);
    }
}