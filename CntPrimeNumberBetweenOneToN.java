class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0; 
        }
        if(n==3) return 1;
        boolean arr[]=new boolean[n];
        arr[0]=true;
        arr[1]=true;
        for(int i=2;i<n;i+=2){
            arr[i]=true;
        }
        arr[2]=false;
        int cnt=1;
        for(int i=3;i<n;i++){
            if(!arr[i]){
                cnt++;
                for(int j=i;j<n;j+=i){
                    arr[j]=true;
                }
            }
        }
        return cnt;
    }
}