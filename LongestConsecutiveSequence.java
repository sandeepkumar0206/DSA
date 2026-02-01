class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int ans=0;
        for(int i:set){
            if(!set.contains(i-1)){
                int num=i;
                int cnt=0;
                while(set.contains(num)){
                    cnt++;
                    num++;
                }
                ans=Math.max(ans,cnt);
            }
        }
        return ans;
    }
}