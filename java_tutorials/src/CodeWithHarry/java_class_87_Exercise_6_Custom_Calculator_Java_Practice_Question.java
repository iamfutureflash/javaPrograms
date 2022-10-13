package CodeWithHarry;

import java.util.Scanner;

//Exception 01
class InvalidInputException extends Exception{
    public String toString() {
        return "InvalidInputException occure";
    }
    public String toMessage(){
        return "this input is invalid";
    }
}
//Exception 02
class CannotDivideByZeroException extends Exception{
    public String toString() {
        return "CannotDivideByZero occure";
    }
    public String toMessage(){
        return "zero cannot be divided with any number";
    }
}
//Exception 03
class MaxInputException extends Exception{
    public String toString() {
        return "MaxInput occure";
    }
    public String toMessage(){
        return "given limit exceed";
    }
}
//Exception 04
class MaxMultiplierReachedException extends Exception{public String toString() {
    return "MaxMultiplierReached occure";
}
    public String toMessage(){
        return "max multiplier reached";
    }}
class Calculator{
    public double add(double a, double b){
        return a+b;
    }
    public double subtract(double a, double b){
        return a-b;
    }
    public double multiplication(double a, double b){
        return a*b;
    }
    public double divide(double a, double b){
        return a/b;
    }
}
public class java_class_87_Exercise_6_Custom_Calculator_Java_Practice_Question {
    static Calculator calculator = new Calculator();
    public static Scanner scan  = new Scanner(System.in);
    public static boolean flag = true;
    //addition is check
    public static void add() throws InvalidInputException{
        System.out.println("enter a:- ");
        double a =scan.nextDouble();
        System.out.println("enter b:- ");
        double b =scan.nextDouble();
        //1st if block

        if(a==8 || a==9 || b==8 || b==9){
            try{
                throw new InvalidInputException();
            }
            catch(InvalidInputException e){
                System.out.println(e.toMessage());
            }
        }
        else{
            System.out.println("addition is " + calculator.add(a,b));
        }
    }
    public static void sub() throws MaxInputException{
        System.out.println("enter a:- ");
        double a =scan.nextDouble();
        System.out.println("enter b:- ");
        double b =scan.nextDouble();
        //1st if block
        if(a<10000&&b<10000){
            System.out.println("addition is " + calculator.subtract(a,b));
        }
        else{
            try{
                throw new MaxInputException();
            }
            catch(MaxInputException e){
                System.out.println(e.toMessage());
            }
        }
    }
    public static void multiplication() throws MaxInputException, MaxMultiplierReachedException{
        System.out.println("enter a:- ");
        double a =scan.nextDouble();
        System.out.println("enter b:- ");
        double b =scan.nextDouble();
        //3st if block
        if(a<10000&&b<10000){
                        if(a*b<7000)
                            System.out.println("addition is " + calculator.multiplication(a,b));
                        else{
                            try {
                                throw new MaxMultiplierReachedException();
                            } catch (MaxMultiplierReachedException e) {
                                System.out.println(e.toMessage());
                            }
                        }
        }
        else{
            if(a>10000 || b>10000) {
                try {
                    throw new MaxInputException();
                } catch (MaxInputException e) {
                    System.out.println(e.toMessage());
                }
            }
        }
    }
    public static void divide() throws MaxInputException, CannotDivideByZeroException{
        System.out.println("enter a:- ");
        double a =scan.nextDouble();
        System.out.println("enter b:- ");
        double b =scan.nextDouble();
        //1st if block
        if(a<10000&&b<10000&&b!=0){
            System.out.println("addition is " + calculator.divide(a,b));
        }
        else if (a > 10000 && b > 10000 && b != 0 || a > 10000 || b > 10000) {
                try {
                    throw new MaxInputException();
                } catch (MaxInputException e) {
                    System.out.println(e.toMessage());
                }
        }
        else if(b==0){
                try {
                    throw new CannotDivideByZeroException();
                } catch (CannotDivideByZeroException e) {
                    System.out.println(e.toMessage());
                }
            }
    }
    public static void printChoice() throws InvalidInputException, MaxInputException, CannotDivideByZeroException, MaxMultiplierReachedException {
        System.out.println("1.addition");
        System.out.println("2.subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");
        System.out.println("5.exit");
        System.out.println();
        System.out.print("enter choice:- ");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:add();
                break;
            case 2:sub();
                break;
            case 3:multiplication();
                break;
            case 4:divide();
                break;
            case 5:
                System.out.println("exiting system done");
                flag = false;
                break;
            default:
                System.out.println("enter valid choice");
                break;
        }
    }
    public static void main(String[] args) throws InvalidInputException, MaxInputException, CannotDivideByZeroException, MaxMultiplierReachedException {
         /*
        Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 10000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
         */
        while(flag) {
            printChoice();
        }
    }
}
