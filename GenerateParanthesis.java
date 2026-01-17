class Solution {
    public static void find(List<String>ans,int n,int o,int c,String s){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        if(c<o){
            find(ans,n,o,c+1,s+")");
        }
        if(o<n)find(ans,n,o+1,c,s+"(");


    }
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        find(ans,n,0,0,"");
        return ans;
    }
}