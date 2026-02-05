class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                int idx=Math.abs(nums[i])%n;
                if(i-idx<0){
                    idx=n+(i-idx);
                    if(idx<n && idx>=0){
                        ans[i]=nums[idx];
                    }
                }
                else{
                    ans[i]=nums[i-idx];
                }
            }
            else if(nums[i]>0){
                int idx=nums[i]%n;
                if(i+idx<n){
                    ans[i]=nums[i+idx];
                }
                else{
                    ans[i]=nums[(i+idx-n)];
                }
            }
        }
        return ans;
    }
}