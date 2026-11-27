class Solution {
    public int distributeCandies(int n, int limit) {
        int max=Math.min(n,limit);
        int cnt=0;
        for(int i=0;i<=max ;i++){
            for(int j=0;j<=max ;j++){
                int k=n-i-j;
                if(k>=0 && k<=limit){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}