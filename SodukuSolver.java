class Solution {
    public static boolean find(int i,int j,char board[][],int arr[][],int row[],int col[]){
        if(i==9){
            return true;
        }
        int newr=i,newc=j+1;
        if(newc==9){
            newr++;
            newc=0;
        }
        if(board[i][j]!='.'){
            return find(newr,newc,board,arr,row,col);
        }
        for(char num='1';num<='9';num++){
            int n=num-'0';
            if(
                ( (row[i] & (1<<n))==0 ) &&
                ( (col[j] & (1<<n))==0 ) &&
                ( (arr[i/3][j/3] & (1<<n))==0 )
                ){
                board[i][j]=num;
                row[i]^=(1<<n);
                col[j]^=(1<<n);
                arr[i/3][j/3]^=(1<<n);
                if(find(newr,newc,board,arr,row,col)){
                    return true;
                }
                row[i]^=(1<<n);
                col[j]^=(1<<n);
                arr[i/3][j/3]^=(1<<n);
                board[i][j]='.';
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        int row[]=new int[9];
        int col[]=new int[9];
        int arr[][]=new int[3][3];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    int num=board[i][j]-'0';
                    row[i]=row[i] | (1<<num);
                    col[j]=col[j] | (1<<num);
                    arr[i/3][j/3]= arr[i/3][j/3] | (1<<num);
                }
            }
        }
        find(0,0,board,arr,row,col);
    }
}
// class Solution {
//     public static boolean find(int i,int j,char board[][]){
//         if(i==9){
//             return true;
//         }
//         int newr=i,newc=j+1;
//         if(newc==9){
//             newr++;
//             newc=0;
//         }
//         if(board[i][j]!='.'){
//             return find(newr,newc,board);
//         }
//         for(char num='1';num<='9';num++){
//             if(issafe(i,j,board,num)){
//                 board[i][j]=num;
//                 if(find(newr,newc,board)){
//                     return true;
//                 }
//                 board[i][j]='.';
//             }
//         }
//         return false;
//     }
//     public static boolean issafe(int r,int c,char board[][],char num){
//         for(int k=0;k<9;k++){
//             if(board[k][c]==num){
//                 return false;
//             }
//         }
//         for(int k=0;k<9;k++){
//             if(board[r][k]==num){
//                 return false;
//             }
//         }
//         int nr=(r/3)*3,nc=(c/3)*3;
//         for(int i=nr;i<nr+3;i++){
//             for(int j=nc;j<nc+3;j++){
//                 if(board[i][j]==num){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
//     public void solveSudoku(char[][] board) {
//         find(0,0,board);
//     }
// }