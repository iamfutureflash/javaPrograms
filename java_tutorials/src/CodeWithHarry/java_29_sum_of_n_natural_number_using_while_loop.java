package CodeWithHarry;
import java.util.Scanner;
public class java_29_sum_of_n_natural_number_using_while_loop {
    public static void main(String[] args) {
        int n=0,i=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number");
        int input=scan.nextInt();
            while (i<=input){
                if(i%2==0) {
                    n=n+i;
                    System.out.printf("%d\t->\t%d",i,n);
                    System.out.println();
                }
                i++;
            }
//            int sum=0;
        System.out.printf("sum of even number is %d",n);
        }
}
