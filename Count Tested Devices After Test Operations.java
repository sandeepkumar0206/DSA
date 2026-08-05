class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int cnt=0;
        for(int i:batteryPercentages){
            if(i-cnt>0){
                cnt++;
            }
        }
        return cnt;
    }
}