class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder();
        int n=s.length(),m=spaces.length;
        int i=0,j=0;
        while(i<n && j<m){
            if(i<spaces[j]){
                sb.append(s.charAt(i));
            }
            else{
                sb.append(' ');
                sb.append(s.charAt(i));
                j++;
            }
            i++;
        }
        while(i<n){
            sb.append(s.charAt(i));
            i++;
        }
        return sb.toString();
    }
}