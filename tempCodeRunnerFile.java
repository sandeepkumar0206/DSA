import java.util.*;

public class Solution {
    public long optimizeReservedConcurrency(int[] conc, int[] price) {
        int n = conc.length;
        if (n == 0) return 0;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (i, j) -> Integer.compare(conc[i], conc[j]));
        long totalCost = 0;
        long prev = Long.MIN_VALUE / 2;  // Safe low value
        for (int idx : indices) {
            long currConc = conc[idx];
            long currPrice = price[idx];
            
            long target = Math.max(currConc, prev + 1);
            long increments = target - currConc;
            totalCost += increments * currPrice;
            prev = target;
        }
        return totalCost;
    }
        public static void main(String[] args) {
        // Sample Case 0
        int[] conc1 = {8, 6, 8};
        int[] price1 = {8, 6, 7};
        System.out.println(optimizeReservedConcurrency(conc1, price1)); // Output: 7

        // Sample Case 1
        int[] conc2 = {3, 5};
        int[] price2 = {1, 7};
        System.out.println(optimizeReservedConcurrency(conc2, price2)); // Output: 0
    }
}
