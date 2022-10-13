package JavaByApnaCollage;

import java.util.Scanner;

public class CJPC_L03_Conditional_Statements_If_else_Switch_Break {
    public static void main(String[] args) {
        /*
        * Problem 01
        * System.out.print("*\n");
        System.out.print("**\n");
        System.out.print("***\n");
        System.out.print("****");
        //problrm 02
        Scanner scan = new Scanner(System.in);
        int button = scan.nextInt();
        if (button ==1){
            System.out.println("Hello");
        }else if (button ==2){
            System.out.println("Namaste");
        }else if (button ==3){
            System.out.println("Bonjour");
        }
        else{
            System.out.println("Invalid Button");
        }
        */
        //Problem 03
        Scanner scan = new Scanner(System.in);
        System.out.print("enter button:-  ");
        int button = scan.nextInt();
        switch (button){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Nameste");
                break;
            case 3:
                System.out.println("Bonjor");
                break;
            default:
                System.out.println("Invalid Statement");
                break;
        }
    }
}