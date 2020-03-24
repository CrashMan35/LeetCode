package 剑指offer;

public class offer04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        int col = 0;
        int row = matrix[0].length-1;
        while (col < matrix.length && row >= 0) {
            if (matrix[col][row] == target) {
                return true;
            } else if (matrix[col][row] > target) {
                row--;
            } else {
                col++;
            }
        }
        return false;
    }
}
