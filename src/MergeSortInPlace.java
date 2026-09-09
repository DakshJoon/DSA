import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr, int start , int end){
        if(start >= end) {
            return;
        }

        int middle = start + (end - start) / 2;
        mergeSort(arr, start, middle);
        mergeSort(arr, middle + 1, end);
        
        merge(arr, start, middle, end);
    }
    public static void merge(int[] array, int start, int middle, int end){
        int[] mix = new int[end - start + 1];
        int i = start;
        int j = middle + 1;
        int k = 0;

        while(i <= middle && j <= end) {
            if(array[i] <= array[j]) {
                mix[k] = array[i];
                i++;
            }
            else {
                mix[k] = array[j];
                j++;
            }
            k++;
        }

        while(i <= middle){
            mix[k] = array[i];
            i++; k++;
        }

        while(j <= end){
            mix[k] = array[j];
            j++; k++;
        }
        for(int l = 0; l<mix.length; l++){
            array[start+l] = mix[l];
        }
    }
}
