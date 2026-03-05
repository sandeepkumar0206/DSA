class Solution {
    public static int check(String s,char sh){
        int n=s.length();
        int cnt=0;
        for(int i=0;i<n;i++){
            if(i%2==0 && s.charAt(i)==sh){
                cnt++;
            }
            if(i%2!=0 && s.charAt(i)!=sh){
                cnt++;
            }
        }
        return cnt;
    }
    public int minOperations(String s) {
        return Math.min(check(s,'0'),check(s,'1'));
    }
}