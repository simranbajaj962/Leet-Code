class Solution {
    public List<List<String>> solveNQueens(int n) {

        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<List<String>>();
        solve(0, board, ans, n);
        return ans;
    }

    // checking whether the position is safe for the queen to be placed or not
    private boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        int temprow = row;
        int tempcol = col;

        // checking towards left-diagonally-up
        while (temprow >= 0 && tempcol >= 0) {
            if (board[temprow][tempcol] == 'Q')
                return false;
            temprow--;
            tempcol--;
        }

        temprow = row;
        tempcol = col;

        // checking towards left-horizontally
        while (tempcol >= 0) {
            if (board[temprow][tempcol] == 'Q')
                return false;
            tempcol--;
        }

        temprow = row;
        tempcol = col;

        // checking towards left-diagonally-down
        while (temprow < n && tempcol >= 0) {
            if (board[temprow][tempcol] == 'Q')
                return false;
            temprow++;
            tempcol--;
        }
        return true;
    }

    private void solve(int col, char[][] board, List<List<String>> ans, int n) {
        if (col == n) {
            ans.add(construct(board));
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {
                // placing the queen at its desired place
                board[row][col] = 'Q';
                solve(col + 1, board, ans, n);
                // backtracking
                board[row][col] = '.';
            }
        }
    }

    private List<String> construct(char[][] board) {
        List<String> ans = new LinkedList<String>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            ans.add(s);
        }
        return ans;
    }
}
