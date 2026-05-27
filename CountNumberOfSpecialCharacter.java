class Solution {
    public int numberOfSpecialChars(String word) {
        int[] arr = new int[52];
        Arrays.fill(arr, -1) ;
        int n = word.length();
        for (int i = 0; i < n; i++) {
            char a = word.charAt(i);
            if (Character.isLowerCase(a)) {
                arr[a - 'a'] = i ;
            } else {
                int idx = a - 'A';
                if (arr[idx+26] == -1)
                    arr[idx+26] = i;
            }
        }
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] != -1 && arr[i+26] != -1 && arr[i] < arr[i+26])
                ans++ ;
        }
        return ans;
    }
}