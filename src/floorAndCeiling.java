public class floorAndCeiling {
    public static void main(String[] args) {
        // question 1 ceilling of a number
        int[] arr = {1,2,3,4,6,8,10,13};
        int target = 9;
        System.out.println(ceiling(arr, target));

        // find the floor of the number
        // using the same above data
        System.out.println(floor(arr, target));
        int[] arr1 = {3,5,6,7,9,10,13,15};
        int target1 = 1;
        int target2 = 20;
        System.out.println(ceiling(arr1, target2)); // this is the demo if the number is greater then the arr[end]
        System.out.println(floor(arr1,target1)); // this is the demo if the number is shorter then arr[start]
    }
    public static int ceiling(int[] arr, int target){
        int start = 0; 
        int end = arr.length -1;
        // what if the target is the greatest number -> then we will return the -1
        if (target>arr[end]) {
            return -1;
        }
        while(start<=end){
            int middle = start + (end-start)/2;
            if(target == arr[middle]){
                return middle;
            } else if(target < arr[middle]){
                end = middle - 1;
            } else { // target > arr[middle]
                start = middle + 1;
            }
        }
        // start is the smallest index greater than target (ceiling)
        return start;
    }
    public static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        // what if target is the smallest number -> then we will return -1
        if (target<arr[start]) {
            return -1;
        }
        while(start<=end){
            int middle = start + (end-start)/2;
            if(target == arr[middle]){
                return middle;
            } else if(target < arr[middle]){
                end = middle - 1;
            } else { // target > arr[middle]
                start = middle + 1;
            }
        }
        // end is the greatest number which is smaller then target
        return end;
    }
}
