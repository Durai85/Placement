package lc1572_matrix_diagonal_sum;

public class BruteForce {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j || i+j==n-1){
                    sum += mat[i][j];
                }
            }
        }

        return sum;
        // return n % 2 != 0 ? sum-=mat[n/2][n/2] : sum;
    }
}
