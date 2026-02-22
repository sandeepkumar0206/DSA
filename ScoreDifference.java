class Solution {
    public int scoreDifference(int[] nums) {
        int a=0,b=0;
        boolean isTrue=true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                isTrue=!isTrue;
            }
            if((i+1)%6==0){
                isTrue=!isTrue;
            }
            if(isTrue){
                a+=nums[i];
            }
            else{
                b+=nums[i];
            }
            
        }
        return a-b;
    }
}