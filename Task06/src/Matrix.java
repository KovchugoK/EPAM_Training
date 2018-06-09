public class Matrix {

    public static int maxElem(int a[][]) {
        int max = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (max < a[i][j])
                    max = a[i][j];
            }
        }
        return max;
    }

    public static int minElem(int a[][]) {
        int min = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (min > a[i][j])
                    min = a[i][j];
            }
        }
        return min;
    }

    public static int averegeArifmetic(int[][] a) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                res += a[i][j];
            }
        }
        res /= (a.length * a[0].length);
        return res;
    }

    public static int averegeGeometric(int[][] a) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                res *= a[i][j];
            }
        }
        res = (int) Math.pow(res, 1 / (a.length * a[0].length));
        return res;
    }

    public static int[][] transposeMatrix(int a[][]) {
        if (a[0].length == a.length) {
            int[][] temp = new int[a[0].length][a.length];
            for (int i = 0; i < a.length; i++)
                for (int j = 0; j < a[0].length; j++)
                    temp[j][i] = a[i][j];
            return temp;
        } else {
            for (int i = 0; i < a.length; i++)
                for (int j = i; j < a[0].length; j++) {
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
            return a;
        }
    }
    
    public static String positionOfLocalMinimum(int a[][]) {
        for (int i = 1; i < a.length - 1; i++) {
            for (int j = 1; j < a[i].length - 2; j++) {
                if (a[i][j] < a[i][j + 1] && a[i][j] < a[i + 1][j] && a[i][j] < a[i - 1][j] && a[i][j] < a[i][j - 1]) {
                    return "row: " + Integer.toString(i + 1) + " columns: " + Integer.toString(j + 1);
                }
            }
        }
        return "-1";
    }
}
