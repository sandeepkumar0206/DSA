class Solution {
    public static void reverse(int nums[],int i,int j){
        if(i>=j){
            return;
        }
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;;
        i++;
        j--;
        reverse(nums,i,j);
    }
    public void rotate(int[] nums, int k) {
        
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
}