class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 0; i < row; i++){
            boolean ans = search(matrix, i, 0, col-1, target);
            if (ans) {
                return true;
            }
        }
        return false;
    }
    public boolean search(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart<= cEnd){
            int middle = cStart + (cEnd-cStart)/2;
            if (matrix[row][middle] == target) {
                return true;
            } else if(matrix[row][middle]<target){
                cStart = middle+1;
            } else if(matrix[row][middle]>target){
                cEnd = middle-1;
            }
        }
        return false;
    }
}