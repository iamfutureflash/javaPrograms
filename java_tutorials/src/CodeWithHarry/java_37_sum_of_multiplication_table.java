package CodeWithHarry;
import java.util.Scanner;
public class java_37_sum_of_multiplication_table {
    public static void main(String[] args) {
        int sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter value ");
        int value=scan.nextByte();
//        for(int i=1;i<=10;i++){
//            System.out.printf("%d x %d = %d\n",i,value,i*value);
//            sum=sum+(i*value);
//        }
//        System.out.printf("\nsum is %d",sum);
        int j=1;
        for (int i=1;i<=value;i++){
            if(i%2==0){
                System.out.printf("%d even number is %d",j,i);
                sum+=i;
                j++;
            }
            System.out.println();
        }
        System.out.printf("\nsum is %d",sum);
    }
}
