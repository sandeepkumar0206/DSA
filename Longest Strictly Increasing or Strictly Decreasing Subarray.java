class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=0,n=nums.length,cnt=1,cnt2=1;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                cnt++;
            }
            else{
                max=Math.max(max,cnt);
                cnt=1;
            }
            if(nums[i]<nums[i-1]){
                cnt2++;
            }
            else{
                max=Math.max(max,cnt2);
                cnt2=1;
            }
        }
        max=Math.max(max,cnt);
        max=Math.max(max,cnt2);
        return max;
    }
}