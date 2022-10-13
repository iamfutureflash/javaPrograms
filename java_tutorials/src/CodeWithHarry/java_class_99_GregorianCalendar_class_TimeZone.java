package CodeWithHarry;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class java_class_99_GregorianCalendar_class_TimeZone {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
//        System.out.println(c.getTime());
//        System.out.println(c.get(Calendar.AM));
//        System.out.println(c.get(Calendar.DAY_OF_WEEK));
//        System.out.println(c.get(Calendar.DAY_OF_MONTH));
//        System.out.println(c.get(Calendar.DAY_OF_YEAR));
//        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
//        System.out.println(c.get(Calendar.DATE));
//        System.out.println(c.get(Calendar.MILLISECOND));
//        System.out.println(c.get(Calendar.SECOND));
//        System.out.println(c.get(Calendar.MINUTE));
//        System.out.println(c.get(Calendar.HOUR));
//        System.out.println(c.get(Calendar.HOUR_OF_DAY));
            System.out.println("H:M:S:MS  " + c.get(Calendar.HOUR) + " : " + c.get(Calendar.MINUTE) + " : " + c.get(Calendar.SECOND) + " : " + c.get(Calendar.MILLISECOND));
            GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.getTime());
        System.out.println(cal.getMinimalDaysInFirstWeek());
    }
}
