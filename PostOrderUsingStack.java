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
    public static void find(TreeNode root, Stack<Integer>st){
        if(root==null){
            return ;
        }
        find(root.left,st);
        find(root.right,st);
        st.push(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        find(root,st);
        while(!st.isEmpty()){
            ans.add(0,st.pop());
        }
        return ans;
    }
}