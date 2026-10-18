class Solution {
    public int dominantIndices(int[] nums) {
        int sum=0,cnt=0,n=nums.length;
        for(int i=n-2;i>=0;i--){
            sum+=nums[i+1];
            if(nums[i]*(n-i-1)>sum){
                cnt++;
            }
        }
        return cnt;
    }
}