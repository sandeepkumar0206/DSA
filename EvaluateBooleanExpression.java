class Solution {
    public static boolean find(TreeNode root){
        if(root.val==0){
            return false;
        }
        if(root.val==1){
            return true;
        }
        if(root.val==2){
            return find(root.left) || find(root.right);
        }
        return find(root.left) && find(root.right);
    }
    public boolean evaluateTree(TreeNode root) {
        return find(root);
    }
}