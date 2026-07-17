class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for(int i = 0; i<nums.length; i++){
            start = Math.max(start, nums[i]); // in the end of the loop it will contain the max item from the array
            end = end + nums[i];
        }
        // apply binary search 
        while (start<end) {
            // try for the middle as the potientail answer
            int middle = start + (end-start)/2;
            // calculate how many pieces you can divide this in with the max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > middle){
                    // if you cannot add this in array, make a new subArray
                    // say you add this num in new subArray, then sum = num
                    sum = num;
                    pieces++;
                } else{
                    sum += num;
                }
            }
            if (pieces <= k) {
                end =  middle;
            } else{
                start =  middle + 1;
            }
        }
        return end;
    }
}