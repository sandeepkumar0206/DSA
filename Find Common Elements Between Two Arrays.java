class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans=0;
        for(int i=low;i<=high;i++){
            String curr=String.valueOf(i);
            int len=curr.length();
            if(len%2==0){
                int currAns=0;
                for(int j=0;j<len/2;j++){
                    currAns+=curr.charAt(j)-'0';
                    currAns-=curr.charAt(len-j-1)-'0';
                }
                if(currAns==0){
                    ans++;
                }
            }
        }
        return ans;
    }
}