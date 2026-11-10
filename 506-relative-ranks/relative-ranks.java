class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] ans = new String[n];
        int[][] ranked = new int[n][2];

        for (int i = 0; i < n; i++) {
            ranked[i][0] = score[i];
            ranked[i][1] = i;
        }

        Arrays.sort(ranked, (a, b) -> Integer.compare(b[0], a[0]));

        for (int i = 0; i < n; i++) {
            int originalIndex = ranked[i][1];
            if (i == 0) {
                ans[originalIndex] = "Gold Medal";
            } else if (i == 1) {
                ans[originalIndex] = "Silver Medal";
            } else if (i == 2) {
                ans[originalIndex] = "Bronze Medal";
            } else {
                ans[originalIndex] = String.valueOf(i + 1);
            }
        }

        return ans;
    }
}