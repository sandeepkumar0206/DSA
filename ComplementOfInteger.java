class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        int num=n;
        int cnt=0;
        while(num!=0){
            num/=2;
            cnt++;
        }
        int m=(1<<cnt)-1;
        return m^n;
    }
}