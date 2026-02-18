class Solution {
    public boolean hasAlternatingBits(int n) {
        int a=n%2;
        n=n/2;
        while(n!=0){
            int d=n%2;
            if(d==a){
                return false;
            }
            a=d;
            n/=2;
        }
        return true;

    }
}