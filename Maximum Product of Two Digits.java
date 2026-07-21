class Solution {
    public int maxProduct(int n) {
        int a=0,b=0;
        while(n!=0){
            int d=n%10;
            if(a<=d){
                b=a;
                a=d;
            }
            else if(b<d && a!=0){
                b=d;
            }
            n/=10;
        }
        return a*b;
    }
}