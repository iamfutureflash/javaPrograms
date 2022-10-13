package CodeWithHarry;
import java.util.Scanner;
public class java_20_find_greater_between_4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter 4 values");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=scan.nextInt();
        System.out.printf("entered data successfully %d %d %d %d \n",a,b,c,d);
        if(a>b)
            if (a>c)
                if(a>d)
                    System.out.printf("a is greater which is %d",a);
        if(b>a)
            if (b>c)
                if(b>d)
                    System.out.printf("b is greater which is %d",b);
        if(c>a)
            if (c>b)
                if(c>d)
                    System.out.printf("c is greater which is %d",c);
        if(d>a)
            if (d>b)
                if(d>c)
                    System.out.printf("d is greater which is %d",d);
        if(a==b&&b==c&&c==d) {
            System.out.println("both 4 values are equal");
        }
    }

}
