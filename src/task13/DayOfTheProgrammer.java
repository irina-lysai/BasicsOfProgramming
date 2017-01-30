package task13;

import helpers.Helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class DayOfTheProgrammer {
    private static Map<Integer, String> daysOfWeek = new HashMap<>();

    static {
        daysOfWeek.put(1, "Sunday");
        daysOfWeek.put(2, "Monday");
        daysOfWeek.put(3, "Tuesday");
        daysOfWeek.put(4, "Wednesday");
        daysOfWeek.put(5, "Thursday");
        daysOfWeek.put(6, "Friday");
        daysOfWeek.put(7, "Saturday");
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Hello! Please enter the year");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer year = Helper.getYear(br);
        getDay(year);
    }

    public static void getDay(Integer year) {
        Calendar c = Calendar.getInstance();
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            c.set(year, 8, 12);
        } else {
            c.set(year, 8, 13);
        }

        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(daysOfWeek.get(dayOfWeek));


    }

}
