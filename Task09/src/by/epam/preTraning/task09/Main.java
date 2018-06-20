package by.epam.preTraning.task09;

public class Main {
    public static void main(String[] args) {
        int n = 123456;
        System.out.println(Recursion.sumOfNumbers(n));
        double x = 10;
        n = 0;
        System.out.println(Recursion.pow(x, n));
        n = 12345678;
        int s = 36;
        System.out.println(Recursion.equalsOfNumberAndSum(n, s));
        n = 10;
        System.out.println(Recursion.fibonachi(n));
    }
}
