class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        int cnt=0;
        for(List<Integer>li:map.values()){
            if(li.size()==3){
                if(li.get(1)-li.get(0)==li.get(2)-li.get(1)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}