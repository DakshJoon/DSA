class Solution {
    public int findMin(int[] nums) {
        int povit = findPovit(nums);
        return nums[povit+1];
    }
    public int findPovit(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int middle = start + (end - start) / 2;
            if (middle < end && nums[middle] > nums[middle + 1]) {
                return middle;
            }

            else if (middle > start && nums[middle] < nums[middle - 1]) {
                return middle-1;
            }

            if (nums[middle] <= nums[start]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
    return -1;
   }
}