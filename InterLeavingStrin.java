class Solution {
    public static boolean find(int j,int k,int l,String s,String t,String str){
        if(j+k==str.length()){
            return true;
        }
        if(j<s.length() && s.charAt(j)==str.charAt(l)){
            if(find(j+1,k,l+1,s,t,str)){
                return true;
            }
        }
        if( k<t.length() && t.charAt(k)==str.charAt(l)){
            if(find(j,k+1,l+1,s,t,str)){
                return true;
            }
        }
        return false;
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length() +s2.length()!=s3.length()){
            return false;
        }
        int n=s1.length(),m=s2.length();
        boolean arr[][]=new boolean[n+1][m+1];
        arr[n][m]=true;
        for(int i=m-1;i>=0;i--){
            arr[n][i]=s2.charAt(i)==s3.charAt(n+i) && arr[n][i+1];
        }
        for(int i=n-1;i>=0;i--){
            arr[i][m]=s1.charAt(i)==s3.charAt(m+i) && arr[i+1][m];
        }
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(s1.charAt(i)==s3.charAt(i+j)){
                    if(arr[i+1][j]){
                        arr[i][j]=true;
                    }
                }
                if( s2.charAt(j)==s3.charAt(i+j)){
                    if(arr[i][j+1]){
                        arr[i][j]=true;
                    }
                }
            }
        }
        return arr[0][0];
        // return find(0,0,0,s1,s2,s3);   
    }
}