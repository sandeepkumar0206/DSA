class Solution {
    public int smallestAbsent(int[] nums) {
        int n=nums.length,sum=0;
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            sum+=i;
            set.add(i);
        }
        int average=(int)Math.floor(sum/n);
        if(average<=0){
            average=0;
        }
        for(int i=average+1;i<=200;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}