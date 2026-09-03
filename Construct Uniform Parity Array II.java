class Solution {
    public boolean uniformArray(int[] nums1) {
        int cnt=0,n=nums1.length,min=Integer.MAX_VALUE;
        for(int i:nums1){
            if(i%2==0){
                cnt++;
            }
            min=Math.min(min,i);
        }
        if(cnt==0 || cnt==n){
            return true;
        }
        for(int i:nums1){
            if(i%2==0 && (i-min)%2==0){
                return false;
            }
        }
        return true;
    }
}


// we can also one just store min and at the end if we have one of them is max then answer is alreadyt there otherwise we have to check maxeven-maxodd what does it give means >0