class Solution {
    ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer>ans=new ArrayList<>();
        if(root==null){
            return  ans;
        }
        ans.add(root.data);
        if(root.left==null && root.right==null){
            return ans;
        }
        Node l=root.left;
        Node r=root.right;
        while(l!=null){
            if(l.left==null && l.right==null){
                break;
            }
            ans.add(l.data);
            if(l.left==null){
                l=l.right;
            }
            else{
                l=l.left;
            }
        }
        inorder(root,ans);
        Stack<Integer>st=new Stack<>();
        while(r!=null){
            if(r.left==null && r.right==null){
                break;
            }
            st.push(r.data);
            if(r.right==null){
                r=r.left;
            }
            else{
                r=r.right;
            }
        }
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        return ans;
        
    }
    public void inorder(Node root,ArrayList<Integer>ans){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            ans.add(root.data);
        }
        inorder(root.left,ans);
        inorder(root.right,ans);
    }
}