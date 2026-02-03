class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        int i=1;
        while(i<n && nums[i-1]<nums[i]){
            i++;
        }
        int p=i-1;
        if(p==0){
            return false;
        }
        while(i<n && nums[i-1]>nums[i]){
            i++;
        }
        int q=i-1;
        if(p==q || q==n-1){
            return false;
        }
        while(i<n && nums[i-1]<nums[i]){
            i++;
        }
        return i==n;
    }
}