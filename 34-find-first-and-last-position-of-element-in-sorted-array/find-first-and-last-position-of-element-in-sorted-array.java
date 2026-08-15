class Solution {
    public int[] searchRange(int[] nums, int target) {
      if(nums == null || nums.length == 0){
        return new int[] {-1,-1};
      }
      return new int[]{findFirst(nums,target),findLast(nums,target)};
    }
    
    int findFirst(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (nums[middle] >= target) {
                if (nums[middle] == target) {
                    index = middle;
                }
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return index;
    }
    int findLast(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (nums[middle] <= target) {
                if (nums[middle] == target) {
                    index = middle;
                }
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return index;
    }
}