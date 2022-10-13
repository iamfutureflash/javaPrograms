package JavaByApnaCollage;

import java.util.Scanner;

public class CJPC_L17_Recursion_in_One_Shot_Level_1_Easy_Lecture_17 {
    public static boolean k = true;
    public static Scanner scan = new Scanner(System.in);
    public static void printNumbersInDescendingOrder(int n) {
        if (n == 0)
            return;
        System.out.print(" " + n + " ");
        printNumbersInDescendingOrder(n - 1);
    }

    public static void printNumbersInAssendingOrder(int s) {
        if (s > 5)
            return;
        System.out.print(" " + s + " ");
        printNumbersInAssendingOrder(s + 1);
    }
    public static void printSumOfnNaturalNmbers(int s, int e, int sum) {
        if (s == e) {
            sum += s;
            System.out.println("sum is : " + sum);
            return;
        }
        sum += s;
        printSumOfnNaturalNmbers(s + 1, e, sum);
    }
    public static void factorial(int s, int multiply) {
        if (s==0) {
            System.out.println("factorial is :- " + multiply);
            return;
        }
        System.out.print(" " + multiply + " ");
        multiply*=s;
        factorial(s - 1,multiply);
    }
    public static void fibonacci(int a,int b ,int n, int i, int sum) {
        if (i==n) {
            return;
        }
        System.out.print(" " + sum + " ");
        sum = a + b;
        if(a==0){
            System.out.print(" " + sum + " ");
            n--;
        }
            a=b;
            b =sum;
        i++;
        fibonacci(a,b,n,i,sum);
    }
    public static int calcPower(int a,int n, int mul) {
        if (n == 0) {
            System.out.print("power is :- " + mul);
            return 0;
        } else if (a == 0) {
            System.out.print("zero power anything become zero at the end");
            return 0;
        }
        mul *=a;
        calcPower(a, n-1, mul);
        return 0;
    }
//    public static int x,n, mul=1;
    public static int calcPowerLogn(int x , int n, int mul) {
        /*
        if(k==true){
            System.out.print("enter number:- ");
            x  = scan.nextInt();
            System.out.println();
            System.out.print("enter power:- ");
            n  = scan.nextInt();
            k=false;
        }
        */
        if (n == 0) {
            return 1;
        } else if (x == 0) {
            System.out.print("zero power anything become zero at the end");
            return 0;
        }
        // if n is even
        if (n % 2 == 0) {
            mul *= calcPowerLogn(x,n/2, mul) * calcPowerLogn(x,n/2,mul);
            return mul;
        } else {// if n is odd
            mul *= calcPowerLogn(x, n / 2, mul) * calcPowerLogn(x, n / 2, mul) * x;
            return mul;

        }
    }
    public static void main(String[] args) {
        int result =  calcPowerLogn(2,5,1);
        System.out.println("power is :- "+  + result);
    }
}