class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashMap<Integer,Integer>ans=new HashMap<>();
        for(int i:map.values()){
            ans.put(i,ans.getOrDefault(i,0)+1);
        }
        for(int i:nums){
            if(ans.get(map.get(i))==1){
                return i;
            }
        }
        return -1;
    }
}