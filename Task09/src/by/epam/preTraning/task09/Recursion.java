package by.epam.preTraning.task09;

public class Recursion {
    public static int sumOfNumbers(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfNumbers(n / 10);
    }

    public static double pow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * pow(x, n - 1);
    }

    public static boolean equalsOfNumberAndSum(int n, int s) {
        if (n == 0) {
            if (s == 0) {
                return true;
            }
            return false;
        }
        return equalsOfNumberAndSum(n / 10, s - (n % 10));
    }

    public static int fibonachi(int n) {
        if(n<2){
            if(n<0){
                return -1;
            }
            return n;
        }
        return fibonachi(n-1)+fibonachi(n-2);
    }
}
