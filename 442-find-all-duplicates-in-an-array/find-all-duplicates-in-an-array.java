class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         int i = 0;
        List<Integer> ans = new ArrayList<>();
        while(i<nums.length){
            int correctIndex = nums[i] - 1;
            if(correctIndex >= 0 && correctIndex < nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            } else{
                i++;
            }
        }
        for(int j = 0; j<nums.length; j++){
            if(nums[j] != j+1){
                ans.add(nums[j]);
            }
        }
        return ans;
    }
    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}