package CodeWithHarry;
import java.util.Scanner;
public class java_08_check_int_or_not {
    public static void main(String[] args){
      Scanner scan=new Scanner(System.in);
        System.out.println("enter number");
     // int check=scan.nextInt();
      boolean b1= scan.hasNextInt();
        System.out.println(b1);

    }
}
