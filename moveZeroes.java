class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=0,n=nums.length;
        while(i<n){
            if(nums[i]!=0){
                nums[j++]=nums[i];
            }
            i++;
        }
        while(j<n){
            nums[j++]=0;
        }
        
    }
}