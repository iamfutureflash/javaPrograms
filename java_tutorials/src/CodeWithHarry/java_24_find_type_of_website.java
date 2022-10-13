package CodeWithHarry;
import java.util.Scanner;
public class java_24_find_type_of_website {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String website=scan.nextLine();
        if (website.endsWith(".com")){
            System.out.println("it is an commercial website");
        }
        else if (website.endsWith(".org")){
            System.out.println("it is an organizational website");
        }
        else if (website.endsWith(".in")){
            System.out.println("it is an indian website");
        }
    }
}
