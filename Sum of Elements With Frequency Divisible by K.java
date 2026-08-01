class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        // HashMap<Integer,Integer>map=new HashMap<>();
        // for(int i:nums){
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        // int sum=0;
        // for(int i:map.keySet()){
        //     if(map.get(i)%k==0){
        //         sum+=i*map.get(i);
        //     }
        // }
        // return sum;
        int arr[]=new int[101];
        for(int i:nums){
            arr[i]++;
        }
        int sum=0;
        for(int i=0;i<101;i++){
            if(arr[i]%k==0){
                sum+=i*arr[i];
            }
        }
        return sum;
    }
}