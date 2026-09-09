class Solution {
    public long countCommas(long n) {
        long ans=0l;
        long s=1000;
        long e=s*1000-1;
        int cnt=1;
        while(s<=n){
            long currNum=Math.min(n,e)-s+1;
            ans+=(long)(cnt*currNum);
            if(e>n){
                break;
            }
            s=s*1000;
            e=s*1000-1;
            cnt++;
        }
        return ans;
    }
}