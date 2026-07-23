class Solution {
    public int getLeastFrequentDigit(int n) {
        int min=9,cnt=11;
        int arr[]=new int[10];
        while(n!=0){
            arr[n%10]++;
            n/=10;
        }
        for(int i=0;i<10;i++){
            if(arr[i]!=0 && arr[i]<cnt){
                min=i;
                cnt=arr[i];
            }
        }
        return min;
    }
}