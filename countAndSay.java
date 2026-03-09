class Solution {
    public static String find(String s,int i,int n){
        if(i>n){
            return s;
        }
        StringBuilder sb=new StringBuilder();
        int cnt=1;char ch=s.charAt(0);
        for(int j=1;j<s.length();j++){
            if(ch==s.charAt(j)){
                cnt++;
            }
            else{
                sb.append(cnt);
                sb.append(ch);
                ch=s.charAt(j);
                cnt=1;
            }
        }
        sb.append(cnt);
        sb.append(ch);
        return find(sb.toString(),i+1,n);
    }
    public String countAndSay(int n) {
        return find("1",2,n);
    }
}