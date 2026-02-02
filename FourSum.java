class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>>ans=new HashSet<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int j=0;j<n-3;j++){
            if(j>0 && nums[j]==nums[j-1]){
                continue;
            }
            for(int i=j+1;i<n-2;i++){
                if(i>j+1 && nums[i]==nums[i-1]){
                    continue;
                }
                int s=i+1,e=n-1;
                while(s<e){
                    long sum=(long)nums[j]+nums[i]+nums[s]+nums[e];
                    if(sum==target){
                        List<Integer>curr=new ArrayList<>();
                        curr.add(nums[j]);
                        curr.add(nums[i]);
                        curr.add(nums[s]);
                        curr.add(nums[e]);
                        ans.add(curr);
                        s++;
                    }
                    else if(sum>target){
                        e--;
                    }
                    else{
                        s++;
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
}