package CodeWithHarry;
import java.util.Scanner;
public class java_23_find_leap_year {
public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the year to find leap year");
    int year=scan.nextInt();
    if(year%400==0 || (year%4==0 && year%100!=0) ){
        System.out.printf("%d is leap year",year);
    }
    else{
        System.out.printf("%d is not leap year",year);
    }
}
}
