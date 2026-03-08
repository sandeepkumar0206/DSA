class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(sb.length()<nums[0].length()){
            if(nums[i].charAt(i)=='0'){
                sb.append('1');
            }
            else{
                sb.append('0');
            }
            i++;
        }
        return sb.toString();
    }
}