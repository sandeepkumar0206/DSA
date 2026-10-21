class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr[]=new int[101];
        for(int i:nums){
            arr[i]++;
        }
        int i=0,n=nums.length;
        while(i<n){
            for(int j=1;j<101;j++){
                if(arr[j]!=0){
                    arr[j]--;
                    nums[i]=j;
                    i++;
                }
            }
        }
        return nums;
    }
}