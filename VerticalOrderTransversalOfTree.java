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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>map=new TreeMap<>();
        pre(root,0,0,map);

        for(TreeMap<Integer,PriorityQueue<Integer>>i :map.values()){
            List<Integer>li=new ArrayList<>();
            for(PriorityQueue<Integer>pq:i.values()){
                while(!pq.isEmpty()){
                    li.add(pq.poll());
                }
            }
            ans.add(li);
        }
        return ans;
    }
    public static void pre(TreeNode root,int c,int r,TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>map){
        if(root==null){
            return ;
        }
        if(map.containsKey(c)){
            if(!map.get(c).containsKey(r)){
               map.get(c).put(r,new PriorityQueue<>());
            }
            map.get(c).get(r).add(root.val); 
            
        }
        else{
            map.put(c,new TreeMap<>());
            map.get(c).put(r,new PriorityQueue<>());
            map.get(c).get(r).add(root.val);
        }
        pre(root.left,c-1,r+1,map);
        pre(root.right,c+1,r+1,map);
    }
}