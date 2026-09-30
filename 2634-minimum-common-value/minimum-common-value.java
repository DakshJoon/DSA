class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int min = 0;
        int min1 = 0;
        while (min < nums1.length && min1 < nums2.length) {
            if (nums1[min] == nums2[min1]) {
                return nums1[min];
            }

            if(nums1[min] < nums2[min1]){
                min++;
            } else {
                min1++;
            }
        }
        return -1;
    }
}