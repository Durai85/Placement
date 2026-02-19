package lc1572_matrix_diagonal_sum;

public class Optimal {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i=0; i<n; i++){
            sum += mat[i][i];
        }
        for(int i=0; i<n; i++){
            sum += mat[i][n-1-i];
        }

        return n%2 != 0 ? sum-mat[n/2][n/2] : sum;
    }
}
