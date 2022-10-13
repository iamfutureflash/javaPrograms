package CodeWithHarry;
import java.util.Scanner;
public class java_15_remove_space_using_underscore {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter your name\t");
        String removeSpace=scan.nextLine();
        String changeit=removeSpace.replace(" ","_");
        System.out.println(changeit);

    }
}
