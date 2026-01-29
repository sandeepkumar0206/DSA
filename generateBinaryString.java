class Solution {
    public ArrayList<String> binstr(int n) {
        // code here
        ArrayList<String>ans=new ArrayList<>();
        find(ans,n,"");
        return ans;
        
    }
    public static void find(ArrayList<String>ans,int n,String curr){
        if(curr.length()==n){
            ans.add(curr);
            return;
        }
        find(ans,n,curr+'0');
        find(ans,n,curr+'1');
    }
}
