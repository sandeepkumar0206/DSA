class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        int num=1<<k;
        
        // System.out.print(num);
        return (n&num)!=0;
    }
}