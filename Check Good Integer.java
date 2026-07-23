class Solution {
    public boolean checkGoodInteger(int n) {
        int a=0,b=0;
        while(n!=0){
            int d=n%10;
            a+=d;
            b+=(d*d);
            n/=10;
        }
        return b-a>=50;
    }
}