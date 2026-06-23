// class Solution {
//     public boolean reorderedPowerOf2(int n) {
//         int arr[]=find(n);
//         System.out.println(Arrays.toString(arr));
//         for(int i=0;i<=29;i++){
//             int curr=power(i);
//             System.out.println(curr);
//             int currArr[]=find(curr);
//             System.out.println(Arrays.toString(currArr));
//             int j=0;
//             for(;j<10;j++){
//                 if(arr[j]!=currArr[j]){
//                     break;
//                 }
//             }
//             if(j==10){
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static int power(int i){
//         if(i==0){
//             return 1;
//         }
//         else if(i%2==0){
//             return power(i/2)*power(i/2);
//         }
//         return 2*power(i/2)*power(i/2);
//     }
//     public static int[] find(int n){
//         int arr[]=new int[10];
//         while(n!=0){
//             arr[n%10]++;
//             n/=10;
//         }
//         return arr;
//     } 
// }
///2nd sol --- Optimization


class Solution {
    public boolean reorderedPowerOf2(int n) {
        int arr[]=find(n);
        for(int i=0;i<=29;i++){
            int curr=1<<i;
            int currArr[]=find(curr);
            if(Arrays.equals(arr,currArr)){
                return true;
            }
        }
        return false;
    }
    public static int[] find(int n){
        int arr[]=new int[10];
        while(n!=0){
            arr[n%10]++;
            n/=10;
        }
        return arr;
    } 
}