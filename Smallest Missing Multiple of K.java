class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int m=k;
        while(set.contains(m)) {
            m+=k;
        }
        return m;
    }
}