class Solution {
    public int rotatedDigits(int n) {
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(get(i)>0){
                cnt++;
            }
        }
        return cnt;
    }
    public static int get(int m){
        int cnt=0;
        while(m!=0){
            int r=m%10;
            if(r==3||r==4||r==7){
                return 0;
            }
            if(r==2||r==5||r==6 ||r==9){
                cnt++;
            }
            m/=10;
        }
        return cnt;
    }
}