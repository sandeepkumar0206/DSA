class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        List<Integer>l1=new ArrayList<>();
        List<Integer>l2=new ArrayList<>();
        l1.add(nums[0]);
        l2.add(nums[1]);
        int k1=0,k2=0;
        for(int i=2;i<n;i++){
            if(l1.get(k1)>l2.get(k2)){
                l1.add(nums[i]);
                k1++;
            }
            else{
                l2.add(nums[i]);
                k2++;
            }
        }
        System.out.println(l1);
        System.out.println(l2);
        int i=0;
        for(int val:l1){
            nums[i]=val;
            i++;
        }
        for(int val:l2){
            nums[i]=val;
            i++;
        }
        return nums;
    }
}