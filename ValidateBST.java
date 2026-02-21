class Solution {
    public static boolean find(TreeNode root,TreeNode min,TreeNode max){
        if(root==null){
            return true;
        }
        if(min!=null && root.val<=min.val){
            return false;    
        }
        if(max!=null && root.val>=max.val){
            return false;    
        }
        return find(root.left,min,root) && find(root.right,root,max);        
    }
    public boolean isValidBST(TreeNode root) {
        return find(root,null,null);
    }
}