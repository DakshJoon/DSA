class Solution {
    public int search(int[] nums, int target) { // this is binary search using recursion
        if(nums.length == 0){
            return -1;
        }
        return helperForBS(nums, target, 0, nums.length-1);
    }
    public int helperForBS(int[] nums, int target, int start, int end) { // this is the helper of @binarSearch method
        if (start > end) {
            return -1;
        }
        int middle = start + (end-start)/2;
        if(nums[middle] == target) {
            return middle;
        }
        else if(nums[middle]>target) {
            return helperForBS(nums, target, start, middle-1);
        }
        return helperForBS(nums, target, middle + 1, end);
    }
}