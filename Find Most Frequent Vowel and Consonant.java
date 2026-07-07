class Solution {
    public int maxFreqSum(String s) {
        int arr[]=new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        int a=0,b=0;
        for(int i=0;i<26;i++){
            if(i==0 || i==4 || i==8 || i==14 || i==20){
                a=Math.max(a,arr[i]);
            }
            else{
                b=Math.max(b,arr[i]);
            }
        }
        return a+b;
    }
}
