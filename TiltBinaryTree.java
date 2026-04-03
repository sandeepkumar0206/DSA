class Solution {
    static int ans=0;
    public static int  find(TreeNode root){
        if(root==null){
            return 0;
        }
        int sum=root.val;
        int l=find(root.left);
        int r=find(root.right);
        sum+=l;
        sum+=r;
        ans+=Math.abs(l-r);
        return sum;
    }
    public int findTilt(TreeNode root) {
        ans=0;
        find(root);
        return ans;
    }
}