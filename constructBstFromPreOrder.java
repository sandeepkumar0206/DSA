class Solution {
    public static TreeNode insert(TreeNode ans,int val){
        if(ans==null){
            return ans=new TreeNode(val);
        }
        if(ans.val<val){
            ans.right=insert(ans.right,val);
        }
        else{
            ans.left=insert(ans.left,val);
        }
        return ans;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode ans=null;
        for(int i=0;i<preorder.length;i++){
            ans=insert(ans,preorder[i]);
        }
        return ans;
    }
}