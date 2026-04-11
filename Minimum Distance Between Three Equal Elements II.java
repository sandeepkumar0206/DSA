class Solution {
    public int minimumDistance(int[] nums) {
        int n=nums.length;
        int arr1[]=new int[n+1];
        int arr2[]=new int[n+1];
        for(int i=0;i<=n;i++){
            arr1[i]=-1;
            arr2[i]=-1;
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int val=nums[i];
            if(arr2[val]!=-1){
                ans=Math.min(ans,i-arr2[val]);
            }
            arr2[val]=arr1[val];
            arr1[val]=i;
        }
        return ans==Integer.MAX_VALUE ? -1 : ans*2;
        
    }
}