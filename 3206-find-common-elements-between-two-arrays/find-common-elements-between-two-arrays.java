class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        java.util.HashSet<Integer> set1 = new java.util.HashSet<>();
        java.util.HashSet<Integer> set2 = new java.util.HashSet<>();

        for (int value : nums1) {
            set1.add(value);
        }
        for (int value : nums2) {
            set2.add(value);
        }

        int inNums2 = 0;
        for (int value : nums1) {
            if (set2.contains(value)) {
                inNums2++;
            }
        }

        int inNums1 = 0;
        for (int value : nums2) {
            if (set1.contains(value)) {
                inNums1++;
            }
        }

        return new int[]{inNums2, inNums1};
    }
}