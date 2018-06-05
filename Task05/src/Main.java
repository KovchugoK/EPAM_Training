import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {53,87,23,88, 123, 4, 10};
        int[] array1 = {5,3,1};
        System.out.println(Array.maxInArray(array));
        System.out.println(Array.minInArray(array));
        Array.reverse(array);
        for (int i: array) {
            System.out.print (i + " ");
        }
        System.out.println();
        System.out.println(Array.averegeGeometric(array));
       // Arrays.sort(array);
        System.out.println(Array.sequenceHigh(array));
        System.out.println(Array.sequenceLow(array1));
        System.out.println(Array.localMax(array));
        System.out.println(Array.localMin(array));
    }

}
