package CodeWithHarry;


import java.util.Date;

public class java_class_97_The_Date_Class {
    public static void main(String[] args) {
        Long a =1612443786836l;
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());
//        System.out.println(System.currentTimeMillis()-a);
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        System.out.println(date.equals(55));
        System.out.println(date.after(date));
        System.out.println(date.getYear());

    }
}
