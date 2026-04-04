class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int n=encodedText.length();
        int c=(int)Math.ceil((double)(n/rows));
        char arr[][]=new char[rows][c];
        int p=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=encodedText.charAt(p);
                p++;
            }
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<c;i++){
            int x=0,y=i;
            while(y<c && x<rows){
                ans.append(arr[x][y]);
                x++;
                y++;
            }
        }
        int l=ans.length()-1;
        while (l >= 0 && ans.charAt(l)==' ') {
            l--;
        }
        ans.setLength(l + 1);
        return ans.toString();
    }
}