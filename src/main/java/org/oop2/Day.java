package org.oop2;

public class Day {

    private static String text = "Today is: ";
    private static String result;


    static String dayOFWeek(Days day) {
        switch (day) {
            case Monday -> result = text + Days.Monday;
            case Tuesday -> result = text + Days.Tuesday;
            case Wednesday -> result = text + Days.Wednesday;
            case Thursday -> result = text + Days.Thursday;
            case Friday -> result = text + Days.Friday;
            case Saturday -> result = text + Days.Saturday;
            case Sunday -> result = text + Days.Sunday;
        }
        return result;
    }
}
