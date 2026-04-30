class Solution {
    public int[] transformArray(int[] nums) {
        int cnt=0;
        for(int i:nums){
            if(i%2==0){
                cnt++;
            }
        }
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i<cnt){
                nums[i]=0;
            }
            else{
                nums[i]=1;
            }
        }
        return nums;
    }
}