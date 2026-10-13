class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder sb=new StringBuilder();
        int cnt=0;
        for(char ch:s.toCharArray()){
            if(ch==x){
                cnt++;
            }
            else{
                sb.append(ch);
            }
        }
        while(cnt--!=0){
            sb.append(x);
        }
        return sb.toString();
    }
}