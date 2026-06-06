class Solution {
    public int[] leftRightDifference(int[] nums) {
         int arr1[]=new int[nums.length];
        int sum1=0;
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sum1;
            sum1+=nums[i];
        }
        int arr2[]=new int[nums.length];
        int sum2=0;
        for(int i=arr2.length-1;i>=0;i--){
            arr2[i]=sum2;
            sum2+=nums[i];
        }
        for(int i=0;i<arr1.length;i++){
            arr1[i]=arr2[i]-arr1[i];
            if(arr1[i]<0){
                arr1[i]=-arr1[i];
            }
        }
        return arr1;
    }
}