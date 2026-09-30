class Solution {
    public String convertDateToBinary(String date) {
        return find(Integer.valueOf(date.substring(0,4)))+
        "-"+find(Integer.valueOf(date.substring(5,7)))+
        "-"+find(Integer.valueOf(date.substring(8)));
    }
    public static String find(int n){
        return Integer.toBinaryString(n);
    }
}