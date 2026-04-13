class Solution {
    public static boolean find(TreeNode root,int n){
        if(root==null){
            return true;
        }
        if(root.val!=n){
            return false;
        }
        return find(root.left,n) && find(root.right,n);
    }
    public boolean isUnivalTree(TreeNode root) {
        return find(root.left,root.val) && find(root.right,root.val);
    }
}