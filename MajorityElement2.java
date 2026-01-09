class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0,c2=0,n1=Integer.MAX_VALUE,n2=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i:nums){
            if(c1==0 && i!=n2){
                c1=1;
                n1=i;
            }
            else if(c2==0 && i!=n1){
                c2=1;
                n2=i;
            }
            else if(i==n1){
                c1++;
            }
            else if(i==n2){
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        List<Integer>ans=new ArrayList<>();
        c1=0;c2=0;
        for(int i:nums){
            if(n1==i){
                c1++;
            }
            if(n2==i){
                c2++;
            }
        }
        if(c1>n/3){
            ans.add(n1);
        }
        if(c2>n/3){
            ans.add(n2);
        }
        return ans;
    }
}