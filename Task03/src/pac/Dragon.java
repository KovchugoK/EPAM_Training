package pac;

public class Dragon {

    int age;

    Dragon() {
        this.age = 0;
    }

    Dragon(int age) {
        this.age = age;
    }

    private static final int NUMOFEYES = 2;
    private static final int YEARSYONG = 200;
    private static final int YEARSOLD = 200;


    public static int numberOfHead(int age) {
        int head = 3;
        if (age > 0 && age <= YEARSYONG) {
            head += (3 * age);
        } else if (age > YEARSYONG && age <= YEARSOLD) {
            head += (3 * YEARSYONG) + (2 * (age - YEARSYONG));
        } else {
            head += (3 * YEARSYONG) + (2 * 100) + (age - YEARSOLD);
        }
        return head;
    }
    public static int numberOfEyes(int age) {
        int head = 3;
        int eyes = head * NUMOFEYES;
        if (age > 0 && age <= YEARSYONG) {
            head += (3 * age);
            eyes = head * NUMOFEYES;
        } else if (age > YEARSYONG && age <= YEARSOLD) {
            head += (3 * YEARSYONG) + (2 * (age - YEARSYONG));
            eyes = head * NUMOFEYES;
        } else {
            head += (3 * YEARSYONG) + (2 * 100) + (age - YEARSOLD);
            eyes = head * NUMOFEYES;
        }
        return eyes;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
