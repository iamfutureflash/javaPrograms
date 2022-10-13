package CodeWithHarry;

import java.util.Scanner;

class MyException extends Exception {
@Override
public String toString(){
    return super.toString()+"Iam toString()";
}
@Override
public String getMessage(){
    return super.getMessage() + "I am getMessage()";
}
}
public class java_class_83_The_Exception_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hello everyone");
        int a;
        System.out.print("enter value of a ");
        a = sc.nextInt();
        if (a<9){
            try {
//                throw new MyException();
                throw new ArithmeticException("i am ArithmeticException");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            }
            System.out.println("Finished");
        }
    }
}
