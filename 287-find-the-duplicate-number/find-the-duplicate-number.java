class Solution {
    public int findDuplicate(int[] nums) {
       int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i];
            if(correctIndex<nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            } else{
                i++;
            }
        }
        for(int j = 0; j<nums.length; j++ ){
            if(nums[j] != j+1){
                return nums[j];
            }
        }
        return -1;
    }
    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
