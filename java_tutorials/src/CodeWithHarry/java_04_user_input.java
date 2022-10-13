package CodeWithHarry;
import java.util.Scanner;
public class java_04_user_input {
    public static void main(String[] args) {
        System.out.println("TAKING USER INPUT");
        Scanner take=new Scanner(System.in);
        System.out.println("Enter Value 1");
        int a=take.nextInt();
        System.out.println("Enter Value 2");
        int b=take.nextInt();
        int sum=a+b;
        System.out.println("Sum of a and b is : ");
        System.out.println(sum);
        boolean check=take.hasNextInt();
        System.out.println(check);
    }
}
