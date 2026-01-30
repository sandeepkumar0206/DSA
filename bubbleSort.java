class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        int n=arr.length;
        solution(arr,0,arr.length);
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-i-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             int t=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=t;
        //         }
        //     }
        // }
        
    }
    public static void solution(int arr[],int i,int n){
        if(i==n){
            return;
        }
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int t=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
            }
        }
        solution(arr,i+1,n);
    }
}