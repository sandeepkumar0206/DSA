import java.util.*;
class Solution {
    public static int[] freq(String s){
        int arr[]=new int[10];
        for(char ch:s.toCharArray()){
            arr[ch-'0']++;
        }
        return arr;
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public boolean isDigitorialPermutation(int n) {
        String s=String.valueOf(n);
        int a[]=freq(s);
        int sum=0;
        for(char ch:s.toCharArray()){
            sum+=fact(ch-'0');
        }
        int b[]=freq(String.valueOf(sum));
        return Arrays.equals(a,b);
    }
}