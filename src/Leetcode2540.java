public class Leetcode2540 {
    public static void main(String[] args){
        int[] ar = {1,2,3}; int[] ar1 = {2,4};
        int[] arr = {1,2,3,6}; int[] arr1 = {2,3,4,5};
        int[] arrr = {2,4}; int[] arrr1 = {1,2};
        int[] arrrr = {2}; int[] arrrr1 = {1,2};
        System.out.println(getCommon(ar, ar1));
        System.out.println(getCommon(arr, arr1));
        System.out.println(getCommon(arrr, arrr1));
        System.out.println(getCommon(arrr, arrr1));
        System.out.println(getCommon(arrrr, arrrr1));

    }

    public static int getCommon(int[] nums1, int[] nums2) {
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
