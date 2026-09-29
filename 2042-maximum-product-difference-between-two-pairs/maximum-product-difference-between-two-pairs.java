class Solution {
    public int maxProductDifference(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        int base = nums[0] * nums[1];
        int ending = nums[nums.length - 1] * nums[nums.length - 2];
        return ending - base;

    }

    public void quickSort(int[] nums, int low, int high){
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;
        int middle = start + (end - start) / 2;
        int povit = nums[middle];

        while(start <= end){

            while(nums[start] < povit){
                start++;
            }

            while(nums[end] > povit){
                end--;
            }

            if(start <= end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++; end--;
            }
        }
        quickSort(nums, low, end);
        quickSort(nums, start, high);
    }
}