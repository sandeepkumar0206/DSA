class Solution {
    public static int findWave(String s){
        int n=s.length();
        if(n<=2){
            return 0;
        }
        int cnt=0;g
        for(int i=1;i<n-1;i++){
            if( s.charAt(i-1)<s.charAt(i) && s.charAt(i)>s.charAt(i+1) ){
                cnt++;
            }
            else if( s.charAt(i-1)>s.charAt(i) && s.charAt(i)<s.charAt(i+1)){
                cnt++;
            }
        }
        return cnt;
    }
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int i=num1;i<=num2;i++){
            ans+=findWave(String.valueOf(i));
        }
        return ans;
    }
}