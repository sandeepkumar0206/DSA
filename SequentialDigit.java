// class Solution {
//     public List<Integer> sequentialDigits(int low, int high) {
//         List<Integer>ans=new ArrayList<>();
//         for(int i=1;i<=9;i++){
//             int n=i;
//             for(int j=i+1;j<=9;j++){
//                 n=n*10+j;
//                 if(n>=low && n<=high){
//                     ans.add(n);
//                 }
//             }
//         }
//         Collections.sort(ans);
//         return ans;
//     }
// }
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        String digits = "123456789";
        
        for (int len = 2; len <= 9; len++) {
            for (int i = 0; i + len <= 9; i++) {
                int num = Integer.parseInt(digits.substring(i, i + len));
                if (num >= low && num <= high) {
                    ans.add(num);
                }
            }
        }
        
        return ans;
    }
}