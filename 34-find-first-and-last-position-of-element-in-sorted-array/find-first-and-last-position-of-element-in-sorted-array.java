class Solution {
    private static int findFirst(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = end + (start - end) / 2;
            if (nums[mid] >= target) {
                if (nums[mid] == target) {
                    index = mid;
                }
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;
    }

    private static int findLast(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                if (nums[mid] == target) {
                    index = mid;
                }
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }
    public int[] searchRange(int[] nums, int target) {
         if (nums == null || nums.length == 0) {
            return new int[] {-1, -1};
        }
        return new int[] { findFirst(nums, target), findLast(nums, target) };
    }
}