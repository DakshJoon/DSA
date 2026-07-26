import java.util.Arrays;
public class selectionSorting {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        selectionSort(arr);
        int[] s = {4,5,1,2,3};
        selectionSort(s);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(s));
    }
    public static void selectionSort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            int last = arr.length -i -1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swapArray(arr, maxIndex, last);
        }
    }
    public static void swapArray(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static int getMaxIndex(int[] arr, int start, int end){
        int maxIndex = start;
        for(int i = start+1; i<=end; i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }    
}