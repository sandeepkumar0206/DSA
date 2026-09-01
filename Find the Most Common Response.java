class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String,Integer>map=new HashMap<>();
        int max=0;
        String ans="";
        int n=responses.size();
        for(int i=0;i<n;i++){
            HashSet<String>set=new HashSet<>(responses.get(i));
            for(String s:set){
                map.put(s,map.getOrDefault(s,0)+1);
                if(map.get(s)>max){
                    ans=s;
                    max=map.get(s);
                }
                else if(map.get(s)==max){
                    if(s.compareTo(ans)<0){
                        ans=s;
                    }
                }
            }
        }
        return ans;
    }
}