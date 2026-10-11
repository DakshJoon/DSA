class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int write = 1;
        int count = 1;

        for (int read = 1; read < nums.length; read++) {
            if (nums[read] == nums[write - 1]) {
                if (count < 2) {
                    nums[write] = nums[read];
                    write++;
                    count++;
                }
            } else {
                nums[write] = nums[read];
                write++;
                count = 1;
            }
        }

        return write;
    }
}