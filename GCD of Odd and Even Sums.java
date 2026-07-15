class Solution {
    public int gcdOfOddEvenSums(int n) {
        int o=(int)Math.pow(n,2);
        int e=n*(n+1);
        return get(o,e);
    }
    public static int get(int a,int b){
        if(b==0){
            return a;
        }
        return get(b,a%b);
    }
}