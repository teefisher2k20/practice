package exercises.interviewQuestions;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TimeForMilkAndCookies {
    public static void main(String[] args) {
    }
    //*Christmas Eve is almost upon us, so naturally we need to prepare some
    // milk and cookies for Santa! Create a method that accepts a
    // GregorianCalendar object and returns true if it's Christmas Eve (December 24th)
    // and false otherwise.

    public static boolean timeForMilkAndCookies(GregorianCalendar date) {
        return date.get(GregorianCalendar.MONTH) == 11 && date.get(GregorianCalendar.DAY_OF_MONTH) == 24;
    }
}
