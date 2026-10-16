class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int a1=coordinate1.charAt(0)-'a';
        int a2=coordinate1.charAt(1)-'1';
        int b1=coordinate2.charAt(0)-'a';
        int b2=coordinate2.charAt(1)-'1';
        return (a1+a2+b1+b2)%2==0;
    }
}