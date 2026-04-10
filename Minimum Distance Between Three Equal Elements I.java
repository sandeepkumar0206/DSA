class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.get(nums[i]).add(i);
            }
            else{
                map.put(nums[i],new ArrayList<>());
                map.get(nums[i]).add(i);
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i:map.keySet()){
            if(map.get(i).size()>=3){
                List<Integer>curr=map.get(i);
                for(int j=0;j+2<curr.size();j++){
                    ans=Math.min(ans,2*(curr.get(j+2)-curr.get(j)));
                }
            }
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}

