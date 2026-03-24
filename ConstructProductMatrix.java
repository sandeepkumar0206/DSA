class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        long ans=1;
        int mod=12345;
        int n=grid.length;
        int m=grid[0].length;
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=(int)ans%mod;
                ans=(ans*grid[i][j])%mod;
            }
        }
        ans=1;
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                arr[i][j]=(int)(arr[i][j]*ans)%mod;
                ans=(ans*grid[i][j])%mod;
            }
        }
        return arr;
    }
}