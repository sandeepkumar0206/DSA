class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int ans[]=new int[queries.length];
        List<Integer> n=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                n.add(i);
            }
        }
        for(int i=0;i<queries.length;i++){
            if(queries[i]>n.size()){
                ans[i]=-1;
            }
            else{
                ans[i]=n.get(queries[i]-1);
            }
        }
        return ans;
    }
}