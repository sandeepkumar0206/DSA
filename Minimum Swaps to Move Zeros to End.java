class Solution {
    public int minimumSwaps(int[] nums) {
        int i=0,cnt=0,n=nums.length-1;
        while(i<n){
            while(i<n && nums[i]!=0){
                i++;
            }
            while(i<n && nums[n]==0){
                n--;
            }
            if(i!=n){
                cnt++;
                i++;
                n--;
            }
        }
        return cnt;
    }
}