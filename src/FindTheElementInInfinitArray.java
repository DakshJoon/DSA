public class FindTheElementInInfinitArray {
    public static void main(String[] args) {
        // now we are going to see how can we find element using binary search
        int[] arr = {1,2,3,4,6,7,9,10,15,17,19,20,25,37};
        int target = 25;
        System.out.println(mainAns(arr, target)); // output must be 12
    }
    public static int mainAns(int[] arr, int target){
        // first find the range
        // first start with the box of 2
        int start = 0;
        int end = 1;
        // condition for the target to lie in the range
        while (target>arr[end]) {
            int temp = end +1; // this is my new start 
            // double the box value 
            // end = previous end + size of array*2
            end = end +(end -start+1)*2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }
    public static int binarySearch(int[] arr, int target, int start, int end){
        while (start<=end) {
            int middle = start + (end-start)/2;
             if(target<arr[middle]){
                end = middle - 1;
            }else if(target>arr[middle]){
                start = middle + 1;
            }else{
                // ans found
                return middle;
            }
        }
        return -1;
    }
}
