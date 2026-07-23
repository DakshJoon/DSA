public class countNegative {
    public static void main(String[] args) {
        // in this we are going to solve leetcode 1351
        int[][] grid = {
            {4,3,2,-1},
            {3,2,1,-1},
            {1,1,-1,-2},
            {-1,-1,-2,-3}
        };
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int totalCount = 0;
        for(int i = 0; i<grid.length; i++){
            totalCount = totalCount + countInRow(grid[i]);
        }
        return totalCount;
    }
    public static int countInRow(int[] grid){
        int cStart = 0;
        int cEnd = grid.length - 1;
        int firstNegInt = grid.length;
        while (cStart <= cEnd) {
            int middle = cStart + (cEnd-cStart)/2;
            if (grid[middle]<0) {
                firstNegInt = middle;
                cEnd = middle -1;
            } else{
                cStart = middle + 1;
            }
        }
        return grid.length - firstNegInt;
    }
}