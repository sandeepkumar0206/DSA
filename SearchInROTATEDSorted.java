class Solution {
    public static int  find(int nums[],int s,int e,int t){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(nums[mid]==t){
            return mid;
        }
        if(nums[s]<=nums[mid]){
            if(nums[s]<=t && t<=nums[mid]){
                return find(nums,s,mid-1,t);
            }
            else{
                return find(nums,mid+1,e,t);
            }
        }
        else{
            if(nums[mid]<=t && t<=nums[e]){
                return find(nums,mid+1,e,t);
            }
            else{
                return find(nums,s,mid-1,t);
            }
        }
    }
    public int search(int[] nums, int t) {
        return find(nums,0,nums.length-1,t);
    }
}