package CodeWithHarry;
import java.util.Scanner;
public class java_12_introduction_to_strings {
    public static void main(String[] args){
        //String name = new String("puneet");
        Scanner scan=new Scanner(System.in);
        System.out.printf("Enter your name :- ");
        String name=scan.nextLine();
        System.out.printf("the name is %s %n",name);
        System.out.format("the name is %s",name);
    }
}
