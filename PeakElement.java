class Solution {
    public static int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n<2){
            return 0;
        }
        int s=0,e=nums.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(mid < n-1 && nums[mid]<nums[mid+1]){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        return e;
    }
}