class Solution {
    public String maximumXor(String s, String t) {
        int cnt0=0,cnt1=0;
        for(char ch:t.toCharArray()){
            if(ch=='0'){
                cnt0++;
            }
            else{
                cnt1++;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                if(cnt1>0){
                    cnt1--;
                    sb.append('1');
                }
                else{
                    cnt0--;
                    sb.append('0');
                }
            }
            else{
                if(cnt0>0){
                    cnt0--;
                    sb.append('1');
                }
                else{
                    cnt1--;
                    sb.append('0');
                }
            }
        }
        return sb.toString();
        
    }
}