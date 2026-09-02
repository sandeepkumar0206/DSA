class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int max=nums[0];
        arr[0]=max;
        for(int i=1;i<n;i++){
            max=Math.max(max,nums[i]);
            arr[i]=gcd(nums[i],max);
        }
        int i=0,j=n-1;long sum=0;
        Arrays.sort(arr);
        while(i<j){
            sum+=gcd(arr[i],arr[j]);
            i++;j--;
        }
        return sum;
    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}