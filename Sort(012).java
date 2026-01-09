class Solution {
    public void sortColors(int[] nums) {
        int l=0,r=nums.length-1,i=0;
        while(i<=r){
            if(nums[i]==0){
                int t=nums[l];
                nums[l]=nums[i];
                nums[i]=t;
                l++;
                i++;
            }
            else if(nums[i]==2){
                int t=nums[r];
                nums[r]=nums[i];
                nums[i]=t;
                r--;
            }
            else{
                i++;
            }
        }
    }
}