/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    static class  info{
        int d;Node n;
        info(int d,Node c){
            this.d=d;
            this.n=c;
        }
    }
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        TreeMap<Integer,Node>map=new TreeMap<>();
        Queue<info>q=new LinkedList<>();
        q.add(new info(0,root));
        while(!q.isEmpty()){
            info curr=q.remove();
            if(!map.containsKey(curr.d)){
                map.put(curr.d,curr.n);
            }
            if(curr.n.left!=null){
                q.add(new info(curr.d-1,curr.n.left));
            }
            if(curr.n.right!=null){
                q.add(new info(curr.d+1,curr.n.right));
            }
        }
        
        for(Node i :map.values()){
            ans.add(i.data);
        }
        return ans;
        
    }
}