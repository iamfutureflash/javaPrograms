package JavaByApnaCollage;

import java.util.Scanner;

public class CJPC_L07_Functions_and_Methods_Lecture_7 {
    public static void SumTwoNumbers(int a, int b) {
        System.out.println("sum is :- " + (a + b));
    }

    public static void productOfTwoNumbers(int a, int b) {
        System.out.println("multiplication is :- " + (a * b));
    }

    public static int FactorialOf(int a) {
        int multipl = 1;
        for (int i = 1; i <= a; i++) {
            if (a == 0) {
                return 1;
            }
            multipl = multipl * i;
        }
        return multipl;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(FactorialOf(a));
    }
}