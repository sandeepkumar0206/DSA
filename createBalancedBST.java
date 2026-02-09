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
    public static TreeNode find(ArrayList<Integer>ans,int i,int j){
        if(i>j){
            return null;
        }
        int mid=(i+j)/2;
        TreeNode root=new TreeNode(ans.get(mid));
        root.left=find(ans,i,mid-1);
        root.right=find(ans,mid+1,j);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer>ans=new ArrayList<>();
        print(root,ans);
        return root=find(ans,0,ans.size()-1);
    }
    public static void print(TreeNode root,ArrayList<Integer>ans){
        if(root==null){
            return;
        }
        print(root.left,ans);
        ans.add(root.val);
        print(root.right,ans);
    }
}