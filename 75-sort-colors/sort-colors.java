class Solution {
    public void sortColors(int[] nums) {
        sortColors(nums, 0, nums.length-1);
    }
    private void sortColors(int[] nums, int low, int high){
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;
        int middle = start + (end - start) / 2;
        int pivot = nums[middle];

        while(start <= end){

            while(nums[start] < pivot){
                start++;
            }

            while(nums[end] > pivot){
                end--;
            }

            if(start <= end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++; end--;
            }
        }
        sortColors(nums, low , end);
        sortColors(nums, start, high);
    }
}