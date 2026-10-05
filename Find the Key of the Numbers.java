class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int ans=0,p=1;
        while(num1!=0 || num2!=0 || num3!=0 ){
            ans+=Math.min(num1%10,Math.min(num2%10,num3%10))*p;
            num1/=10;
            num2/=10;
            num3/=10;
            p*=10;
        }
        return Integer.parseInt(String.valueOf(ans));
    }
}