class Solution {
        public static boolean  find(int nums[],int s,int e,int t){
        if(s>e){
            return false;
        }
        int mid=s+(e-s)/2;
        if(nums[mid]==t){
            return true;
        }
        if (nums[s] == nums[mid] && nums[mid] == nums[e]) {
            return find(nums, s + 1, e - 1, t);
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
    public boolean search(int[] nums, int t) {
        return find(nums,0,nums.length-1,t);
    }
}