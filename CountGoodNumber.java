class Solution {
    public int countGoodNumbers(long n) {
        long n1=(n+1)/2;
        long n2=n/2;
        long ans=1;long x1=5l;
        while(n1!=0){
            if((n1&1)!=0){
                ans=(ans*x1)%1000000007;
            }
            x1=(x1*x1)%1000000007;
            n1=n1>>>1;
        }
        x1=4l;
        while(n2!=0){
            if((n2&1)!=0){
                ans=(ans*x1)%1000000007;
            }
            x1=(x1*x1)%1000000007;
            n2=n2>>>1;
        }
        return (int)ans%1000000007;
    }
}