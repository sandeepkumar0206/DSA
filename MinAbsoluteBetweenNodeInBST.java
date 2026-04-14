/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int ans;
    static int p;
    public static void find(TreeNode root){
        if(root==null){
            return ;
        }
        find(root.left);
        ans=Math.min(ans,Math.abs(root.val-p));
        p=root.val;
        find(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        ans=Integer.MAX_VALUE;
        p=Integer.MAX_VALUE;
        find(root);
        return ans;
    }
}