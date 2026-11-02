class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int[] ans = Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .toArray();
        Arrays.sort(ans);
        return ans[k - 1];
    }
}