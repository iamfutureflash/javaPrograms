package CodeWithHarry;
import java.sql.SQLOutput;
import java.util.Scanner;
public class java_16_fill_letter_template {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String username=scan.nextLine();
        System.out.printf("letter =\"Dear %s , plays a lot\"",username);
    }
}
