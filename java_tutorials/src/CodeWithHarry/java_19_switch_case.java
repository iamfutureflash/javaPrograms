package CodeWithHarry;
import java.util.Scanner;
public class java_19_switch_case {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter our age");
        int age=scanner.nextInt();
        switch(age){
            case 18:
                System.out.println("you are becoming an adult");
                break;
            case 25:
                System.out.println("you are an adult");
                break;
            case 60:
                System.out.println("you are old");
                break;
            default:
                System.out.println("enter right age");
        }

    }
}
