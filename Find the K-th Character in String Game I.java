class Solution {
    public char kthCharacter(int k) {
        return find(k,"a","b");
    }
    public static char find(int k,String s,String gen){
        if(s.length()>=k){
            return s.charAt(k-1);
        }
        String finals=s+gen;
        StringBuilder sb=new StringBuilder();
        for(char ch:finals.toCharArray()){
            sb.append((char)(ch+1));
        }
        return find(k,finals,sb.toString());
    }
}