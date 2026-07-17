public class BSinRotatedBInarySearchArray {
    public static void main(String[] args) {
        int[] arr = {5,6,6,6,7,0,1,1,2};
        int target = 1;
        System.out.println(ans(arr, target));
    }
    public static int ans(int[] arr, int target){
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int ans = binarySearch1(arr, target, 0, povitWithDuplicate(arr));
        if (ans != -1) {
            return ans;
        }
        return binarySearch1(arr, target, povitWithDuplicate(arr)+1 , arr.length-1);
    }
    public static int binarySearch1(int[] arr, int target,int start, int end){
        while(start<= end){
            int middle = start + (end - start)/2;
            if(target<arr[middle]){
                end = middle-1;
            } else if(target>arr[middle]){
                start = middle +1;
            } else if(target==arr[middle]){ 
                return middle;
            }
        }
        return -1;
    }
    public static int povitWithDuplicate(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int middle = start + (end - start)/2;
            if (middle<end&&arr[middle]>arr[middle+1]) {
                return middle;
            }
            if (middle>start && arr[middle]<arr[middle-1]) {
                return middle;
            }
            // if elements at middle, start and end are epual then just skip the duplicates
            if (arr[middle] == arr[start] && arr[middle] == arr[end]) {
                // skip the duplicates
                // what if the start and end element are the povit
                // check if start is povit
                if (arr[start]>arr[start + 1]) {
                    return start;
                }
                start++;
                // check if end is povit or not
                if (arr[end]<arr[end-1]) {
                    return end-1;
                }
                end++;
            }
            // left side is sorted so povit should be in rigth
            else if (arr[start]<arr[middle] || (arr[start] == arr[middle]&&arr[middle]>arr[end])) {
                start = middle + 1;
            } else {
                end = middle -1;
            }
        }
        return -1;
    }
}
