public class numberOfRotationInARotatedArray {
    public static void main(String[] args) {
        // here we need to find the rotation of a rotated array
        int[] arr = {1,2,3,4,5,6};
        System.out.println(ans(arr)); // this will give us the number of rotation
    }
    public static int ans(int[] arr){
        if (numberOfRotation(arr) == -1) {
            return 0;
        }
        return numberOfRotation(arr);
    }
    public static int numberOfRotation(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int middle = start + (end - start)/2;
            if (middle<end&&arr[middle]>arr[middle+1]) {
                return middle+1;
            }
            if (middle>start && arr[middle]<arr[middle-1]) {
                return middle;
            }
            if(arr[middle]<=arr[start]){
                end = middle -1;
            } else{
                start = middle +1;
            }
        }
        return -1;
    }
       
    
}
