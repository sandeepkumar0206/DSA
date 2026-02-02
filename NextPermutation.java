class Solution {
    public void nextPermutation(int[] nums) {
        int a=0;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                a=i;
                break;
            }
        }
        int b=0;
        for(int i=n-1;i>=0;i--){
            if(nums[a]<nums[i]){
                b=i;
                break;
            }
        }
        if(a==b){
            rev(nums,0,n-1);
        }
        else{
            int t=nums[a];
            nums[a]=nums[b];
            nums[b]=t;
            rev(nums,a+1,n-1);
        }
    }
    public static void rev(int nums[],int i,int j){
        while(i<j){
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }
    }
}