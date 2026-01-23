class Solution {
    public static boolean find(int i,int j,char board[][]){
        if(i==9){
            return true;
        }
        int newr=i,newc=j+1;
        if(newc==9){
            newr++;
            newc=0;
        }
        if(board[i][j]!='.'){
            return find(newr,newc,board);
        }
        for(char num='1';num<='9';num++){
            if(issafe(i,j,board,num)){
                board[i][j]=num;
                if(find(newr,newc,board)){
                    return true;
                }
                board[i][j]='.';
            }
        }
        return false;
    }
    public static boolean issafe(int r,int c,char board[][],char num){
        for(int k=0;k<9;k++){
            if(board[k][c]==num){
                return false;
            }
        }
        for(int k=0;k<9;k++){
            if(board[r][k]==num){
                return false;
            }
        }
        int nr=(r/3)*3,nc=(c/3)*3;
        for(int i=nr;i<nr+3;i++){
            for(int j=nc;j<nc+3;j++){
                if(board[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        find(0,0,board);
    }
}