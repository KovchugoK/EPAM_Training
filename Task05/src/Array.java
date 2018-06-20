public class Array {
    public static int maxInArray(int[] array) {
        validator(array);
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int minInArray(int[] array) {
        validator(array);
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void reverse(int[] array) {
        validator(array);
        int size = array.length / 2;
        for (int i = 0; i < size; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static int averegeArifmetic(int[] array) {
        validator(array);
        int res = 0;
        for (int i = 0; i < array.length; i++) {

            res += array[i];
        }
        res /= array.length;
        return res;
    }

    public static double averegeGeometric(int[] array) {
        validator(array);
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
        validator(array);
        boolean flag = true;
        int size = array.length - 1;
        for (int i = 0; i < size; i++) {
            if (array[i] > array[i + 1]) {
                flag = false;
                break;
            }

        }
        return flag;
    }

    public static boolean sequenceLow(int[] array) {
        validator(array);
        boolean flag = true;
        int size = array.length - 1;
        for (int i = 0; i < size; i++) {
            if (array[i] < array[i + 1])
            {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static int localMax(int[] array) {
        validator(array);
        int index = -1;
        int size = array.length - 2;
        for (int i = 1; i < size; i++) {
            if (array[i] > array[i + 1] && array[i] > array[i-1])
            {
                index =  i + 1;
                break;
            }

        }
        return index;
    }

    public static int localMin(int[] array) {
        validator(array);
        int index = -1;
        int size = array.length - 2;
        for (int i = 1; i < size; i++) {
            if (array[i] < array[i + 1] && array[i] < array[i-1])
            {
                index = i + 1;
            }
        }
        return index;
    }

    public static void validator(int[] array) {
        if (array.length <= 0 ) {
            throw new IndexOutOfBoundsException ("too small size");
        }
    }

}
