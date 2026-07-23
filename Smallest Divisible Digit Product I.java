class Solution {
    public static int find(int n){
        int ans=1;
        while(n!=0){
            ans*=n%10;
            n/=10;
        }
        return ans;
    }
    public int smallestNumber(int n, int t) {
        while(true){
            if(find(n)%t==0){
                return n;
            }
            n++;
        }
    }
}