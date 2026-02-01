class Solution {
    void merge(int arr[],int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;
        int j=l;
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=arr[j++];
        }
        int arr2[]=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=arr[j++];
        }
        int j1=0,j2=0;
        j=l;
        
        while(j1<n1 && j2<n2){
            if(arr1[j1]<=arr2[j2]){
               arr[j] =arr1[j1];
               j1++;
            }
            else{
                arr[j] =arr2[j2];
                j2++;
            }
            j++;
        }
        while(j1<n1){
           arr[j] =arr1[j1];
           j1++;
           j++;
        }
        while(j2<n2){
           arr[j] =arr2[j2];
           j2++;
           j++;
        }
    }

    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r){
            return;
        }
            int m=l+(r-l)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        
    }
}