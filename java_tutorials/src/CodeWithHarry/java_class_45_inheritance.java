package CodeWithHarry;
import java.util.Scanner;
class Base{
    public static Scanner scan = new Scanner(System.in);
    int x;
     int getX(){
         System.out.println("Printing value of x = " + x);
        return x;
    }
    void setX(int x){
        System.out.println("Setting the value of x :- " + x);
         this.x = x;
    }
    void PrintMeX(){
        System.out.print("enter Value of x :- ");
    }
    Base(){
         PrintMeX();
         x = scan.nextInt();
         setX(x);
         getX();
    }
}
class Derived extends Base{
    int y, z;
    public int getY() {System.out.println("Getting the value of y... "+y);return y;}
    public void setY(int y) {
        System.out.println("Setting value of y = "+y);
        this.y = y;
    }
    void PrintMeY(){
        System.out.print("enter Value of y :- ");
        y = scan.nextInt();
    }
    public void sum(){
        z = y + x;
        System.out.println("sum of x "+x+" and y "+y+" is :- "+z);
    }
    Derived(){
        PrintMeY();
        setY(y);
        getY();
        sum();
    }
}
public class java_class_45_inheritance {
    public static void main(String[] args) {
    Derived d = new Derived();
    }
}
