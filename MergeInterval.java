class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingDouble(o->o[0]));
        List<int[]>ans=new ArrayList<>();
        int s=intervals[0][0];
        int e=intervals[0][1];
        for(int i[]:intervals){
            if(i[0]<=e){
                e=Math.max(e,i[1]);
            }
            else{
                ans.add(new int[]{s,e});
                s=i[0];
                e=i[1];
            }
        }
        ans.add(new int[]{s,e});
        return ans.toArray(new int[ans.size()][2]);
    }
}