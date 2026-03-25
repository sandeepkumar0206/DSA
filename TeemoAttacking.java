class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans=0;
        int n=timeSeries.length;
        for(int i=0;i<n-1;i++){
            if(timeSeries[i+1]<=timeSeries[i]+duration-1){
                ans+=timeSeries[i+1]-timeSeries[i];
            }
            else{
                ans+=duration;
            }
        }  
        return ans+duration; 
    }
}