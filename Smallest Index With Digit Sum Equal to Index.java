class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int curr=nums[i],s=0;
            while(curr!=0){
                s+=curr%10;
                curr/=10;
            }
            if(s==i){
                return i;
            }
        }
        return -1;
    }
}