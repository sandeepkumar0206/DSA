class Solution {
    public int concatenatedBinary(int n) {
        int mod=1000000007;
        long ans=0;
        for(int i=1;i<=n;i++){
            ans=((ans<<getBits(i))%mod+i)%mod;
        }
        return (int)ans;
    }
    public static int getBits(int n){
        return (int)(Math.log(n)/Math.log(2))+1;
    }
}