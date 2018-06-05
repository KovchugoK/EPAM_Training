public class Array {
    public static int maxInArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int minInArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static int averegeArifmetic(int[] array) {
        int res = 0;
        for (int i = 0; i < array.length; i++) {

            res += array[i];
        }
        res /= array.length;
        return res;
    }

    public static double averegeGeometric(int[] array) {
        double res = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 0)
                return -1;
            res *= array[i];
        }
        res = Math.pow(res, 1 / 6.);
        return res;
    }

    public static boolean sequenceHigh(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }

    public static boolean sequenceLow(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1])
                return false;
        }
        return true;
    }

    public static int localMax(int[] array) {
        for (int i = 1; i < array.length - 2; i++) {
            if (array[i] > array[i + 1] && array[i] > array[i-1])
                return i + 1;
        }
        return -1;
    }

    public static int localMin(int[] array) {
        for (int i = 1; i < array.length - 2; i++) {
            if (array[i] < array[i + 1] && array[i] < array[i-1])
                return i + 1;
        }
        return -1;
    }


}
