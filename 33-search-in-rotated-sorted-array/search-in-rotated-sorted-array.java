class Solution {
    public static int binarySearch(int[] nums, int target, int start, int end){
        while(start<= end){
            // find the middle element
            // int middle = (start+end)/2; here it might be possible the (start+end) exceed the range of integer in java
            int middle = start + (end - start)/2;
            if(target<nums[middle]){ // target is on the left hand side of the array so the end will change
                end = middle-1;
            } else if(target>nums[middle]){ // target is on the right hand side of the array
                start = middle +1;
            } else if(target==nums[middle]){ 
                // found the answer
                return middle;
            }
        }
        // if target is not in the array
        return -1;
        
    }
    public static int povit(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int middle = start + (end - start)/2;
            if (middle<end&&arr[middle]>arr[middle+1]) {
                return middle;
            }
            if (middle>start && arr[middle]<arr[middle-1]) {
                return middle-1;
            }
            if(arr[middle]<=arr[start]){
                end = middle -1;
            } else{
                start = middle +1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int povit = povit(nums);
        if (povit == -1) {
            return binarySearch(nums, target, 0, nums.length-1);
        }
        else if(nums[povit] == target){
            return povit;
        }
        else if (target>=nums[0]) {
            return binarySearch(nums, target, 0, povit-1);
        } 
        return binarySearch(nums, target, povit + 1, nums.length-1);
    }
}