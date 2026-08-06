class Solution {
    public String findValidPair(String s) {
        int arr[]=new int[10];
        for(char ch: s.toCharArray()){
            arr[ch-'0']++;
        }
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)!=s.charAt(i)){
                int cnt1=arr[s.charAt(i-1)-'0'];
                int cnt2=arr[s.charAt(i)-'0'];
                if(cnt1==s.charAt(i-1)-'0' && cnt2==s.charAt(i)-'0'){
                    return s.substring(i-1,i+1);
                }
            }
        }
        return "";
    }
}