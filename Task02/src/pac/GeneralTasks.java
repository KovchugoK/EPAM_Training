package pac;

class GeneralTasks {
    private final static int TEN = 10;

    //task1
    public static void theSame(int a, int b, int c) {
        System.out.println("a = b = c = " + ((a == b) && (b == c)));
    }

    //task2
    public static void weihtOfDinasaur(int weight) {
        int tmp;
        tmp = weight * 1000;
        System.out.println("In gramm: " + tmp);
        tmp *= 1000;
        System.out.println("In milligram: " + tmp);
        tmp = weight / 1000;
        System.out.println("In tonn: " + tmp);
    }

    //task3
    public static void squareOfRing(int r1, int r2) {
        double square = Math.abs(Math.PI * Math.pow(r1, 2) - Math.PI * Math.pow(r2, 2));
        System.out.println("Square of ring: " + square);
    }

    //task5
    public static void arifmeticAndGeometric(int a) {
        double sum = a % TEN;
        double mul = a % TEN;
        a /= TEN;
        sum += a % TEN;
        mul *= a % TEN;
        a /= TEN;
        sum += a % TEN;
        mul *= a % TEN;
        a /= TEN;
        sum += a % TEN;
        mul *= a % TEN;
        a /= TEN;
        sum += a % TEN;
        mul *= a % TEN;
        a /= TEN;
        sum += a % TEN;
        mul *= a % TEN;
        sum /= 6;
        mul = Math.sqrt(mul);
        System.out.println("Arifmetic average: " + sum);
        System.out.println("Geometric average: " + mul);
    }

    //task4
    public static boolean sequence(int number) {
        int first = number % TEN;
        number /= TEN;
        int second = number % TEN;
        number /= TEN;
        int third = number % TEN;
        number /= TEN;
        int fourth = number;
        if (first < second) {
            return false;
        } else if (second < third) {
            return false;
        } else if (third < fourth) {
            return false;
        }

        return true;
    }


    //task6
    public static void reversNumber(int a) {
        int num = a % TEN;
        a /= TEN;
        int res = num;
        num = a % TEN;
        a /= TEN;
        res = res * TEN + num;
        num = a % TEN;
        a /= TEN;
        res = res * TEN + num;
        num = a % TEN;
        a /= TEN;
        res = res * TEN + num;
        num = a % TEN;
        a /= TEN;
        res = res * TEN + num;
        num = a % TEN;
        a /= TEN;
        res = res * TEN + num;
        num = a % TEN;
        a /= TEN;
        res = res * TEN + num;
        System.out.println(res);
    }

    //task7
    public static void swapWithoutVar(int a, int b) {
        System.out.println("Before: " + "a = " + a + " " + "b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("After: " + "a = " + a + ' ' + "b = " + b);
    }
}
