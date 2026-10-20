class Solution {
    public int minDeletion(String s, int k) {
        int arr[]=new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        Arrays.sort(arr);
        int cnt=0;
        for(int i=25;i>=26-k;i--){
            cnt+=arr[i];
        }
        return s.length()-cnt;
    }
}