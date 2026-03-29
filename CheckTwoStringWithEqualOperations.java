class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        if(s1.equals(s2)){
            return true;
        }
        char arr[]=s1.toCharArray();
        for(int i=0;i<2;i++){
            char ch=arr[i];
            if(ch==s2.charAt(i+2)){
                char t=arr[i];
                arr[i]=arr[i+2];
                arr[i+2]=t;
            }
        }
        if(s2.equals(new String(arr))){
            return true;
        }
        return false;
    }
}