class Solution {
    public boolean validDigit(int n, int x) {
        int cnt=0;
        while(n!=0){
            int d=n%10;
            n/=10;
            if(d==x){
                cnt++;
            }
            if(n==0){
                if(cnt>0 && d!=x){
                    return true;
                }
            }
        }
        return false;
    }
}