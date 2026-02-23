class Solution {
    public static TreeNode find(TreeNode root,int val){
        if(root==null){
            return root=new TreeNode(val);
        }
        if(root.val<val){
            root.right=find(root.right,val);
        }
        else{
            root.left=find(root.left,val);
        }
        return root;
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return find(root,val);
    }
}