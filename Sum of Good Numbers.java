class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int ans=0,n=nums.length;
        for(int i=0;i<n;i++){
            boolean curr=true;
            if((i-k>=0 && nums[i]<=nums[i-k])){
                curr=false;
            }
            else if(i+k<n && nums[i]<=nums[i+k]){
                curr=false;
            }
            if(curr){
                ans+=nums[i];
            }
        }
        return ans;
    }
}