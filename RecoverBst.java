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
    static TreeNode prev;
    static TreeNode first;
    static TreeNode last;
    static TreeNode middle;;

    public static void find(TreeNode root){
        if(root==null){
            return;
        }
        find(root.left);
        if(prev!=null && root.val<prev.val){
            if(first==null){
                first=prev;
                middle=root;
            }
            else{
                last=root;
            }
        }
        prev=root;
        find(root.right);
    }
    public void recoverTree(TreeNode root) {
        prev=first=last=middle=null;
        find(root);
        if(first!=null  && last!=null ){
            int t=first.val;
            first.val=last.val;
            last.val=t;
        }
        else if(first!=null && middle!=null){
            int t=first.val;
            first.val=middle.val;
            middle.val=t;
        }
    }
}