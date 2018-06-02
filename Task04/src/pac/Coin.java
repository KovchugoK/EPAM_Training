package pac;

import java.util.Random;

public class Coin {
    public static String nomOfHeads(int attempt){
        Random random = new Random();
        int head = 0;
        int tail = 1;
        int count = 0;
        for (int i = 0; i < attempt; i++) {
            if(random.nextInt(2) == head)
                count++;
        }
        return "Heads: " + count + " Tails: " + (attempt - count);
    }

}
