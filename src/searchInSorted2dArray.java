import java.util.Arrays;

public class searchInSorted2dArray {
    public static void main(String[] args) {
        // today we are going to see if we can search in 2d sorted array or not using binary search
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr, 6)));
        
    }
    // search in the row provided between in the col provide
    public static int[] Array2d(int[][] arr, int row, int cStart, int cEnd, int target){
        while (cStart<=cEnd) {
            int middle = cStart + (cEnd-cStart)/2;
            if (arr[row][middle] == target) {
                return new int[] {row,middle};
            }
            else if (arr[row][middle]<target) {
                cStart = middle+1;
            } else {
                cEnd = middle-1;
            }
        }
        return new int[] {-1,-1};
    }
    public static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int r = 0; r < rows; r++) {
            int[] res = Array2d(matrix, r, 0, cols-1, target);
            if (res[0] != -1) return res;
        }
        return new int[] {-1,-1};
    }
}