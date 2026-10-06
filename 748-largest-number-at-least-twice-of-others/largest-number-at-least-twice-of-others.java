class Solution {
    public int dominantIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int maxIndex = find(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && nums[maxIndex] < (nums[i] * 2)) {
                return -1;
            }
        }
        return maxIndex;
    }

    public static int find(int[] arr) {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}