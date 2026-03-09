class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int arr[]=new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i]=triangle.get(n-1).get(i);
        }
        for(int i=n-2;i>=0;i--){
            int curr[]=new int[n];
            for(int j=i;j>=0;j--){
                curr[j]=Math.min(arr[j],arr[j+1])+triangle.get(i).get(j);
            }
            arr=curr;
        }
        int ans=arr[0];
        for(int i:arr){
            ans=Math.min(ans,i);
        }
        return arr[0];
    }
}