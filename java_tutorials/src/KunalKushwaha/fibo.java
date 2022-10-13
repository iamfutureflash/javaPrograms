package KunalKushwaha;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter length in number :- ");
        int n = scanner.nextInt();
        System.out.println();
        int a = 0,b = 1,temp;
        System.out.print(" " + a + " " + b + " ");
        for (int i = 2; i <n ; i++) {
            temp = a+b;
            System.out.print(" " + temp + " ");
            a=b;
            b=temp;
        }
    }
}
