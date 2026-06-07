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
  public TreeNode createBinaryTree(int[][] descriptions) {
    HashMap<Integer,TreeNode>map=new HashMap<>();
    HashSet<Integer>set=new HashSet<>();
    for(int arr[]:descriptions){
      int  par=arr[0],child=arr[1],leftorright=arr[2];
      TreeNode root=map.getOrDefault(par,new TreeNode(par));
      map.put(par,root);
      set.add(child);
      if(leftorright==1){
        root.left=map.getOrDefault(child,new TreeNode(child));
        map.put(child,root.left);
      }
      else{
        root.right=map.getOrDefault(child,new TreeNode(child));
        map.put(child,root.right);
      }
    }
    int ans=-1;
    for(int i[]:descriptions){
      if(!set.contains(i[0])){
        ans=i[0];
        break;
      }
    }
    return map.getOrDefault(ans,new TreeNode());
  }
}