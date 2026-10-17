class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int n=queries.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int x=queries[i][0];
            int y=queries[i][1];
            int r=queries[i][2];
            int cnt=0;
            int dist=r*r;
            for(int j[]:points){
                int dx=j[0]-x;
                int dy=j[1]-y;
                if(dx*dx+dy*dy<=dist) {
                    cnt++;
                }
            }
            ans[i]=cnt;
        }
        return ans;
    }
}