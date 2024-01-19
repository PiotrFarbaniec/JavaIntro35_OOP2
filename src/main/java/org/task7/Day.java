package org.task7;

public class Day {

    private static String text = "Today is: ";
    private static String result;


    static String dayOFWeek(Days day) {
        switch (day) {
            case MONDAY -> result = text + Days.MONDAY;
            case TUESDAY -> result = text + Days.TUESDAY;
            case WEDNESDAY -> result = text + Days.WEDNESDAY;
            case THURSDAY -> result = text + Days.THURSDAY;
            case FRIDAY -> result = text + Days.FRIDAY;
            case SATURDAY -> result = text + Days.SATURDAY;
            case SUNDAY -> result = text + Days.SUNDAY;
        }
        return result;
    }
}
