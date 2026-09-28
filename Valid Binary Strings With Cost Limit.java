class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String>ans=new ArrayList<>();
        find(new StringBuilder(),n,k,ans,false,0,0);
        return ans;
    }
    public static void find(StringBuilder curr,int n,int k,List<String>ans,boolean prev,int cnt,int idx){
        if(cnt>k){
            return ;
        }
        if(idx==n){
            ans.add(curr.toString());
            return ;
        }
        curr.append('0');
        find(curr,n,k,ans,false,cnt,idx+1);
        curr.deleteCharAt(curr.length()-1);
        if(!prev){
            curr.append('1');
            find(curr,n,k,ans,true,cnt+idx,idx+1);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}