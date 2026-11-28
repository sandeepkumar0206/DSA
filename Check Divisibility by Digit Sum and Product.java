class Solution {
    public boolean checkDivisibility(int n) {
        int k=n;
        int s=0,p=1;
        while(n!=0){
            int d=n%10;
            s+=d;
            p*=d;
            n/=10;
        }
        return k%(s+p)==0;
    }
}