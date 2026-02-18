class Solution {
    static int ans=-1;
    public void find(Node root,int x){
        if(root==null){
            return;
        }
        if(root.data<x){
            find(root.right,x);
        }
        else{
            ans=root.data;
            find(root.left,x);
        }
    }
    
    int findCeil(Node root, int x) {
        ans=-1;
        find(root,x);
        return ans;
    }
}