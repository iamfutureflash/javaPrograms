package JavaByApnaCollage;

import java.util.Locale;
import java.util.Scanner;

public class CJPC_L13_String_Builder_Lecture_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter name:- ");
        String name = scan.nextLine();
    StringBuilder s = new StringBuilder(name);
        System.out.println("String is:- " + s.toString().toUpperCase(Locale.ROOT));
    String reverseString = "";
//    s.append(" Vaishnav");
//    System.out.println(s);
//        System.out.println(s.indexOf("t"));
//        System.out.println(s.indexOf("p"));
//        System.out.println(s.charAt(0));
//        s.setCharAt(0,'h');
//        System.out.println(s.charAt(0));
//        System.out.println(s.insert(0,"HI"));
//        System.out.println(s.delete(0,3));
//        System.out.println(s.insert(0,"P"));for
     for(int i=s.length()-1;i>=0;i--)
         reverseString += s.charAt(i);

        System.out.println("reverse String is:- " + reverseString.toUpperCase(Locale.ROOT));
    }
}