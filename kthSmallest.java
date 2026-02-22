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
  int i=0,ans=-1;
  public void  get(TreeNode root,int k){
    if(root==null){
      return;
    }
    get(root.left,k);
    i++;
    if(k==i){
      ans=root.val;
      return;
    }
    get(root.right,k);
  }
  public int kthSmallest(TreeNode root, int k) {
    get(root,k);
    return ans;
  }
}