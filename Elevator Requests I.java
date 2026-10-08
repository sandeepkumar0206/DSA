class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int ans=0,m=requests.length;
        for(int i=0;i<m;i++){
            if(i==0){
                ans+=Math.abs(requests[i]-0);
            }
            else{
                ans+=Math.abs(requests[i]-requests[i-1]);
            }
        }
        return ans;
    }
}