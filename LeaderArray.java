class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            if(ans.size()==0){
                ans.add(arr[i]);
            }
            else if(ans.get(0)<=arr[i]){
                ans.add(0,arr[i]);
            }
        }
        return ans;
    }
}
