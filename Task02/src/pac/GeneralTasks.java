package pac;

class GeneralTasks {
    private final static int DIVIDOR = 10;

    //task1
    public static boolean theSame(int a, int b, int c) {
        return a == b && b == c;
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
        double mul = a % DIVIDOR;
        a /= DIVIDOR;
        mul *= a % DIVIDOR;
        a /= DIVIDOR;
        mul *= a % DIVIDOR;
        a /= DIVIDOR;
        mul *= a % DIVIDOR;
        a /= DIVIDOR;
        mul *= a % DIVIDOR;
        a /= DIVIDOR;
        mul *= a % DIVIDOR;
      return Math.sqrt(mul);
    }
    public static double calcArifmetic(int a) {
        double sum = a % DIVIDOR;
        a /= DIVIDOR;
        sum += a % DIVIDOR;
        a /= DIVIDOR;
        sum += a % DIVIDOR;
        a /= DIVIDOR;
        sum += a % DIVIDOR;
        a /= DIVIDOR;
        sum += a % DIVIDOR;
        a /= DIVIDOR;
        sum += a % DIVIDOR;
        sum /= 6;
        return sum;
    }

    //task4
    public static boolean sequence(int number) {
        int first = number % DIVIDOR;
        number /= DIVIDOR;
        int second = number % DIVIDOR;
        number /= DIVIDOR;
        int third = number % DIVIDOR;
        number /= DIVIDOR;
        int fourth = number;
       /* if (first < second) {
            return false;
        } else if (second < third) {
            return false;
        } else if (third < fourth) {
            return false;
        }*/
    return first < second && second < third && third < fourth;
        //return true;
    }


    //task6
    public static int reversNumber(int a) {
        int num = a % DIVIDOR;
        a /= DIVIDOR;
        int res = num;
        num = a % DIVIDOR;
        a /= DIVIDOR;
        res = res * DIVIDOR + num;
        num = a % DIVIDOR;
        a /= DIVIDOR;
        res = res * DIVIDOR + num;
        num = a % DIVIDOR;
        a /= DIVIDOR;
        res = res * DIVIDOR + num;
        num = a % DIVIDOR;
        a /= DIVIDOR;
        res = res * DIVIDOR + num;
        num = a % DIVIDOR;
        a /= DIVIDOR;
        res = res * DIVIDOR + num;
        num = a % DIVIDOR;
        a /= DIVIDOR;
        res = res * DIVIDOR + num;
      return res;
    }

    //task7
    public static void swapWithoutVar(int a, int b) {
        a += b;
        b = a - b;
        a -= b;
    }
}
