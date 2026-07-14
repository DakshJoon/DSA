public class binarySearch {
    public static void main(String[] args) {
        // today we are going to study about binary search
        // lets use the binarySearch1 
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45};
        int target = 18;
        int ans = binarySearch1(arr, target);
        System.out.println(ans);
    }
    // return index 
    // return -1 if it doesn't exist in the array
    public static int binarySearch1(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while(start<= end){
            // find the middle element
            // int middle = (start+end)/2; here it might be possible the (start+end) exceed the range of integer in java
            int middle = start + (end - start)/2;
            if(target<arr[middle]){ // target is on the left hand side of the array so the end will change
                end = middle-1;
            } else if(target>arr[middle]){ // target is on the right hand side of the array
                start = middle +1;
            } else if(target==arr[middle]){ 
                // found the answer
                return middle;
            }
        }
        // if target is not in the array
        return -1;
    }
}
