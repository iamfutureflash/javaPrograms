package CodeWithHarry;
import java.util.Scanner;
public class java_10_comparision_operator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER YOUR AGE(18 TO 40 ONLY)");
        int check= scan.nextInt();
        System.out.println(18<check && check<40);
    }
}
