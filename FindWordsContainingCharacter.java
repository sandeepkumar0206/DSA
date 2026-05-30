class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>ans=new ArrayList<>();
        int n=words.length;
        for(int j=0;j<n;j++){
            int m=words[j].length();
            for(int i=0;i<m;i++){
                if(words[j].charAt(i)==x){
                    ans.add(j);
                    break;
                }
            }
        }
        return ans;
    }
}