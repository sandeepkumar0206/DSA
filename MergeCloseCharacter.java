class Solution {
    public String mergeCharacters(String s, int k) {
        StringBuilder sb=new StringBuilder(s);
        int o=1;
        int n=s.length();
        while(o==1){
            o=0;
            for(int i=0;i<sb.length();i++){
                char ch=sb.charAt(i);
                for(int j=i+1;j<=i+k && j<sb.length();j++){
                    if(sb.charAt(j)==ch){
                        sb.deleteCharAt(j);
                        o=1;
                        break;
                    }
                }
                if(o==1){
                    break;
                }
                
            }
        }
        return sb.toString();
    }
}