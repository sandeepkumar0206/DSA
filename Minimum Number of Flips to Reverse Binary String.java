class Solution {
    public static String gen(int n){
        StringBuilder sb=new StringBuilder();
        while(n>0){
            int r=n%2;
            sb.append((char) ('0' + r));
            n/=2;
        }
        sb.reverse();
        return sb.toString();
    }
    public int minimumFlips(int n) {
        String s=gen(n);
        int len=s.length(),cnt=0;
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                cnt+=2;
            }
            i++;
            j--;
        }
        return cnt;
    }
}