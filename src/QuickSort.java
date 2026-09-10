import java.util.Arrays;

public class QuickSort{
    public static void main(String[] args){

        int[] arr = {14,9,10,5,12,7,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static void sort(int[] nums){
        sort(nums, 0, nums.length-1);
    }
    private static void sort(int[] nums, int low , int high){ // this is the helper method 
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;
        int middle = start + (end - start) / 2;
        int pivot = nums[middle];

        while(start <= end){

            while(nums[start]<pivot){
                start++;
            }

            while(nums[end] > pivot){
                end--;
            }

            if(start <= end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++; end--; 
            }
        }
        // now my pivot is at correct index and it time to sorting the 2 halves using recursion
        sort(nums, low, end);
        sort(nums, start, high);

    }
}