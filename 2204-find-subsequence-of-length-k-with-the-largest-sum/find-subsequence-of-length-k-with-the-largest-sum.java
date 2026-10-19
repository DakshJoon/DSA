class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        int g = nums.length;
        int ans[] = Arrays.copyOf(nums, g);
        Arrays.sort(ans);
        int start = ans[g - k];
        int count = 0;
        for(int i = g - k; i < g; i++){
            if(ans[i] == start) count++;
        }
        int result[] = new int[k];
        int index = 0;
        for(int num : nums){
            if(num > start) {
                result[index++] = num;
            }
            else if(num == start && count > 0){
                result[index++] = num;
                count--;
            }
            if(index == k) break;
        }
        return result;
    }
}