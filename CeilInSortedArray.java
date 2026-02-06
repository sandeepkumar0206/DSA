class Solution {
    public int findCeil(int[] arr, int x) {
        int n=arr.length;
        if(x==0){
            return 0;
        }
        if(arr[n-1]<x){
            return -1;
        }

        int ans=-1;
        int s=0,e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]<x){
                s=mid+1;
            }
            else{
                ans=mid;
                e=mid-1;
            }
        }
        return ans;
    }
}
