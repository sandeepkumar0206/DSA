class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        int n=nums.length;
        int l[]=new int[n];
        int r[]=new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                l[i]=0;
            }
            else{
                l[i]=Math.max(nums[i-1],l[i-1]);
            }
            int j=n-i-1;
            if(n-1==j){
                r[j]=0;
            }
            else{
                r[j]=Math.max(nums[j+1],r[j+1]);
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>l[i] || nums[i]>r[i] || i==0 || i==n-1){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}