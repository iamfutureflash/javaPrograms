package CodeWithHarry;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class java_class_101_Date_Time_Formatter {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-mm-yyyy");//this is the format
        DateTimeFormatter df1 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate = ldt.format(df1);//creating date string date and formatter
        System.out.println(myDate);
    }
}
