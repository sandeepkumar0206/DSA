class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int max=0;
        for(int i=1;i<s.length();i++){
            max=Math.max(max,Math.abs(s.charAt(i)-s.charAt(i-1)));
        }
        return max<=2;
    }
}