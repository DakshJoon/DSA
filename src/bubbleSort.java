import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        // here we are doing bubble sorting today
        int[] arr = {3,1,4,2,5,7,6}; // unsorted array
        int[] arra = {1,2,3,4,5,6,7}; // sorted array
        int[] arraa = {1}; // single element
        int[] neg = {-1,-2,-3,-4,-5}; // negatives elements
        bubbe(arraa);
        bubbe(neg);
        bubbe(arr);
        bubbe(arra);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arraa));
        System.out.println(Arrays.toString(neg));
        System.out.println(Arrays.toString(arra));
        // working with every case
    }
    public static void bubbe(int[] arr){
        boolean swapped;
        // run the step n-1 times
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            // for each step the largest unsorted item moves to its correct position
            for(int j = 1; j < arr.length - i; j++){
                // compare 
                // swap if the item is smaller then the previous item
                if (arr[j]<arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted
            // hence stopped the program 
            if (!swapped) { // !false == true
                break;
            }
        }
    }
}
