class Solution {
    public static boolean find(String s){
        int n=s.length();
        if(n<=2){
            return s.charAt(0)==s.charAt(1);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n-1;i++){
            char curr=(char)((s.charAt(i)-'0'+s.charAt(i+1)-'0')%10 +'0');
            sb.append(curr);
        }
        return find(sb.toString());
    }
    public boolean hasSameDigits(String s) {
        return find(s);
    }
}