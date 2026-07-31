class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            if(i%2==0){
                map.put(i,map.getOrDeafult(i,0)+1);
            }
        }
        int cnt=0;
        for(int i:map.values()){
            if(i==1){
                cnt++;
            }
        }
        return cnt;
    }
}