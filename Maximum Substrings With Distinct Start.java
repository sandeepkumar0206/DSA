class Solution {
    public int maxDistinct(String s) {
        int ans=0;
        boolean arr[]=new boolean[26];
        for(char ch:s.toCharArray()){
            int index=ch-'a';
            if(!arr[index]){
                arr[index]=true;
                ans++;
            }
        }
        return ans;
    }
}