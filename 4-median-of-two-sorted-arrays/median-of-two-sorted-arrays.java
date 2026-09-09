class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = merge(nums1, nums2);
        double ans1 = 0;
        if(ans.length % 2 == 0){
            ans1 = (ans[ans.length / 2] + ans[(ans.length/2) - 1]) / 2.0;
        }
        else if (ans.length % 2 != 0) {
            ans1 = ans[(ans.length / 2)];
        }

        return ans1;
    }
    public static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while(i < first.length && j < second.length){
            if(first[i] <= second[j]){
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            mix[k] = first[i];
            k++; i++;
        }
        while(j < second.length){
            mix[k] = second[j];
            k++; j++;
        }
        return mix;
    }
}