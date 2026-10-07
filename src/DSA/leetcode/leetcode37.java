package DSA.leetcode;

public class leetcode37 {
    public static void main(String[] args){
        char[][] board = {
            {'3','.','6','5','.','8','4','.','.'},
            {'5','2','.','.','.','.','.','.','.'},
            {'.','8','7','.','.','.','.','3','1'},
            {'.','.','3','.','1','.','.','8','.'},
            {'9','.','.','8','6','3','.','.','5'},
            {'.','5','.','.','9','.','6','.','.'},
            {'1','3','.','.','.','.','2','5','.'},
            {'.','.','.','.','.','.','.','7','4'},
            {'.','.','5','2','.','6','3','.','.'}
        };

        solveSudoku(board);
        if (isSolved(board)) {
            display(board);
        }
        else {
            System.out.println("cannot solve");
        }
    }

    public static void solveSudoku(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == '.') {
                    for (char num = '1'; num <= '9'; num++) {
                        if (isSafe(board, row, col, num)) {
                            board[row][col] = num;
                            solveSudoku(board);
                            if (isSolved(board)) return;
                            board[row][col] = '.';
                        }
                    }
                    return;
                }
            }
        }
    }
    public static boolean isSolved(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == '.') return false;
            }
        }
        return true;
    }

    
    
    public static boolean isSafe(char[][] board, int row, int col, char number) {
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] == number) {
                return false;
            }
        }

        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == number) {
                return false;
            }
        }

        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - (row % sqrt);
        int colStart = col - (col % sqrt);

        for (int i = rowStart; i < rowStart + sqrt; i++) {
            for (int j = colStart; j < colStart + sqrt; j++) {
                if (board[i][j] == number) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void display(char[][] board){
        for(char[] row : board){
            for(char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
