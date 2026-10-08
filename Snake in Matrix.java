class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int r=0,c=0;
        for(String s:commands){
            if(s.equals("DOWN")){
                r++;
            }
            else if(s.equals("RIGHT")){
                c++;
            }
            else if(s.equals("UP")){
                r--;
            }
            else{
                c--;
            }
        }
        return n*(r)+c;
    }
}