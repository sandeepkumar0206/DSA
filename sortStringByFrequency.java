class Solution {
    public String frequencySort(String s) {
        int arr[]=new int[128];
        int n =s.length();
        for(int i=0;i<n;i++){
            arr[s.charAt(i)]++;
        }
        String ans="";
        while(ans.length()<n){
            int max=arr[0];
            int idx=0;
            for(int i=1;i<128;i++){
                if(max<arr[i]){
                    max=arr[i];
                    idx=i;
                }
            }
            while(arr[idx]!=0){
                ans+=(char)idx;
                arr[idx]--;
            }
        }
        return ans;
    }
}