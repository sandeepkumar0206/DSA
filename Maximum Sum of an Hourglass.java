class Solution {
    public int maxSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        for(int i=0;i<=n-3;i++){
            for(int j=0;j<=m-3;j++){
                int sum=0;
                for(int k=i;k<i+3;k++){
                    for(int l=j;l<j+3;l++){
                        if((k==i+1 && j==l) || (k==i+1 && l==j+2)){
                            continue;
                        }
                        sum+=grid[k][l];
                    }
                }
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
}