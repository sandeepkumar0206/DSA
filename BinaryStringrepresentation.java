class Solution {
    public int countPrimeSetBits(int left, int right) {
        int cnt=0;
        for(int i=left;i<=right;i++){
            int ans=count(i);
            if(isprime(ans)){
                cnt++;
            }
        }
        return cnt;
    }
    public static boolean isprime(int n){
        if( n==1){
            return false;
        }
        int m=(int)Math.sqrt(n);
        for(int i=2;i<=m;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int count(int n){
        int cnt=0;
        while(n!=0){
            if((n&1)!=0)
            cnt++;
            n>>>=1;
        }
        return cnt;
    }
}