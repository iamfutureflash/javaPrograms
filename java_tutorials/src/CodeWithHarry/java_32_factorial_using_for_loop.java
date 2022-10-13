//Question 5: Write a program to find the factorial of a given number using for loops.
package CodeWithHarry;
import java.util.Scanner;
public class java_32_factorial_using_for_loop {
    public static void main(String[] args ){
int a=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number to find factorial");
        int factorial=scanner.nextInt();
        for(int i=factorial;i>=1;i--){
            a= a * i;
            System.out.printf("%d x ",a);

        }
//        System.out.println(a);
    }
}
