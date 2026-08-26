class Solution {
    public long removeZeros(long n) {
        long ans=0;
        long i=1;
        while(n!=0){
            long d=n%10;
            if(d!=0){
                ans=d*i+ans;
                i*=10;
            }
            n/=10;
        }
        return ans;
    }
}