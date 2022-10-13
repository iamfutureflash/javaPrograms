package puneet;
import java.util.Scanner;
public class bit_stuffing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] value = new  int[7];
        int [] value1 = new  int[9];
        System.out.println("enter bits");
        for(int i = 0;i<8;i++){
            System.out.printf("enter value %d ",i);
            value[i] = scan.nextInt();
        }
        for(int i = 0;i<=7;i++){
            System.out.print(value[i]);
        }
    }
}
