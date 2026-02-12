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
    public static int getL(TreeNode root) {
        int h=0;
        while(root!=null){
            h++;
            root=root.left;
        }
        return h;
    }
    
    public static  int getR(TreeNode root) {
        int h=0;
        while(root!=null){
            h++;
            root=root.right;
        }
        return h;
    }
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int lh=getL(root);
        int rh=getR(root);
        if(lh==rh){
            return (1<<lh)-1;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}