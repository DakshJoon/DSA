/*
    @now we are going to sort an array using recursion
*/
import java.util.*;
public class SortingUsingRecursion {
    public static void main(String[] args) {
        int[] nums = {2,3,1,4,5,8,6};
        sort(nums, 0);
        System.out.println(Arrays.toString(nums));

        int[] anotherArray = {7, 2, 9, 1, 5, 3};
        bubbleSort(anotherArray);
        System.out.println(Arrays.toString(anotherArray));
    }
    public static void sort(int[] nums, int index) { // selection sorting 

        // let the index be the minimum number of index
        int min = index;
        if(index < 0 || index == nums.length-1) {
            return;
        }

        // finding the index of minimum number
        for(int i = index+1; i<nums.length; i++) {
            if(nums[i]<nums[min]) {
                min = i;
            }
        }

        // let the minimum number get sorted first
        int temp = nums[min];
        nums[min] = nums[index];
        nums[index] = temp;

        // sorting the rest array using recursion
        sort(nums, index+1);
    }
    public static void bubbleSort(int[] nums) { // bubble sort
        bubbleSort(nums, nums.length);
    }

    private static void bubbleSort(int[] nums, int length) { // this is helper function for @bubbleSort
        if(length <= 1) {
            return;
        }

        boolean swapped = false;
        for(int i = 0; i < length - 1; i++) {
            if(nums[i] > nums[i + 1]) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
                swapped = true;
            }
        }

        if(swapped) {
            bubbleSort(nums, length - 1);
        }
    }
}