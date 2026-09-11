import java.util.Arrays;

public class MergeSortUsingRecursion {
    public static void main(String[] args) {
        int[] ab = {3,2,4,1,5,7,6};
        System.out.println(Arrays.toString(mergeSort(ab))); 
    }
    public static int[] mergeSort(int[] arr){
        if(arr.length == 1) {
            return arr;
        }

        int middle = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, middle));
        int[] right = mergeSort(Arrays.copyOfRange(arr, middle, arr.length)); 
        
        return merge(left, right);
    }
    public static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0; 
        int k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else if (first[i]>second[j]){
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while(i < first.length){
            mix[k] = first[i];
            i++; k++;
        }

        while(j < second.length){
            mix[k] = second[j];
            j++; k++;
        }
        return mix;
    }
}
