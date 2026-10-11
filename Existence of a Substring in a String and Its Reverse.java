class Solution {
    public boolean isSubstringPresent(String s) {
        int n=s.length();
        String sb=new StringBuilder(s).reverse().toString();
        for(int i=0;i<n-1;i++){
            if(sb.contains(s.substring(i,i+2))){
                return true;
            }
        }
        return false;
    }
}