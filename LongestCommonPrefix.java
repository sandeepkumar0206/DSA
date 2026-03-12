class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans=strs[0];
        int n=strs.length;
        for(int i=1;i<n;i++){
            while(strs[i].indexOf(ans)!=0){
                ans=ans.substring(0,ans.length()-1);
            }
        }
        return ans;
    }
}