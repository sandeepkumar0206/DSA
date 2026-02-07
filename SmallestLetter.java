class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s=0;int e=letters.length-1;
        if(target>=letters[e]){
            return letters[0];
        }
        while(s<=e){
            int mid=(e-s)/2+s;
            if(target>=letters[mid]){
                s=mid+1;
            }
            else if(target<letters[mid]){
                e=mid-1;
            }
        }
        return letters[s];
    }
}
