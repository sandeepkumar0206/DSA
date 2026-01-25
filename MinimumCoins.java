class Solution {
    public int findMin(int n) {
        // code here
        int arr[]={10,5,2,1};
        int ans=0;
        for(int i=0;i<4;i++){
            ans+=n/arr[i];
            n%=arr[i];
        }
        return ans;
    }
}
