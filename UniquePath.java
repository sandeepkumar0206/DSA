class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[]=new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                dp[i]=obstacleGrid[0][i]==1 ? 0:1 ;
            }
            else{
                dp[i]=(obstacleGrid[0][i]==1 || dp[i-1]==0) ? 0:1 ;

            }
        }
        for(int i=1;i<m;i++){
            int arr[]=new int[n];
            if(obstacleGrid[i][0]==0 && dp[0]==1){
                arr[0]=1;
            }
            for(int j=1;j<n;j++){
                if(obstacleGrid[i][j]!=1)
                arr[j]=arr[j-1]+dp[j];
            }
            dp=arr;
        }
        return dp[n-1];
    }
}