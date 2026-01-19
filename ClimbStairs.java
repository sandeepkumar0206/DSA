class Solution {
    public int climbStairs(int n) {
        int arr[]=new int[n+1];
        arr[0]=1;
        for(int i=1;i<=n;i++){
            arr[i]+=arr[i-1];
            if(i>=2){
                arr[i]+=arr[i-2];
            }
        }
        return arr[n];
        // if(n==0){
        //     return 1;
        // }
        // if(n<0){
        //     return 0;
        // }
        // return climbStairs(n-1)+climbStairs(n-2);
    }
}