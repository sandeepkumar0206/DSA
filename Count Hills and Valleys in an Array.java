class Solution {
    public int countHillValley(int[] nums) {
        int n=nums.length,cnt=0;
        int l=nums[0];
        for(int i=1;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            int r=nums[i+1];
            if((nums[i]>l && nums[i]>r) || (nums[i]<l && nums[i]<r)){
                cnt++;
            }
            l=nums[i];
        }
        return cnt;
    }
}