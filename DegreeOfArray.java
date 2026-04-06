class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            max=Math.max(max,map.get(nums[i]));
        }
        int ans=Integer.MAX_VALUE;
        for(int i:map.keySet()){
            if(map.get(i)==max){
                int l=0,r=n-1;
                while(l<=n-1){
                    if(nums[l]==i){
                        break;
                    }
                    l++;
                }
                while(r>=0){
                    if(nums[r]==i){
                        break;
                    }
                    r--;
                }
                ans=Math.min(ans,r-l+1);
            }
        }

        return ans;
    }
}