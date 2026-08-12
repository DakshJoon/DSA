class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        int i = 0;
        
        // Calculate sum of longest sequential prefix
        for (i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i] + 1) {
                sum += nums[i + 1];
            } else {
                break;
            }
        }
        
        // Convert array to set for O(1) lookup
        java.util.Set<Integer> numSet = new java.util.HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        
        // Find the smallest missing integer starting from sum
        int result = sum;
        while (numSet.contains(result)) {
            result++;
        }
        
        return result;
    }
}