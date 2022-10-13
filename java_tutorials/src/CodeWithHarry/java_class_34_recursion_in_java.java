package CodeWithHarry;

import java.util.Scanner;

public class java_class_34_recursion_in_java {
    private static Scanner scan =new Scanner(System.in);
    private static int factorial(int n) {
        if(n==0 || n==1){
            return 1;
        }
        else
            return n * factorial(n-1);
    }
    private static int factorial_iterative(int n){
        int result = 1;
        for(int i = 1; i <=n ; i++) {
            result = result * i;
        }
        return result;
    }
    private static int febonachi(long n) {
        if(n==1||n==2)
            return 1;
        return febonachi(n-1)+febonachi(n-2);
    }
    public static void main(String[] args) {
//        int n= 4;
//        System.out.println(factorial(n));
//        System.out.println(factorial_iterative(n));
        long n;
        System.out.print("enter number:- ");
        n = scan.nextInt();
        for (long i = 1; i <=n ; i++) {
            System.out.println(i + " value is " + febonachi(i) + " ");
            if(i==40)
                System.out.println("");
            if(i==80)
                System.out.println("");
            if(i==120)
                System.out.println("");
        }
        System.out.println("end of code");

    }
}
