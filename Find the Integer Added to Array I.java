class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int a=nums1[0],b=nums2[0];
        for(int i=1;i<n;i++){
            a=Math.max(a,nums1[i]);
            b=Math.max(b,nums2[i]);
        }
        return b-a;
    }
}