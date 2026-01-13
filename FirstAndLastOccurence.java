class Solution {
    public int[] searchRange(int[] nums, int target) {
        int idx1=search1(nums,0,nums.length-1,target);
        int idx2=search2(nums,0,nums.length-1,target);  
        return new int[]{idx1,idx2};    
    }
    public static int search1(int nums[],int s,int e,int target){
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                ans=mid;
                e=mid-1;
            }
            else if(nums[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }
    public static int search2(int nums[],int s,int e,int target){
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                ans=mid;
                s=mid+1;
            }
            else if(nums[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }
}