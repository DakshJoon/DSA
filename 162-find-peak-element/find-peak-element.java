class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<end){ // if it get equal the loop will break it self
            int middle = start + (end - start)/2;
            if(nums[middle]>nums[middle+1]){
                // we are in the descending part
                end = middle;
            } else if(nums[middle]<nums[middle+1]){
                start = middle + 1; 
            } else {
                // we are in ascending part
                start = middle+1;
            }
        }
        // now we can say the loop will break when the start == end
        // so for after breaking the loop it must return the end or start
        return start;
    }
}