class Solution {
    public int[] relativeSortArray(int[] nums, int[] nums1) {
        int[] ans = new int[nums.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(j <= nums1.length-1){
            if(nums[i] == nums1[j]){
                ans[k] = nums[i];
                nums[i] = -1;
                i++; k++;

            }
            else if (nums[i] != nums1[j]){
                while(i < nums.length){
                    if(nums[i] == nums1[j]){
                        ans[k] = nums[i];
                        nums[i] = -1;
                        k++;
                    }
                    i++;
                    if(i == nums.length){
                        break;
                    }
                }
                j++; i = 0;
            }
        }
        int leftOver = k;
        for(int g = 0; g < nums.length; g++) {
            if(nums[g] != -1){
                ans[k] = nums[g];
                k++;
            }
        }
        sort(ans, leftOver, ans.length-1);
        return ans;
    }
    public void sort(int[] nums, int from, int to){
        int min = from;
        for(int i = from; i < to ; i++){
            min = i;
            for(int j = i + 1; j <= to; j++){
                if(nums[j] < nums[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }
    }
}
