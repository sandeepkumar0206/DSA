class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(cloned);
        while(!q.isEmpty()){
            // int n=q.size();
            // for(int i=0;i<n;i++){
                TreeNode curr=q.remove();
                if(curr.val==target.val){
                    return curr;
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            // }
        }
        return null;
    }
}