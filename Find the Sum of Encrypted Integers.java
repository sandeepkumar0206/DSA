class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int ans=0;
        for(int i:nums){
            ans+=find(i);
        }
        return ans;
    }
    public static int find(int n){
        int ans=0,max=0;
        while(n!=0){
            int d=n%10;
            ans=ans*10+1;
            max=Math.max(d,max);
            n/=10;
        }
        ans*=max;
        return ans;
    }
}