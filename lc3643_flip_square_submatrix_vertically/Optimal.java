package lc3643_flip_square_submatrix_vertically;

public class Optimal {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for(int i=y; i < y+k; i++){
            int left = x;
            int right = x+k-1;
            while(left < right){
                int temp = grid[left][i];
                grid[left++][i] = grid[right][i];
                grid[right--][i] = temp;
            }
        }   
        return grid;
    }
}
