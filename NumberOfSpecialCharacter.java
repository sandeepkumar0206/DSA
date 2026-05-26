class Solution {
    public int numberOfSpecialChars(String word) {
        boolean arr[]=new boolean[52];
        int ans=0;
        for(char ch:word.toCharArray()){
            int idx=(int)ch;
            if(idx>=97){
                idx=idx-97;
            }
            else{
                idx=idx-39;
            }
            arr[idx]=true;
        }
        for(int i=0;i<26;i++){
            if(arr[i] && arr[i+26]){
                ans++;
            }
        }
        return ans;
    }
}