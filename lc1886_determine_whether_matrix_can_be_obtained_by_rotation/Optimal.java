package lc1886_determine_whether_matrix_can_be_obtained_by_rotation;

public class Optimal {
    int n;
    public boolean findRotation(int[][] mat, int[][] target) {
        n = mat.length;
        for(int i=0; i<4; i++){
            if(equalMatrix(mat,target)) return true;
            rotateMatrix(mat);
        }
        return false;
    }

    private void rotateMatrix(int[][] matrix){
        // Transpose
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Swap row elements
        for(int[] row : matrix){
            int left = 0;
            int right = n-1;
            while(left < right){
                int temp = row[left];
                row[left++] = row[right];
                row[right--] = temp;
            }
        }
    }

    private boolean equalMatrix(int[][] matrix, int[][] target){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] != target[i][j]) return false;
            }
        }
        return true;
    }
}
