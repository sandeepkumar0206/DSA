class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[]=new int[101];
        int n=nums.length;
        for(int i:nums){
            arr[i]++;
        }
        for(int i=1;i<101;i++){
            arr[i]+=arr[i-1];
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]!=0)ans[i]=arr[nums[i]-1];
        }
        return  ans;
    }
}