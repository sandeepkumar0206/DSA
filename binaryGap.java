class Solution {
    public int binaryGap(int n) {
        int b=-1;
        int ans=0;
        int i=0;
        while(n!=0){
            int r=n%2;
            if(r==1){
                if(b==-1){
                    b=i;
                }
                else{
                    ans=Math.max(i-b,ans);
                    b=i;
                }
            }
            n/=2; 
            i++;
        }
        return ans;
    }
}