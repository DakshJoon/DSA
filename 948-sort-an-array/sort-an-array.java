class Solution {
    public int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return nums;
    }
    public void sort(int[] nums, int low , int high){ // this is the helper method 
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;
        int middle = start + (end - start) / 2;
        int pivot = nums[middle];

        while(start <= end){

            while(nums[start]<pivot){
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
        
        sort(nums, low, end);
        sort(nums, start, high);

    }
}