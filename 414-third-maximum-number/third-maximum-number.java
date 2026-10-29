class Solution {
    public int thirdMax(int[] nums) {
        sort(nums, 0, nums.length - 1);
        nums = removeDuplicate(nums);
        if(nums.length < 3) {
            return nums[nums.length - 1];
        }
        return nums[nums.length - 3];

    }
    private static void sort(int[] nums, int low, int high) {
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

        sort(nums, start, high);
        sort(nums, low, end);
    }

    private static int[] removeDuplicate(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        java.util.LinkedHashSet<Integer> unique = new java.util.LinkedHashSet<>();
        for (int value : arr) {
            unique.add(value);
        }

        int[] result = new int[unique.size()];
        int index = 0;
        for (int value : unique) {
            result[index++] = value;
        }
        return result;
    }
}