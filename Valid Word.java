class Solution {
    public boolean isValid(String word) {
        int n=word.length();
        if(n<3){
            return false;
        }
        boolean v=false,c=false;
        for(char ch:word.toCharArray()){
            if(Character.isDigit(ch)){
                continue;
            }
            else if(Character.isUpperCase(ch) || Character.isLowerCase(ch)){
                if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
                    v=true;
                }
                else{
                    c=true;
                }
            }
            else{
                return false;
            }
        }
        return v && c;
    }
}