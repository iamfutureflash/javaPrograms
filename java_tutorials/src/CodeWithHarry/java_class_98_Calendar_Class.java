package CodeWithHarry;

import java.util.Calendar;
import java.util.TimeZone;

public class java_class_98_Calendar_Class {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c.getTime());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTimeZone().toZoneId());
        System.out.println(c.getTimeInMillis());
        System.out.println(c.getCalendarType());
        System.out.println(c.getFirstDayOfWeek());

    }
}
