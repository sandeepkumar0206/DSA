class Solution {
    static class info{
        int col,row;TreeNode r;
        public info(TreeNode r,int row,int col){
            this.r=r;
            this.row=row;;
            this.col=col;
        }
    }

    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=height(root.left);
        int r=height(root.right);
        return Math.max(l,r)+1;
    }

    public List<List<String>> printTree(TreeNode root) {
        List<List<String>>ans=new ArrayList<>();
        int m=height(root);
        int n=(int)Math.pow(2,m)-1;
        for(int i=0;i<m;i++){
            List<String>li=new ArrayList<>();
            for(int j=0;j<n;j++){
                li.add("");
            }
            ans.add(li);
        }
        Queue<info>q=new LinkedList<>();
        q.add(new info(root,0,(n-1)/2));
        while(!q.isEmpty()){
            info curr=q.remove();
            ans.get(curr.row).set(curr.col,String.valueOf(curr.r.val));
            int o=(int)Math.pow(2,m-curr.row-2);
            if(curr.r.left!=null){
                q.add(new info(curr.r.left,curr.row+1,curr.col-o));
            }
            if(curr.r.right!=null){
                q.add(new info(curr.r.right,curr.row+1,curr.col+o));
            }
        }
        return ans;
    }
    
}