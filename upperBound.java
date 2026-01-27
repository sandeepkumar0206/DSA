class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int n=arr.length;
        int s=0,e=n-1;
        while(s<e){
            int m=s+(e-s)/2;
            if(arr[m]<=target){
                s=m+1;
            }
            else{
                e=m;
            }
        }
        if(s==n-1 && arr[s]<target){
            return n;
        }
        return s;
    }
}
