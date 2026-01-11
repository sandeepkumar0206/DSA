class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE,curr=0;
        for(int i=0;i<nums.length;i++){
            curr+=nums[i];
            if(curr>maxsum){
                maxsum=Math.max(maxsum,curr);
            }
            if(curr<0){
                curr=0;
            }
            
        }
        return maxsum;
    }
}