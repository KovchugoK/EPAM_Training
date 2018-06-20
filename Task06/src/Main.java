import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int[][] matrix = new int[5][5];
        int[][] matrix1 = new int[5][6];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
        System.out.println(Matrix.maxElem(matrix));
        System.out.println(Matrix.minElem(matrix));
        for (int i = 0; i < matrix.length ; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();
        Matrix.transposesquareMatrix(matrix);
        for (int i = 0; i < matrix.length ; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println(Matrix.positionOfLocalMinimum(matrix));
    }
}
