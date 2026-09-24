class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int k = 0;
        int[] ans = new int[2];

        for(int index = 0; index < nums.length;){

            if(index + 1 <= nums.length - 1 && nums[index] == nums[index + 1]){
                index +=2;
            }

            else {
                ans[k] = nums[index];
                k++; index++;
            }
        }
        return ans;
    }
}