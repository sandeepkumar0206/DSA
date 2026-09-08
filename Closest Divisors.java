class Solution {
    public int[] closestDivisors(int num) {
        int[] ans=new int[2];
        int[] arr=new int[2];
        arr[0]=num+1;
        arr[1]=num+2;
        int min=Integer.MAX_VALUE;
        for(int x:arr) {
            for(int i=1;i*i<=x;i++){
                if(x%i==0){
                    int j=x/i;
                    if(Math.abs(i-j)<min){
                        min=Math.abs(i-j);
                        ans[0]=i;
                        ans[1]=j;
                    }
                    if(i==j){
                        return new int[]{i,j};
                    }
                }
            }
        }
        return ans;
    }
}