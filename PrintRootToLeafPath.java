class Solution {
    public static void find(Node root,ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>li){
        if(root==null){
            return;
        }
        li.add(root.data);
        if(root.left==null && root.right==null){
            ans.add(new ArrayList<>(li));
        }
        else{
            find(root.left,ans,li);
            find(root.right,ans,li);
        }
        li.remove(li.size()-1);


    }
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        find(root,ans,new ArrayList<>());
        return ans;
        
    }
}