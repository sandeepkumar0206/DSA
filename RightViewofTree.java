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
    public static void find(TreeNode root,HashMap<Integer,Integer>map,int h){
        if(root==null){
            return ;
        }
        if(!map.containsKey(h)){
            map.put(h,root.val);
        }
        find(root.right,map,h+1);
        find(root.left,map,h+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        // HashMap<Integer,Integer>map=new HashMap<>();
        // find(root,map,0);
        // for(int i:map.values()){
        //     ans.add(i);
        // }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            for(int j=0;j<n;j++){
                TreeNode curr=q.remove();
                if(j==n-1){
                    ans.add(curr.val);
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return ans;
    }
}