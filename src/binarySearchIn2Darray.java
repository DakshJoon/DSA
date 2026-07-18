import java.util.Arrays;

public class binarySearchIn2Darray {
    public static void main(String[] args) {
        // today we are going to see how can we apply binary search in 2d Array
        int[][] arr = { // it is a 2d array in a row and coloum wise sorted
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        int target = 37;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] search(int[][] matrix, int target){
        int row = 0;
        int coloum = matrix.length-1;
        while (row<matrix.length && coloum>=0) {
            if (matrix[row][coloum] == target) {
                // found answer
                return new int[]{row,coloum};
            }
            if (matrix[row][coloum]< target) {
                row++;
            } else{
                coloum--;
            }
        }
        return new int[] {-1,-1};
    }
}
