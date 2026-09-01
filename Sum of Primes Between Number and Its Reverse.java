class Solution {
    public int getRev(int n){
        int ans=0;
        while(n!=0){
            ans=ans*10+n%10;
            n/=10;
        }
        return ans;
    }
    public boolean checkPrime(int n){
        if(n<2){
            return false;
        }
        int max=(int)Math.sqrt(n);
        for(int i=2;i<=max;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int sumOfPrimesInRange(int n) {
        int ans=getRev(n);
        int a=Math.min(ans,n);
        int b=Math.max(ans,n);
        int sum=0;
        for(int i=a;i<=b;i++){
            if(checkPrime(i)){
                sum+=i;
            }
        }
        return sum;
    }
}