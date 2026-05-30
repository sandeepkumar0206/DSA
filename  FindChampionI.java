class Solution {
    public int findChampion(int[][] grid) {
        int ans=-1,max=0,n=grid.length;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)cnt++;
            }
            if(cnt>max){
                max=cnt;
                ans=i;
            }
        }
        return ans;
    }
}