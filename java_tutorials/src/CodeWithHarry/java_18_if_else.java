package CodeWithHarry;
import java.util.Scanner;
public class java_18_if_else {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number between 1 to 3");
        int a;
        System.out.println("enter value of a");
        a=scan.nextInt();
        if (a == 1 || a == 2 || a == 3)
            System.out.printf("the value of a is %d", a);
        else if(a==4)
            System.out.printf("the value of a is %d", a);
        else if(a==5)
            System.out.printf("the value of a is %d", a);
        else
            System.out.println("enter some correct values");
    }
}
