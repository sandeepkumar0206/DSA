class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        double  min=51;
        while(i<j){
            double sum=(double)(nums[i]+nums[j])/2;
            min=Math.min(min,sum);
            i++;j--;
        }
        return min;
    }
}