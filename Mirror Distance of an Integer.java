class Solution {
    public int mirrorDistance(int n) {
        StringBuilder sb=new StringBuilder(String.valueOf(n));
        String s=sb.reverse().toString();
        return Math.abs(n-Integer.valueOf(s));
    }
}