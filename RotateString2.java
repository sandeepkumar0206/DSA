class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        for(int i=0;i<n;i++){
            if((s.substring(i,n)+s.substring(0,i)).equals(goal)){
                return true;
            }
        }
        return false;
    }
}