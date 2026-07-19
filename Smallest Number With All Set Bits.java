class Solution {
    public int smallestNumber(int n) {
        int ans=1;
        while(n!=0){
            n>>=1;
            ans<<=1;
        }
        return ans-1;
    }
}

/*
101- 3 2^3 =8 -1 
111
*/
1  1<<=1 1
10 
100
1000
10000
100000