package lc1582_special_positions_in_a_binary_matrix;

public class Optimal {
    public int numSpecial(int[][] mat) {
        int row[] = new int[mat.length];
        int col[] = new int[mat[0].length];
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]==1){
                    row[i]++;
                    col[j]++;
                }
            }
        }
        int result = 0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]==1 && row[i]==1 && col[j]==1){
                    result++;
                }
            }
        }
        return result;
    }
}
