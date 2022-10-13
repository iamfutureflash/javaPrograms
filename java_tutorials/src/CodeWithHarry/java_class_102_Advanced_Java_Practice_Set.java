package CodeWithHarry;


import java.io.Console;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class java_class_102_Advanced_Java_Practice_Set {
    public static Scanner scan = new Scanner(System.in);
    public static void Q01_array_list(){
        int y= 1;
        int value;
        String name;
        ArrayList<String> al = new ArrayList<String>();
        try{
            System.out.print("entervalue:- ");
            value = scan.nextInt();
            System.out.println("enter names:- ");
//            i<=al.size()
            for (int i=1;i<=value;i++){
                System.out.print(y + " ");
                name = scan.next();
                al.add(name);
                y++;
                System.out.println("added");
            }
            y=1;
            System.out.println("list of the names:- ");
            for (Object x:al){
                System.out.println(y + " :- " + x);
                y++;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
//            Q01_array_list();
        // Problem 02 starts

//        LocalDateTime ldt = LocalDateTime.now();
//        System.out.println(ldt);
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH-mm-ss");
//        String mytime = ldt.format(dtf);
//        System.out.println(mytime);

        // Problem 02 ends

        // Problem 03 starts
//        GregorianCalendar gc = new GregorianCalendar();
//        System.out.println(gc.get(Calendar.HOUR_OF_DAY));
//        System.out.println(gc.get(Calendar.HOUR_OF_DAY) + ":" + gc.get(Calendar.MINUTE) + ":" + gc.get(Calendar.SECOND));

        // Problem 03 ends

        // Problem 04 starts

//        LocalTime t = LocalTime.now();
//        LocalTime lt =  LocalTime.now();
//        System.out.println(lt);
        // Problem 04 ends

        // Problem 05 ends

        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(12);
        hs.add(12);
        hs.add(14);
        hs.add(15);
        hs.add(16);
        hs.add(16);
        System.out.println(hs);
        // Problem 05 ends
    }
}
