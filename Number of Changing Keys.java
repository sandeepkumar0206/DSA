class Solution {
    public int countKeyChanges(String s) {
        int ans=0;
        int prev=0;
        if(s.charAt(0)<='z' && s.charAt(0)>='a'){
            prev=s.charAt(0) -'a';
        }
        else{
            prev=s.charAt(0) -'A';
        }
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            int curr=0;
            if(ch>='a' && ch<='z'){
                curr=ch-'a';
            }
            else{
                curr=ch-'A';
            }
            if(curr!=prev){
                ans++;
                prev=curr;
            }
        }
        return ans;
    }
}