class Solution {
    public int findFloor(int[] arr, int x) {
        int n=arr.length;
        if(x==0){
            return -1;
        }
        if(arr[n-1]<x){
            return n-1;
        }

        int ans=-1;
        int s=0,e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]<=x){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
        
    }
}
