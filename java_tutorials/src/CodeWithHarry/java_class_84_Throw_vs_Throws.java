package CodeWithHarry;
import java.util.Scanner;

class NegitiveRadiusException extends Exception {
    @Override
    public String toString(){
        return "NegitiveRadiusException occure";
    }
    public String toMessage(){
        return "negitive radius cannot obtained result, NegitiveRadiusException occure";
    }
}
public class java_class_84_Throw_vs_Throws {
    public static Scanner scan = new Scanner(System.in);
    public static double area(double radius) throws NegitiveRadiusException{ return Math.PI*Math.pow(radius,2);}
    public static int divide(int x, int y) throws ArithmeticException { return x/y; }
    public static void takeIput() throws NegitiveRadiusException {
        System.out.print("enter radius :- ");
        double radius = scan.nextDouble();
        if(radius<0) {
            try {
                throw new NegitiveRadiusException();
            } catch (NegitiveRadiusException e) {
                System.out.println(e.toMessage());
            }
        }
        else{
            try {
                System.out.println("area is " + area(radius));
            } catch (NegitiveRadiusException e) {
                System.out.println(e);
            }
        }

    }

    public static void main(String[] args) throws NegitiveRadiusException {
       /**
        *System.out.print("enter x :- ");
        *         int x = scan.nextInt();
        *         System.out.println();
        *         System.out.print("enter y :- ");
        *         int y = scan.nextInt();
        *         try {
        *             System.out.println("divide is " + divide(x, y));
        *         }
        *         catch (ArithmeticException e){
        *             System.out.println(e);
        *         }
        *
        *
        * **/
        takeIput();
        System.out.println("finished");
    }
}
