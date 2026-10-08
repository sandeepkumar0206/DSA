class Solution {
    public String reverseByType(String s) {
        int n=s.length();
        int i=0;
        int j=n-1;
        StringBuilder sb=new StringBuilder(s);
        while(i<=j){
            if(Character.isLowerCase(sb.charAt(i)) && Character.isLowerCase(sb.charAt(j))){
                char ch=sb.charAt(i);
                sb.setCharAt(i,sb.charAt(j));
                sb.setCharAt(j,ch);
                i++;j--;
            }
            else if(!Character.isLowerCase(sb.charAt(i))){
                i++;
            }
            else {
                j--;
            }
        }
        i=0;j=n-1;
        while(i<=j){
            if(!Character.isLowerCase(sb.charAt(i)) && !Character.isLowerCase(sb.charAt(j))){
                char ch=sb.charAt(i);
                sb.setCharAt(i,sb.charAt(j));
                sb.setCharAt(j,ch);
                i++;j--;
            }
            else if(Character.isLowerCase(sb.charAt(i))){
                i++;
            }
            else {
                j--;
            }
        }
        return sb.toString();
    }
}