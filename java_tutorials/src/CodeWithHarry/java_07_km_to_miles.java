package CodeWithHarry;
import java.util.Scanner;
public class java_07_km_to_miles {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        float kilometer=0.6213712f;
        System.out.println("ENTER KILOMETERS TO CONVERT INTO MILES");
        float km= scan.nextFloat();
        float miles=km*kilometer;
        System.out.println(km + " kilometer have " + miles + " miles");
    }
}
