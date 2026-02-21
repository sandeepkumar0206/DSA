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
    static class pair{
        TreeNode r;int index; 
        pair(TreeNode r,int index){
            this.r=r;
            this.index=index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<pair>q=new LinkedList<>();
        q.add(new pair(root,0));
        int ans=1;
        while(!q.isEmpty()){
            int n=q.size();
            int a=-1,b=-1;
            for(int i=0;i<n;i++){
                pair curr=q.remove();
                if(i==0){
                    a=curr.index;
                }
                if(i==n-1){
                    b=curr.index;
                }
                if(curr.r.left!=null){
                    q.add(new pair(curr.r.left,curr.index*2));
                }
                if(curr.r.right!=null){
                    q.add(new pair(curr.r.right,curr.index*2+1));
                }
            }
            ans=Math.max(ans,b-a+1);
        }
        return ans;
    }
}