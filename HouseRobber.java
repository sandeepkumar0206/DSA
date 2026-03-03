class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        arr[0]=nums[0];
        for(int i=1;i<n;i++){
            arr[i]=nums[i];
            if(i-2>=0){
                arr[i]=Math.max(arr[i],nums[i]+arr[i-2]);
            }
            arr[i]=Math.max(arr[i],arr[i-1]);
        }
        return arr[n-1];
    }
}