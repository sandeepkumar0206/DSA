class Solution {
    public int reverseDegree(String s) {
        int ans=0,n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            ans+=('z'-ch+1)*(i+1);
        }
        return ans;
    }
}