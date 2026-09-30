class Solution {
    public int findPermutationDifference(String s, String t) {
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr1[s.charAt(i)-'a']=i;
            arr2[t.charAt(i)-'a']=i;
        }
        int sum=0;
        for(int i=0;i<26;i++){
            sum+=Math.abs(arr1[i]-arr2[i]);
        }
        return sum;
    }
}