class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int ans=Integer.MAX_VALUE;
        for(int j=l;j<=r;j++){
            for (int i=0;i+j<=n;i++){
                int sum=0;
                for (int k=i;k<i+j;k++){
                    sum+=nums.get(k);
                }
                if(sum>0 && sum<ans){
                    ans=sum;
                }
            }
        }
        return ans==Integer.MAX_VALUE ? -1:ans;
    }
}