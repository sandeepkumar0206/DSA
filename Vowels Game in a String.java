class Solution {
    public boolean doesAliceWin(String s) {
        int cnt=0;
        for(char ch:s.toCharArray()){
            if(ch=='a' || ch=='i' || ch=='o' || ch=='u' || ch=='e'){
                return true;
            }
        }
        return false;
    }
}