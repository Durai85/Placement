package lc0036_valid_sudoku;

import java.util.HashSet;
import java.util.Set;

public class SetApproach {
    public boolean isValidSudoku(char[][] board) {
        boolean rowFlag = true;
        boolean colFlag = true;
        boolean boxFlag = true;
        // row
        for(char[] arr : board){
            Set<Character> row = new HashSet<>();
            for(char ch : arr){
                if(ch != '.'){
                    if(row.contains(ch)){
                        rowFlag = false;
                        break;
                    }    
                    row.add(ch);
                }
            }
        }   

        // col
        for(int i=0; i<board.length; i++){
            Set<Character> col = new HashSet<>();
            for(int j=0; j<board.length; j++){
                if(board[j][i] != '.'){
                    if(col.contains(board[j][i])){
                        colFlag = false;
                        break;
                    } 
                    col.add(board[j][i]);
                }
            }
        }

        // box
        Set<String> box = new HashSet<>();
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[i][j]!='.'){
                    int r = i / 3;
                    int c = j / 3;
                    String key = board[i][j]+" "+r+" "+c;
                    if(box.contains(key)){
                        boxFlag = false;
                        break;
                    }
                    box.add(key);
                }
            }
        }

        return rowFlag && colFlag && boxFlag;
    }
}
