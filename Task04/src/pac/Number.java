package pac;

public class Number {
    public static boolean isPolindrom(int number) {
        return number == Number.reverse(number);
    }

    public static int reverse(int number) {
        int res = 0;
        while (number > 0) {
            res += number % 10;
            number /= 10;
            res *= 10;
        }
        res /= 10;
        return res;
    }

    public static int maxDigit(int number) {
        int max = number % 10;
        while (number > 0) {
            if (max < number % 10) {
                max = number % 10;
            }
            number /= 10;
        }
        return max;
    }

    public static boolean isSimple(int number) {
        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static String simpleDividers(int number) {
        String res = "";
        if (isSimple(number)) {
            return 1 + " " + number;
        } else {
            for (int i = 1; i <= (int) Math.sqrt(number); i++) {
                if (isSimple(i) && number % i == 0) {
                    res += i + " ";
                }
            }
        }
        return res;
    }

    public static int countOfDifferentNumber(int number) {
        boolean count0 = false;
        boolean count1 = false;
        boolean count2 = false;
        boolean count3 = false;
        boolean count4 = false;
        boolean count5 = false;
        boolean count6 = false;
        boolean count7 = false;
        boolean count8 = false;
        boolean count9 = false;
        int res = 0;
        while (number > 0) {
            switch (number % 10) {
                case 0:
                    if (!count0) {
                        res++;
                        count0 = true;
                    }
                    break;
                case 1:
                    if (!count1) {
                        res++;
                        count1 = true;
                    }
                    break;
                case 2:
                    if (!count2) {
                        res++;
                        count2 = true;
                    }
                    break;
                case 3:
                    if (!count3) {
                        res++;
                        count3 = true;
                    }
                    break;
                case 4:
                    if (!count4) {
                        res++;
                        count4 = true;
                    }
                    break;
                case 5:
                    if (!count5) {
                        res++;
                        count5 = true;
                    }
                    break;
                case 6:
                    if (!count6) {
                        res++;
                        count6 = true;
                    }
                    break;
                case 7:
                    if (!count7) {
                        res++;
                        count7 = true;
                    }
                    break;
                case 8:
                    if (!count8) {
                        res++;
                        count8 = true;
                    }
                    break;
                case 9:
                    if (!count9) {
                        res++;
                        count9 = true;
                    }
                    break;

            }
            number /= 10;
        }
        return res;

    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    public static boolean isPerfect(int number) {
        int res = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                res += i;
            }
        }
        return res == number;
    }

}


