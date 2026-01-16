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
    static class info{
        int h,d;
        public info(int h,int d){
            this.h=h;
            this.d=d;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        info ans=diameterOfBinaryTreec(root);
        return ans.d-1;
    }
    public info diameterOfBinaryTreec(TreeNode root) {
        if(root==null){
            return new info(0,0);
        }
        info l=diameterOfBinaryTreec(root.left);
        info r=diameterOfBinaryTreec(root.right);
        int currDia=l.h+r.h+1;
        return new info(Math.max(l.h,r.h)+1,Math.max(currDia,Math.max(l.d,r.d)));
    }
}