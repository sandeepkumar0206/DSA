class Solution {
    public int[] rearrangeArray(int[] arr) {
        int[] nums=new int[arr.length];
        int posIndex=0;
        int negIndex=1;
        for(int i:arr){
            if(i>0){
                nums[posIndex]=i;
                posIndex+=2;
            }
            else{
                nums[negIndex]=i;
                negIndex+=2;
            }
        }
        return nums;
    }
}