//Question 4: Write a program to print a multiplication table of 10 in reverse order.
package CodeWithHarry;
import java.util.Scanner;
public class java_31_print_table_in_reverse_order {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number");
        int table=scan.nextInt();
        for(int i=10;i>=1;i--){
            System.out.printf("%d\tx\t%d\t=\t%d",table,i,table*i);
            System.out.println();
        }
    }
}
