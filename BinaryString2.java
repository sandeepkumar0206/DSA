class Solution {
    public int countBinarySubstrings(String s) {
        int cnt=0;
        int c=1,p=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i)){
                c++;
            }
            else{
                cnt+=Math.min(p,c);
                p=c;
                c=1;
            }
        }
        cnt+=Math.min(p,c);
        return cnt;
    }
}