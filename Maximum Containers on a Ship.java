class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int k=maxWeight/w;
        return Math.min(k,n*n);
    }
}