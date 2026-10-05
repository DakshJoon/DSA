class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        if (!bS(nums, original, 0, nums.length - 1)) {
            return original;
        }
        return findFinalValue(nums, original * 2);
    }

    public boolean bS(int[] nums, int target, int start, int end){
        while(start <= end){
            int middle = start + (end - start) / 2;
            if(nums[middle] == target){
                return true;
            }

            else if (nums[middle] < target){
                start = middle + 1;
            }
            else {
                end = middle - 1;
            }
        }
        return false;
    }
}