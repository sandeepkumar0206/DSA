class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        List<Integer>ans=new ArrayList<>();
        int n=nums.length;
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            // else{
                map.get(nums[i]).add(i);
            // }
        }
        int m=queries.length;
        for(int i=0;i<m;i++){
            int val=nums[queries[i]];
            if(map.containsKey(val)){
                int max=Integer.MAX_VALUE;
                List<Integer>curr=map.get(val);
                for(int j=0;j<curr.size();j++){
                    if(queries[i]!=curr.get(j)){
                    max=Math.min(max,Math.abs(curr.get(j)-queries[i]));
                    max=Math.min(max,Math.abs(n+queries[i]-curr.get(j)));
                    max=Math.min(max,Math.abs(n-queries[i]+curr.get(j)));
                    }
                }
                if(max!=Integer.MAX_VALUE){
                    ans.add(max);
                }
                else{
                    ans.add(-1);
                }
            }
            else{
                ans.add(-1);
            }
        }
        return ans;
    }
}