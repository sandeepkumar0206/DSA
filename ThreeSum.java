class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>>ans=new HashSet<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]>0){
                break;
            }
            int s=i+1,e=n-1;
            while(s<e){
                int sum=nums[i]+nums[s]+nums[e];
                if(sum==0){
                    List<Integer>curr=new ArrayList<>();
                    curr.add(nums[i]);
                    curr.add(nums[s]);
                    curr.add(nums[e]);
                    ans.add(curr);
                    s++;
                }
                else if(sum>0){
                    e--;
                }
                else{
                    s++;
                }
            }
        }
        return new ArrayList<>(ans);
    }
}