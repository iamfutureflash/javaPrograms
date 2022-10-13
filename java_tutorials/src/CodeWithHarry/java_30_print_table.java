package CodeWithHarry;
import java.util.Scanner;
public class java_30_print_table {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number");
        int table=scan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d",table,i,table*i);
            System.out.println();
        }
    }
}
