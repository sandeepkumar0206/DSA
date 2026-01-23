class Solution {
    public static void find(int i,int n,List<List<String>>ans,char arr[][]){
        if(i==n){
            List<String>curr=new ArrayList<>();
            for(char arrr[]:arr){
                String s="";
                for(char ch:arrr){
                    s+=ch;
                }
                curr.add(s);
            }
            ans.add(curr);
            return;
        }
        for(int  j=0;j<n;j++){
            if(check(arr,i,j,n)){
                arr[i][j]='Q';
                find(i+1,n,ans,arr);
                arr[i][j]='.';
            }
        }
    }
    public static boolean check(char arr[][],int i,int j,int n){
        for(int k=i-1;k>=0;k--){
            if(arr[k][j]=='Q'){
                return false;
            }
        }
        for(int k=i-1,l=j-1;k>=0 && l>=0;k--,l--){
            if(arr[k][l]=='Q'){
                return false;
            }
        }
        for(int k=i-1,l=j+1;k>=0 && l<n;k--,l++){
            if(arr[k][l]=='Q'){
                return false;
            }
        }
        return true;
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>ans=new ArrayList<>();
        char arr[][]=new char[n][n];
        for(char i[]:arr){
            Arrays.fill(i,'.');
        }
        find(0,n,ans,arr);
        return ans;
    }
}