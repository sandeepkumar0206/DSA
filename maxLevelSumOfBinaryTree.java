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
    public int maxLevelSum(TreeNode root) {
        int ans=1;
        int max=root.val;
        Queue<TreeNode>q=new LinkedList<>();
        int level=1;
        q.add(root);
        while(!q.isEmpty()){
            int l=q.size();
            int currMax=0;
            for(int i=0;i<l;i++){
                TreeNode t=q.remove();
                currMax+=t.val;
                if(t.left!=null){
                    q.add(t.left);
                }
                if(t.right!=null){
                    q.add(t.right);
                }
            }
            if(max<currMax){
                ans=Math.max(ans,level);
                max=currMax;
            }
            level++;
        }

        return ans;
    }
}