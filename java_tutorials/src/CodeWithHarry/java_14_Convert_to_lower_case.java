package CodeWithHarry;
import java.util.Scanner;
public class java_14_Convert_to_lower_case {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your name in capital letter");
        String entername=scan.nextLine();
        System.out.println(entername.toLowerCase());
    }
}
