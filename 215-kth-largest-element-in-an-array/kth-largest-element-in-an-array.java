class Solution {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || k < 1 || k > nums.length) {
            throw new IllegalArgumentException("nums must be non-null and k must be in [1, nums.length]");
        }
        quickSort(nums);
        return nums[nums.length - k];
    }
    public static void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }
    private static void quickSort(int[] nums, int low, int high) {
        if(low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int middle = start + (end - start) / 2;
        int povit = nums[middle];

        while(start <= end) {

            while(nums[start] < povit) {
                start++;
            }

            while(nums[end] > povit) {
                end--;
            }

            if(start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        quickSort(nums, low, end);
        quickSort(nums, start, high);
    }
}