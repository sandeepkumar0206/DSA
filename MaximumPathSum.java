class Solution {
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        find(root);
        return max;
    }
    public int find(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=Math.max(0,find(root.left));
        int r=Math.max(0,find(root.right));
        max=Math.max(max,root.val+l+r);
        return root.val+Math.max(l,r);
    }
}