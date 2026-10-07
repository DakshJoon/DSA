class Solution {
    public int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return totalNQueens(board, 0);
    }
    public int totalNQueens(boolean[][] board, int row){
        if(row == board.length){
            return 1;
        }

        int count = 0;
        for(int col = 0; col < board.length; col++){
            if(ifSafe1(board, row, col)){
                board[row][col] = true;
                count += totalNQueens(board, row + 1);
                board[row][col] = false;
            }
        }

        return count;

    }
    public boolean ifSafe1(boolean[][] board, int row, int col){
        for(int i = 0; i < row; i++){
            if(board[i][col]){
                return false;
            }
        }

        for(int i = 1; i <= row; i++){
            int r = row - i;
            int c = col - i;
            if(c >= 0 && board[r][c]){
                return false;
            }
        }

        for(int i = 1; i <= row; i++){
            int r = row - i;
            int c = col + i;
            if(c < board.length && board[r][c]){
                return false;
            }
        }

        return true;
    }
}