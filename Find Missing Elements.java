class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        boolean arr[]=new boolean[101];
        int min=101,max=1;
        for(int i:nums){
            min=Math.min(min,i);
            max=Math.max(max,i);
            arr[i]=true;
        }
        List<Integer>ans=new ArrayList<>();
        for(int i=min+1;i<=max-1;i++){
            if(!arr[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}