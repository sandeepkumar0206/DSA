class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1,j=1;
        int n=nums.length;
        while(i<n ){
            if(nums[j-1]!=nums[i]){
                nums[j]=nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}