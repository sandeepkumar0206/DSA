class Solution {
    public List<String> printVertically(String s) {
        String arr[]=s.split(" ");
        int maxLength=0;
        for(String i:arr){
            maxLength=Math.max(maxLength,i.length());
        }
        List<String>ans=new ArrayList<>();
        for(int i=0;i<maxLength;i++){
            StringBuilder sb=new StringBuilder();
            for(String word:arr){
                if(i<word.length()){
                    sb.append(word.charAt(i));
                } 
                else{
                    sb.append(" ");
                }
            }
            ans.add(sb.toString().stripTrailing());
        }
        return ans;
    }
}