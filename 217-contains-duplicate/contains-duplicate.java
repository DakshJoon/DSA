class Solution {
    public boolean containsDuplicate(int[] nums) {
        sort(nums, 0, nums.length-1);
        for(int i = 1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
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