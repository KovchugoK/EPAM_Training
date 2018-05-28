package pac;

class GeneralTasks {
    private final static int TEN = 10;

    //task1
    public static boolean theSame(int a, int b, int c) {
        return (a == b) && (b == c);
    }

    //task2
    private  final static int GRAMM = 1000;
    private  final static int MIGRAMM = 1000000;
    private  final static int TONE = 1000;
    public static int convertKgIntoGramm(int weight) {
       return weight * GRAMM;
    }
    public static int convertKgIntoMiGramm(int weight) {
        return weight * MIGRAMM;
    }
    public static int convertKgIntoTon(int weight) {
        return weight/ TONE;
    }


    //task3
    public static double calcsquareOfCircle(int r1){
        return Math.PI * Math.pow(r1, 2);
    }
    public static double calcsquareOfRing(int r1, int r2) {
       return Math.abs(calcsquareOfCircle(r1) - calcsquareOfCircle(r2));
    }

    //task5
    public static double calcaGeometric(int a) {
        double mul = a % TEN;
        a /= TEN;
        mul *= a % TEN;
        a /= TEN;
        mul *= a % TEN;
        a /= TEN;
        mul *= a % TEN;
        a /= TEN;
        mul *= a % TEN;
        a /= TEN;
        mul *= a % TEN;
      return Math.sqrt(mul);
    }
    public static double calcArifmetic(int a) {
        double sum = a % TEN;
        a /= TEN;
        sum += a % TEN;
        a /= TEN;
        sum += a % TEN;
        a /= TEN;
        sum += a % TEN;
        a /= TEN;
        sum += a % TEN;
        a /= TEN;
        sum += a % TEN;
        sum /= 6;
        return sum;
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
    public static int reversNumber(int a) {
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
      return res;
    }

    //task7
    public static void swapWithoutVar(int a, int b) {
        a += b;
        b = a - b;
        a -= b;
    }
}
