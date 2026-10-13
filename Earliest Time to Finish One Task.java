class Solution {
    public int earliestTime(int[][] tasks) {
        int min=Integer.MAX_VALUE,ans=0;
        for(int i[]:tasks){
            int c=i[0]+i[1];
            if(min>c){
                min=c;
                ans=c;
            }
        }
        return ans;
    }
}