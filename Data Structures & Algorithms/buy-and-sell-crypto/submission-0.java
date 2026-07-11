class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profitMax = 0;
        for (int i = 0; i < n - 1; i++) {
            int buy = prices[i];
            for (int j = i + 1; j < n; j++) {
                int sell = prices[j];
                int profit = sell - buy;

                profitMax = Math.max(profitMax, profit);
            }
        }
        return profitMax;
    }
}
