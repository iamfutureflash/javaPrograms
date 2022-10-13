package CodeWithHarry;
import java.io.PrintStream;
import java.util.Scanner;
public class java_22_calculate_tax_on_income {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int tax=0;
        System.out.println("enter your income");
        int income= scan.nextInt();
        System.out.printf("your income is %d",income);
        System.out.println();
        if(income<250000){
            tax=(income*0)/100;
            System.out.printf("your tax is %d",tax);
            System.out.println();
            System.out.printf("your initially income %d",income);
            System.out.println();
            System.out.printf("your in hand income is %d",(income-tax));
            System.out.println();
        }
        if(250000<income && income<500000){
            tax=(income*5)/100;
            System.out.printf("your tax is %d",tax);
            System.out.println();
            System.out.printf("your initially income %d",income);
            System.out.println();
            System.out.printf("your in hand income is %d",(income-tax));
            System.out.println();
        }
        if(500000<income && income<1000000){
            tax=(income*20)/100;
            System.out.printf("your tax is %d",tax);
            System.out.println();
            System.out.printf("your initially income %d",income);
            System.out.println();
            System.out.printf("your in hand income is %d",(income-tax));
            System.out.println();
        }
        if(1000000<income){
            tax=(income*30)/100;
            System.out.printf("your tax is %d",tax);
            System.out.println();
            System.out.printf("your initially income %d",income);
            System.out.println();
            System.out.printf("your in hand income is %d",(income-tax));
            System.out.println();
        }
    }

}
