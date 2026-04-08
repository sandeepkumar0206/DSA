class Solution {
    public int[] evenOddBit(int n) {
        int a=0,b=0,i=0;
        while(n!=0){
            if((n&1)==1){
                if(i%2==0){
                    a++;
                }
                else{
                    b++;
                }
            }
            i++;
            n=n>>>1;
        }
        return new int[]{a,b};
    }
}