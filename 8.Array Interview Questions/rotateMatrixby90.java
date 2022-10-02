import java.util.*;

public class rotateMatrixby90 {
    public static void main(String[] args) {
        // Same Question in LeetCode - Rotate Image
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // transpose of the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // swapping the colums to get the desired answer
        int colfirst = 0;
        int collast = matrix[0].length - 1;
        while (colfirst < collast) {
            for (int i = 0; i < matrix.length; i++) {
                int temp = matrix[i][colfirst];
                matrix[i][colfirst] = matrix[i][collast];
                matrix[i][collast] = temp;
            }
            colfirst++;
            collast--;
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
