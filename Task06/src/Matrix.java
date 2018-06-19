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

    public static int averegeGeometric(int[][] matrix) {
        validator(matrix);
        int res = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                res *= matrix[i][j];
            }
        }
        res = (int) Math.pow(res, 1 / (matrix.length * matrix[0].length));
        return res;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        validator(matrix);
        if (matrix[0].length == matrix.length) {
            int[][] temp = new int[matrix[0].length][matrix.length];
            for (int i = 0; i < matrix.length; i++)
                for (int j = 0; j < matrix[0].length; j++)
                    temp[j][i] = matrix[i][j];
            return temp;
        } else {
            for (int i = 0; i < matrix.length; i++)
                for (int j = i; j < matrix[0].length; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            return matrix;
        }
    }
    
    public static String positionOfLocalMinimum(int[][] matrix) {
        validator(matrix);
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix[i].length - 2; j++) {
                if (matrix[i][j] < matrix[i][j + 1] && matrix[i][j] < matrix[i + 1][j] && matrix[i][j] < matrix[i - 1][j] && matrix[i][j] < matrix[i][j - 1]) {
                    return "row: " + Integer.toString(i + 1) + " columns: " + Integer.toString(j + 1);
                }
            }
        }
        return "-1";
    }
}
