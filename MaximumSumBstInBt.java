
class Solution {
    static class info{
        int min,max;
        boolean isBst;
        int size;
        info(int min,int max,boolean isBst,int size){
            this.min=min;
            this.max=max;
            this.isBst=isBst;
            this.size=size;
            
        }
    }
    public static int ans=0;
    public int maxSumBST(TreeNode root) {
        ans=0;
        find(root);
        return ans;
    }
     public static  info find(TreeNode root){
        if(root==null){
            return new info(Integer.MAX_VALUE,Integer.MIN_VALUE,true,0);
        }
        info l=find(root.left);
        info r=find(root.right);
        int min=Math.min(root.val,Math.min(l.min,r.min));
        int max=Math.max(root.val,Math.max(l.max,r.max));
        int size=l.size+r.size+root.val;
        if(l.max>=root.val || r.min<=root.val){
            return new info(min,max,false,size);
        }
        if(l.isBst  && r.isBst){
            ans=Math.max(size,ans);
            return new info(min,max,true,size);
        }
        return new info(min,max,false,size);
    }
}