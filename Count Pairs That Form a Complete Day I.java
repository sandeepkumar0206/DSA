class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int cnt=0,n=hours.length;
        int arr[]=new int[24];
        for(int i=0;i<n;i++){
            int d=hours[i]%24;
            cnt+=(arr[(24-d)%24]);
            arr[d]++;            
        }
        return cnt;
    }
}