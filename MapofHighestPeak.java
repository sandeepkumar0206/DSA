class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int n=isWater.length,m=isWater[0].length;
        int ans[][]=new int[n][m];
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(isWater[i][j]==1){
                    q.add(new int[]{i,j});
                }
                else{
                    ans[i][j]=-1;
                }
            }
        }
        int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};
        while(!q.isEmpty()){
            int curr[]=q.remove();
            for(int i[]:dir){
                int x=curr[0]+i[0];
                int y=curr[1]+i[1];
                if(x>=0 && x<n && y>=0 && y<m && ans[x][y]==-1){
                    ans[x][y]=ans[curr[0]][curr[1]]+1;
                    q.add(new int[]{x,y});
                }
            }
        }
        return ans;
    }
}