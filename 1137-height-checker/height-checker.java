class Solution {
    public int heightChecker(int[] heights) {
        int[] ans = Arrays.copyOf(heights, heights.length);
        bubbleSort(ans);
        int count = 0;
        for(int i = 0; i< ans.length; i++){
            if(ans[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
    public void bubbleSort(int[] nums){
        for(int i = 0; i<nums.length-1; i++){
            for(int j = 0; j<nums.length-1; j++){
                if(nums[j]> nums[j+1]){
                    swap(nums, j , j+1);
                }
            }
        }
    }
    public void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}