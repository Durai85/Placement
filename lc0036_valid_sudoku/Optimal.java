package lc0036_valid_sudoku;

public class Optimal {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] box = new boolean[9][9];

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j]=='.')continue;
                int num = board[i][j] - '1';
                int b = 3 * (i/3) + (j/3);
                if(row[i][num] || col[j][num] || box[b][num]) return false;
                row[i][num] = col[j][num] = box[b][num] = true;
            }
        }
        return true;
    }
}
