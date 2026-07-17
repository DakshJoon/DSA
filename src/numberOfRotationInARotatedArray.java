public class numberOfRotationInARotatedArray {
    public static void main(String[] args) {
        // here we need to find the rotation of a rotated array
        int[] arr = {15,18,2,3,6,12};
        System.out.println(numberOfRotation(arr)); // this will give us the number of rotation
    }
    public static int numberOfRotation(int[] arr){
        return povit(arr)+1;
    }
    public static int povit(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int middle = start + (end - start)/2;
            if (middle<end&&arr[middle]>arr[middle+1]) {
                return middle;
            }
            if (middle>start && arr[middle]<arr[middle-1]) {
                return middle-1;
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
