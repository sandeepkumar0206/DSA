class Solution {
    public String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
        int n=s.length();
        int i=n-1;       
        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            if(i<0){
                break;
            }
            int e=i;
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }
            if(ans.length()>0){
                ans.append(" ");
            }
            for(int st=i+1;st<=e;st++){
                ans.append(s.charAt(st));
            }
        }
        return ans.toString();
    }
}