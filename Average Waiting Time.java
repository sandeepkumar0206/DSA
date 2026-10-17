class Solution {
    public double averageWaitingTime(int[][] customers) {
        int t=customers[0][0];
        int n=customers.length;
        double ans=0;
        for(int i[]:customers){
            t=Math.max(i[0]+i[1],t+i[1]);
            int wt=t-i[0];
            ans+=wt;
        }
        return (double)(ans/n);
    }
}