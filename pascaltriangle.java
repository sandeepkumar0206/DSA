class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();
        ans.add(new ArrayList<>(Arrays.asList(1)));
        for(int i=1;i<numRows;i++){
            List<Integer>currans=new ArrayList<>();
            List<Integer>prev=ans.get(i-1);
            currans.add(1);
            for(int j=1;j<i;j++){
                currans.add(prev.get(j-1)+prev.get(j));
            }
            currans.add(1);
            ans.add(currans);

        }   
        return ans;
    }
}