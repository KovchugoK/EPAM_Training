package pac;

public class Days {
    private static final int DAYS31 = 31;
    private static final int DAYS30 = 30;
    private static final int DAYS29 = 29;
    private static final int DAYS28 = 28;

    public static String nextDay(int day, int month, int year) {
        if(day > DAYS31 || 0 >= day || month <= 0 || month > 12)
            return "Invalid date";
        if (day <= 27) {
            day++;
        } else if (day == DAYS28) {
            if ((month != FEBRUARY) && !isLeapYear(year)) {
                day++;
            } else {
                month++;
                day = 1;
            }
        } else if (day == DAYS29)  {
            if (month != FEBRUARY) {
                day++;
            } else {
                month++;
                day = 1;
            }
        } else if (day == DAYS30) {
            if(month == FEBRUARY){
                return "Invalid date";
            }
            if ((month == JANUARY) || (month == MARCH) || (month == MAY) || (month == JULY)
                    || (month == AUGUST) || (month == OCTOBER) || (month == DECEMBER)) {
                day++;
            } else {
                month++;
                day = 1;
            }
        }
        else {
            if (month != DECEMBER) {
                month++;
                day = 1;
            } else {
                year++;
                month = 1;
                day = 1;
            }
        }
        return day + "." + month + "." + year;

    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 == 0 && year % 400 != 0) {
            return false;
        }
        return true;
    }

    public static final int JANUARY = 1;
    public static final int FEBRUARY = 2;
    public static final int MARCH = 3;
    public static final int MAY = 5;
    public static final int JULY = 7;
    public static final int AUGUST = 8;
    public static final int OCTOBER = 10;
    public static final int DECEMBER = 12;

}
