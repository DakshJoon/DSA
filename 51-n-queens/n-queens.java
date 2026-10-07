class Solution {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> list = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        return solveNQueens(list, board, 0, new ArrayList<>());
    }

    private static List<List<String>> solveNQueens(List<List<String>> list, boolean[][] board, int row, List<String> st) {
        if (row == board.length) {
            list.add(new ArrayList<>(st));
            return list;
        }

        for (int col = 0; col < board.length; col++) {
            if (issafe(board, row, col)) {
                board[row][col] = true;

                StringBuilder sb = new StringBuilder();
                for (int c = 0; c < board.length; c++) {
                    sb.append(c == col ? 'Q' : '.');
                }
                st.add(sb.toString());

                solveNQueens(list, board, row + 1, st);

                st.remove(st.size() - 1);
                board[row][col] = false;
            }
        }
        return list;
    }

    public static boolean issafe(boolean[][] board, int row, int col) {
        // check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // diagonal left-up
        int r = row - 1;
        int c = col - 1;
        while (r >= 0 && c >= 0) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c--;
        }

        // diagonal right-up
        r = row - 1;
        c = col + 1;
        while (r >= 0 && c < board.length) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c++;
        }

        return true;
    }
}