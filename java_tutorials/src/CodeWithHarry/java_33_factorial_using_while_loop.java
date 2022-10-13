//**Question 6:** Repeat problem 5 using a while loop.
package CodeWithHarry;
import java.util.Scanner;

public class java_33_factorial_using_while_loop {
    public static void main(String[] args) {
        int a=1,i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number to find factorial");
        int factorial=scanner.nextInt();
//        for(int i=factorial;i>=1;i--)
        i=factorial;
        while(i>=1){
            a= a * i;
            System.out.printf("%d x ",a);
            i--;
        }
    }
}
