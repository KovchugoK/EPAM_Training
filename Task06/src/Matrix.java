public class Matrix {

    private static void validator(int[][] matrix){
        int len = matrix[0].length;
        if(matrix == null) {
            throw new NullPointerException();
        }
        for (int i = 0; i < matrix.length ; i++) {
            if(matrix[i].length != len)
                throw new IllegalArgumentException();
        }
    }

    public static int maxElem(int[][] matrix) {
        validator(matrix);
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j])
                    max = matrix[i][j];
            }
        }
        return max;
    }

    public static int minElem(int[][] matrix) {
        validator(matrix);
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (min > matrix[i][j])
                    min = matrix[i][j];
            }
        }
        return min;
    }

    public static int averegeArifmetic(int[][] matrix) {
        validator(matrix);
        int res = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                res += matrix[i][j];
            }
        }
        res /= (matrix.length * matrix[0].length);
        return res;
    }

    public static double averegeGeometric(int[][] matrix) {
        validator(matrix);
        double res = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                res *= matrix[i][j];
            }
        }
        res = Math.pow(res, 1 / (matrix.length * matrix[0].length));
        return res;
    }

    public static void transposesquareMatrix(int[][] matrix) {
        validator(matrix);
        if (matrix[0].length == matrix.length) {
            for (int i = 0; i < matrix.length; i++)
                for (int j = i; j < matrix[0].length; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
        }
    }

    public static int[][] transposeMatrix(int[][] matrix) throws Exception {
        validator(matrix);
        int[][] temp = new int[matrix[0].length][matrix.length];
        if (matrix[0].length != matrix.length) {
            for (int i = 0; i < matrix.length; i++)
                for (int j = 0; j < matrix[0].length; j++)
                    temp[j][i] = matrix[i][j];

        }
        else{
            throw new ArrayIndexOutOfBoundsException("Use another method");
        }
        return temp;
    }

    public static String positionOfLocalMinimum(int[][] matrix) {
        validator(matrix);
        String s = "no local min";
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix[i].length - 2; j++) {
                if (matrix[i][j] < matrix[i][j + 1] && matrix[i][j] < matrix[i + 1][j] && matrix[i][j] < matrix[i - 1][j] && matrix[i][j] < matrix[i][j - 1]) {
                    s = "row: " + Integer.toString(i + 1) + " columns: " + Integer.toString(j + 1);
                    break;
                }
            }
        }
        return s;
    }
}
