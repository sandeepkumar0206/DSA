class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>>ans=new ArrayList<>();
        boolean arr[][]=new boolean[8][8];
        for(int i[]:queens){
            arr[i[0]][i[1]]=true;
        }
        int dir[][]=new int[][]{
            {-1,0},
            {-1,1},
            {-1,-1},
            {0,1},
            {0,-1},
            {1,-1},
            {1,0},
            {1,1},
        };
        for(int i[]:dir){
            int r=king[0];
            int c=king[1];
            while(r<8 && r>=0 && c>=0 && c<8){
                r+=i[0];
                c+=i[1];
                if(r<0 || r>=8 || c<0 || c>=8){
                    break;
                }
                if(arr[r][c]){
                    ans.add(new ArrayList<>(Arrays.asList(r,c)));
                    break;
                }
            }
        }
        return ans;
    }
}