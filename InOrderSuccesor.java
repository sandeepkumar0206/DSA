class Solution {
    public int inorderSuccessor(Node root, Node x) {
        Node succ=null;
        while(root!=null){
            if(x.data<root.data){
                succ=root;
                root=root.left;
            }
            else{
                root=root.right;
            }
        }
        return succ==null ? -1 :succ.data;
    }
}