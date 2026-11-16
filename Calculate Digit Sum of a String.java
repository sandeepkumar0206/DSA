class Solution {
    public String digitSum(String s, int k) {
        if(s.length()<=k){
            return s;
        }
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i+=k){
            int cnt=0;
            for(int j=i;j<i+k && j<n;j++){
                cnt+=s.charAt(j)-'0';
            }
            sb.append(cnt);
        }
        return digitSum(sb.toString(),k);
    }
}