package lc0999_available_captures_for_rook;

public class Optimal {
    public int numRookCaptures(char[][] board) {
        // Find the rook
        int len = board.length;
        int row = 0;
        int col = 0;
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                if(board[i][j]=='R'){
                    row = i;
                    col = j;
                    break;
                }
            }
        }
        
        int count = 0;
        // Check left
        for(int left=col-1; left >=0; left--){
            if(board[row][left]=='B') break;
            else if(board[row][left]=='p'){
                count ++;
                break;
            }
        }

        // Check right
        for(int right=col+1; right < len; right++){
            if(board[row][right]=='B') break;
            else if(board[row][right]=='p'){
                count ++;
                break;
            }
        }

        // Check up 
        for(int up=row-1; up >=0; up--){
            if(board[up][col]=='B') break;
            else if(board[up][col]=='p'){
                count ++;
                break;
            }
        }

        // Check down
        for(int down=row+1; down < len; down++){
            if(board[down][col]=='B') break;
            else if(board[down][col]=='p'){
                count ++;
                break;
            }
        }

        return count;
    }
}
