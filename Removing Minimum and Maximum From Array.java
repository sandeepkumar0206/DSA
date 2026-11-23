class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        if(n<=2){
            return n;
        }
        int minidx=-1,maxidx=-1,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<nums[i]){
                maxidx=i;
                max=nums[i];
            }
            if(min>nums[i]){
                minidx=i;
                min=nums[i];
            }
        }
        int i=Math.min(minidx, maxidx);
        int j=Math.max(minidx, maxidx);
        int cnt1=j+1;                   // Both from the front
        int cnt2=n-i;                   // Both from the back
        int cnt3=(i+1)+(n-j);       // One from front, one from back
        return Math.min(Math.min(cnt1,cnt2),cnt3);
    }
}
// 1 +2-1