class Solution {
    public boolean checkOnesSegment(String s) {
        boolean b=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                if(b==true){
                    return false;
                }
                continue;
            }
            else{
                b=true;
            }
        }
        return true;
    }
}