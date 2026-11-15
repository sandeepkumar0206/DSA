class Solution {
    public String reorganizeString(String s) {
        int arr[]=new int [26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        PriorityQueue<Character>pq=new PriorityQueue<>((a,b)->(arr[b-'a']-arr[a-'a']));
        for(int i=0;i<26;i++){
            if(arr[i]>0){
                pq.add((char)(i+'a'));
            }
        }
        StringBuilder sb=new StringBuilder();
        while(pq.size()>=2){
            char f=pq.poll();
            char fs=pq.poll();
            sb.append(f);
            sb.append(fs);
            arr[f-'a']--;
            arr[fs-'a']--;
            if(arr[f-'a']>0){
                pq.add(f);
            }
            if(arr[fs-'a']>0){
                pq.add(fs);
            }
        }
        if(!pq.isEmpty()){
            char l=pq.poll();
            if(arr[l-'a']>1){
                return "";
            }
            sb.append(l);
        }
        return sb.toString();
    }
}