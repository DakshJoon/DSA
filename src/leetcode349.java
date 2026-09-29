import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class leetcode349 {
    public static void main(String[] args){
        int[] arr = {1,1,2,2}; int[] arr1 = {2,2};
        int[] arr2 = {4,9,5}; int[] arr3 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(arr, arr1)));
        System.out.println(Arrays.toString(intersection(arr2, arr3)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        nums1 = removeDuplicateFromArray(nums1);
        nums2 = removeDuplicateFromArray(nums2);
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                ans.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] result = new int[ans.size()];
        for (int k = 0; k < ans.size(); k++) {
            result[k] = ans.get(k);
        }

        return result;
    }

    public static int[] removeDuplicateFromArray(int[] arr){
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        Set<Integer> unique = new HashSet<>();
        for (int value : arr) {
            unique.add(value);
        }

        int[] result = new int[unique.size()];
        int index = 0;
        for (int value : unique) {
            result[index++] = value;
        }
        Arrays.sort(result);
        return result;
    }
}
