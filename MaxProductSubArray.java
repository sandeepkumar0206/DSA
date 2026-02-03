class Solution {
    public int maxProduct(int[] nums) {
        int sum=1,ans=Integer.MIN_VALUE,n=nums.length;
        for(int i=0;i<n;i++){
            sum*=nums[i];
            ans=Math.max(sum,ans);
            if(sum==0){
                sum=1;
            }
        }
        sum=1;
        for(int i=n-1;i>=0;i--){
            sum*=nums[i];
            ans=Math.max(sum,ans);
            if(sum==0){
                sum=1;
            }
        }
        return ans;
    }
}