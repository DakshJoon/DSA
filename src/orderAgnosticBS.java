public class orderAgnosticBS {
    public static void main(String[] args) {
        // in this code we are going to see how can we if the sorted array is sorted in ascending or descending
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45};
        int target = 18;
        System.out.println(orderAgnosticBS1(arr, target)); // this is a descending order sorted array
        int[] arr1 = {45,22,18,16,15,4,3,2,0,-4,-12,-18};
        int target1 = 18;
        System.out.println(orderAgnosticBS1(arr1, target1));
    }
    public static int orderAgnosticBS1(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        boolean isAscending = arr[start] < arr[end];

        // find if the array is ascending or descending
         while(start<= end){
            // find the middle element
            // int middle = (start+end)/2; here it might be possible the (start+end) exceed the range of integer in java
            int middle = start + (end - start)/2;
            if(target==arr[middle]){ 
                // found the answer
                return middle;
            } 
            if (isAscending) {
                if(target<arr[middle]){ // target is on the left hand side of the array so the end will change
                end = middle-1;
            }   else { // target is on the right hand side of the array
                    start = middle +1;
                }
            }else {
                if (target>arr[middle]) {
                    end = middle-1;
                } else {
                    start = middle + 1;
                }
            }
        }
        // if target is not in the array
        return -1;
    }
}