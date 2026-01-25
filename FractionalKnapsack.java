import java.util.*;
class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        double ans=0;
        int n=val.length;
        double arr[][]=new double[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=i;
            arr[i][1]=(double)val[i]/wt[i];
        }
        Arrays.sort(arr,(a,b)->Double.compare(b[1],a[1]));
        // for(double i[]:arr){
        //     System.out.println(Arrays.toString(i));
        // }
        for(int i=0;i<n && capacity>0;i++){
            int idx=(int)arr[i][0];
            if(wt[idx]<=capacity){
                ans+=val[idx];
                capacity-=wt[idx];
            }
            else{
                ans+=arr[i][1]*capacity;
                break;
            }
        }
        return ans;
    }
}