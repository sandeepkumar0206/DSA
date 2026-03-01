class Solution {
    public int minPartitions(String n) {
        char max='0';
        for(char ch:n.toCharArray()){
            if(ch>max){
                max=ch;
            }
        }
        return (int)(max-'0');
    }
}