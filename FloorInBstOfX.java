
class Solution {
    static int ans=-1;
    public  int floor(Node root, int x) {
        // code here
        ans=-1;
        find(root,x);
        return ans;
    }
    public void find(Node root,int x){
        if(root==null){
            return;
        }
        if(root.data>x){
            find(root.left,x);
        }
        else{
            ans=root.data;
            find(root.right,x);
        }
    }
}