package CodeWithHarry;

import java.util.Scanner;
class MaxRetireReachedException extends Exception{
public String toString(){
return "MaxRetireReachedException occure";
}
public String toMessage(){
return "you reached max limit of wrong guess";
}
}
public class java_class_86_Practice_Set_on_Errors_Exceptions {
    public static void q3() throws MaxRetireReachedException{
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        boolean flag = true;
        int i = 0;
        while(flag) {
            if (i <5) {
                try {
                    System.out.print("enter index:- ");
                    int index = scan.nextInt();
                    System.out.println("fetched value " + arr[index]);
                    System.out.println(" false tries " + i);
                    System.out.println(" max false tries are 5 ");
                } catch (Exception  e) {
                    System.out.println(e);
                    i++;
                    System.out.println("i incrimented to " + i + " \n max tries are 5");
                }
                System.out.print(" next ");
            }
            else {
                try {
                    throw new MaxRetireReachedException();
                } catch (MaxRetireReachedException  e) {
                    System.out.println(e.toMessage());
                    System.out.println(" error ");
                    flag = false;
                }
            }
        }

// Problem 04 ends
    }
public static void main(String[] args) throws MaxRetireReachedException {
/**
* // Problem 1 starts
*         // Syntax Error - int a = 7
*         int age = 78;
*         int year_born = 2000-78; // Logical error
* //        System.out.println(6/0);
*
*  //Problem 01 ends
*
*          //Problem 02 starts
*
*         try{
*             int a = 5, b = 0;
*             System.out.println(a/b);
*         }
*         catch(ArithmeticException e){
*             System.out.println("HaHa");
*         }
*         catch(IllegalArgumentException e){
*             System.out.println("HeHe");
*         }
*         System.out.println("done");
*
*         //Problem 02 ends
*
*
*         //Problem 03 starts
*         Scanner scan = new Scanner(System.in);
*         int[] arr = new int[4];
*         arr[0] = 1;
*         arr[1] = 2;
*         arr[2] = 3;
*         arr[3] = 4;
*         boolean flag = true;
*         int i = 0;
*         while(flag) {
*             if (i <5) {
*                 try {
*                     System.out.print("enter index:- ");
*                     int index = scan.nextInt();
*                     System.out.println("fetched value " + arr[index]);
*                     System.out.println(" false tries " + i);
*                     System.out.println(" max false tries are 5 ");
*                 } catch (ArrayIndexOutOfBoundsException e) {
*                     System.out.println(e);
*                     i++;
*                     System.out.println("i incrimented to " + i + " \n max tries are 5");
*                 }
*                 System.out.print(" next ");
*             }
*             else {
*                 System.out.println(" error ");
*                 flag = false;
*             }
*         }
*
*         //Problem 03  ends
*
* **/
//Problem 04 starts
    q3();
}
}
