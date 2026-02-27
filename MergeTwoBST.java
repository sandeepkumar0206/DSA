class Solution {
    public void find(Node root,ArrayList<Integer>ans){
        if(root==null){
            return;
        }
        find(root.left,ans);
        ans.add(root.data);
        find(root.right,ans);
        
    }
    public ArrayList<Integer> merge(Node root1, Node root2) {
        // code here
        ArrayList<Integer>ans1=new ArrayList<>();
        find(root1,ans1);
        ArrayList<Integer>ans2=new ArrayList<>();
        find(root2,ans2);
        ArrayList<Integer>ans=new ArrayList<>();
        int i=0,j=0,k=0,n=ans1.size(),m=ans2.size();
        while(i<n && j<m){
            if(ans1.get(i)<ans2.get(j)){
                ans.add(ans1.get(i));
                i++;
            }
            else{
                ans.add(ans2.get(j));
                j++;
            }
            k++;
        }
        while(i<n){
            ans.add(ans1.get(i));
            i++;
            k++;
        }
        while(j<m){
            ans.add(ans2.get(j));
            j++;
            k++;
        }
        return ans;
    }
}