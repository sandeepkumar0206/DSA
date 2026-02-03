class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        n=n*n+1;
        int arr[]=new int[n];
        for(int i[]:grid){
            for(int k:i){
                arr[k]++;
            }
        }
        int a=-1,b=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                b=i;
            }
            if(arr[i]==2){
                a=i;
            }
        }
        return new int[]{a,b};
    }
}