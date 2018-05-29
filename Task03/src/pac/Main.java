package pac;

public class Main {
    public static void main(String[] args) {
        //Point p1 = new Point(1,5);
        //Point p2 = new Point(1,1);
        //Point p3 = new Point(4,1);
        Point p1 = new Point(1, 5);
        Point p2 = new Point(1, 1);
        Point p3 = new Point(9, 1);

        System.out.println("Chek is triangle:  " + Triangle.isTriangle(p1, p2, p3));
        System.out.println("Chek is recangular: " + Triangle.isRectangular(p1, p2, p3));
        System.out.println();

        System.out.println(Dragon.numberOfEyes(2));
        System.out.println(Dragon.numberOfHead(5));
        System.out.println();

        System.out.println("Chek is vowel:  " + Vowel.isVowel1('b'));
        System.out.println("Chek is vowel:  " + Vowel.isVowel2('a'));
        System.out.println("Chek is vowel:  " + Vowel.isVowel3('d'));
        System.out.println("Chek is vowel:  " + Vowel.isVowel3('e'));
        System.out.println();

        System.out.println(MoodSensor.userMood());

        System.out.println(Days.nextDay(1,3,2018));
    }

}
