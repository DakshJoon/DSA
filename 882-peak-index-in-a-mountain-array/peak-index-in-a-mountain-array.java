class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length-1;
        while (start<end) {
            int middle = start +(end-start)/2;
            if (arr[middle]<arr[middle+1]) {
                
                start = middle+1;
            } else if(arr[middle]>arr[middle+1]){
                // you are at dcreasing part of the array
                // this may be the answer but look at the left
                // this is why end != middle-1
                end = middle;
            } else{
                // you are in ascending part of the array
                start = middle + 1; // because we know that middle + 1 element > then mid element
            }
        }
        // in the end start == end and pointing to the largest because of the 2 checks above
        return end;
    }
}