package pac;

import java.util.Random;

public class MoodSensor {
    private static final String SMILE = ":)";
    private static final String SAD = ":(";
    private static final String NORMAL = ":|";

    public static String userMood(){
        Random random = new Random();
        int m = random.nextInt(3);
        if(m == 0){
           return SMILE;
        }
        else if (m == 1){
            return SAD;
        }
        else return NORMAL;
    }
}
