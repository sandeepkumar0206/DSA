class Solution {
    public String getEncryptedString(String s, int k) {
        int n=s.length();
        k%=n;
        return s.substring(k)+s.substring(0,k);
    }
}
/// when thing we can also do rotate the string 
// rotate (0,k-1) rotate(k,n);then rotate (0,n);