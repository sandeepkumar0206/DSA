class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        int arr[]=new int[101];
        for(int i:bulbs){
            if(arr[i]==1){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<101;i++){
            if(arr[i]==1){
                ans.add(i);
            }
        }
        return ans;
    }
}