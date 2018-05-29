package pac;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vowel {
    char simbol;

    public Vowel() {
        this.simbol = 0;
    }

    public Vowel(char simbol) {
        this.simbol = simbol;
    }

    public char getSimbol() {
        return simbol;
    }

    public void setSimbol(char simbol) {
        this.simbol = simbol;
    }

    public static boolean isVowel1(char a) {
        a = Character.toLowerCase(a);
        return (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'y');
    }

    public static boolean isVowel2(char a) {
        a = Character.toLowerCase(a);
        switch (a) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                return true;
        }
        return false;
    }

    public static boolean isVowel3(char a) {
        String str = Character.toString(a);
        Pattern p = Pattern.compile("a|e|i|o|u|y");
        Matcher m = p.matcher(str);
        return m.matches();
    }

    public static boolean isVowel4(char a) {
        a = Character.toLowerCase(a);
        String str = Character.toString(a);
        return (str.equals('a') || str.equals('e') || str.equals('i') || str.equals('o') || str.equals('u') || str.equals('y'));
    }

}


